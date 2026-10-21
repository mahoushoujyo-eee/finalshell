import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import javax.swing.filechooser.FileSystemView;

public class ck_4 implements Serializable {
   long f;
   long L;
   String S;
   long r;
   String X;
   Timestamp H;
   File v;
   int R;
   String o;
   String t;
   boolean I;
   long x;
   int V;
   boolean G;
   int a;
   String m;
   String q;
   int y;
   int l;
   static FileSystemView U;
   ln_4 O;

   public ck_4(File var1) {
      com.c.c(124607656514820922L).setBoolean(this, false);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(325634526741383265L);
      Object[] var10002 = var10001;
      ck_4 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public ck_4() {
      com.c.c(124607656514820922L).setBoolean(this, false);
   }

   public String T() {
      return (String)com.c.c(147082674119486934L).get(this);
   }

   public void H(String var1) {
      com.c.c(147082674119486934L).set(this, var1);
   }

   public long m() {
      return com.c.c(535403621757972923L).getLong(this);
   }

   public void R(long var1) {
      com.c.c(535403621757972923L).setLong(this, var1);
   }

   public String a() {
      return (String)com.c.c(291178179411629597L).get(this);
   }

   public void T(String var1) {
      com.c.c(291178179411629597L).set(this, var1);
   }

   public long T$long() {
      return com.c.c(555971785129875340L).getLong(this);
   }

   public void q(long var1) {
      com.c.c(555971785129875340L).setLong(this, var1);
   }

   public long V() {
      return com.c.c(486528967412993197L).getLong(this);
   }

   public void w(long var1) {
      com.c.c(486528967412993197L).setLong(this, var1);
   }

   public Timestamp U() {
      return (Timestamp)com.c.c(630397883516711882L).get(this);
   }

   public void H(Timestamp var1) {
      com.c.c(630397883516711882L).set(this, var1);
   }

   public boolean M() {
      return (File)com.c.c(319061412527090643L).get(this) != null;
   }

   public File i() {
      return (File)com.c.c(319061412527090643L).get(this);
   }

   public void N(File var1) {
      com.c.c(319061412527090643L).set(this, var1);
      com.c.c(558196263811559628L).set(this, var1.getAbsolutePath());
      com.c.c(305970725490929616L).set(this, ((FileSystemView)com.c.c(442299594682816259L).get(null)).getSystemDisplayName(var1));
      com.c.c(291178179411629597L).set(this, var1.getName());
      Object[] var10001 = com.c.e(var1.length());
      Method var10003 = com.c.d(130797771737578875L);
      Object[] var10002 = var10001;
      ck_4 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(359393494525141082L).setLong(this, var1.lastModified());
   }

   public int p() {
      return com.c.c(133706834413389952L).getInt(this);
   }

   public void l(int var1) {
      com.c.c(133706834413389952L).setInt(this, var1);
   }

   public String d() {
      return (String)com.c.c(558196263811559628L).get(this);
   }

   public void o(String var1) {
      com.c.c(558196263811559628L).set(this, var1);
   }

   public String y() {
      return (String)com.c.c(305970725490929616L).get(this);
   }

   public void Q(String var1) {
      com.c.c(305970725490929616L).set(this, var1);
   }

   public void B(boolean var1) {
      com.c.c(227534702578793828L).setBoolean(this, var1);
   }

   public long Q() {
      return com.c.c(359393494525141082L).getLong(this);
   }

   public void Q(long var1) {
      com.c.c(359393494525141082L).setLong(this, var1);
   }

   public int I() {
      return com.c.c(284794950070679028L).getInt(this);
   }

   public void U(int var1) {
      com.c.c(284794950070679028L).setInt(this, var1);
   }

   public boolean l() {
      return com.c.c(124607656514820922L).getBoolean(this);
   }

   public void d(boolean var1) {
      com.c.c(124607656514820922L).setBoolean(this, var1);
   }

   public int v() {
      return com.c.c(587530985709747542L).getInt(this);
   }

   public void s(int var1) {
      com.c.c(587530985709747542L).setInt(this, var1);
   }

   public String S() {
      return (String)com.c.c(133527229147317349L).get(this);
   }

   public void W(String var1) {
      com.c.c(133527229147317349L).set(this, var1);
   }

   public String M$String() {
      return (String)com.c.c(291210318993119174L).get(this);
   }

   public void h(String var1) {
      com.c.c(291210318993119174L).set(this, var1);
   }

   public int f() {
      return com.c.c(271149342293157747L).getInt(this);
   }

   public void z(int var1) {
      com.c.c(271149342293157747L).setInt(this, var1);
   }

   public int s() {
      return com.c.c(401764158009500979L).getInt(this);
   }

   public void a(int var1) {
      com.c.c(401764158009500979L).setInt(this, var1);
   }

   public ln_4 u() {
      return (ln_4)com.c.c(197217865165611258L).get(this);
   }

   public void J(ln_4 var1) {
      com.c.c(197217865165611258L).set(this, var1);
   }

   static {
      com.c.c(442299594682816259L).set(null, FileSystemView.getFileSystemView());
   }
}





