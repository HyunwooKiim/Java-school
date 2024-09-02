String name;
int ban;
int no;
int kor;
int eng;
int math;

getTotal(kor, eng, math) {
  int total = kor + eng + math;
  return total;
}

getTotal(kor, eng, math) {
  float average = (getTotal()/3.0);
  return average;
}
