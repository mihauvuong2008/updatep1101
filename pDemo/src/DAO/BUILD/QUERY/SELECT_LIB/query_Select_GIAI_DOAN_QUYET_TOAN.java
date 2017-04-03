package DAO.BUILD.QUERY.SELECT_LIB;

import DAO.DOT_THUCHIEN_SUACHUA_BAODUONG;
import DAO.DOT_THUCHIEN_TANG_TAISAN;
import DAO.NGUOIDUNG;

public class query_Select_GIAI_DOAN_QUYET_TOAN {

	public String getString_GiaidoanQuyettoan_Tangtaisan(DOT_THUCHIEN_TANG_TAISAN dtt) {
		try {
			return "SELECT * " + " FROM (SELECT * FROM GIAI_DOAN_QUYET_TOAN"
					+ " WHERE  MA_QUATRINH_NGHIEMTHU_QUYETTOAN = '" + dtt.getMA_QUATRINH_NGHIEMTHU_QUYETTOAN()
					+ "' )as t" + " WHERE (THOI_GIAN_KET_THUC IN (SELECT MAX(THOI_GIAN_KET_THUC)"
					+ " FROM (SELECT  THOI_GIAN_KET_THUC" + " FROM GIAI_DOAN_QUYET_TOAN"
					+ " WHERE  MA_QUATRINH_NGHIEMTHU_QUYETTOAN = '" + dtt.getMA_QUATRINH_NGHIEMTHU_QUYETTOAN()
					+ "' )as t ))OR (THOI_GIAN_KET_THUC IS NULL);";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DangQUYETTOAN_SuachuaBaoduong(NGUOIDUNG nd) {
		try {
			return "SELECT * " + " FROM DOT_THUCHIEN_SUACHUA_BAODUONG ,GIAI_DOAN_QUYET_TOAN"
					+ " INNER JOIN GIAI_DOAN_QUYET_TOAN_CAN_BO"
					+ " ON (GIAI_DOAN_QUYET_TOAN_CAN_BO.MA_GIAI_DOAN_QUYET_TOAN= GIAI_DOAN_QUYET_TOAN.MA_GIAI_DOAN_QUYET_TOAN ) AND TEN_TAI_KHOAN='"
					+ nd.getTEN_TAI_KHOAN() + "'"
					+ " WHERE GIAI_DOAN_QUYET_TOAN.THOI_GIAN_KET_THUC IS NULL AND GIAI_DOAN_QUYET_TOAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_SUACHUA_BAODUONG.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DangQUYETTOAN_TangTaisan(NGUOIDUNG nd) {
		try {
			return "SELECT * " + " FROM DOT_THUCHIEN_TANG_TAISAN ,GIAI_DOAN_QUYET_TOAN"
					+ " INNER JOIN GIAI_DOAN_QUYET_TOAN_CAN_BO"
					+ " ON (GIAI_DOAN_QUYET_TOAN_CAN_BO.MA_GIAI_DOAN_QUYET_TOAN= GIAI_DOAN_QUYET_TOAN.MA_GIAI_DOAN_QUYET_TOAN ) AND TEN_TAI_KHOAN='"
					+ nd.getTEN_TAI_KHOAN() + "'"
					+ " WHERE THOI_GIAN_KET_THUC IS NULL AND GIAI_DOAN_QUYET_TOAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_TANG_TAISAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_GiaidoanQuyettoan_SuachuaBaoduong(DOT_THUCHIEN_SUACHUA_BAODUONG dsb) {
		try {
			return "SELECT * FROM GIAI_DOAN_QUYET_TOAN" + " WHERE MA_QUATRINH_NGHIEMTHU_QUYETTOAN = '"
					+ dsb.getMA_QUATRINH_NGHIEMTHU_QUYETTOAN() + "'; ";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DaQUYETTOAN_SuachuaBaoduong(NGUOIDUNG nd) {
		try {
			String userPart = nd == null ? ""
					: " INNER JOIN GIAI_DOAN_QUYET_TOAN_CAN_BO"
							+ " ON (GIAI_DOAN_QUYET_TOAN_CAN_BO.MA_GIAI_DOAN_QUYET_TOAN= GIAI_DOAN_QUYET_TOAN.MA_GIAI_DOAN_QUYET_TOAN ) AND TEN_TAI_KHOAN='"
							+ nd.getTEN_TAI_KHOAN() + "'";
			return "SELECT * " + " FROM DOT_THUCHIEN_SUACHUA_BAODUONG ,GIAI_DOAN_QUYET_TOAN" + userPart
					+ " WHERE GIAI_DOAN_QUYET_TOAN.THOI_GIAN_KET_THUC IS NOT NULL AND GIAI_DOAN_QUYET_TOAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_SUACHUA_BAODUONG.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_CongviecPhanviec_DaQUYETTOAN_TangTaisan(NGUOIDUNG nd) {
		try {
			String userPart = nd == null ? ""
					: " INNER JOIN GIAI_DOAN_QUYET_TOAN_CAN_BO"
							+ " ON (GIAI_DOAN_QUYET_TOAN_CAN_BO.MA_GIAI_DOAN_QUYET_TOAN= GIAI_DOAN_QUYET_TOAN.MA_GIAI_DOAN_QUYET_TOAN ) AND TEN_TAI_KHOAN='"
							+ nd.getTEN_TAI_KHOAN() + "'";
			return "SELECT * " + " FROM DOT_THUCHIEN_TANG_TAISAN ,GIAI_DOAN_QUYET_TOAN" + userPart
					+ " WHERE THOI_GIAN_KET_THUC IS NOT NULL AND GIAI_DOAN_QUYET_TOAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN = DOT_THUCHIEN_TANG_TAISAN.MA_QUATRINH_NGHIEMTHU_QUYETTOAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_GiaidoanQuyettoan(int ma_PHANVIEC) {
		try {
			return "SELECT * " + "  FROM GIAI_DOAN_QUYET_TOAN" + " WHERE  MA_GIAI_DOAN_QUYET_TOAN  = '" + ma_PHANVIEC
					+ "' ";
		} catch (Exception e) {
			return null;
		}
	}

}
