package Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		PvrMovies mov1=new PvrMovies(101,"Kerala");
		PvrMovies mov2=new PvrMovies(102,"Evil deal");
		PvrMovies mov3=new PvrMovies(103,"fast x");
		ArrayList pvr = new ArrayList();
		pvr.add(mov1);
		pvr.add(mov2);
		pvr.add(mov3);
		for(Object pm : pvr)
		{
			if(pm instanceof PvrMovies)
			{
				PvrMovies p=(PvrMovies)pm;
			    System.out.println(p.pvrAudiNum+" "+p.pvrMovieName);
			}
		}
	}
}
