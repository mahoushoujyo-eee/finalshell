package com.finalshell.core;

import com.finalshell.ui.model.WF;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class W62 {
   public static C82 Z;
   public static On2 l;
   public static Object Y;
   public static boolean y;
   public static boolean G;
   public static Map z;
   public static List R;
   public static Map q;
   public static boolean L;
   public static String[] a;
   public static String[] b;
   public static long c;

   public static synchronized void U() {
      String[] var0 = GR.I();
      boolean var10000 = L;
      if (var0 != null) {
         if (L) {
            return;
         }

         var10000 = true;
      }

      L = var10000;
      PM.m(com.finalshell.ui.model.Cs2.class);
      Toolkit.getDefaultToolkit().addAWTEventListener(new Bm2(), c);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Map b() {
      List var12;
      String[] var10000 = GR.I();
      Object var1 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var0 = var10000;

      try {
         HashMap var2 = new HashMap(z.size());

         for (Entry var4 : z.entrySet()) {
            JComponent var5;
            label79: {
               var5 = (JComponent)var4.getKey();
               WeakReference var6 = (WeakReference)var4.getValue();
               var10000 = var6;
               if (var0 != null) {
                  if (var6 == null) {
                     var12 = null;
                     break label79;
                  }

                  var10000 = (String[])var6.get();
               }

               var12 = (List)var10000;
            }

            List var7 = var12;
            label73:
            if (var5 != null) {
               List var13 = var7;
               if (var0 != null) {
                  if (var7 == null) {
                     break label73;
                  }

                  var13 = var7;
               }

               if (var0 != null && !var13.isEmpty()) {
                  var2.put(var5, AL_2.J((Collection)var7));
               }
            }

            if (var0 == null) {
               break;
            }
         }

         // $VF: monitorexit
         return var2;
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static Map Q() {
      List var12;
      String[] var10000 = GR.I();
      Object var1 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var0 = var10000;

      try {
         HashMap var2 = new HashMap(q.size());

         for (Entry var4 : q.entrySet()) {
            JComponent var5;
            label79: {
               var5 = (JComponent)var4.getKey();
               WeakReference var6 = (WeakReference)var4.getValue();
               var10000 = var6;
               if (var0 != null) {
                  if (var6 == null) {
                     var12 = null;
                     break label79;
                  }

                  var10000 = (String[])var6.get();
               }

               var12 = (List)var10000;
            }

            List var7 = var12;
            label73:
            if (var5 != null) {
               List var13 = var7;
               if (var0 != null) {
                  if (var7 == null) {
                     break label73;
                  }

                  var13 = var7;
               }

               if (var0 != null && !var13.isEmpty()) {
                  var2.put(var5, var7);
               }
            }

            if (var0 == null) {
               break;
            }
         }

         // $VF: monitorexit
         return var2;
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static boolean g(KeyEvent var0) {
      boolean var8;
      int var2 = FN.k(var0).hashCode();
      String[] var10000 = GR.I();
      Iterator var3 = R.iterator();
      String[] var1 = var10000;

      while (true) {
         if (var3.hasNext()) {
            DN_2 var4 = (DN_2)var3.next();
            var8 = (var4.x().hashCode()) != 0;
            if (var1 == null) {
               break;
            }

            if (var1 == null) {
               return (boolean)var8;
            }

            if (var8 == var2) {
               return 1 != 0;
            }

            if (var1 != null) {
               continue;
            }
         }

         var3 = b().entrySet().iterator();
         var8 = var3.hasNext();
         break;
      }

      label54:
      while (var8 != 0) {
         Entry var7 = (Entry)var3.next();

         for (DN_2 var6 : (List)var7.getValue()) {
            var8 = (var6.x().hashCode()) != 0;
            if (var1 == null) {
               continue label54;
            }

            if (var1 == null) {
               return (boolean)var8;
            }

            if (var8 == var2) {
               return 1 != 0;
            }

            if (var1 == null) {
               break;
            }
         }

         if (var1 == null) {
            break;
         }

         var8 = var3.hasNext();
      }

      return false;
   }

   public static void m(KeyEvent var0) {
      Map var2 = b();
      String[] var10000 = GR.I();
      Iterator var3 = R.iterator();
      String[] var1 = var10000;

      while (var3.hasNext()) {
         DN_2 var4 = (DN_2)var3.next();
         a(var0, var4);
         if (var1 != null && var1 != null) {
            continue;
         }
         break;
      }

      for (Entry var7 : var2.entrySet()) {
         Iterator var5 = ((List)var7.getValue()).iterator();

         while (true) {
            if (var5.hasNext()) {
               DN_2 var6 = (DN_2)var5.next();
               a(var0, var6);
               if (var1 == null) {
                  break;
               }

               if (var1 != null) {
                  continue;
               }
            }

            if (var1 == null) {
               return;
            }
            break;
         }
      }
   }

   public static void a(KeyEvent var0, DN_2 var1) {
      DN_2 var11;
      boolean var12;
      Wc2 var8;
      String[] var10000 = GR.I();
      JComponent var3 = var1.j();
      String[] var2 = var10000;
      var10000 = var3;
      if (var2 != null) {
         if (var3 == null) {
            DN_2 var7 = var1;
            if (var2 != null) {
               if (!var1.x().J(var0)) {
                  return;
               }

               var7 = var1;
            }

            var8 = var7.t();
            if (var2 != null) {
               if (var8 == null) {
                  return;
               }

               var8 = var1.t();
            }

            FN.J(var8, var0);
            if (var2 != null) {
               return;
            }
         }

         var10000 = var1.R();
      }

      Object var4 = var10000;
      var10000 = (String[])var4;
      if (var2 != null) {
         var10000 = (String[])(var4 != null ? var4 : FN.L(var3));
      }

      label78: {
         var4 = var10000;
         boolean var10 = FN.l((Component)var4);
         if (var2 != null) {
            if (!var10) {
               return;
            }

            var11 = var1;
            if (var2 == null) {
               break label78;
            }

            var10 = var1.x().J(var0);
         }

         if (!var10) {
            return;
         }

         var11 = var1;
      }

      if (var11.t() != null) {
         var12 = L(var3);
         if (var2 != null) {
            if (!var12) {
               return;
            }

            var12 = G;
         }

         if (var2 != null && var12) {
            var3.requestFocusInWindow();
         }

         FN.J(var1.t(), var0);
      }
   }

   public static boolean L(Component var0) {
      boolean var8;
      String[] var10000 = GR.I();
      Iterator var2 = Q().entrySet().iterator();
      String[] var1 = var10000;

      label52:
      while (true) {
         boolean var6 = var2.hasNext();

         label48:
         while (true) {
            if (var6) {
               label55: {
                  Entry var3 = (Entry)var2.next();
                  Object var7 = (JComponent)var3.getKey();
                  if (var1 != null) {
                     var8 = var7.isAncestorOf(var0);
                     if (var1 == null) {
                        break;
                     }

                     if (!var8) {
                        break label55;
                     }

                     var7 = var3.getValue();
                  }

                  for (PT var5 : (List)var7) {
                     var6 = var5.d(var0);
                     if (var1 == null) {
                        continue label48;
                     }

                     if (var1 == null) {
                        return var6;
                     }

                     if (!var6) {
                        return false;
                     }

                     if (var1 == null) {
                        break;
                     }
                  }
               }

               if (var1 != null) {
                  continue label52;
               }
            }

            var8 = true;
            break;
         }

         return var8;
      }
   }

   public static DN_2 I(com.finalshell.ui.model.Cs2 var0, Wc2 var1) {
      DN_2 var2 = new DN_2();
      var2.s(true);
      var2.M(var0);
      var2.v(var1);
      c(var2);
      return var2;
   }

   public static DN_2 v(JComponent var0, com.finalshell.ui.model.Cs2 var1, Wc2 var2) {
      return H(null, var0, var1, var2);
   }

   public static DN_2 n(JComponent var0, com.finalshell.ui.model.Cs2 var1, Wc2 var2, boolean var3) {
      return h(null, var0, var1, var2, var3);
   }

   public static DN_2 H(Component var0, JComponent var1, com.finalshell.ui.model.Cs2 var2, Wc2 var3) {
      return h(var0, var1, var2, var3, false);
   }

   public static DN_2 r(Component var0, JComponent var1, com.finalshell.ui.model.Cs2 var2, Wc2 var3, WF var4) {
      return k(var0, var1, var2, var3, false, var4);
   }

   public static DN_2 h(Component var0, JComponent var1, com.finalshell.ui.model.Cs2 var2, Wc2 var3, boolean var4) {
      return k(var0, var1, var2, var3, var4, null);
   }

   public static DN_2 k(Component var0, JComponent var1, com.finalshell.ui.model.Cs2 var2, Wc2 var3, boolean var4, WF var5) {
      DN_2 var7 = new DN_2();
      String[] var10000 = GR.I();
      var7.s(var4);
      var7.p(var0);
      var7.u(var1);
      var7.M(var2);
      String[] var6 = var10000;
      var7.T(var5);
      var7.v(var3);
      c(var7);
      if (var6 == null) {
         Ky4.K(new String[3]);
      }

      return var7;
   }

   public static DN_2 R(AbstractButton var0, com.finalshell.ui.model.Cs2 var1) {
      return k(null, var0, var1);
   }

   public static DN_2 T(AbstractButton var0, com.finalshell.ui.model.Cs2 var1, boolean var2) {
      return R(null, var0, var1, var2);
   }

   public static DN_2 y(AbstractButton var0, com.finalshell.ui.model.Cs2 var1, WF var2) {
      return V(null, var0, var1, var2);
   }

   public static DN_2 k(Component var0, AbstractButton var1, com.finalshell.ui.model.Cs2 var2) {
      return R(var0, var1, var2, false);
   }

   public static DN_2 V(Component var0, AbstractButton var1, com.finalshell.ui.model.Cs2 var2, WF var3) {
      return k(var0, var1, var2, F(var1), false, var3);
   }

   public static DN_2 R(Component var0, AbstractButton var1, com.finalshell.ui.model.Cs2 var2, boolean var3) {
      return k(var0, var1, var2, F(var1), var3, null);
   }

   public static Wc2 F(AbstractButton var0) {
      return new Wb4(var0);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void M(JComponent var0, WF var1) {
      String[] var10000 = GR.I();
      Object var3 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         List var4 = O(var0);
         var10000 = var4;
         if (var2 != null) {
            if (var4 != null) {
               for (DN_2 var6 : var4) {
                  var6.T(var1);
                  if (var2 == null) {
                     return;
                  }

                  if (var2 == null) {
                     break;
                  }
               }
            }

            var10000 = (String[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void R(JComponent var0, PT var1) {
      String[] var10000 = GR.I();
      Object var3 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         Object var4 = I(var0);
         var10000 = (String[])var4;
         if (var2 != null) {
            if (var4 == null) {
               var4 = new ArrayList(1);
               var0.putClientProperty(a(-6816, 1474), var4);
               q.put(var0, new WeakReference<>(var4));
            }

            var4.add(var1);
            var10000 = (String[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void j(JComponent var0, PT var1) {
      String[] var10000 = GR.I();
      Object var3 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         List var4 = I(var0);
         var10000 = var4;
         if (var2 != null) {
            if (var4 != null) {
               var4.remove(var1);
            }

            var10000 = (String[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void k(JComponent var0, List var1) {
      String[] var10000 = GR.I();
      Object var3 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var2 = var10000;

      try {
         List var4 = I(var0);
         var10000 = var4;
         if (var2 != null) {
            if (var4 != null) {
               var4.removeAll(var1);
            }

            var10000 = (String[])var3;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public static void T(JComponent var0) {
      synchronized (Y) {
         var0.putClientProperty(a(-6813, 27566), null);
         q.remove(var0);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static List I(JComponent var0) {
      List var8;
      String[] var10000 = GR.I();
      Object var2 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         label31: {
            WeakReference var3 = (WeakReference)q.get(var0);
            var10000 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  var8 = null;
                  break label31;
               }

               var10000 = (String[])var3.get();
            }

            var8 = (List)var10000;
         }

         // $VF: monitorexit
         return var8;
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static List j(JComponent var0) {
      String[] var10000 = GR.I();
      Object var2 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         label31: {
            List var3 = I(var0);
            List var7 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  var8 = new ArrayList();
                  break label31;
               }

               var7 = var3;
            }

            var8 = AL_2.J((Collection)var7);
         }

         // $VF: monitorexit
         return var8;
      } finally {
         // $VF: monitorexit
      }
   }

   public static void n(DN_2 var0) {
      A(var0);
   }

   public static void A(JComponent var0) {
      Z(var0);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void c(DN_2 var0) {
      JComponent var8;
      String[] var10000 = GR.I();
      Object var2 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         label65: {
            label69: {
               label70: {
                  JComponent var3 = var0.j();
                  var8 = var3;
                  if (var1 != null) {
                     if (var3 == null) {
                        break label70;
                     }

                     var8 = var0.j();
                  }

                  Object var4 = O(var8);
                  Object var9 = var4;
                  if (var1 != null) {
                     if (var4 == null) {
                        var4 = new ArrayList(1);
                        var3.putClientProperty(a(-6814, -10670), var4);
                        z.put(var3, new WeakReference<>(var4));
                     }

                     var9 = var4;
                  }

                  var9.add(var0);
                  if (var1 != null) {
                     break label69;
                  }
               }

               var10000 = R;
               if (var1 == null) {
                  break label65;
               }

               if (!R.contains(var0)) {
                  R.add(var0);
               }
            }

            var10000 = (String[])var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public static void A(DN_2 var0) {
      String[] var1 = GR.I();
      List var10000 = var0;
      if (var1 != null) {
         if (var0 == null) {
            return;
         }

         var10000 = (List)Y;
      }

      synchronized (var10000) {
         label48: {
            JComponent var3 = var0.j();
            var10000 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  break label48;
               }

               var10000 = var3;
            }

            label30: {
               List var4 = O((JComponent)var10000);
               var10000 = var4;
               if (var1 != null) {
                  if (var4 == null) {
                     break label30;
                  }

                  var10000 = var4;
               }

               var10000.remove(var0);
            }

            if (var1 != null) {
               return;
            }
         }

         R.remove(var0);
      }
   }

   public static void j(List var0) {
      String[] var1 = GR.I();
      Object var10000 = var0;
      if (var1 != null) {
         if (var0 == null) {
            return;
         }

         var10000 = var0;
      }

      if (var1 != null) {
         if (var10000.isEmpty()) {
            return;
         }

         var10000 = Y;
      }

      synchronized (var10000) {
         for (DN_2 var4 : var0) {
            A(var4);
            if (var1 == null || var1 == null) {
               break;
            }
         }
      }
   }

   public static void Z(JComponent var0) {
      synchronized (Y) {
         var0.putClientProperty(a(-6810, 15847), null);
         z.remove(var0);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static List O(JComponent var0) {
      List var8;
      String[] var10000 = GR.I();
      Object var2 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         label31: {
            WeakReference var3 = (WeakReference)z.get(var0);
            var10000 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  var8 = null;
                  break label31;
               }

               var10000 = (String[])var3.get();
            }

            var8 = (List)var10000;
         }

         // $VF: monitorexit
         return var8;
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static List g(JComponent var0) {
      String[] var10000 = GR.I();
      Object var2 = Y;
      synchronized (Y){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         label31: {
            List var3 = O(var0);
            List var7 = var3;
            if (var1 != null) {
               if (var3 == null) {
                  var8 = new ArrayList();
                  break label31;
               }

               var7 = var3;
            }

            var8 = AL_2.J((Collection)var7);
         }

         // $VF: monitorexit
         return var8;
      } finally {
         // $VF: monitorexit
      }
   }

   public static void x() {
      Ac2.q();
      String[] var10000 = GR.I();
      Window[] var1 = Window.getWindows();
      String[] var0 = var10000;

      for (Window var4 : var1) {
         u(var4);
         if (var0 == null) {
            break;
         }
      }
   }

   public static void g(Component var0) {
      Ac2.q();
      u(FN.L(var0));
   }

   public static void u(Window var0) {
      boolean var11;
      JComponent var12;
      com.finalshell.ui.panel.O var8;
      String[] var10000 = GR.I();
      LinkedHashSet var2 = new LinkedHashSet();
      String[] var1 = var10000;
      Iterator var3 = b().entrySet().iterator();

      label68:
      while (true) {
         boolean var9 = var3.hasNext();

         label66:
         while (var9) {
            Entry var4 = (Entry)var3.next();

            for (DN_2 var6 : (List)var4.getValue()) {
               label60: {
                  DN_2 var10 = var6;
                  if (var1 != null) {
                     var9 = var6.o();
                     if (var1 == null) {
                        continue label66;
                     }

                     if (var9) {
                        break label60;
                     }

                     var10 = var6;
                  }

                  JComponent var7 = var10.j();
                  label54:
                  if (var7 != null) {
                     var11 = var2.contains(var7);
                     if (var1 != null) {
                        if (var11) {
                           break label54;
                        }

                        var11 = var7.isVisible();
                     }

                     label76: {
                        if (var1 != null) {
                           if (!var11) {
                              break label54;
                           }

                           var12 = var7;
                           if (var1 == null) {
                              break label76;
                           }

                           var11 = var7.isShowing();
                        }

                        if (!var11) {
                           break label54;
                        }

                        var12 = var7;
                     }

                     if (FN.L(var12) == var0) {
                        var8 = new com.finalshell.ui.panel.O(S(var7));
                        var8.S$void(a(-6809, -9940));
                        var8.A$O_();
                        Ac2.e(var7, null, var8, var6.O());
                        var2.add(var7);
                     }
                  }
               }

               if (var1 == null) {
                  break;
               }
            }

            if (var1 == null) {
               return;
            }
            continue label68;
         }

         return;
      }
   }

   public static void h(JComponent var0) {
      x(var0, GR.rC);
   }

   public static void x(JComponent var0, com.finalshell.ui.model.Cs2 var1) {
      h(var0, var0, var1, new EJ(var0), true);
   }

   public static String S(JComponent var0) {
      synchronized (Y) {
         List var2 = O(var0);
         return NE.y(var2, a(-6815, 10429), Z, l);
      }
   }

   public static void u() {
      synchronized (Y) {
         y = false;
      }
   }

   public static void T() {
      synchronized (Y) {
         y = true;
      }
   }

   public static boolean Z() {
      synchronized (Y) {
         return G;
      }
   }

   public static void y(boolean var0) {
      synchronized (Y) {
         G = var0;
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var8;
      int var2 = (var0 ^ -6814) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 170;
               break;
            case 1:
               var10000 = 16;
               break;
            case 2:
               var10000 = 152;
               break;
            case 3:
               var10000 = 246;
               break;
            case 4:
               var10000 = 103;
               break;
            case 5:
               var10000 = 54;
               break;
            case 6:
               var10000 = 38;
               break;
            case 7:
               var10000 = 239;
               break;
            case 8:
               var10000 = 211;
               break;
            case 9:
               var10000 = 34;
               break;
            case 10:
               var10000 = 55;
               break;
            case 11:
               var10000 = 229;
               break;
            case 12:
               var10000 = 12;
               break;
            case 13:
               var10000 = 49;
               break;
            case 14:
               var10000 = 187;
               break;
            case 15:
               var10000 = 23;
               break;
            case 16:
               var10000 = 237;
               break;
            case 17:
               var10000 = 74;
               break;
            case 18:
               var10000 = 2;
               break;
            case 19:
               var10000 = 3;
               break;
            case 20:
               var10000 = 126;
               break;
            case 21:
               var10000 = 6;
               break;
            case 22:
               var10000 = 7;
               break;
            case 23:
               var10000 = 119;
               break;
            case 24:
               var10000 = 4;
               break;
            case 25:
               var10000 = 64;
               break;
            case 26:
               var10000 = 241;
               break;
            case 27:
               var10000 = 110;
               break;
            case 28:
               var10000 = 240;
               break;
            case 29:
               var10000 = 174;
               break;
            case 30:
               var10000 = 58;
               break;
            case 31:
               var10000 = 220;
               break;
            case 32:
               var10000 = 80;
               break;
            case 33:
               var10000 = 28;
               break;
            case 34:
               var10000 = 62;
               break;
            case 35:
               var10000 = 116;
               break;
            case 36:
               var10000 = 61;
               break;
            case 37:
               var10000 = 242;
               break;
            case 38:
               var10000 = 209;
               break;
            case 39:
               var10000 = 144;
               break;
            case 40:
               var10000 = 199;
               break;
            case 41:
               var10000 = 121;
               break;
            case 42:
               var10000 = 10;
               break;
            case 43:
               var10000 = 193;
               break;
            case 44:
               var10000 = 15;
               break;
            case 45:
               var10000 = 77;
               break;
            case 46:
               var10000 = 98;
               break;
            case 47:
               var10000 = 146;
               break;
            case 48:
               var10000 = 114;
               break;
            case 49:
               var10000 = 11;
               break;
            case 50:
               var10000 = 191;
               break;
            case 51:
               var10000 = 231;
               break;
            case 52:
               var10000 = 57;
               break;
            case 53:
               var10000 = 105;
               break;
            case 54:
               var10000 = 250;
               break;
            case 55:
               var10000 = 253;
               break;
            case 56:
               var10000 = 94;
               break;
            case 57:
               var10000 = 249;
               break;
            case 58:
               var10000 = 32;
               break;
            case 59:
               var10000 = 133;
               break;
            case 60:
               var10000 = 141;
               break;
            case 61:
               var10000 = 0;
               break;
            case 62:
               var10000 = 120;
               break;
            case 63:
               var10000 = 128;
               break;
            case 64:
               var10000 = 185;
               break;
            case 65:
               var10000 = 46;
               break;
            case 66:
               var10000 = 33;
               break;
            case 67:
               var10000 = 122;
               break;
            case 68:
               var10000 = 88;
               break;
            case 69:
               var10000 = 70;
               break;
            case 70:
               var10000 = 218;
               break;
            case 71:
               var10000 = 93;
               break;
            case 72:
               var10000 = 142;
               break;
            case 73:
               var10000 = 147;
               break;
            case 74:
               var10000 = 35;
               break;
            case 75:
               var10000 = 140;
               break;
            case 76:
               var10000 = 108;
               break;
            case 77:
               var10000 = 162;
               break;
            case 78:
               var10000 = 96;
               break;
            case 79:
               var10000 = 221;
               break;
            case 80:
               var10000 = 22;
               break;
            case 81:
               var10000 = 136;
               break;
            case 82:
               var10000 = 75;
               break;
            case 83:
               var10000 = 47;
               break;
            case 84:
               var10000 = 137;
               break;
            case 85:
               var10000 = 89;
               break;
            case 86:
               var10000 = 19;
               break;
            case 87:
               var10000 = 171;
               break;
            case 88:
               var10000 = 200;
               break;
            case 89:
               var10000 = 188;
               break;
            case 90:
               var10000 = 225;
               break;
            case 91:
               var10000 = 143;
               break;
            case 92:
               var10000 = 254;
               break;
            case 93:
               var10000 = 217;
               break;
            case 94:
               var10000 = 232;
               break;
            case 95:
               var10000 = 130;
               break;
            case 96:
               var10000 = 82;
               break;
            case 97:
               var10000 = 100;
               break;
            case 98:
               var10000 = 158;
               break;
            case 99:
               var10000 = 224;
               break;
            case 100:
               var10000 = 244;
               break;
            case 101:
               var10000 = 92;
               break;
            case 102:
               var10000 = 85;
               break;
            case 103:
               var10000 = 161;
               break;
            case 104:
               var10000 = 109;
               break;
            case 105:
               var10000 = 210;
               break;
            case 106:
               var10000 = 182;
               break;
            case 107:
               var10000 = 41;
               break;
            case 108:
               var10000 = 1;
               break;
            case 109:
               var10000 = 78;
               break;
            case 110:
               var10000 = 71;
               break;
            case 111:
               var10000 = 21;
               break;
            case 112:
               var10000 = 251;
               break;
            case 113:
               var10000 = 56;
               break;
            case 114:
               var10000 = 203;
               break;
            case 115:
               var10000 = 201;
               break;
            case 116:
               var10000 = 208;
               break;
            case 117:
               var10000 = 234;
               break;
            case 118:
               var10000 = 101;
               break;
            case 119:
               var10000 = 53;
               break;
            case 120:
               var10000 = 153;
               break;
            case 121:
               var10000 = 14;
               break;
            case 122:
               var10000 = 213;
               break;
            case 123:
               var10000 = 69;
               break;
            case 124:
               var10000 = 180;
               break;
            case 125:
               var10000 = 194;
               break;
            case 126:
               var10000 = 135;
               break;
            case 127:
               var10000 = 102;
               break;
            case 128:
               var10000 = 59;
               break;
            case 129:
               var10000 = 79;
               break;
            case 130:
               var10000 = 37;
               break;
            case 131:
               var10000 = 65;
               break;
            case 132:
               var10000 = 17;
               break;
            case 133:
               var10000 = 243;
               break;
            case 134:
               var10000 = 154;
               break;
            case 135:
               var10000 = 192;
               break;
            case 136:
               var10000 = 132;
               break;
            case 137:
               var10000 = 107;
               break;
            case 138:
               var10000 = 66;
               break;
            case 139:
               var10000 = 160;
               break;
            case 140:
               var10000 = 52;
               break;
            case 141:
               var10000 = 156;
               break;
            case 142:
               var10000 = 195;
               break;
            case 143:
               var10000 = 207;
               break;
            case 144:
               var10000 = 115;
               break;
            case 145:
               var10000 = 222;
               break;
            case 146:
               var10000 = 48;
               break;
            case 147:
               var10000 = 99;
               break;
            case 148:
               var10000 = 149;
               break;
            case 149:
               var10000 = 247;
               break;
            case 150:
               var10000 = 125;
               break;
            case 151:
               var10000 = 81;
               break;
            case 152:
               var10000 = 134;
               break;
            case 153:
               var10000 = 139;
               break;
            case 154:
               var10000 = 9;
               break;
            case 155:
               var10000 = 60;
               break;
            case 156:
               var10000 = 36;
               break;
            case 157:
               var10000 = 44;
               break;
            case 158:
               var10000 = 255;
               break;
            case 159:
               var10000 = 106;
               break;
            case 160:
               var10000 = 198;
               break;
            case 161:
               var10000 = 124;
               break;
            case 162:
               var10000 = 118;
               break;
            case 163:
               var10000 = 163;
               break;
            case 164:
               var10000 = 219;
               break;
            case 165:
               var10000 = 236;
               break;
            case 166:
               var10000 = 155;
               break;
            case 167:
               var10000 = 24;
               break;
            case 168:
               var10000 = 197;
               break;
            case 169:
               var10000 = 5;
               break;
            case 170:
               var10000 = 216;
               break;
            case 171:
               var10000 = 129;
               break;
            case 172:
               var10000 = 164;
               break;
            case 173:
               var10000 = 87;
               break;
            case 174:
               var10000 = 138;
               break;
            case 175:
               var10000 = 76;
               break;
            case 176:
               var10000 = 40;
               break;
            case 177:
               var10000 = 39;
               break;
            case 178:
               var10000 = 31;
               break;
            case 179:
               var10000 = 131;
               break;
            case 180:
               var10000 = 169;
               break;
            case 181:
               var10000 = 148;
               break;
            case 182:
               var10000 = 157;
               break;
            case 183:
               var10000 = 204;
               break;
            case 184:
               var10000 = 167;
               break;
            case 185:
               var10000 = 150;
               break;
            case 186:
               var10000 = 112;
               break;
            case 187:
               var10000 = 8;
               break;
            case 188:
               var10000 = 73;
               break;
            case 189:
               var10000 = 196;
               break;
            case 190:
               var10000 = 63;
               break;
            case 191:
               var10000 = 184;
               break;
            case 192:
               var10000 = 83;
               break;
            case 193:
               var10000 = 227;
               break;
            case 194:
               var10000 = 230;
               break;
            case 195:
               var10000 = 235;
               break;
            case 196:
               var10000 = 30;
               break;
            case 197:
               var10000 = 67;
               break;
            case 198:
               var10000 = 145;
               break;
            case 199:
               var10000 = 90;
               break;
            case 200:
               var10000 = 248;
               break;
            case 201:
               var10000 = 25;
               break;
            case 202:
               var10000 = 175;
               break;
            case 203:
               var10000 = 43;
               break;
            case 204:
               var10000 = 166;
               break;
            case 205:
               var10000 = 223;
               break;
            case 206:
               var10000 = 45;
               break;
            case 207:
               var10000 = 20;
               break;
            case 208:
               var10000 = 123;
               break;
            case 209:
               var10000 = 205;
               break;
            case 210:
               var10000 = 68;
               break;
            case 211:
               var10000 = 151;
               break;
            case 212:
               var10000 = 86;
               break;
            case 213:
               var10000 = 26;
               break;
            case 214:
               var10000 = 29;
               break;
            case 215:
               var10000 = 159;
               break;
            case 216:
               var10000 = 18;
               break;
            case 217:
               var10000 = 212;
               break;
            case 218:
               var10000 = 252;
               break;
            case 219:
               var10000 = 176;
               break;
            case 220:
               var10000 = 214;
               break;
            case 221:
               var10000 = 177;
               break;
            case 222:
               var10000 = 127;
               break;
            case 223:
               var10000 = 202;
               break;
            case 224:
               var10000 = 95;
               break;
            case 225:
               var10000 = 168;
               break;
            case 226:
               var10000 = 165;
               break;
            case 227:
               var10000 = 189;
               break;
            case 228:
               var10000 = 72;
               break;
            case 229:
               var10000 = 113;
               break;
            case 230:
               var10000 = 172;
               break;
            case 231:
               var10000 = 117;
               break;
            case 232:
               var10000 = 238;
               break;
            case 233:
               var10000 = 173;
               break;
            case 234:
               var10000 = 215;
               break;
            case 235:
               var10000 = 181;
               break;
            case 236:
               var10000 = 50;
               break;
            case 237:
               var10000 = 226;
               break;
            case 238:
               var10000 = 206;
               break;
            case 239:
               var10000 = 245;
               break;
            case 240:
               var10000 = 183;
               break;
            case 241:
               var10000 = 190;
               break;
            case 242:
               var10000 = 111;
               break;
            case 243:
               var10000 = 51;
               break;
            case 244:
               var10000 = 84;
               break;
            case 245:
               var10000 = 97;
               break;
            case 246:
               var10000 = 27;
               break;
            case 247:
               var10000 = 104;
               break;
            case 248:
               var10000 = 42;
               break;
            case 249:
               var10000 = 178;
               break;
            case 250:
               var10000 = 13;
               break;
            case 251:
               var10000 = 179;
               break;
            case 252:
               var10000 = 233;
               break;
            case 253:
               var10000 = 228;
               break;
            case 254:
               var10000 = 91;
               break;
            default:
               var10000 = 186;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "Ñ=,øÜ[\u009b\u001a\u0080Æ4.\u0016:\u000fQ¾s\u00933N`¯\\ù,¨\u0019½Õ\u008c\r(\u0089<\u0016Yt=Ñþ~\u0082óV\u0018\u009a\u000fôv\u0002f¶÷aG\u0004Ñ\u0002Ý\u0013";
      int var6 = "Ñ=,øÜ[\u009b\u001a\u0080Æ4.\u0016:\u000fQ¾s\u00933N`¯\\ù,¨\u0019½Õ\u008c\r(\u0089<\u0016Yt=Ñþ~\u0082óV\u0018\u009a\u000fôv\u0002f¶÷aG\u0004Ñ\u0002Ý\u0013"
         .length();
      char var3 = '\f';
      int var10 = -1;

      label52:
      while (true) {
         byte var10000 = 112;
         String var10001 = var4.substring(++var10, var10 + var3);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label47;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 114;
                        break;
                     case 1:
                        var50 = 29;
                        break;
                     case 2:
                        var50 = 55;
                        break;
                     case 3:
                        var50 = 107;
                        break;
                     case 4:
                        var50 = 94;
                        break;
                     case 5:
                        var50 = 40;
                        break;
                     default:
                        var50 = 15;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var7[var5++] = var33;
                  if ((var10 += var3) >= var6) {
                     a = var7;
                     b = new String[6];
                     long var0 = 5040563740230392903L;
                     long var27 = 5040563740230392911L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     Z = new LH3();
                     l = new Xw2();
                     Y = new Object();
                     y = true;
                     G = false;
                     z = new WeakHashMap();
                     R = new ArrayList(2);
                     q = new WeakHashMap();
                     L = false;
                     return;
                  }

                  var3 = var4.charAt(var10);
                  break;
               default:
                  var7[var5++] = var33;
                  if ((var10 += var3) < var6) {
                     var3 = var4.charAt(var10);
                     continue label52;
                  }

                  var4 = "n|\u000f\u0004l\u0010Y§\f¥q\u0096\u001b\t%\u008ei±U÷ÃO>e#Ë\u0080ÍP\u008dyJ_XÒg`\r6\f";
                  var6 = "n|\u000f\u0004l\u0010Y§\f¥q\u0096\u001b\t%\u008ei±U÷ÃO>e#Ë\u0080ÍP\u008dyJ_XÒg`\r6\f".length();
                  var3 = '\f';
                  var10 = -1;
            }

            var10000 = 102;
            var10001 = var4.substring(++var10, var10 + var3);
            var10002 = 0;
         }
      }
   }
}





