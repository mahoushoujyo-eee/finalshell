import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class tf_4 implements Serializable {
   Long M;
   String s;
   List x;
   List k;
   String r;
   long q;
   boolean u;
   String N;
   File X;
   FileSystemView S;
   String T;
   int A;
   boolean R;
   boolean F;
   boolean p;
   long w;
   boolean a;
   int c;
   String o;
   int I;
   int O;
   ln_4 U;

   public tf_4(File var1) {
      com.c.c(287326415495150566L).set(this, new ArrayList());
      com.c.c(440020181240214312L).set(this, new ArrayList());
      com.c.c(390878661137144247L).set(this, FileSystemView.getFileSystemView());
      com.c.c(334384991298488189L).setBoolean(this, true);
      com.c.c(446892190823601335L).setBoolean(this, false);
      com.c.c(511004212502915120L).setBoolean(this, false);
      com.c.c(397903369507915460L).setBoolean(this, false);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(349593801287953443L);
      Object[] var10002 = var10001;
      tf_4 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public tf_4() {
      com.c.c(287326415495150566L).set(this, new ArrayList());
      com.c.c(440020181240214312L).set(this, new ArrayList());
      com.c.c(390878661137144247L).set(this, FileSystemView.getFileSystemView());
      com.c.c(334384991298488189L).setBoolean(this, true);
      com.c.c(446892190823601335L).setBoolean(this, false);
      com.c.c(511004212502915120L).setBoolean(this, false);
      com.c.c(397903369507915460L).setBoolean(this, false);
   }

   public String M() {
      return (String)com.c.c(205274972020184740L).get(this);
   }

   public int y(String var1) {
      String var10000 = F8.y();
      int var3 = 0;
      String[] var2 = var10000;
      List var4 = (List)com.c.c(287326415495150566L).get(this);
      int var5 = 0;

      while (true) {
         label33:
         if (var5 < var4.size()) {
            tf_4 var6 = (tf_4)var4.get(var5);
            if (var2 == null) {
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(498856411508641826L);
               Object[] var10002 = var10001;
               tf_4 var11 = var6;
               Method var8 = var10003;

               try {
                  var10000 = (String)var8.invoke(var11, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }

               var10 = var10000.equals(var1);
               if (var2 != null) {
                  break;
               }

               if (var10 != 0) {
                  var3 = var5;
                  if (var2 == null) {
                     break label33;
                  }
               }

               var5++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var10 = var3;
         break;
      }

      return var10;
   }

   public ck_4 o(String var1) {
      ck_4 var3 = null;
      String[] var10000 = F8.y();
      int var4 = 0;
      String[] var2 = var10000;

      while (true) {
         if (var4 < ((List)com.c.c(440020181240214312L).get(this)).size()) {
            ck_4 var5 = (ck_4)((List)com.c.c(440020181240214312L).get(this)).get(var4);
            if (var2 == null) {
               var7 = var5;
               if (var2 != null) {
                  break;
               }

               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(605430732347023634L);
               Object[] var10002 = var10001;
               ck_4 var10 = var5;
               Method var8 = var10003;

               try {
                  var10000 = (String)var8.invoke(var10, var10002);
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }

               if (var10000 == var1) {
                  var3 = var5;
               }

               var4++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   public void F(String var1) {
      String var10000 = F8.y();
      Iterator var3 = ((List)com.c.c(440020181240214312L).get(this)).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         ck_4 var4 = (ck_4)var3.next();
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(605430732347023634L);
         Object[] var10002 = var10001;
         ck_4 var9 = var4;
         Method var6 = var10003;

         try {
            var10000 = (String)var6.invoke(var9, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         label29: {
            boolean var8 = var10000.equals(var1);
            if (var2 == null) {
               if (!var8) {
                  break label29;
               }

               ((List)com.c.c(440020181240214312L).get(this)).remove(var4);
            }

            if (var2 == null) {
               break;
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void m(String var1) {
      String var10000 = F8.y();
      Iterator var3 = ((List)com.c.c(287326415495150566L).get(this)).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         tf_4 var4 = (tf_4)var3.next();
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(498856411508641826L);
         Object[] var10002 = var10001;
         tf_4 var9 = var4;
         Method var6 = var10003;

         try {
            var10000 = (String)var6.invoke(var9, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         label29: {
            boolean var8 = var10000.equals(var1);
            if (var2 == null) {
               if (!var8) {
                  break label29;
               }

               ((List)com.c.c(287326415495150566L).get(this)).remove(var4);
            }

            if (var2 == null) {
               break;
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void q() {
      Object[] var10000 = com.c.a(com.c.c(287326415495150566L).get(this));
      Method var2 = com.c.d(340646047318521232L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public void f() {
      Object[] var10000 = com.c.a(com.c.c(440020181240214312L).get(this));
      Method var2 = com.c.d(283664198067068358L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public void h(String var1) {
      com.c.c(205274972020184740L).set(this, var1);
   }

   public Long P() {
      return (Long)com.c.c(120089395022956007L).get(this);
   }

   public void o(Long var1) {
      com.c.c(120089395022956007L).set(this, var1);
   }

   public void n(ck_4 var1) {
      ((List)com.c.c(440020181240214312L).get(this)).remove(var1);
   }

   public void I(ck_4 var1) {
      ((List)com.c.c(440020181240214312L).get(this)).add(var1);
   }

   public List f$List() {
      return (List)com.c.c(287326415495150566L).get(this);
   }

   public void b(List var1) {
      com.c.c(287326415495150566L).set(this, var1);
   }

   public List M$List() {
      return (List)com.c.c(440020181240214312L).get(this);
   }

   public void P(List var1) {
      com.c.c(440020181240214312L).set(this, var1);
   }

   public String p() {
      return (String)com.c.c(570963718081561375L).get(this);
   }

   public void x(String var1) {
      com.c.c(570963718081561375L).set(this, var1);
   }

   public boolean p$boolean() {
      return com.c.c(502974509297120220L).getBoolean(this);
   }

   public void v(boolean var1) {
      com.c.c(502974509297120220L).setBoolean(this, var1);
   }

   public long E() {
      return com.c.c(332406009674514605L).getLong(this);
   }

   public void o(long var1) {
      com.c.c(332406009674514605L).setLong(this, var1);
   }

   public String k() {
      return (String)com.c.c(534373980198691195L).get(this);
   }

   public void u(String var1) {
      com.c.c(534373980198691195L).set(this, var1);
   }

   public File M$File() {
      return (File)com.c.c(548882096572174250L).get(this);
   }

   public boolean z() {
      return com.c.c(334384991298488189L).getBoolean(this);
   }

   public void t(File var1) {
      com.c.c(334384991298488189L).setBoolean(this, true);
      com.c.c(548882096572174250L).set(this, var1);
      if (var1 != null) {
      }

      com.c.c(120089395022956007L).set(this, (long)var1.getAbsolutePath().hashCode());
      com.c.c(534373980198691195L).set(this, var1.getAbsolutePath());
      com.c.c(133073232790774573L).set(this, ((FileSystemView)com.c.c(390878661137144247L).get(this)).getSystemDisplayName(var1));
      com.c.c(205274972020184740L).set(this, var1.getName());
      com.c.c(479126713470689971L).setLong(this, var1.lastModified());
   }

   public String g() {
      return (String)com.c.c(133073232790774573L).get(this);
   }

   public void D(String var1) {
      com.c.c(133073232790774573L).set(this, var1);
   }

   public int r() {
      return com.c.c(429651024627034571L).getInt(this);
   }

   public void z(int var1) {
      com.c.c(429651024627034571L).setInt(this, var1);
   }

   public void t(boolean var1) {
      com.c.c(334384991298488189L).setBoolean(this, var1);
   }

   public boolean H() {
      return com.c.c(446892190823601335L).getBoolean(this);
   }

   public void z(boolean var1) {
      com.c.c(446892190823601335L).setBoolean(this, var1);
   }

   public boolean M$boolean() {
      return com.c.c(511004212502915120L).getBoolean(this);
   }

   public void r(boolean var1) {
      com.c.c(511004212502915120L).setBoolean(this, var1);
   }

   public long w() {
      return com.c.c(479126713470689971L).getLong(this);
   }

   public void W(long var1) {
      com.c.c(479126713470689971L).setLong(this, var1);
   }

   public boolean Y() {
      return com.c.c(397903369507915460L).getBoolean(this);
   }

   public void J(boolean var1) {
      com.c.c(397903369507915460L).setBoolean(this, var1);
   }

   public int y() {
      return com.c.c(398001055604146458L).getInt(this);
   }

   public void j(int var1) {
      com.c.c(398001055604146458L).setInt(this, var1);
   }

   public String C() {
      return (String)com.c.c(171747054672934806L).get(this);
   }

   public void E(String var1) {
      com.c.c(171747054672934806L).set(this, var1);
   }

   public int n() {
      return com.c.c(135434626698158844L).getInt(this);
   }

   public void Z(int var1) {
      com.c.c(135434626698158844L).setInt(this, var1);
   }

   public int B() {
      return com.c.c(138834299800738250L).getInt(this);
   }

   public void v(int var1) {
      com.c.c(138834299800738250L).setInt(this, var1);
   }

   public ln_4 V() {
      return (ln_4)com.c.c(563180066072883212L).get(this);
   }

   public void p(ln_4 var1) {
      com.c.c(563180066072883212L).set(this, var1);
   }
}





