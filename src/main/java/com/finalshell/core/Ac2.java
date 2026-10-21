package com.finalshell.core;

import com.finalshell.ui.listener.Gp2;
import com.finalshell.ui.listener.Qo_2;
import com.finalshell.ui.listener.YD;
import com.finalshell.ui.model.WF;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.Icon;
import javax.swing.JComponent;

public class Ac2 {
   protected static int Q;
   protected static boolean a;
   protected static boolean C;
   protected static boolean h;
   protected static Map k;
   protected static Map J;
   protected static Map Z;
   protected static List g;
   protected static boolean w;
   public static Ky4[] X;
   public static String b;
   public static long c;

   public static synchronized void S$void() {
      Ky4[] var0 = n();
      boolean var10000 = w;
      if (var0 == null) {
         if (w) {
            return;
         }

         var10000 = true;
      }

      w = var10000;
      Toolkit.getDefaultToolkit().addAWTEventListener(new Gt2(), c);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void q() {
      Ky4[] var10000 = n();
      Iterator var1 = AL_2.J(k.keySet()).iterator();
      Ky4[] var0 = var10000;

      label63:
      while (true) {
         if (var1.hasNext()) {
            Component var2 = (Component)var1.next();
            WC_2 var3 = (WC_2)Z.get(var2);
            var10000 = var3;
            if (var0 == null) {
               if (var0 == null) {
                  if (var3 != null) {
                     var3.Y();
                  }

                  var10000 = (Ky4[])k.get(var2);
               }

               label68: {
                  List var4 = (List)var10000;
                  List var10 = var4;
                  if (var0 == null) {
                     if (var4 == null) {
                        break label68;
                     }

                     var10 = var4;
                  }

                  if (var0 == null) {
                     if (var10.size() <= 0) {
                        break label68;
                     }

                     Iterator var5 = AL_2.J((Collection)var4).iterator();
                  }

                  for (com.finalshell.ui.panel.Wd2 var6 : AL_2.J((Collection)var10)) {
                     var6.j$void();
                     if (var0 != null) {
                        continue label63;
                     }

                     if (var0 != null) {
                        break;
                     }
                  }
               }

               if (var0 == null) {
                  continue;
               }

               var1 = AL_2.J((Collection)g).iterator();
            } else {
               com.finalshell.ui.panel.Wd2 var7 = (com.finalshell.ui.panel.Wd2)var3;
               var7.j$void();
               if (var0 != null) {
                  return;
               }
            }
         }

         for (com.finalshell.ui.panel.Wd2 var8 : AL_2.J((Collection)g)) {
            var8.j$void();
            if (var0 != null) {
               return;
            }
         }

         return;
      }
   }

   public static com.finalshell.ui.panel.Wd2 I(Component var0, String var1) {
      return B(var0, var1, null);
   }

   public static com.finalshell.ui.panel.Wd2 d(Component var0, Icon var1, String var2) {
      return g(var0, var1, var2, null);
   }

   public static com.finalshell.ui.panel.Wd2 B(Component var0, String var1, WF var2) {
      return l(var0, var1, var2, Q);
   }

   public static com.finalshell.ui.panel.Wd2 g(Component var0, Icon var1, String var2, WF var3) {
      return R(var0, var1, var2, var3, Q);
   }

   public static com.finalshell.ui.panel.Wd2 l(Component var0, String var1, WF var2, int var3) {
      return R(var0, null, var1, var2, var3);
   }

   public static com.finalshell.ui.panel.Wd2 R(Component var0, Icon var1, String var2, WF var3, int var4) {
      return B(var0, com.finalshell.ui.panel.Wd2.B(var1, var2), var3, var4);
   }

   public static com.finalshell.ui.panel.Wd2 k(Component var0, JComponent var1) {
      return R(var0, var1, null);
   }

   public static com.finalshell.ui.panel.Wd2 o(Component var0, JComponent var1, int var2) {
      return B(var0, var1, null, var2);
   }

   public static com.finalshell.ui.panel.Wd2 R(Component var0, JComponent var1, WF var2) {
      return B(var0, var1, var2, Q);
   }

   public static com.finalshell.ui.panel.Wd2 B(Component var0, JComponent var1, WF var2, int var3) {
      return W(var0, var1, var2, var3, true);
   }

   public static com.finalshell.ui.panel.Wd2 Q(Component var0, String var1) {
      return q(var0, var1, null);
   }

   public static com.finalshell.ui.panel.Wd2 o(Component var0, Icon var1, String var2) {
      return P(var0, var1, var2, null);
   }

   public static com.finalshell.ui.panel.Wd2 q(Component var0, String var1, WF var2) {
      return r(var0, var1, var2, Q);
   }

   public static com.finalshell.ui.panel.Wd2 P(Component var0, Icon var1, String var2, WF var3) {
      return V(var0, var1, var2, var3, Q);
   }

   public static com.finalshell.ui.panel.Wd2 r(Component var0, String var1, WF var2, int var3) {
      return V(var0, null, var1, var2, var3);
   }

   public static com.finalshell.ui.panel.Wd2 V(Component var0, Icon var1, String var2, WF var3, int var4) {
      return U(var0, com.finalshell.ui.panel.Wd2.B(var1, var2), var3, var4);
   }

   public static com.finalshell.ui.panel.Wd2 Q(Component var0, JComponent var1) {
      return I(var0, var1, null);
   }

   public static com.finalshell.ui.panel.Wd2 S(Component var0, JComponent var1, int var2) {
      return U(var0, var1, null, var2);
   }

   public static com.finalshell.ui.panel.Wd2 I(Component var0, JComponent var1, WF var2) {
      return U(var0, var1, var2, Q);
   }

   public static com.finalshell.ui.panel.Wd2 U(Component var0, JComponent var1, WF var2, int var3) {
      int var8;
      label30: {
         label32: {
            Ky4[] var10000 = n();
            List var5 = (List)k.get(var0);
            Ky4[] var4 = var10000;
            List var7 = var5;
            if (var4 == null) {
               if (var5 == null) {
                  break label32;
               }

               var7 = var5;
            }

            var8 = var7.size();
            if (var4 == null) {
               if (var8 <= 0) {
                  break label32;
               }

               var8 = (a) ? 1 : 0;
            }

            if (var4 != null) {
               break label30;
            }

            if (var8 == 0) {
               var8 = 1;
               break label30;
            }
         }

         var8 = 0;
      }

      int var6 = var8;
      return W(var0, var1, var2, var3, (boolean)var6);
   }

   protected static com.finalshell.ui.panel.Wd2 W(Component var0, JComponent var1, WF var2, int var3, boolean var4) {
      Ky4[] var5 = n();
      if (var4) {
         o(var0);
      }

      if (var5 == null && k.get(var0) == null) {
         k.put(var0, new ArrayList());
      }

      com.finalshell.ui.panel.Wd2 var6;
      label23: {
         var6 = new com.finalshell.ui.panel.Wd2(var0, var1, var2, C);
         ((List)k.get(var0)).add(var6);
         boolean var10000 = Z.containsKey(var0);
         if (var5 == null) {
            if (!var10000) {
               break label23;
            }

            var10000 = J.containsKey(var0);
         }

         if (var10000) {
            return var6;
         }
      }

      WeakReference var7 = new WeakReference<>(var0);
      WC_2 var8 = new WC_2(b, (long)var3);
      var8.q(new Qo_2(var7));
      var8.x(false);
      Z.put(var0, var8);
      YD var9 = new YD(var7, var8);
      var0.addMouseListener(var9);
      J.put(var0, var9);
      return var6;
   }

   protected static void y(Component var0) {
      Ky4[] var1 = n();
      if (k.get(var0) != null) {
         ArrayList var2 = new ArrayList();
         var2.addAll((Collection)k.get(var0));

         for (com.finalshell.ui.panel.Wd2 var4 : var2) {
            var4.j$void();
            if (var1 != null) {
               break;
            }
         }
      }
   }

   public static boolean h(Component var0) {
      return z(var0, false);
   }

   public static boolean z(Component var0, boolean var1) {
      Ky4[] var2 = n();
      boolean var10000 = k.containsKey(var0);
      if (var2 == null) {
         if (var10000) {
            var10000 = var0.isShowing();
            if (var2 != null) {
               return var10000;
            }

            if (var10000) {
               if (var1) {
                  ((WC_2)Z.get(var0)).q$WC();
                  if (var2 == null) {
                     return true;
                  }
               }

               com.finalshell.ui.panel.Qm2 var3 = OK3.P(var0);
               if (var3 != null) {
                  ArrayList var4 = new ArrayList();
                  var4.addAll((Collection)k.get(var0));

                  for (com.finalshell.ui.panel.Wd2 var6 : var4) {
                     var3.b(var6);
                     if (var2 != null) {
                        break;
                     }
                  }
               }

               return true;
            }
         }

         var10000 = false;
      }

      return var10000;
   }

   public static void p(Component var0) {
      q();
      M(FN.L(var0));
   }

   protected static void M(Window var0) {
      Ky4[] var1 = n();
      if (var0.isShowing()) {
         label41:
         for (Component var3 : k.keySet()) {
            label45: {
               Object var10000 = FN.L(var3);
               if (var1 == null) {
                  if (var10000 != var0) {
                     break label45;
                  }

                  var10000 = var3;
               }

               if (var1 == null) {
                  if (!var10000.isShowing()) {
                     break label45;
                  }

                  var10000 = k.get(var3);
               }

               for (com.finalshell.ui.panel.Wd2 var5 : (List)var10000) {
                  E(var5, false);
                  if (var1 != null) {
                     continue label41;
                  }

                  if (var1 != null) {
                     break;
                  }
               }
            }

            if (var1 != null) {
               break;
            }
         }
      }
   }

   public static void B() {
      Ky4[] var10000 = n();
      Iterator var1 = k.keySet().iterator();
      Ky4[] var0 = var10000;

      label33:
      while (var1.hasNext()) {
         label38: {
            Component var2 = (Component)var1.next();
            var10000 = var2;
            if (var0 == null) {
               if (!var2.isShowing()) {
                  break label38;
               }

               var10000 = (Ky4[])k.get(var2);
            }

            for (com.finalshell.ui.panel.Wd2 var4 : (List)var10000) {
               E(var4, false);
               if (var0 != null) {
                  continue label33;
               }

               if (var0 != null) {
                  break;
               }
            }
         }

         if (var0 != null) {
            break;
         }
      }
   }

   public static void H(JComponent var0) {
      F(var0, GR.lR);
   }

   public static void F(JComponent var0, com.finalshell.ui.model.Cs2 var1) {
      W62.n(var0, var1, new FL_2(var0), true);
   }

   public static void o(Component var0) {
      Ky4[] var1 = n();
      Object var10000 = k.get(var0);
      if (var1 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = k.get(var0);
      }

      for (com.finalshell.ui.panel.Wd2 var3 : AL_2.J((Collection)var10000)) {
         s(var0, var3);
         if (var1 != null) {
            break;
         }
      }
   }

   public static void Y(Component var0, com.finalshell.ui.panel.Wd2[] var1) {
      Ky4[] var2 = n();

      for (com.finalshell.ui.panel.Wd2 var6 : var1) {
         s(var0, var6);
         if (var2 != null) {
            break;
         }
      }
   }

   public static void S(Component var0, List var1) {
      Ky4[] var10000 = n();
      Iterator var3 = var1.iterator();
      Ky4[] var2 = var10000;

      while (var3.hasNext()) {
         com.finalshell.ui.panel.Wd2 var4 = (com.finalshell.ui.panel.Wd2)var3.next();
         s(var0, var4);
         if (var2 != null) {
            break;
         }
      }
   }

   public static void s(Component var0, com.finalshell.ui.panel.Wd2 var1) {
      Ky4[] var10000 = n();
      List var3 = (List)k.get(var0);
      Ky4[] var2 = var10000;
      List var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var4 = var3;
      }

      int var5 = (var4.contains(var1)) ? 1 : 0;
      if (var2 == null) {
         if (var5 == 0) {
            return;
         }

         var5 = var3.size();
      }

      if (var2 == null) {
         if (var5 <= 1) {
            var0.removeMouseListener((MouseListener)J.get(var0));
            J.remove(var0);
            ((WC_2)Z.get(var0)).Y();
            Z.remove(var0);
         }

         var3.remove(var1);
         var1.j$void();
         var1.R$void();
         if (var2 != null) {
            return;
         }

         var5 = var3.size();
      }

      if (var5 == 0) {
         k.remove(var0);
      }
   }

   public static com.finalshell.ui.panel.Wd2 V(Component var0, Point var1, String var2) {
      return C(var0, var1, var2, null);
   }

   public static com.finalshell.ui.panel.Wd2 g(Component var0, Point var1, Icon var2, String var3) {
      return M(var0, var1, var2, var3, null);
   }

   public static com.finalshell.ui.panel.Wd2 C(Component var0, Point var1, String var2, WF var3) {
      return M(var0, var1, null, var2, var3);
   }

   public static com.finalshell.ui.panel.Wd2 M(Component var0, Point var1, Icon var2, String var3, WF var4) {
      com.finalshell.ui.panel.Wd2 var5 = new com.finalshell.ui.panel.Wd2(var0, var2, var3, var4, h);
      var5.G(var1);
      return E(var5, true);
   }

   public static com.finalshell.ui.panel.Wd2 e(Component var0, Point var1, JComponent var2) {
      return e(var0, var1, var2, null);
   }

   public static com.finalshell.ui.panel.Wd2 e(Component var0, Point var1, JComponent var2, WF var3) {
      com.finalshell.ui.panel.Wd2 var4 = new com.finalshell.ui.panel.Wd2(var0, var2, var3, h);
      var4.G(var1);
      return E(var4, true);
   }

   public static com.finalshell.ui.panel.Wd2 i(com.finalshell.ui.panel.Wd2 var0) {
      return E(var0, true);
   }

   protected static com.finalshell.ui.panel.Wd2 E(com.finalshell.ui.panel.Wd2 var0, boolean var1) {
      Ky4[] var2 = n();
      Component var10000 = var0.N$Component();
      if (var2 == null) {
         if (var10000 == null) {
            return null;
         }

         var10000 = var0.N$Component();
      }

      if (var2 == null) {
         if (!var10000.isShowing()) {
            return null;
         }

         var10000 = var0.N$Component();
      }

      Window var3 = FN.L(var10000);
      com.finalshell.ui.panel.Qm2 var4 = OK3.P(var3);
      if (var4 == null) {
         return null;
      } else {
         Gp2 var5 = new Gp2(var0);
         var4.addComponentListener(var5);
         Ru4 var6 = var0.R$boolean() ? new Ru4(var0) : null;
         var0.e(new U5_2(var0, var6, var4, var5, var1));
         g.add(var0);
         var4.b(var0);
         return var0;
      }
   }

   public static int S$int() {
      return Q;
   }

   public static void x(int var0) {
      Q = var0;
   }

   public static boolean N() {
      return a;
   }

   public static void X(boolean var0) {
      a = var0;
   }

   public static boolean y() {
      return C;
   }

   public static void C(boolean var0) {
      C = var0;
   }

   public static boolean M() {
      return h;
   }

   public static void p(boolean var0) {
      h = var0;
   }

   static {
      __vfClinit__();
   }

   public static void G(Ky4[] var0) {
      X = var0;
   }

   public static Ky4[] n() {
      return X;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (n() != null) {
         G(new Ky4[3]);
      }

      char[] var10003 = "\r\u0011{AA$>\u0014\u001fzLR(<w\u001a}^E!/ *}@P?".toCharArray();
      int var10004 = var10003.length;
      int var6 = 0;
      byte var23 = 63;
      char[] var10002 = var10003;
      int var10 = var10004;
      char[] var27;
      byte var31;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var27 = var10003;
         var10005 = var6;
         char var10008 = var10003[var6];
         var10007 = 63;
         var10006 = var10008;
         switch (var6 % 7) {
            case 0:
               var31 = 102;
               break;
            case 1:
               var31 = 65;
               break;
            case 2:
               var31 = 43;
               break;
            case 3:
               var31 = 18;
               break;
            case 4:
               var31 = 10;
               break;
            case 5:
               var31 = 114;
               break;
            default:
               var31 = 113;
         }
      } else {
         var23 = 63;
         var10 = var10004;
         if (var10004 <= var6) {
            String var26 = new String(var10003).intern();
            byte var15 = -1;
            b = var26;
            long var9 = 301930025004794935L;
            long var21 = 590770831973385639L ^ var9;
            var15 = -1;
            long var8 = var21;
            long var7 = 4801841741682966092L;
            long var22 = 4801841741682835020L ^ var7;
            var15 = -1;
            c = var22;
            Q = (int)var8;
            a = true;
            C = true;
            h = false;
            k = new WeakHashMap();
            J = new WeakHashMap();
            Z = new WeakHashMap();
            g = new ArrayList();
            w = false;
            return;
         }

         var27 = var10003;
         var10005 = var6;
         char var32 = var10003[var6];
         var10007 = 63;
         var10006 = var32;
         switch (var6 % 7) {
            case 0:
               var31 = 102;
               break;
            case 1:
               var31 = 65;
               break;
            case 2:
               var31 = 43;
               break;
            case 3:
               var31 = 18;
               break;
            case 4:
               var31 = 10;
               break;
            case 5:
               var31 = 114;
               break;
            default:
               var31 = 113;
         }
      }

      while (true) {
         var27[var10005] = (char)(var10006 ^ var10007 ^ var31);
         var6++;
         if (var23 == 0) {
            var27 = var10002;
            var10005 = var23;
            char var34 = var10002[var23];
            var10007 = var23;
            var10006 = var34;
            switch (var6 % 7) {
               case 0:
                  var31 = 102;
                  break;
               case 1:
                  var31 = 65;
                  break;
               case 2:
                  var31 = 43;
                  break;
               case 3:
                  var31 = 18;
                  break;
               case 4:
                  var31 = 10;
                  break;
               case 5:
                  var31 = 114;
                  break;
               default:
                  var31 = 113;
            }
         } else {
            if (var10 <= var6) {
               String var25 = new String(var10002).intern();
               byte var12 = -1;
               b = var25;
               long var4 = 301930025004794935L;
               long var19 = 590770831973385639L ^ var4;
               var12 = -1;
               long var2 = var19;
               long var0 = 4801841741682966092L;
               long var20 = 4801841741682835020L ^ var0;
               var12 = -1;
               c = var20;
               Q = (int)var2;
               a = true;
               C = true;
               h = false;
               k = new WeakHashMap();
               J = new WeakHashMap();
               Z = new WeakHashMap();
               g = new ArrayList();
               w = false;
               return;
            }

            var27 = var10002;
            var10005 = var6;
            char var33 = var10002[var6];
            var10007 = var23;
            var10006 = var33;
            switch (var6 % 7) {
               case 0:
                  var31 = 102;
                  break;
               case 1:
                  var31 = 65;
                  break;
               case 2:
                  var31 = 43;
                  break;
               case 3:
                  var31 = 18;
                  break;
               case 4:
                  var31 = 10;
                  break;
               case 5:
                  var31 = 114;
                  break;
               default:
                  var31 = 113;
            }
         }
      }
   }
}





