package DAO.BUILD.QUERY.SELECT_LIB;

import DAO.DOT_THUCHIEN_GIAM_TAISAN;
import DAO.DOT_THUCHIEN_SUACHUA_BAODUONG;
import DAO.DOT_THUCHIEN_TANG_TAISAN;
import DAO.LOAITAISAN_CAP_I;
import DAO.LOAITAISAN_CAP_II;
import DAO.LOAITAISAN_CAP_III;
import DAO.NHOMTAISAN_CAP_I;
import DAO.NHOMTAISAN_CAP_II;
import DAO.NHOMTAISAN_CAP_III;
import DAO.NHOMTAISAN_CAP_IV;
import DAO.NHOMTAISAN_CAP_V;
import DAO.PHONGBAN;
import DAO.PHUONGTIEN_GIAOTHONG;
import DAO.TAISAN;

public class query_Select_TAISAN {

	public String getString_FLASH_ACCESS_MAINFORM_LoaiTaisan(PHONGBAN dv, LOAITAISAN_CAP_III p, LOAITAISAN_CAP_II n,
			LOAITAISAN_CAP_I l) {
		try {
			if (dv != null) {
				if (p != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_LOAITAISAN_CAP_III = '"
							+ p.getMA_LOAITAISAN_CAP_III() + "' and MA_DON_VI_SU_DUNG = '" + dv.getMA_PHONGBAN() + "'";
				} else if (n != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_LOAITAISAN_CAP_III FROM LOAITAISAN_CAP_III WHERE  MA_LOAITAISAN_CAP_II = '"
							+ n.getMA_LOAITAISAN_CAP_II()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "' and t.MA_LOAITAISAN_CAP_III = TAISAN.MA_LOAITAISAN_CAP_III;";
				} else if (l != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_LOAITAISAN_CAP_III FROM LOAITAISAN_CAP_III, LOAITAISAN_CAP_II WHERE LOAITAISAN_CAP_III.MA_LOAITAISAN_CAP_II = LOAITAISAN_CAP_II.MA_LOAITAISAN_CAP_II and LOAITAISAN_CAP_II.MA_LOAITAISAN_CAP_I = '"
							+ l.getMA_LOAITAISAN_CAP_I()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "' and t.MA_LOAITAISAN_CAP_III = TAISAN.MA_LOAITAISAN_CAP_III;";
				} else {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "'";
				}
			} else {
				if (p != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_LOAITAISAN_CAP_III = '"
							+ p.getMA_LOAITAISAN_CAP_III() + "';";
				} else if (n != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_LOAITAISAN_CAP_III FROM LOAITAISAN_CAP_III WHERE  MA_LOAITAISAN_CAP_II = '"
							+ n.getMA_LOAITAISAN_CAP_II()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where t.MA_LOAITAISAN_CAP_III = TAISAN.MA_LOAITAISAN_CAP_III;";
				} else if (l != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_LOAITAISAN_CAP_III FROM LOAITAISAN_CAP_III , LOAITAISAN_CAP_II WHERE LOAITAISAN_CAP_III.MA_LOAITAISAN_CAP_II = LOAITAISAN_CAP_II.MA_LOAITAISAN_CAP_II and LOAITAISAN_CAP_II.MA_LOAITAISAN_CAP_I= '"
							+ l.getMA_LOAITAISAN_CAP_I()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where t.MA_LOAITAISAN_CAP_III = TAISAN.MA_LOAITAISAN_CAP_III;";
				} else {
					return "SELECT TAISAN.MA_TAISAN,TAISAN.TEN_TAISAN,TAISAN.Model,TAISAN.Seri,TAISAN.NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN";
				}
			}
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_get_Phukien_Short(TAISAN t) {
		try {
			return "select MA_PHUKIEN, TEN_PHUKIEN, Model, Seri, NGUYEN_GIA from PHUKIEN where MA_TAISAN = '"
					+ t.getMA_TAISAN() + "';";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_FLASH_ACCESS_MAINFORM_NhomTaisan(PHONGBAN dv, NHOMTAISAN_CAP_V lv5, NHOMTAISAN_CAP_IV lv4,
			NHOMTAISAN_CAP_III lv3, NHOMTAISAN_CAP_II lv2, NHOMTAISAN_CAP_I lv1) {
		try {
			if (dv != null) {
				if (lv5 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_NHOMTAISAN_CAP_V = '"
							+ lv5.getMA_NHOMTAISAN_CAP_V() + "' and MA_DON_VI_SU_DUNG = '" + dv.getMA_PHONGBAN() + "'";
				} else if (lv4 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V WHERE  MA_NHOMTAISAN_CAP_IV = '"
							+ lv4.getMA_NHOMTAISAN_CAP_IV()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "' and t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else if (lv3 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V, NHOMTAISAN_CAP_IV WHERE NHOMTAISAN_CAP_V.MA_NHOMTAISAN_CAP_IV = NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_IV and NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_III = '"
							+ lv3.getMA_NHOMTAISAN_CAP_III()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "' and t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else if (lv2 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V, NHOMTAISAN_CAP_IV, NHOMTAISAN_CAP_III WHERE  NHOMTAISAN_CAP_V.MA_NHOMTAISAN_CAP_IV = NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_IV AND NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_III = NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_III AND NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_II = '"
							+ lv2.getMA_NHOMTAISAN_CAP_II()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "' and t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else if (lv1 != null) {
					return "SELECT TAISAN.MA_TAISAN, TEN_TAISAN, TAISAN.Model, TAISAN.Seri, NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V, NHOMTAISAN_CAP_IV, NHOMTAISAN_CAP_III, NHOMTAISAN_CAP_II WHERE NHOMTAISAN_CAP_V.MA_NHOMTAISAN_CAP_IV = NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_IV AND NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_III = NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_III AND NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_II = NHOMTAISAN_CAP_II.MA_NHOMTAISAN_CAP_II and NHOMTAISAN_CAP_II.MA_NHOMTAISAN_CAP_I = '"
							+ lv1.getMA_NHOMTAISAN_CAP_I()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "' and t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_DON_VI_SU_DUNG = '"
							+ dv.getMA_PHONGBAN() + "'";
				}
			} else {
				if (lv5 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where MA_NHOMTAISAN_CAP_V = '"
							+ lv5.getMA_NHOMTAISAN_CAP_V() + "';";
				} else if (lv4 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V WHERE  MA_NHOMTAISAN_CAP_IV = '"
							+ lv4.getMA_NHOMTAISAN_CAP_IV()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else if (lv3 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V, NHOMTAISAN_CAP_IV WHERE NHOMTAISAN_CAP_V.MA_NHOMTAISAN_CAP_IV = NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_IV and NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_III = '"
							+ lv3.getMA_NHOMTAISAN_CAP_III()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else if (lv2 != null) {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V, NHOMTAISAN_CAP_IV, NHOMTAISAN_CAP_III WHERE  NHOMTAISAN_CAP_V.MA_NHOMTAISAN_CAP_IV = NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_IV AND NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_III = NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_III AND NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_II = '"
							+ lv2.getMA_NHOMTAISAN_CAP_II()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else if (lv1 != null) {
					return "SELECT TAISAN.MA_TAISAN, TEN_TAISAN, TAISAN.Model, TAISAN.Seri, NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM (SELECT MA_NHOMTAISAN_CAP_V FROM NHOMTAISAN_CAP_V, NHOMTAISAN_CAP_IV, NHOMTAISAN_CAP_III, NHOMTAISAN_CAP_II WHERE NHOMTAISAN_CAP_V.MA_NHOMTAISAN_CAP_IV = NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_IV AND NHOMTAISAN_CAP_IV.MA_NHOMTAISAN_CAP_III = NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_III AND NHOMTAISAN_CAP_III.MA_NHOMTAISAN_CAP_II = NHOMTAISAN_CAP_II.MA_NHOMTAISAN_CAP_II and NHOMTAISAN_CAP_II.MA_NHOMTAISAN_CAP_I = '"
							+ lv1.getMA_NHOMTAISAN_CAP_I()
							+ "') as t, TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN where t.MA_NHOMTAISAN_CAP_V = TAISAN.MA_NHOMTAISAN_CAP_V;";
				} else {
					return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN FROM TAISAN INNER JOIN PHONGBAN ON TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN  ";
				}
			}
		} catch (Exception e) {
			return null;
		}

	}

	public String getString_get_Phukien_FULL(TAISAN t) {
		try {
			return "select  MA_PHUKIEN, TEN_PHUKIEN, MODEL, SERI, NGUYEN_GIA, MA_TAISAN  from PHUKIEN where MA_TAISAN = '"
					+ t.getMA_TAISAN() + "';";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_TAISAN_Full(Integer key) {
		try {
			return "select * from Taisan where MA_TAISAN='" + key + "'";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_TAISAN_Full(String text_tentaisan, PHONGBAN p) {
		try {
			return "select * from Taisan where TEN_TAISAN LIKE '%" + text_tentaisan + "%' AND MA_DON_VI_SU_DUNG = '"
					+ p.getMA_PHONGBAN() + "'";

		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Tong_SoluongHang_theoColumn(String columnName) {
		try {
			return "SELECT COUNT(*) FROM  (SELECT distinct " + columnName + " FROM Taisan ) as _Taisan WHERE "
					+ columnName + " IS NOT  NULL;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Random_Dulieu_Column(String columnName, int num) {
		try {
			return "SELECT " + columnName + " FROM (SELECT " + columnName + " FROM Taisan ORDER BY  RAND() LIMIT "
					+ (num) + ") as Taisan  WHERE " + columnName + " IS NOT NULL GROUP BY " + columnName + ";";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_FlASH_ACCESS_DotTangTaisan(DOT_THUCHIEN_TANG_TAISAN dtt) {
		try {
			return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN "
					+ " FROM TAISAN_DOT_THUCHIEN_TANG_TAISAN, TAISAN, PHONGBAN"
					+ " WHERE TAISAN_DOT_THUCHIEN_TANG_TAISAN.MA_TAISAN = TAISAN.MA_TAISAN AND TAISAN_DOT_THUCHIEN_TANG_TAISAN.MA_DOT_TANG = '"
					+ dtt.getMA_DOT_TANG() + "' AND TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Taisan_Oto(PHONGBAN dv) {
		try {
			if (dv != null) {
				return "SELECT TAISAN.MA_TAISAN, TEN_TAISAN, TAISAN.NGAY_SU_DUNG, MA_PHUONGTIEN_GIAOTHONG,TEN_PHUONGTIEN_GIAOTHONG, LOAI_PHUONGTIEN_GIAOTHONG, MA_LOAI_XE, BIENSO, SOKHUNG, SOMAY, SO_KM_XE, XANG_DAU, THOIHAN_DANGKIEM, MA_KYHAN_DANGKIEM FROM TAISAN, PHUONGTIEN_GIAOTHONG "
						+ "WHERE TAISAN.MA_TAISAN = PHUONGTIEN_GIAOTHONG.MA_TAISAN AND LOAI_PHUONGTIEN_GIAOTHONG = '1' AND TAISAN.MA_DON_VI_SU_DUNG='"
						+ dv.getMA_PHONGBAN() + "';";
			} else {
				return "SELECT TAISAN.MA_TAISAN, TEN_TAISAN, TAISAN.NGAY_SU_DUNG,  MA_PHUONGTIEN_GIAOTHONG,TEN_PHUONGTIEN_GIAOTHONG, LOAI_PHUONGTIEN_GIAOTHONG, MA_LOAI_XE, BIENSO, SOKHUNG, SOMAY, SO_KM_XE, XANG_DAU, THOIHAN_DANGKIEM, MA_KYHAN_DANGKIEM FROM TAISAN, PHUONGTIEN_GIAOTHONG "
						+ "WHERE TAISAN.MA_TAISAN = PHUONGTIEN_GIAOTHONG.MA_TAISAN AND LOAI_PHUONGTIEN_GIAOTHONG = '1' ;";
			}
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Taisan_Xemey(PHONGBAN dv) {
		try {
			if (dv != null) {
				return "SELECT TAISAN.MA_TAISAN, TEN_TAISAN, TAISAN.NGAY_SU_DUNG, MA_PHUONGTIEN_GIAOTHONG,TEN_PHUONGTIEN_GIAOTHONG, LOAI_PHUONGTIEN_GIAOTHONG, MA_LOAI_XE, BIENSO, SOKHUNG, SOMAY, SO_KM_XE, XANG_DAU, THOIHAN_DANGKIEM, MA_KYHAN_DANGKIEM  FROM TAISAN, PHUONGTIEN_GIAOTHONG "
						+ "WHERE TAISAN.MA_TAISAN = PHUONGTIEN_GIAOTHONG.MA_TAISAN AND LOAI_PHUONGTIEN_GIAOTHONG = '2' AND TAISAN.MA_DON_VI_SU_DUNG='"
						+ dv.getMA_PHONGBAN() + "';";
			} else {
				return "SELECT TAISAN.MA_TAISAN, TEN_TAISAN, TAISAN.NGAY_SU_DUNG, MA_PHUONGTIEN_GIAOTHONG,TEN_PHUONGTIEN_GIAOTHONG, LOAI_PHUONGTIEN_GIAOTHONG, MA_LOAI_XE, BIENSO, SOKHUNG, SOMAY, SO_KM_XE, XANG_DAU, THOIHAN_DANGKIEM, MA_KYHAN_DANGKIEM  FROM TAISAN, PHUONGTIEN_GIAOTHONG "
						+ "WHERE TAISAN.MA_TAISAN = PHUONGTIEN_GIAOTHONG.MA_TAISAN AND LOAI_PHUONGTIEN_GIAOTHONG = '2' ;";
			}
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Taisan(PHUONGTIEN_GIAOTHONG pg) {
		try {
			return "SELECT TAISAN.MA_TAISAN, TEN_TAISAN, TAISAN.NGAY_SU_DUNG, MA_PHUONGTIEN_GIAOTHONG FROM TAISAN, PHUONGTIEN_GIAOTHONG "
					+ "WHERE TAISAN.MA_TAISAN = PHUONGTIEN_GIAOTHONG.MA_TAISAN AND MA_PHUONGTIEN_GIAOTHONG = '"
					+ pg.getMA_PHUONGTIEN_GIAOTHONG() + "' ;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Taisan_DotGiamTaisan(DOT_THUCHIEN_GIAM_TAISAN dgt) {
		try {
			return "SELECT TAISAN.MA_TAISAN,TEN_TAISAN,TAISAN.Model,TAISAN.Seri,NGAY_SU_DUNG, TAISAN.MA_DON_VI_SU_DUNG, PHONGBAN.TEN_PHONGBAN "
					+ " FROM TAISAN_DOT_THUCHIEN_GIAM_TAISAN, TAISAN, PHONGBAN"
					+ " WHERE TAISAN_DOT_THUCHIEN_GIAM_TAISAN.MA_TAISAN = TAISAN.MA_TAISAN AND TAISAN_DOT_THUCHIEN_GIAM_TAISAN.MA_DOT_GIAM = '"
					+ dgt.getMA_DOT_GIAM() + "' AND TAISAN.MA_DON_VI_SU_DUNG = PHONGBAN.MA_PHONGBAN;";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Taisan_SuachuaBaoduong(DOT_THUCHIEN_SUACHUA_BAODUONG vIEW_dsb) {
		try {
			return " select * from TAISAN INNER JOIN DOT_THUCHIEN_SUACHUA_BAODUONG_TAISAN ON "
					+ "(TAISAN.MA_TAISAN = DOT_THUCHIEN_SUACHUA_BAODUONG_TAISAN.MA_TAISAN AND MA_DOT_THUCHIEN_SUACHUA_BAODUONG='"
					+ vIEW_dsb.getMA_DOT_THUCHIEN_SUACHUA_BAODUONG() + "')";
		} catch (Exception e) {
			return null;
		}
	}

	public String getString_Taisan_TangTaisan(DOT_THUCHIEN_TANG_TAISAN dtt) {
		try {
			return " select * from TAISAN INNER JOIN TAISAN_DOT_THUCHIEN_TANG_TAISAN ON (TAISAN.MA_TAISAN = TAISAN_DOT_THUCHIEN_TANG_TAISAN.MA_TAISAN AND MA_DOT_TANG='"
					+ dtt.getMA_DOT_TANG() + "')";
		} catch (Exception e) {
			return null;
		}

	}

	public String getString_TAISAN_From_MaLienket(String maTaisanLienket) {
		return " select * from TAISAN WHERE MA_TANSAN_KETOAN = '" + maTaisanLienket + "'";
	}

}
