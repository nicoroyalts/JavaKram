package BinaryTree;

public class start {

	public static void main(String[] args) {
		BinaryTree<Integer> b = new BinaryTree<Integer>(new Integer(42));
		b.add(new Integer(10));
		b.add(new Integer(12));
		b.add(new Integer(15));
		b.add(new Integer(45));
		b.add(new Integer(125));
		b.add(new Integer(70));
		b.add(new Integer(2));
		b.add(new Integer(140));
		b.add(new Integer(43));
		b.add(new Integer(4));
		
		//tested 		
		//viewTree();   
		
		//tested
		//for(int i=0;i<100;i++){
		//	System.out.printf("Contains : %s - %s%n",i,b.contains(i));
		//}
		
		/*
		for(int i=0;i<200;i++){
			if(b.contains(i)){
				System.out.printf("Contains : %s%n",i);
			}
		}
		
		System.out.println("cut 125");
		b.cut(125);
		for(int i=0;i<200;i++){
			if(b.contains(i)){
				System.out.printf("Contains : %s%n",i);
			}
		}
		
		System.out.println("cut 45");
		b.cut(45);
		for(int i=0;i<200;i++){
			if(b.contains(i)){
				System.out.printf("Contains : %s%n",i);
			}
		}
		*/
		
		/*
		for(int i=0;i<200;i++){
			if(b.contains(i)){
				System.out.printf("Contains : %s%n",i);
			}
		}
		
		System.out.println("delete 125");
		b.delete(125);
		for(int i=0;i<200;i++){
			if(b.contains(i)){
				System.out.printf("Contains : %s%n",i);
			}
		}
		
		System.out.println("delete 45");
		b.delete(45);
		for(int i=0;i<200;i++){
			if(b.contains(i)){
				System.out.printf("Contains : %s%n",i);
			}
		}
		*/
	}

}
