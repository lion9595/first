package ex;
import java.util.*;
public class ArrayListQ4_DogTest {

	public static void main(String[] args) {
		/*
		//	Q4  
		ArrayListQ4_Dog[] AllDog=new ArrayListQ4_Dog[5];
		AllDog[0]=new ArrayListQ4_Dog("�����","Ǫ��");
		AllDog[1]=new ArrayListQ4_Dog("�����","Ǫ��");
		AllDog[2]=new ArrayListQ4_Dog("�����","Ǫ��");
		AllDog[3]=new ArrayListQ4_Dog("�����","Ǫ��");
		AllDog[4]=new ArrayListQ4_Dog("�����","Ǫ��");
		
		for(int i=0;i<AllDog.length;i++) 
			System.out.println(AllDog[i].showDogInfo());
		
		
		System.out.println("---------���� for---------");
		
		for(ArrayListQ4_Dog dog : AllDog) 
			System.out.println(dog.showDogInfo());
		*/
		
		// Q5
		ArrayList<ArrayListQ4_Dog> AllDog = new ArrayList<>();
		AllDog.add(new ArrayListQ4_Dog("�����","Ǫ��"));
		AllDog.add(new ArrayListQ4_Dog("����","����"));
		AllDog.add(new ArrayListQ4_Dog("������","Ǫ��"));
		AllDog.add(new ArrayListQ4_Dog("������","Ǫ��"));
		AllDog.add(new ArrayListQ4_Dog("����Ǫ","Ǫ��"));
		AllDog.add(new ArrayListQ4_Dog("�츮���","Ǫ��"));
		
		for(int i=0;i<AllDog.size();i++) {
			ArrayListQ4_Dog Puppy=AllDog.get(i);
			System.out.println(Puppy.showDogInfo());
		}
		System.out.println("---------���� for---------");
		
		for(ArrayListQ4_Dog Puppy : AllDog) 
			System.out.println(Puppy.showDogInfo());
		
		
	}

}
