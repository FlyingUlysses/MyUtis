import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class DeleteUtils {
	
	/**
	 * 根据文件名包含内容删除文件
	 * @param path
	 * @param suffix
	 */
	public static void Delete4Suffix(String path,String reg){
		File file = new File(path);
		if (!file.isDirectory()) {
			if (file.getName().contains(reg)) {
				System.out.println("删除了"+file.getName());
				file.delete();
			}
		}else {
			String[] list = file.list();
			for (int i = 0; i < list.length; i++) {
				DeleteUtils.Delete4Suffix(path+"\\"+list[i], reg);
			}
		}
	}
}
