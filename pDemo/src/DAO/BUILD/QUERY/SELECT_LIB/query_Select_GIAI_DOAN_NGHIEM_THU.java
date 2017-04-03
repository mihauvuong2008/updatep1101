package DAO.BUILD.QUERY.SELECT_LIB;

import DAO.DOT_THUCHIEN_SUACHUA_BAODUONG;
import DAO.DOT_THUCHIEN_TANG_TAISAN;
import DAO.NGUOIDUNG;

public class query_Select_GIAI_DOAN_NGHIEM_THU {

	public String getString_GiaidoanNghiemthu_tuDotTangTaisan(DOT_THUCHIEN_TANG_TAISAN dtt) {
		try {
			return "SELECT * FROM (SELECT * FROM GIAI_DOAN_NGHIEM_THU WHERE  MA_QUATRINH_NGHIEMTHU_QUYETTOAN = '"
					+ dtt.getMA_QUATRINH_NGHIEMTHU_QUYETTOAN() + "' )as t"
					+ " WHERE (THOI_DIEM_CHUYEN_GIAO IN (SELECT MAX(THOI_DIEM_CHUYEN_GIAO)"
					+ " FROM (SELECT  THOI_DIEM_CHUYEN_GIAO  FROM GIAI_DOAN_NGHIEM_THU"
					+ " WHERE  MA_QUATRINH_NGHIEMTHU_QUYETTOAN = '" + dtt.getMA_QUATRINH_NGHIEMTHU_QUYETTOAN()
					+ "' )as t ))OR (THOI_DIEM_CHUYEN_GIAO IS NULL);";
			// co tinh den viec chuyen giao nhieu hon 2 lan
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_GiaidoanNghiemthu_tuDotSuachuaBaoduong(DOT_THUCHIEN_SUACHUA_BAODUONG dsb) {
		try {
			return "SELECT * " + " FROM GIAI_DOAN_NGHIEM_THU" + " WHERE MA_QUATRINH_NGHIEMTHU_QUYETTOAN = '"
					+ dsb.getMA_QUATRINH_NGHIEMTHU_QUYETTOAN() + "'; ";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Congviec_Phanviec_DangNGHIEMTHU_suachuaBaoduong(NGUOIDUNG nd) {
		try {
			return "SELECT * " + " FROM DOT_THUCHIEN_SUACHUA_BAODUONG ,GIAI_DOAN_NGHIEM_THU"
					+ " INNER JOIN GIAI_DOAN_NGHIEM_THU_CAN_BO"
					+ " ON (GIAI_DOAN_NGHIEM_THU_CAN_BO.MA_GIAI_DOAN_NGHIEM_THU= GIAI_DOAN_NGHIEM_THU.MA_GIAI_DOAN_NGHIEM_THU ) AND TEN_TAI_KHOAN='"
					+ nd.getTEN_TAI_KHOAN() + "'"
					+ " WHERE THOI_DIEM_KET_THUC IS NULL AND GIAI_DOAN_NGHIEM_THU.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_SUACHUA_BAODUONG.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DangNGHIEMTHU_TangTaisan(NGUOIDUNG nd) {
		try {
			return "SELECT * " + " FROM DOT_THUCHIEN_TANG_TAISAN ,GIAI_DOAN_NGHIEM_THU"
					+ " INNER JOIN GIAI_DOAN_NGHIEM_THU_CAN_BO"
					+ " ON (GIAI_DOAN_NGHIEM_THU_CAN_BO.MA_GIAI_DOAN_NGHIEM_THU= GIAI_DOAN_NGHIEM_THU.MA_GIAI_DOAN_NGHIEM_THU ) AND TEN_TAI_KHOAN='"
					+ nd.getTEN_TAI_KHOAN() + "'"
					+ " WHERE THOI_DIEM_KET_THUC IS NULL AND GIAI_DOAN_NGHIEM_THU.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_TANG_TAISAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DangNGHIEMTHU_GiamTaisan(NGUOIDUNG nd) {
		try {
			return "SELECT * " + " FROM DOT_THUCHIEN_GIAM_TAISAN ,GIAI_DOAN_NGHIEM_THU"
					+ " INNER JOIN GIAI_DOAN_NGHIEM_THU_CAN_BO"
					+ " ON (GIAI_DOAN_NGHIEM_THU_CAN_BO.MA_GIAI_DOAN_NGHIEM_THU= GIAI_DOAN_NGHIEM_THU.MA_GIAI_DOAN_NGHIEM_THU ) AND TEN_TAI_KHOAN='"
					+ nd.getTEN_TAI_KHOAN() + "'"
					+ " WHERE THOI_DIEM_KET_THUC IS NULL AND GIAI_DOAN_NGHIEM_THU.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_GIAM_TAISAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DaNGHIEMTHU_SuachuaBaoduong(NGUOIDUNG nd) {
		try {
			String userPart = nd == null ? ""
					: " INNER JOIN GIAI_DOAN_NGHIEM_THU_CAN_BO"
							+ " ON (GIAI_DOAN_NGHIEM_THU_CAN_BO.MA_GIAI_DOAN_NGHIEM_THU= GIAI_DOAN_NGHIEM_THU.MA_GIAI_DOAN_NGHIEM_THU ) AND TEN_TAI_KHOAN='"
							+ nd.getTEN_TAI_KHOAN() + "'";
			return "SELECT * " + " FROM DOT_THUCHIEN_SUACHUA_BAODUONG ,GIAI_DOAN_NGHIEM_THU" + userPart
					+ " WHERE THOI_DIEM_KET_THUC IS NOT NULL AND GIAI_DOAN_NGHIEM_THU.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_SUACHUA_BAODUONG.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DaNGHIEMTHU_TangTaisan(NGUOIDUNG nd) {
		try {
			String userPart = (nd == null) ? ""
					: " INNER JOIN GIAI_DOAN_NGHIEM_THU_CAN_BO"
							+ " ON (GIAI_DOAN_NGHIEM_THU_CAN_BO.MA_GIAI_DOAN_NGHIEM_THU= GIAI_DOAN_NGHIEM_THU.MA_GIAI_DOAN_NGHIEM_THU ) AND TEN_TAI_KHOAN='"
							+ nd.getTEN_TAI_KHOAN() + "'";
			return "SELECT * " + " FROM DOT_THUCHIEN_TANG_TAISAN ,GIAI_DOAN_NGHIEM_THU" + userPart
					+ " WHERE THOI_DIEM_KET_THUC IS NOT NULL AND GIAI_DOAN_NGHIEM_THU.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_TANG_TAISAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_GiaidoanNghiemthu(int ma_PHANVIEC) {
		try {
			return "SELECT *  FROM GIAI_DOAN_NGHIEM_THU  WHERE  MA_GIAI_DOAN_NGHIEM_THU = '" + ma_PHANVIEC + "'";
		} catch (Exception e) {
			return null;
		}
	}

}
