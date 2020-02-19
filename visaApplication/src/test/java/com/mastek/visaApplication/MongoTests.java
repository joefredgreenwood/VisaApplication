//package com.mastek.visaApplication;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.mastek.visaApplication.dao.DNADatabaseDAO;
//import com.mastek.visaApplication.entities.DNADatabase;
//
//@SpringBootTest
//class MongoTests {
//
//	@Autowired
//	DNADatabaseDAO dnadao;
//	
//	//Test
//	void Test() {
//		System.out.println("Test");
//	}
//	
//	@Test
//		void test1AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Joe");
//			dna.setLastName("Bramhall");
//			dna.setPassportNumber(111111);
//			dna.setCrimeDescription("Stealing");
//			dna.setCrimeDate("20/01/1997");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//	
//	@Test
//	void test2AddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Terrance");
//		dna.setLastName("Lobb");
//		dna.setPassportNumber(111112);
//		dna.setCrimeDescription("Child Sexual Crime");
//		dna.setCrimeDate("25/06/1993");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	} 	
//	@Test
//	void test3AddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Jason");
//		dna.setLastName("Rutter");
//		dna.setPassportNumber(111113);
//		dna.setCrimeDescription("Child Pornography");
//		dna.setCrimeDate("02/10/2003");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	} 	
//	@Test
//	void test4AddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Matthew");
//		dna.setLastName("Price");
//		dna.setPassportNumber(111114);
//		dna.setCrimeDescription("Stealing");
//		dna.setCrimeDate("06/05/2018");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	} 	
//	@Test
//	void test5AddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Auginiah");
//		dna.setLastName("Nblovu");
//		dna.setPassportNumber(111115);
//		dna.setCrimeDescription("Stealing Medication From Care Home");
//		dna.setCrimeDate("19/02/2017");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	} 	
//	@Test
//	void test6AddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Shahid");
//		dna.setLastName("Mohammed");
//		dna.setPassportNumber(111116);
//		dna.setCrimeDescription("Murders of Three Generations of a Family");
//		dna.setCrimeDate("07/08/2019");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	} 	
//	@Test
//	void test7AddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Sarah");
//		dna.setLastName("Barrass");
//		dna.setPassportNumber(111117);
//		dna.setCrimeDescription("Attempted Murder of Children");
//		dna.setCrimeDate("12/11/2019");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	} 	
//	@Test
//	void test8AddDNA() {
//		DNADatabase dna = new DNADatabase();
//		dna.setFirstName("Darren");
//		dna.setLastName("Jenkinson");
//		dna.setPassportNumber(111118);
//		dna.setCrimeDescription("Killed two sons");
//		dna.setCrimeDate("31/10/2018");
//
//		dna=dnadao.save(dna);
//		System.out.println(dna);
//	}
//		@Test
//		void test9AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Neil");
//			dna.setLastName("Smith");
//			dna.setPassportNumber(111119);
//			dna.setCrimeDescription("Shaing Daughter to Death");
//			dna.setCrimeDate("22/02/2019");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test10AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Thomas");
//			dna.setLastName("Hoare");
//			dna.setPassportNumber(111120);
//			dna.setCrimeDescription("Child Rapist");
//			dna.setCrimeDate("18/06/2018");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test11DNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Csaba");
//			dna.setLastName("Kiss");
//			dna.setPassportNumber(111121);
//			dna.setCrimeDescription("Stealing");
//			dna.setCrimeDate("20/01/1997");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test12AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Joe");
//			dna.setLastName("Bramhall");
//			dna.setPassportNumber(111122);
//			dna.setCrimeDescription("Sexual Assult");
//			dna.setCrimeDate("18/12/2018");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test13AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Peter");
//			dna.setLastName("Watton");
//			dna.setPassportNumber(111123);
//			dna.setCrimeDescription("Armed Robbery");
//			dna.setCrimeDate("20/05/1990");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test14AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Christopher");
//			dna.setLastName("Morin");
//			dna.setPassportNumber(111124);
//			dna.setCrimeDescription("Rapist");
//			dna.setCrimeDate("30/11/1976");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test15AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Joe");
//			dna.setLastName("Bramhall");
//			dna.setPassportNumber(111125);
//			dna.setCrimeDescription("Stealing");
//			dna.setCrimeDate("20/01/1997");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test16AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Aesan");
//			dna.setLastName("Pervez");
//			dna.setPassportNumber(111126);
//			dna.setCrimeDescription("Armed Robbery");
//			dna.setCrimeDate("15/03/2003");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test17AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Clive");
//			dna.setLastName("Lewis");
//			dna.setPassportNumber(111127);
//			dna.setCrimeDescription("Stealing");
//			dna.setCrimeDate("02/05/2012");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test18AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Steven");
//			dna.setLastName("Pickett");
//			dna.setPassportNumber(111128);
//			dna.setCrimeDescription("Attempted Murder");
//			dna.setCrimeDate("25/03/2012");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test19AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("James");
//			dna.setLastName("Craig");
//			dna.setPassportNumber(111129);
//			dna.setCrimeDescription("Murder");
//			dna.setCrimeDate("08/09/2010");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test20AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Kevin");
//			dna.setLastName("Rooney");
//			dna.setPassportNumber(111130);
//			dna.setCrimeDescription("Murder and Paedophile");
//			dna.setCrimeDate("15/06/2012");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test21AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Joe");
//			dna.setLastName("Bramhall");
//			dna.setPassportNumber(111131);
//			dna.setCrimeDescription("Stealing");
//			dna.setCrimeDate("20/01/1997");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test22AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Myra");
//			dna.setLastName("Hindley");
//			dna.setPassportNumber(111132);
//			dna.setCrimeDescription("Serial Killer");
//			dna.setCrimeDate("20/07/1965");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test23AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("John");
//			dna.setLastName("Cronin");
//			dna.setPassportNumber(111133);
//			dna.setCrimeDescription("Sexual Predator");
//			dna.setCrimeDate("19/06/2013");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test24AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Dean");
//			dna.setLastName("Goodwin");
//			dna.setPassportNumber(111134);
//			dna.setCrimeDescription("Armed Robbery");
//			dna.setCrimeDate("10/05/1990");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test25AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("James");
//			dna.setLastName("Major");
//			dna.setPassportNumber(111135);
//			dna.setCrimeDescription("drug smuggler");
//			dna.setCrimeDate("20/01/1997");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test26AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Michael");
//			dna.setLastName("Laverick");
//			dna.setPassportNumber(111136);
//			dna.setCrimeDescription("Stealing");
//			dna.setCrimeDate("10/07/1987");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test27AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Austin");
//			dna.setLastName("Stuart-Taylor");
//			dna.setPassportNumber(111137);
//			dna.setCrimeDescription("Human Trafficing");
//			dna.setCrimeDate("30/08/1990");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test28AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Matthew");
//			dna.setLastName("Avenell");
//			dna.setPassportNumber(111138);
//			dna.setCrimeDescription("Narcotics Dealer");
//			dna.setCrimeDate("18/02/2007");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test29AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Asim");
//			dna.setLastName("Hussain");
//			dna.setPassportNumber(111139);
//			dna.setCrimeDescription("Armed Robery");
//			dna.setCrimeDate("19/04/2003");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test30AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Omar");
//			dna.setLastName("Sharif");
//			dna.setPassportNumber(111140);
//			dna.setCrimeDescription("Sexual Harrassment");
//			dna.setCrimeDate("08/09/2018");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//		@Test
//		void test31AddDNA() {
//			DNADatabase dna = new DNADatabase();
//			dna.setFirstName("Royston");
//			dna.setLastName("White");
//			dna.setPassportNumber(111141);
//			dna.setCrimeDescription("exploitation");
//			dna.setCrimeDate("17/01/1993");
//
//			dna=dnadao.save(dna);
//			System.out.println(dna);
//		} 	
//
//
//}
