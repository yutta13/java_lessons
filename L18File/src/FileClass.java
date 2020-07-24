import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {

        File newTxtDir = new File("D:\\forTxt"); //временно
        File path = new File("D:\\rootFolder");


        File[] arrayt = path.listFiles(new TxtFilter());
        if (arrayt.length>0){
         newTxtDir.mkdir();
        }
        for (File txtFile : arrayt){
            String newdir = newTxtDir.getAbsolutePath().concat("\\").concat(txtFile.getName());
            System.out.println(newdir);
          //  txtFile.renameTo(new File(newdir));
        }

        File[] arrayOfDir = path.listFiles(); //get list of dir
        for (File file : arrayOfDir) //for each file check if it is a dir
         { if (file.isDirectory()){ //if it is a dir - get files .txt
            
                File[] arrayOftxt =  file.listFiles(new TxtFilter());
                for (File txtFile : arrayOftxt){ //for each file.txt replace it to new dir
                    String newdir = newTxtDir.getAbsolutePath().concat("\\").concat(txtFile.getName());
                    txtFile.renameTo(new File(newdir));
                   // System.out.println(newdir);
                }
                file.delete();
            }
         }
    }
}

class TxtFilter implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}

