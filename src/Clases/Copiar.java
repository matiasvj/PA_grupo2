
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copiar {

        public void copy(File src, File dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
        
        
        byte[] buf = new byte[10240];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    } 
        public void copiar(File src, File dst){
         try {
            
            FileInputStream in = new FileInputStream(src);
            FileOutputStream out = new FileOutputStream(dst);

            int c;
            while ((c = in.read()) != -1)
                out.write(c);

                in.close();
                out.close();

            if (src.exists()) {
            src.delete();
            }

            } catch (IOException e) {
            System.err.println("Hubo un error de entrada/salida: "+e);
            }

           }
 
}
