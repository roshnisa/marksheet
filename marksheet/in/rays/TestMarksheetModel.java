package marksheet.in.rays;

public class TestMarksheetModel {
	
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testupdate();
		//testdelete();
		//testget();
		maritlist();
		//search();
		
		
	}
	
	

	private static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(3);
		bean.setRollno("103");
		bean.setFirstName("bhavesh");
		bean.setLastName("Gupta");
		bean.setPhy(61);
		bean.setChem(47);
		bean.setMaths(71);
		MarksheetModel model = new MarksheetModel();
		model.add(bean);
		

	}
	
	private static void testupdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(3);
		bean.setFirstName("kavita");
		MarksheetModel model = new MarksheetModel();
		model.update(bean);
		
		
	}

	private static void testdelete() throws Exception {
        MarksheetBean bean = new MarksheetBean();
        bean.setId(3);
        MarksheetModel model = new MarksheetModel();
        model.delete(bean);

	}

	private static void testget() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(4);
		MarksheetModel model = new MarksheetModel();
        model.testget(bean);
        
		
		
	}
	private static void maritlist() throws Exception {
		MarksheetBean bean = new MarksheetBean();
        MarksheetModel model = new MarksheetModel();
        model.Maritlist(bean);

		
	}
	private static void search() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setFirstName("Shalini");
        MarksheetModel model = new MarksheetModel();
        model.search(bean);

		
		
	}
	
}
