import com._y_2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class KV {
   public boolean Z;
   public long K_;
   private long U;
   private long l;
   private long KP;
   private long b;
   private long KM;
   private long q;
   long K0;
   long KQ;
   long Kr;
   long W;
   public ArrayList Kx;
   public ArrayList y;
   ArrayList KT;
   int Ko;
   ArrayList Q;
   int K6;
   int H;
   int j;
   String L;
   String Y;
   float i;
   float Kw;
   float F;
   long KA;
   long N;
   long K9;
   long Ki;
   float Kn;
   float v;
   ArrayList Ke;
   Ty_2 KU;
   zh_2 O;
   String X;
   String x;
   String Kc;
   boolean I;
   int c;
   ArrayList C;
   private HashMap r;
   private HashMap B;
   private HashMap Kq;
   HashMap o;
   HashMap t;
   public ArrayList e;
   uI_3 KR;
   uI_3 z;
   ArrayList s;
   ArrayList k;
   ArrayList M;
   HashMap KX;
   String KN;
   String Kk;
   List S;
   public static int d;
   public static int A;
   public static int R;
   int K3;
   U E;
   _y_2 Ky;
   ArrayList J;
   HashMap Kt;
   HashMap w;
   HashMap KV;
   String K;
   public String P;
   public String T;
   public String K7;
   public String h;
   public String KF;
   public String G;
   public String u;
   public String a;
   public ArrayList f;
   public float K4;
   public float Ka;
   public float D;
   public float KE;
   public float n;
   public float g;
   public float p;
   public float m;
   private static String[] V;
   private static final long[] ab;
   private static final Integer[] bb;

   public KV() {
      com.c.c(461634183601281643L).setBoolean(this, false);
      com.c.c(145065415043723772L).set(this, new ArrayList());
      com.c.c(440679443050947666L).set(this, new ArrayList());
      com.c.c(331392941524154562L).set(this, new ArrayList());
      com.c.c(499668470188365332L).set(this, new ArrayList());
      com.c.c(160206397693083276L).setInt(this, a(24028, 8752817068883030092L));
      com.c.c(163804441514003146L).setInt(this, a(31136, 8576188376594519091L));
      com.c.c(634329548138662429L).set(this, "");
      com.c.c(170871081927228831L).set(this, new ArrayList());
      com.c.c(173605349477549712L).setBoolean(this, false);
      com.c.c(339725338807347986L).setInt(this, 0);
      com.c.c(560968132035439101L).set(this, new ArrayList());
      com.c.c(479474497587386484L).set(this, new HashMap());
      com.c.c(607995512395270001L).set(this, new HashMap());
      com.c.c(600054082677792342L).set(this, new HashMap());
      com.c.c(376104324445056825L).set(this, new HashMap());
      com.c.c(596174358018264971L).set(this, new HashMap());
      com.c.c(561219037117570651L).set(this, new ArrayList());
      com.c.c(433779219006082278L).set(this, null);
      com.c.c(490170495427869670L).set(this, new ArrayList());
      com.c.c(228370773532392878L).set(this, new ArrayList());
      com.c.c(347265159330994458L).set(this, new ArrayList());
      com.c.c(178455607871494135L).set(this, new HashMap());
      com.c.c(484505275822541853L).set(this, new ArrayList());
      com.c.c(353651663696402392L).setInt(this, com.c.c(446362246660561336L).getInt(null));
      com.c.c(476574520691101634L).set(this, new ArrayList());
      com.c.c(372280250081052002L).set(this, new HashMap());
      com.c.c(302872926979192717L).set(this, new HashMap());
      com.c.c(382338391250706591L).set(this, new HashMap());
      com.c.c(134673259912521572L).set(this, new ArrayList());
      com.c.c(623923395514501325L).setFloat(this, -1.0F);
   }

   public void I(String var1, bo_4 var2) {
      ((HashMap)com.c.c(382338391250706591L).get(this)).put(var1, var2);
   }

   public bo_4 b(String var1) {
      return (bo_4)((HashMap)com.c.c(382338391250706591L).get(this)).get(var1);
   }

   public void w(String var1, ArrayList var2) {
      ((HashMap)com.c.c(372280250081052002L).get(this)).put(var1, var2);
      ((HashMap)com.c.c(302872926979192717L).get(this)).put(var1, System.currentTimeMillis());
   }

   public void L(String var1) {
      ((HashMap)com.c.c(372280250081052002L).get(this)).remove(var1);
   }

   public ArrayList F(String var1) {
      return (ArrayList)((HashMap)com.c.c(372280250081052002L).get(this)).get(var1);
   }

   public Long R(String var1) {
      return (Long)((HashMap)com.c.c(302872926979192717L).get(this)).get(var1);
   }

   public void Y() {
      ((HashMap)com.c.c(372280250081052002L).get(this)).clear();
   }

   public uI_3 h(String var1) {
      String[] var10000 = b();
      uI_3 var3 = null;
      String[] var2 = var10000;
      Iterator var4 = ((ArrayList)com.c.c(561219037117570651L).get(this)).iterator();

      while (true) {
         if (var4.hasNext()) {
            uI_3 var5 = (uI_3)var4.next();
            var7 = var5;
            if (var2 != null) {
               break;
            }

            label30: {
               if (var2 == null) {
                  Object[] var10001 = com.c.f();
                  Method var10003 = com.c.d(326911699754169518L);
                  Object[] var10002 = var10001;
                  uI_3 var10 = var5;
                  Method var8 = var10003;

                  try {
                     var10000 = (String)var8.invoke(var10, var10002);
                  } catch (InvocationTargetException var6) {
                     throw var6.getTargetException();
                  }

                  if (!var10000.equals(var1)) {
                     break label30;
                  }

                  var7 = var5;
               }

               var3 = var7;
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

   public synchronized u8_2 m(int var1) {
      String[] var10000 = b();
      u8_2 var3 = (u8_2)((HashMap)com.c.c(479474497587386484L).get(this)).get(var1);
      String[] var2 = var10000;
      u8_2 var5 = var3;
      if (var2 == null) {
         if (var3 == null) {
            var3 = new u8_2();
            Object[] var10001 = com.c.a(var1);
            Method var10003 = com.c.d(216694399931710134L);
            Object[] var10002 = var10001;
            u8_2 var7 = var3;
            Method var6 = var10003;

            try {
               var6.invoke(var7, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            ((HashMap)com.c.c(479474497587386484L).get(this)).put(var1, var3);
         }

         var5 = var3;
      }

      return var5;
   }

   public synchronized boolean m$boolean(int var1) {
      return ((HashMap)com.c.c(479474497587386484L).get(this)).containsKey(var1);
   }

   public synchronized void H(int var1) {
      ((HashMap)com.c.c(479474497587386484L).get(this)).remove(var1);
   }

   public HashMap E() {
      return (HashMap)com.c.c(479474497587386484L).get(this);
   }

   public synchronized HashMap h() {
      return (HashMap)((HashMap)com.c.c(479474497587386484L).get(this)).clone();
   }

   public void w() {
      ((ArrayList)com.c.c(331392941524154562L).get(this)).clear();
      ((ArrayList)com.c.c(145065415043723772L).get(this)).clear();
      ((ArrayList)com.c.c(440679443050947666L).get(this)).clear();
      ((ArrayList)com.c.c(170871081927228831L).get(this)).clear();
      ((HashMap)com.c.c(479474497587386484L).get(this)).clear();
      ((HashMap)com.c.c(607995512395270001L).get(this)).clear();
      ((HashMap)com.c.c(376104324445056825L).get(this)).clear();
      ((HashMap)com.c.c(596174358018264971L).get(this)).clear();
      ((HashMap)com.c.c(600054082677792342L).get(this)).clear();
      ((ArrayList)com.c.c(490170495427869670L).get(this)).clear();
      ((ArrayList)com.c.c(228370773532392878L).get(this)).clear();
      ((ArrayList)com.c.c(347265159330994458L).get(this)).clear();
      ((HashMap)com.c.c(178455607871494135L).get(this)).clear();
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new VW(this), a(5184, 8510190696092334545L));
      Method var10003 = com.c.d(266288712085965362L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public long w$long() {
      return com.c.c(358845271564900026L).getLong(this);
   }

   public synchronized void l(long var1) {
      String[] var3;
      long var10;
      label38: {
         com.c.c(358845271564900026L).setLong(this, var1);
         String[] var10000 = b();
         ((ArrayList)com.c.c(145065415043723772L).get(this)).add(com.c.c(358845271564900026L).getLong(this));
         var3 = var10000;
         int var9 = ((ArrayList)com.c.c(145065415043723772L).get(this)).size();
         if (var3 == null) {
            if (var9 > com.c.c(160206397693083276L).getInt(this)) {
               ((ArrayList)com.c.c(145065415043723772L).get(this)).remove(0);
            }

            var10 = com.c.c(358845271564900026L).getLong(this);
            if (var3 != null) {
               break label38;
            }

            long var11;
            var9 = (var11 = var10 - com.c.c(326380557918603131L).getLong(this)) == 0L ? 0 : (var11 < 0L ? -1 : 1);
         }

         if (var9 > 0) {
            com.c.c(326380557918603131L).setLong(this, com.c.c(358845271564900026L).getLong(this));
         }

         var10 = 0L;
      }

      long var4 = var10;
      Iterator var6 = ((ArrayList)com.c.c(145065415043723772L).get(this)).iterator();

      while (true) {
         if (var6.hasNext()) {
            long var7 = (Long)var6.next();
            var4 += var7;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         com.c.c(336164899962354822L).setLong(this, var4 / (long)((ArrayList)com.c.c(145065415043723772L).get(this)).size());
         break;
      }
   }

   public long r() {
      return com.c.c(617299953892353908L).getLong(this);
   }

   public synchronized void t(org.icmp4j.j var1) {
      String[] var10000 = b();
      ((ArrayList)com.c.c(331392941524154562L).get(this)).add(var1);
      String[] var2 = var10000;
      int var6 = ((ArrayList)com.c.c(331392941524154562L).get(this)).size();
      if (var2 == null) {
         if (var6 > com.c.c(163804441514003146L).getInt(this)) {
            ((ArrayList)com.c.c(331392941524154562L).get(this)).remove(0);
         }

         var6 = com.c.c(173605349477549712L).getBoolean(this);
      }

      label54: {
         label58: {
            if (var2 == null) {
               if (var6 == 0) {
                  var6 = var1.q();
                  if (var2 != null) {
                     break label54;
                  }

                  if (var6 == 0) {
                     break label58;
                  }

                  com.c.c(563659240650350807L).setInt(this, var1.r());
                  if (var2 == null) {
                     break label58;
                  }
               }

               var6 = var1.r();
            }

            if (var2 != null) {
               break label54;
            }

            if (var6 >= 0) {
               com.c.c(563659240650350807L).setInt(this, var1.r());
            }
         }

         var6 = 0;
      }

      int var3 = var6;
      Iterator var4 = ((ArrayList)com.c.c(331392941524154562L).get(this)).iterator();

      while (true) {
         if (var4.hasNext()) {
            org.icmp4j.j var5 = (org.icmp4j.j)var4.next();
            if (var2 != null) {
               break;
            }

            if (var5.r() < 0) {
               var3++;
            }

            if (var2 == null) {
               continue;
            }
         }

         com.c.c(339725338807347986L).setInt(this, var3);
         break;
      }
   }

   public synchronized void V(long var1) {
      String[] var3;
      long var10;
      label38: {
         com.c.c(617299953892353908L).setLong(this, var1);
         String[] var10000 = b();
         ((ArrayList)com.c.c(440679443050947666L).get(this)).add(com.c.c(617299953892353908L).getLong(this));
         var3 = var10000;
         int var9 = ((ArrayList)com.c.c(440679443050947666L).get(this)).size();
         if (var3 == null) {
            if (var9 > com.c.c(160206397693083276L).getInt(this)) {
               ((ArrayList)com.c.c(440679443050947666L).get(this)).remove(0);
            }

            var10 = com.c.c(617299953892353908L).getLong(this);
            if (var3 != null) {
               break label38;
            }

            long var11;
            var9 = (var11 = var10 - com.c.c(297023967117852023L).getLong(this)) == 0L ? 0 : (var11 < 0L ? -1 : 1);
         }

         if (var9 > 0) {
            com.c.c(297023967117852023L).setLong(this, com.c.c(617299953892353908L).getLong(this));
         }

         var10 = 0L;
      }

      long var4 = var10;
      Iterator var6 = ((ArrayList)com.c.c(440679443050947666L).get(this)).iterator();

      while (true) {
         if (var6.hasNext()) {
            long var7 = (Long)var6.next();
            var4 += var7;
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         com.c.c(635649676691536029L).setLong(this, var4 / (long)((ArrayList)com.c.c(440679443050947666L).get(this)).size());
         break;
      }
   }

   public ArrayList h$ArrayList() {
      return (ArrayList)com.c.c(145065415043723772L).get(this);
   }

   public synchronized ArrayList L() {
      ArrayList var1 = new ArrayList();
      var1.addAll((ArrayList)com.c.c(145065415043723772L).get(this));
      return var1;
   }

   public synchronized ArrayList Y$ArrayList() {
      ArrayList var1 = new ArrayList();
      var1.addAll((ArrayList)com.c.c(440679443050947666L).get(this));
      return var1;
   }

   public synchronized ArrayList e() {
      ArrayList var1 = new ArrayList();
      var1.addAll((ArrayList)com.c.c(331392941524154562L).get(this));
      return var1;
   }

   public ArrayList X() {
      return (ArrayList)com.c.c(331392941524154562L).get(this);
   }

   public void a(ArrayList var1) {
      com.c.c(331392941524154562L).set(this, var1);
   }

   public void y() {
      com.c.c(197584667951517205L).setLong(this, 0L);
      com.c.c(224249706707492074L).setLong(this, 0L);
      com.c.c(553364991541524908L).setLong(this, 0L);
      com.c.c(600605087352640318L).setLong(this, 0L);
   }

   public ArrayList I() {
      return (ArrayList)com.c.c(440679443050947666L).get(this);
   }

   public void A(ArrayList var1) {
      com.c.c(440679443050947666L).set(this, var1);
   }

   public String l() {
      return (String)com.c.c(608537944872197145L).get(this);
   }

   public void m(String var1) {
      com.c.c(608537944872197145L).set(this, var1);
   }

   public long z() {
      return com.c.c(600605087352640318L).getLong(this);
   }

   public void M(long var1) {
      com.c.c(600605087352640318L).setLong(this, var1);
   }

   public long J() {
      return com.c.c(553364991541524908L).getLong(this);
   }

   public void z(long var1) {
      com.c.c(553364991541524908L).setLong(this, var1);
   }

   public long e$long() {
      return com.c.c(224249706707492074L).getLong(this);
   }

   public void w(long var1) {
      com.c.c(224249706707492074L).setLong(this, var1);
   }

   public long M() {
      return com.c.c(197584667951517205L).getLong(this);
   }

   public void v(long var1) {
      com.c.c(197584667951517205L).setLong(this, var1);
   }

   public float b() {
      return com.c.c(601251413451527275L).getFloat(this);
   }

   public void g(float var1) {
      com.c.c(601251413451527275L).setFloat(this, var1);
   }

   public long m() {
      return com.c.c(574877765346695989L).getLong(this);
   }

   public void g(long var1) {
      com.c.c(574877765346695989L).setLong(this, var1);
   }

   public long b$long() {
      return com.c.c(205233766635684007L).getLong(this);
   }

   public void f(long var1) {
      com.c.c(205233766635684007L).setLong(this, var1);
   }

   public float V() {
      return com.c.c(505971951449493194L).getFloat(this);
   }

   public void S(float var1) {
      com.c.c(505971951449493194L).setFloat(this, var1);
   }

   public float g() {
      return com.c.c(134921346838480057L).getFloat(this);
   }

   public void x(float var1) {
      com.c.c(134921346838480057L).setFloat(this, var1);
   }

   public float P() {
      return com.c.c(542196700484183728L).getFloat(this);
   }

   public void K(float var1) {
      com.c.c(542196700484183728L).setFloat(this, var1);
   }

   public int A() {
      return com.c.c(563659240650350807L).getInt(this);
   }

   public void W(int var1) {
      com.c.c(563659240650350807L).setInt(this, var1);
   }

   public ArrayList K() {
      return (ArrayList)com.c.c(170871081927228831L).get(this);
   }

   public void W(ArrayList var1) {
      com.c.c(170871081927228831L).set(this, var1);
   }

   public Ty_2 O() {
      return (Ty_2)com.c.c(495313673457085157L).get(this);
   }

   public void U(Ty_2 var1) {
      com.c.c(495313673457085157L).set(this, var1);
   }

   public zh_2 K$zh_2() {
      return (zh_2)com.c.c(358960218727881651L).get(this);
   }

   public void l(zh_2 var1) {
      com.c.c(358960218727881651L).set(this, var1);
   }

   public String S() {
      return (String)com.c.c(161312254309439718L).get(this);
   }

   public void g(String var1) {
      com.c.c(161312254309439718L).set(this, var1);
   }

   public String v() {
      return (String)com.c.c(617476148710129001L).get(this);
   }

   public void N(String var1) {
      com.c.c(617476148710129001L).set(this, var1);
   }

   public String D() {
      return (String)com.c.c(367471813779312594L).get(this);
   }

   public void z(String var1) {
      com.c.c(367471813779312594L).set(this, var1);
   }

   public boolean g$boolean() {
      return com.c.c(173605349477549712L).getBoolean(this);
   }

   public void s(boolean var1) {
      com.c.c(173605349477549712L).setBoolean(this, var1);
   }

   public int B() {
      return com.c.c(339725338807347986L).getInt(this);
   }

   public void t(int var1) {
      com.c.c(339725338807347986L).setInt(this, var1);
   }

   public ArrayList Q() {
      return (ArrayList)com.c.c(560968132035439101L).get(this);
   }

   public void Q(ArrayList var1) {
      com.c.c(560968132035439101L).set(this, var1);
   }

   public int i() {
      return ((HashMap)com.c.c(479474497587386484L).get(this)).size();
   }

   public HashMap T() {
      return (HashMap)com.c.c(607995512395270001L).get(this);
   }

   public void K(HashMap var1) {
      com.c.c(607995512395270001L).set(this, var1);
   }

   public HashMap W() {
      return (HashMap)com.c.c(600054082677792342L).get(this);
   }

   public void k(HashMap var1) {
      com.c.c(600054082677792342L).set(this, var1);
   }

   public long G() {
      return com.c.c(326380557918603131L).getLong(this);
   }

   public void H(long var1) {
      com.c.c(326380557918603131L).setLong(this, var1);
   }

   public long v$long() {
      return com.c.c(297023967117852023L).getLong(this);
   }

   public void F(long var1) {
      com.c.c(297023967117852023L).setLong(this, var1);
   }

   public long I$long() {
      return com.c.c(336164899962354822L).getLong(this);
   }

   public void W(long var1) {
      com.c.c(336164899962354822L).setLong(this, var1);
   }

   public long k() {
      return com.c.c(635649676691536029L).getLong(this);
   }

   public void U(long var1) {
      com.c.c(635649676691536029L).setLong(this, var1);
   }

   public HashMap Y$HashMap() {
      return (HashMap)com.c.c(376104324445056825L).get(this);
   }

   public void Y(HashMap var1) {
      com.c.c(376104324445056825L).set(this, var1);
   }

   public HashMap f() {
      return (HashMap)com.c.c(596174358018264971L).get(this);
   }

   public void H(HashMap var1) {
      com.c.c(596174358018264971L).set(this, var1);
   }

   public ArrayList E$ArrayList() {
      return (ArrayList)com.c.c(561219037117570651L).get(this);
   }

   public uI_3 b$uI_3() {
      return (uI_3)com.c.c(284667866022471457L).get(this);
   }

   public void j(uI_3 var1) {
      com.c.c(284667866022471457L).set(this, var1);
   }

   public uI_3 I$uI_3() {
      return (uI_3)com.c.c(433779219006082278L).get(this);
   }

   public void x(uI_3 var1) {
      com.c.c(433779219006082278L).set(this, var1);
   }

   public float O$float() {
      return com.c.c(285390904816942766L).getFloat(this);
   }

   public void b(float var1) {
      com.c.c(285390904816942766L).setFloat(this, var1);
   }

   public long S$long() {
      return com.c.c(491632743163195844L).getLong(this);
   }

   public void i(long var1) {
      com.c.c(491632743163195844L).setLong(this, var1);
   }

   public long p() {
      return com.c.c(537621560241588005L).getLong(this);
   }

   public void E(long var1) {
      com.c.c(537621560241588005L).setLong(this, var1);
   }

   public String V$String() {
      return (String)com.c.c(634329548138662429L).get(this);
   }

   public void t(String var1) {
      com.c.c(634329548138662429L).set(this, var1);
   }

   public ArrayList b$ArrayList() {
      return (ArrayList)com.c.c(490170495427869670L).get(this);
   }

   public void J(ArrayList var1) {
      com.c.c(490170495427869670L).set(this, var1);
   }

   public ArrayList s() {
      return (ArrayList)com.c.c(228370773532392878L).get(this);
   }

   public void E(ArrayList var1) {
      com.c.c(228370773532392878L).set(this, var1);
   }

   public ArrayList N() {
      return (ArrayList)com.c.c(347265159330994458L).get(this);
   }

   public void q(ArrayList var1) {
      com.c.c(347265159330994458L).set(this, var1);
   }

   public HashMap Z() {
      return (HashMap)com.c.c(178455607871494135L).get(this);
   }

   public void s(HashMap var1) {
      com.c.c(178455607871494135L).set(this, var1);
   }

   public ArrayList z$ArrayList() {
      return (ArrayList)com.c.c(499668470188365332L).get(this);
   }

   public void v(ArrayList var1) {
      com.c.c(499668470188365332L).set(this, var1);
   }

   public int U() {
      return com.c.c(401404027618669330L).getInt(this);
   }

   public void e(int var1) {
      com.c.c(401404027618669330L).setInt(this, var1);
   }

   public String N$String() {
      return (String)com.c.c(190422132413770762L).get(this);
   }

   public void x(String var1) {
      com.c.c(190422132413770762L).set(this, var1);
   }

   public String C() {
      return (String)com.c.c(149748238956047104L).get(this);
   }

   public void P(String var1) {
      com.c.c(149748238956047104L).set(this, var1);
   }

   public List Y$List() {
      return (List)com.c.c(484505275822541853L).get(this);
   }

   public void P(List var1) {
      com.c.c(484505275822541853L).set(this, var1);
   }

   public int X$int() {
      return com.c.c(353651663696402392L).getInt(this);
   }

   public void G(int var1) {
      com.c.c(353651663696402392L).setInt(this, var1);
   }

   public _y_2 C$_y_2() {
      return (_y_2)com.c.c(585210851817000159L).get(this);
   }

   public void O(_y_2 var1) {
      com.c.c(585210851817000159L).set(this, var1);
   }

   public U h$U() {
      return (U)com.c.c(634919959519274946L).get(this);
   }

   public void E(U var1) {
      com.c.c(634919959519274946L).set(this, var1);
   }

   public ArrayList M$ArrayList() {
      return (ArrayList)com.c.c(476574520691101634L).get(this);
   }

   public void T(ArrayList var1) {
      com.c.c(476574520691101634L).set(this, var1);
   }

   public String Z$String() {
      return (String)com.c.c(194899433035228739L).get(this);
   }

   public void s(String var1) {
      com.c.c(194899433035228739L).set(this, var1);
   }

   static {
      long var0 = 2640909237110135954L;
      long[] var6 = new long[4];
      W(null);
      int var3 = 0;
      String var4 = "fµN2â\u0095¦«¯\u0094ÿ\u0018o@íò";
      int var5 = "fµN2â\u0095¦«¯\u0094ÿ\u0018o@íò".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     ab = var6;
                     bb = new Integer[4];
                     com.c.c(446362246660561336L).setInt(null, 0);
                     com.c.c(371231778264945792L).setInt(null, 1);
                     com.c.c(557433960963555325L).setInt(null, a(12513, 7343562933933137267L));
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ò²m«P?I\u008d,rf\u0013\u001f0\u0001ã";
                  var5 = "Ò²m«P?I\u008d,rf\u0013\u001f0\u0001ã".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   public static void W(String[] var0) {
      V = var0;
   }

   public static String[] b$String() {
      return V;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28049;
      if (bb[var3] == null) {
         bb[var3] = (int)(ab[var3] ^ var1);
      }

      return bb[var3];
   }
}





