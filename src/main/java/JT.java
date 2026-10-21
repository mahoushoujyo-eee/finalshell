import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;

public class JT {
   private static final Map U = new HashMap();

   JT() {
   }

   public ImageIcon P(String var1) {
      Object[] var10001 = com.c.a(this.getClass(), var1);
      Method var10003 = com.c.d(250722249728895787L);
      Object[] var10002 = var10001;
      JT var3 = this;
      Method var10000 = var10003;

      try {
         return (ImageIcon)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public ImageIcon l(Class var1, String var2) {
      String var3 = var1.getCanonicalName() + ":" + var2;
      if (!((Map)com.c.c(536270001736964625L).get(null)).containsKey(var3)) {
         ((Map)com.c.c(536270001736964625L).get(null)).put(var3, new ImageIcon(var1.getResource("/" + var2)));
      }

      return (ImageIcon)((Map)com.c.c(536270001736964625L).get(null)).get(var3);
   }
}





