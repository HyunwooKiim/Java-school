Class Student{
	String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    
    Student(String name, int ban, int no, int kor, int eng, int math){
    	this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
}
 
 public String info(){
 	return name+","+ban+","+no+","+kor+","+eng+","+math+","+(kor+eng+math)
    +","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f)
    }
}
