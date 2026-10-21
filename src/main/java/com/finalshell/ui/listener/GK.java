package com.finalshell.ui.listener;

import com.finalshell.core.TH3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.Bq2;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;

public class GK implements MouseMotionListener {
   final AM V;
   final Bq2 Q;
   public static long a;

   GK(Bq2 var1, AM var2) {
      this.Q = var1;
      this.V = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Object var2 = 523286601714712427L;
      Registry.lookupField(444246150125769098L).setLong(Ref.g(523286601714712427L, var2), System.currentTimeMillis());
      Object var4 = 523286601714712427L;
      Ref.g(523286601714712427L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 356550171956632315L;
      Object[] var6 = var10003;
      Ref.h(356550171956632315L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object var8 = 523286601714712427L;
      Ref.g(523286601714712427L, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var11 = 259809416276946956L;
      Object[] var10 = var10005;
      Ref.h(259809416276946956L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      AM.s$arrString();
      Object var8 = 523286601714712427L;
      Object var10002 = Ref.g(523286601714712427L, var8);
      Object[] var10003 = Registry.emptyArgs();
      long var11 = 259809416276946956L;
      Object[] var10 = var10003;
      Ref.h(259809416276946956L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var93) {
         throw var93.getTargetException();
      }

      Object var2 = var10002;
      Object var12 = 519266586727171533L;
      Ref.g(519266586727171533L, var12);
      Boolean var10004 = (Boolean)(Registry.emptyArgs());
      long var15 = 318524088468974674L;
      Object[] var14 = var10004;
      var10004 = Ref.h(318524088468974674L, var14, var15);

      try {
         var10004 = (Boolean)var10004;
      } catch (InvocationTargetException var92) {
         throw var92.getTargetException();
      }

      label231: {
         if (var2 == null) {
            if (var10004 == false) {
               return;
            }

            var10004 = this;
            Object var16 = 523286601714712427L;
            Bq2 var10005 = (Bq2)Ref.g(523286601714712427L, var16);
            if (var2 != null) {
               break label231;
            }

            Object[] var10006 = Registry.emptyArgs();
            long var19 = 127314456327634796L;
            Object[] var18 = var10006;
            var10006 = Ref.h(127314456327634796L, var18, var19);

            try {
            } catch (InvocationTargetException var91) {
               throw var91.getTargetException();
            }
         }

         if (var10004 == false) {
            return;
         }

         Object var20 = 523286601714712427L;
         Bq2 var97 = (Bq2)Ref.g(523286601714712427L, var20);
      }

      Object[] var99 = Registry.emptyArgs();
      long var23 = 581509655726891390L;
      Object[] var22 = var99;
      Ref.h(581509655726891390L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var90) {
         throw var90.getTargetException();
      }

      Registry.emptyArgs();
      long var24 = 299368763907830673L;
      Ref.h2(299368763907830673L, var24);

      try {
         ;
      } catch (InvocationTargetException var89) {
         throw var89.getTargetException();
      }

      Object[] var10008 = Registry.packArgs(true);
      long var27 = 555622091513386681L;
      Object[] var26 = var10008;
      Ref.h(555622091513386681L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var88) {
         throw var88.getTargetException();
      }

      Integer var10009 = (Integer)(Registry.emptyArgs());
      long var29 = 386124335143120314L;
      Object[] var28 = var10009;
      var10009 = Ref.h(386124335143120314L, var28, var29);

      try {
         var10009 = (Integer)var10009;
      } catch (InvocationTargetException var87) {
         throw var87.getTargetException();
      }

      Object var4;
      label212: {
         var4 = var10009;
         GK var102 = (GK)var4;
         if (var2 == null) {
            if (var4 == Registry.lookupField(299739253213373636L).getInt(null)) {
               break label212;
            }

            var102 = this;
            Object var30 = 519266586727171533L;
            Ref.g(519266586727171533L, var30);
            Object[] var10011 = Registry.emptyArgs();
            long var33 = 308510891685223410L;
            Object[] var32 = var10011;
            var10011 = Ref.h(308510891685223410L, var32, var33);

            try {
            } catch (InvocationTargetException var86) {
               throw var86.getTargetException();
            }
         }

         if (var102 == 0) {
            return;
         }
      }

      Point var5 = var1.getLocationOnScreen();
      var10009 = (Object[])var4;
      int var10010 = Registry.lookupField(299739253213373636L).getInt(null);
      if (var2 == null) {
         if (var4 == var10010) {
            label236: {
               label237: {
                  System.currentTimeMillis();
                  Object var34 = 523286601714712427L;
                  long var6 = this - Registry.lookupField(265947950920722185L).getLong(Ref.g(523286601714712427L, var34));
                  long var120;
                  GK var104 = (var120 = var6 - a) == 0L ? 0 : (var120 < 0L ? -1 : 1);
                  if (var2 == null) {
                     if (!(var104 > 0)) {
                        break label236;
                     }

                     var104 = this;
                     Object var36 = 523286601714712427L;
                     Bq2 var109 = (Bq2)Ref.g(523286601714712427L, var36);
                     if (var2 != null) {
                        break label237;
                     }

                     Registry.lookupField(308935006170094327L).getInt(var109);
                  }

                  if (var104 != 1) {
                     break label236;
                  }

                  Object var38 = 523286601714712427L;
                  Registry.lookupField(613636876466420761L).setBoolean(Ref.g(523286601714712427L, var38), true);
                  Object var40 = 523286601714712427L;
                  Bq2 var10012 = (Bq2)Ref.g(523286601714712427L, var40);
               }

               Object var42 = 523286601714712427L;
               Ref.g(523286601714712427L, var42);
               Object var44 = 158293829082319616L;
               Ref.g(158293829082319616L, var44);
               Object var46 = 519266586727171533L;
               Object[] var10016 = Registry.packArgs(var5, this, Ref.g(519266586727171533L, var46), false);
               long var48 = 334508177020329919L;
               Object var10017 = Ref.h2(334508177020329919L, var48);

               try {
                  var117 = (Integer)var10017;
               } catch (InvocationTargetException var85) {
                  throw var85.getTargetException();
               }

               Registry.lookupField(198114728363002908L).setInt(var10016, var117);
               Object var50 = 519266586727171533L;
               Ref.g(519266586727171533L, var50);
               TH3 var10018 = Registry.emptyArgs();
               long var53 = 311724385945399618L;
               Object[] var52 = var10018;
               var10018 = Ref.h(311724385945399618L, var52, var53);

               try {
                  var10018 = (TH3)var10018;
               } catch (InvocationTargetException var84) {
                  throw var84.getTargetException();
               }

               var10018.setVisible(true);
            }

            if (var2 == null) {
               return;
            }
         }

         var10009 = (Object[])var4;
         var10010 = Registry.lookupField(489009438537732568L).getInt(null);
      }

      if (var2 == null) {
         if (var10009 == var10010) {
            Object[] var105 = Registry.emptyArgs();
            long var55 = 404411013658768945L;
            Object[] var54 = var105;
            Object var106 = Ref.h(404411013658768945L, var54, var55);

            try {
               var107 = (AM)var106;
            } catch (InvocationTargetException var83) {
               throw var83.getTargetException();
            }

            AM var94 = var107;
            Boolean var110 = (Boolean)(Registry.emptyArgs());
            long var57 = 308510891685223410L;
            Object[] var56 = var110;
            var110 = Ref.h(308510891685223410L, var56, var57);

            try {
               var110 = (Boolean)var110;
            } catch (InvocationTargetException var82) {
               throw var82.getTargetException();
            }

            if (var2 == null) {
               if (var110 == 0) {
                  return;
               }

               var110 = this;
               Object var58 = 523286601714712427L;
               Ref.g(523286601714712427L, var58);
               Object var60 = 158293829082319616L;
               Registry.packArgs(Ref.g(158293829082319616L, var60), var5, var94, false);
               long var62 = 334508177020329919L;
               Object var10014 = Ref.h2(334508177020329919L, var62);

               try {
               } catch (InvocationTargetException var81) {
                  throw var81.getTargetException();
               }
            }

            GK var7 = var110;
            Object[] var113 = Registry.packArgs((int)var7);
            long var65 = 468727106235330106L;
            Object[] var64 = var113;
            Ref.h(468727106235330106L, var64, var65);

            try {
               ;
            } catch (InvocationTargetException var80) {
               throw var80.getTargetException();
            }

            Object var66 = 519266586727171533L;
            Ref.g(519266586727171533L, var66);
            TH3 var114 = Registry.emptyArgs();
            long var69 = 311724385945399618L;
            Object[] var68 = var114;
            var114 = Ref.h(311724385945399618L, var68, var69);

            try {
               var114 = (TH3)var114;
            } catch (InvocationTargetException var79) {
               throw var79.getTargetException();
            }

            var114.setVisible(true);
            if (var2 == null) {
               return;
            }
         }

         var10009 = (Object[])var4;
         var10010 = Registry.lookupField(581124220784366544L).getInt(null);
      }

      label241: {
         if (var2 == null) {
            if (var10009 == var10010) {
               break label241;
            }

            var10009 = (Object[])var4;
            var10010 = Registry.lookupField(617945104086657545L).getInt(null);
         }

         if (var2 == null) {
            if (var10009 == var10010) {
               break label241;
            }

            var10009 = (Object[])var4;
            var10010 = Registry.lookupField(470891030811937041L).getInt(null);
         }

         if (var10009 != var10010) {
            return;
         }
      }

      Object var70 = 523286601714712427L;
      Ref.g(523286601714712427L, var70);
      Object var72 = 158293829082319616L;
      Ref.g(158293829082319616L, var72);
      Object var74 = 519266586727171533L;
      Registry.packArgs(var5, this, Ref.g(519266586727171533L, var74));
      long var76 = 300591266421964145L;
      Ref.h2(300591266421964145L, var76);

      try {
         ;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 8285475901048755521L;
      long var10002 = 8285475901048755571L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





