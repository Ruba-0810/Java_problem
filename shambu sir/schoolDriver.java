class schoolDriver{
    public static void main(String[] args){
        School s1=new School("ARLM","Cuddalore","Raja",123);
        System.out.println(s1.getschoolName());
        System.out.println(s1.getschoolAddress());
        s1.setprincipal("Rose");
        System.out.println(s1.getprincipal());
        s1.setnoOfStudents(1234);
        System.out.println(s1.getnoOfStudents());
        System.out.println("************************************");
        School s2=new School("SNS","Coimbatore","Rakesh",1000);
        System.out.println(s2.getschoolName());
        System.out.println(s2.getschoolAddress());
        s2.setprincipal("Rajaguru");
        System.out.println(s2.getprincipal());
        s2.setnoOfStudents(2000);
        System.out.println(s2.getnoOfStudents());
    }
}