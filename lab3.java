public  class student2
 {
    int rollno;
    string name;
    void insertrecord(int r,string n)
       {
        roll no=r;
        name=n;
        }
        void displayinformation(){
            System.out.println(rollno=""+name);}
        public static void main(String[] args) {
		student2 s1=new student2();
		student2 s2=new student2();
		
		s1.insertrecord(111,"Karan");
		s2.insertrecord(222,"aran");
		
		s1.displayinformation();
	    s2.displayinformation();
	    
        }
 }
 
