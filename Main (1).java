public class Main
{
	public static void main(String[] args)
	{
		// 직원관리를 목적으로 설계된 컨트롤 클래스의 인스턴스생성
		EmployeeHandler handler=new EmployeeHandler();

		handler.aAddEmployee(new PermanentWorker("KIM", 1000));   //정규직 등록
		handler.addEmployee(new PermanentWorker("LEE", 1500));

		TemporaryWorker alba=new TemporaryWorker("Jung", 700);	
		alba.addWorkTime(5);									// 5시간 일한결과 등록
		handler.addEmployee(alba);								//임시직 등록	
		
		SalesWorker seller=new SalesWorker("Hong", 1000, 0.1);
		seller.addSalesResult(7000);	        // 영업실적 7000
		handler.addEmployee(seller);

		handler.showAllSalaryInfo();  	// 이번 달에 지불해야 할 급여의 정보	
		handler.showTotalSalary();			// 이번 달에 지불해야 할 급여의 총합
	}
}

