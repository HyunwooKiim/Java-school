class Student{
	String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    
    Student(){} // 기본 생성자
    
    Student(String name, int ban, int no, int kor, int eng, int math){
    	this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
     }
     
     int getTotal(){
     		return kor+eng+math;
     }
     
     float getAverage(){
     		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
     }
     
     public String info(){
 		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()
        +","+getAverage()
     }
