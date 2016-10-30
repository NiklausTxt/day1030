package com.hibernate.app;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hibernate.bean.AcademyYear;
import com.hibernate.bean.Accommodation;
import com.hibernate.bean.Apartment;
import com.hibernate.bean.Student;
import com.hibernate.bean.StudentStatus;
import com.hibernate.dao.AcademyYearDao;
import com.hibernate.dao.AccommodationDao;
import com.hibernate.dao.ApartmentDao;
import com.hibernate.dao.StudentDao;

public class HibernateApp {
	@SuppressWarnings("deprecation")
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		StudentDao dao = new StudentDao(session);
//		Student student = dao.listByName(100);
//		System.out.println(student.toString());
//		System.out.println(student.getLogin().toString());
//		System.out.println(student.getStatus());
		
		StudentStatus status = session.get(StudentStatus.class,110);
		System.out.println(status);
		System.out.println(status.getStudents().size());
//		ApartmentDao aDao = new ApartmentDao(session);
//		AcademyYearDao ayDao = new AcademyYearDao(session);
//		AccommodationDao acDao = new AccommodationDao(session);
//		List<Student> students = dao.list();
//		 for(Student s: students){
//		 System.out.println(s.toString());
//		 }

//		 List<Student> students2 = dao.listByName(101);
//		 for(Student s: students2){
//		 System.out.println(s.toString());
//		 }
		
//		List<Apartment> apartment = aDao.list();
		// for(Apartment a: apartment){
		// System.out.println(a.toString());
		// }

//		List<AcademyYear> academyYear = ayDao.list();
		// for(AcademyYear a: academyYear){
		// System.out.println(a.toString());
		// }
//		List<Accommodation> accommodation = acDao.list();
//		for (Accommodation a : accommodation) {
//			
//			for (Apartment ap : apartment) {
//				for (Student s : students) {
//					if (s.getId() == a.getStudent_id() && ap.getId() == a.getApartmentId()) {
//						System.out.println("姓名：" + s.getLastname() + s.getFirstname() + ",学号：" + s.getSid() + ",宿舍楼："
//								+ ap.getBuilding() + ",楼层：" + ap.getFloor() + ",房间号：" + ap.getRoom() + ",床号："
//								+ ap.getBed());
//					}
//				}
//			}
//
//		}
		
		
//		Student student = new Student();
//		student.setId(102);
//		student.setLastname("五");
//		student.setFirstname("王");
//		student.setGender("男");
//		student.setPhone("16867587633");
//		student.setEmail("toinf@163.com");
//		student.setDateOfBirth(new Date(1992, 10, 11));
//		student.setStatusId(1);
//		student.setSid(102);
//		
//		dao.insert(student);
//		System.out.println("按entry继续...");
//		sc.nextLine();
//		
//		student.setGender("女");
//		dao.update(student);
//		System.out.println("按entry继续...");
//		sc.nextLine();
//		dao.delete(student);
		
		
		session.close();

	}
}
