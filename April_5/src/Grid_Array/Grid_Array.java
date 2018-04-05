package Grid_Array;

public class Grid_Array {

	public static void main(String[] args) {

		String[]grid={"_","_","_","_","_"};


		for(int i=0; i<grid.length; i++){

			System.out.print(" ");
			
			for(int y=0; y<grid.length;  y++){

				System.out.print(grid[y]+ " ");
	
			}
		}
	}
}