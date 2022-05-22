package home_library;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResourseLocation {
	final Path resourseDirectory = Paths.get("src", "main", "resourse");
	public final String FILEPATH  = 
        String.format("%s\\%s", resourseDirectory.toFile().getAbsolutePath(), "db-home-library.txt");

}
