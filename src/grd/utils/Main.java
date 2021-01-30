package grd.utils;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File mainDir = new File("D:\\Física");
		rename(mainDir.listFiles());
		format(mainDir.listFiles());
		setExercises(mainDir.listFiles());
		System.out.println("*-----------------------------*");
		System.out.println("|Script completed succesfully!|");
		System.out.println("*-----------------------------*");
	}

	private static void setExercises(File[] files) {
		System.out.println("*--------------------*");
		System.out.println("|Setting as exercises|");
		System.out.println("*--------------------*");
		for(int m=0; m<files.length; m++) {
			if(files[m].isFile()) {
				try {
					String name = files[m].getName();
					try {
						System.out.println(name.replace("(1)", "actividades"));
						files[m].renameTo(new File("D:\\Física\\"+name.replace("(1)", "actividades")));	
					}catch(Exception e) {}
				}catch(Exception e) {}
			}
		}
	}

	private static void format(File[] files) {
		System.out.println("*----------*");
		System.out.println("|Formatting|");
		System.out.println("*----------*");
		for(int j=0; j<files.length;j++) {
		if(files[j].isFile()) {
			try {
				String name = files[j].getName();
				System.out.println("Formatting: "+name.charAt(0)+name.substring(1).toLowerCase());
				files[j].renameTo(new File("D:\\Física\\"+name.charAt(0)+name.substring(1).toLowerCase()));	
			}catch(Exception e) {}
		}
	}
	}

	private static void rename(File[] files) {
		System.out.println("*--------*");
		System.out.println("|Renaming|");
		System.out.println("*--------*");
		for(int i=0; i<files.length;i++) {
			if(files[i].isFile()) {
				try {
					String name = files[i].getName();
					String[] newName=name.split("\\- ");
					System.out.println(newName[1]+" Renamed succesfully!");
					files[i].renameTo(new File("D:\\Física\\"+newName[1]));	
				}catch(Exception e) {}
			}
		}
	}

}
