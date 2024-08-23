class School{
    private String schoolName;
    private String schoolAddress;
    private String principal;
    private double noOfStudents;
    public School(String  schoolName,String schoolAddress,String  principal,double noOfStudents  ){
        this.schoolName=schoolName;
        this.schoolAddress=schoolAddress;
        this.principal=principal;
        this.noOfStudents=noOfStudents;
    }
    public String getschoolName(){
        return schoolName;
    }
    public String getschoolAddress(){
        return schoolAddress;
    }
    public String getprincipal(){
        return principal;
    }
    public double getnoOfStudents(){
        return noOfStudents;
    }
    public void setprincipal(String principal){
        this.principal=principal;
    }
    public void setnoOfStudents(double noOfStudents){
        this.noOfStudents=noOfStudents;
    }
}