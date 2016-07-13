package chapter03;



public class Point  {
	private int x;
	private int y;
	
	public Point(){
		
	}

	public Point(int x, int y){ //super ();
			this.x=x;
			this.y=y;
	}
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}




	public void showPoint(){
		System.out.println("[x= " + x + ",y= " + y + "]에 점을 그렸습니다.");
	}
	public void showPoints(boolean visible){//메소드 오버로드
		if(visible){
			showPoint();//로 써도되고 System.out.println("[x= " + x + ",y= " + y + "]에 점을 그렸습니다.");로 써도됨
			return;
		}
			System.out.println("[x= " + x + ",y= " + y + "]에 점을 지웠습니다.");// if else 복잡하니깐 return을 통해 else 빼기 
	}

	@Override
	public String toString() {
		
		return "point [x="+  x +","+ y;
	}

	@Override
	public int hashCode() {//두개의객체의안의 내용이 값으면 해쉬코드값도 같아야한다
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {// source -> generate hashCode() and equals() 누르면 자동생성!! 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

/*	@Override
	public boolean equals(Object obj) {//두객체의 내용이 같은지 판별하기 위해   override
		if(this==obj){//그냥  같은지
			return true;
		}	
		if(this.getClass()!=obj.getClass()){//?
			return false;
		}
			Point other =(Point)obj;
			if(this.x == other.getX() && this.y == other.getY()){//안의 내용이 같은지
				return true;
			}
			return false;
		}
*/

	}
