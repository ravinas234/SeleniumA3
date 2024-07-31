package Java;

public class StringArrayExplanation {
	public static void main(String[] args) {
		String[][] arr = {{"Firstname","Lastname","Email", "Password"},
		{"Ravina","Shinde","ravinashinde234@gmail.com","Ravina@234"},
		{"renuka","pathade","renuka@gmail.com","renuka@234"},
		{"sumit","pandhawale","sumit23@gmail.com","sumit@234"}};
		
		String[][] result = new String[arr.length] [arr[0].length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				result[i][j]= arr[i][j];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
