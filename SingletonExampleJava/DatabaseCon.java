
//SINGLETON CLASS
class DatabaseCon {
	//#1 SINGLE INSTANCE AS PRIVATE & STATIC
	private static DatabaseCon obj ;

	//#2 CONSTRUCTOR IS PRIVATE
	private DatabaseCon() {}
	
	//#3 METHOD THAT RETURNS SINGLE INSTANCE AS PUBLIC & STATIC
	public static DatabaseCon getInstance() {
		if(obj == null )
		{
			obj = new DatabaseCon();
		}		
		return obj;
	}

}
