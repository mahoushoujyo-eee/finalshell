package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.O0;
import com.finalshell.ui.model.Oc2;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Zj2_2 {
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static void K(Oc2 var0) {
      Registry.packArgs(var0);
      long var4 = 555841273766489448L;
      Object var10001 = Ref.h2(555841273766489448L, var4);

      try {
         var10001 = (ArrayList)var10001;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      ArrayList var1 = (ArrayList)var10001;
      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 306266403902896148L;
      Object[] var8 = var10003;
      Ref.h(306266403902896148L, var8, var9);
      ArrayList var10004 = (ArrayList)(Registry.emptyArgs());
      long var11 = 518875030097846779L;
      Object[] var10 = var10004;
      var10004 = Ref.h(518875030097846779L, var10, var11);

      try {
         var10004 = (ArrayList)var10004;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      ArrayList var2 = var10004;
      Registry.packArgs(var1, var2);
      long var12 = 469700102995215773L;
      Object var10005 = Ref.h2(469700102995215773L, var12);

      try {
         var10005 = (ArrayList)var10005;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      ArrayList var3 = (ArrayList)var10005;
      Registry.emptyArgs();
      long var14 = 270389152141252877L;
      Ref.h2(270389152141252877L, var14);
      Object[] var10007 = Registry.emptyArgs();
      long var17 = 306266403902896148L;
      Object[] var16 = var10007;
      Ref.h(306266403902896148L, var16, var17);
      Object[] var10008 = Registry.packArgs(var3);
      long var19 = 482439858102463037L;
      Object[] var18 = var10008;
      Ref.h(482439858102463037L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }
   }

   public static ArrayList H(ArrayList var0, ArrayList var1) {
      Registry.packArgs(var0, var1, new Li4());
      long var8 = 212474312414779304L;
      Object var10001 = Ref.h2(212474312414779304L, var8);

      try {
         var10001 = (ArrayList)var10001;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      ArrayList var3 = (ArrayList)var10001;
      ArrayList var4 = new ArrayList();
      var10001 = AppendCarriageReturnCRPanel.Y();
      Iterator var5 = var3.iterator();
      int[] var2 = (int[])var10001;

      while (true) {
         if (var5.hasNext()) {
            Li4 var6 = (Li4)var5.next();
            Registry.packArgs(var6);
            long var10 = 366543685241882690L;
            Object var10002 = Ref.h2(366543685241882690L, var10);

            try {
               var19 = (Boolean)var10002;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            boolean var7 = var19;
            if (var2 != null) {
               break;
            }

            if (var2 == null && !var7) {
               var4.add(var6);
            }

            if (var2 == null) {
               continue;
            }
         }

         var3 = var4;
         Registry.packArgs(var4, var0, var1);
         long var12 = 435622865167251575L;
         Ref.h2(435622865167251575L, var12);

         try {
            break;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }
      }

      return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static void i(ArrayList var0, ArrayList var1, ArrayList var2) {
      HashSet var4 = new HashSet();
      HashMap var5 = new HashMap();
      HashMap var6 = new HashMap();
      ArrayList var7 = new ArrayList();
      int[] var10000 = AppendCarriageReturnCRPanel.Y();
      Iterator var8;
      Object var10001 = var8 = var1.iterator();
      int[] var3 = var10000;

      Object var10002;
      label688:
      while (true) {
         if (var8.hasNext()) {
            Li4 var9 = (Li4)var8.next();
            var10000 = (int[])var9;
            var10001 = Registry.emptyArgs();
            long var21 = 408177353860141270L;
            Object[] var20 = (Object[])var10001;
            var10001 = Ref.h(408177353860141270L, var20, var21);

            try {
               var10001 = (ArrayList)var10001;
            } catch (InvocationTargetException var88) {
               throw var88.getTargetException();
            }

            ArrayList var10 = (ArrayList)var10001;
            var10001 = var10.iterator();
            var10002 = var3;
            if (var3 != null) {
               break;
            }

            Object var11 = var10001;

            while (var11.hasNext()) {
               Lj4_2 var12 = (Lj4_2)var11.next();
               var10001 = var5;
               String var10003 = (String)(Registry.emptyArgs());
               long var23 = 194080076253066315L;
               Object[] var22 = var10003;
               var10003 = Ref.h(194080076253066315L, var22, var23);

               try {
                  var10003 = (String)var10003;
               } catch (InvocationTargetException var89) {
                  throw var89.getTargetException();
               }

               var12.put(var10003, var12);
               var10002 = var3;
               if (var3 != null) {
                  continue label688;
               }

               var10002 = var3;
               if (var3 != null) {
                  break;
               }
            }

            var10001 = var3;
            if (var3 == null) {
               continue;
            }
         }

         var10000 = (int[])var2.iterator();
         break;
      }

      var8 = var10000;

      label668:
      while (true) {
         Li4 var156 = var8.hasNext();

         label665:
         while (var156 != false) {
            Li4 var103 = (Li4)var8.next();
            var156 = var103;
            var10001 = Registry.emptyArgs();
            long var25 = 408177353860141270L;
            Object[] var24 = (Object[])var10001;
            var10001 = Ref.h(408177353860141270L, var24, var25);

            try {
               var10001 = (ArrayList)var10001;
            } catch (InvocationTargetException var84) {
               throw var84.getTargetException();
            }

            ArrayList var109 = (ArrayList)var10001;
            var10001 = var109.iterator();
            var10002 = var3;
            if (var3 != null) {
               break label668;
            }

            Object var115 = var10001;

            while (var115.hasNext()) {
               Lj4_2 var126 = (Lj4_2)var115.next();
               var10001 = var6;
               String var169 = (String)(Registry.emptyArgs());
               long var27 = 194080076253066315L;
               Object[] var26 = var169;
               var169 = Ref.h(194080076253066315L, var26, var27);

               try {
                  var169 = (String)var169;
               } catch (InvocationTargetException var87) {
                  throw var87.getTargetException();
               }

               var126.put(var169, var126);
               var10002 = var5;
               String var10004 = (String)(Registry.emptyArgs());
               long var29 = 194080076253066315L;
               Object[] var28 = var10004;
               var10004 = Ref.h(194080076253066315L, var28, var29);

               try {
                  var10004 = (String)var10004;
               } catch (InvocationTargetException var86) {
                  throw var86.getTargetException();
               }

               boolean var172 = var126.containsKey(var10004);
               if (var3 != null) {
                  continue label665;
               }

               label658:
               if (var3 == null) {
                  if (var172) {
                     String var10005 = (String)(Registry.emptyArgs());
                     long var31 = 194080076253066315L;
                     Object[] var30 = var10005;
                     var10005 = Ref.h(194080076253066315L, var30, var31);

                     try {
                        var10005 = (String)var10005;
                     } catch (InvocationTargetException var85) {
                        throw var85.getTargetException();
                     }

                     var126.add(var10005);
                     if (var3 == null) {
                        break label658;
                     }
                  }

                  var7.add(var126);
               }

               if (var3 != null) {
                  break;
               }
            }

            var10001 = var3;
            if (var3 == null) {
               continue label668;
            }
            break;
         }

         var1.iterator();
         break;
      }

      var8 = (Iterator)var10001;

      label636:
      while (true) {
         var10001 = var8.hasNext();

         label633:
         while (var10001 != false) {
            Li4 var104 = (Li4)var8.next();
            var10001 = var104;
            var10002 = Registry.emptyArgs();
            long var33 = 408177353860141270L;
            Object[] var32 = (Object[])var10002;
            var10002 = Ref.h(408177353860141270L, var32, var33);

            try {
               var10002 = (ArrayList)var10002;
            } catch (InvocationTargetException var82) {
               throw var82.getTargetException();
            }

            ArrayList var110 = (ArrayList)var10002;
            var10002 = var110.iterator();
            if (var3 != null) {
               break label636;
            }

            Object var116 = var10002;

            while (var116.hasNext()) {
               Lj4_2 var127 = (Lj4_2)var116.next();
               var10002 = var6;
               String var178 = (String)(Registry.emptyArgs());
               long var35 = 194080076253066315L;
               Object[] var34 = var178;
               var178 = Ref.h(194080076253066315L, var34, var35);

               try {
                  var178 = (String)var178;
               } catch (InvocationTargetException var83) {
                  throw var83.getTargetException();
               }

               boolean var173 = var127.containsKey(var178);
               if (var3 != null) {
                  continue label633;
               }

               if (var3 == null && !var173) {
                  var7.add(var127);
               }

               if (var3 != null) {
                  break;
               }
            }

            var10002 = var3;
            if (var3 == null) {
               continue label636;
            }
            break;
         }

         var5.keySet().iterator();
         break;
      }

      var8 = (Iterator)var10002;

      while (var8.hasNext()) {
         String var105 = (String)var8.next();
         Lj4_2 var111 = (Lj4_2)var5.get(var105);
         if (var3 != null || var3 != null) {
            break;
         }
      }

      for (String var106 : var6.keySet()) {
         Lj4_2 var112 = (Lj4_2)var6.get(var106);
         if (var112 != null) {
         }

         if (var3 != null) {
            break;
         }
      }

      Registry.packArgs(var1, var2, new Lj4_2(), var5, var6, var4, var7);
      long var36 = 458116842536415420L;
      Object var174 = Ref.h2(458116842536415420L, var36);

      try {
         var174 = (ArrayList)var174;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      ArrayList var102 = (ArrayList)var174;

      for (Lj4_2 var113 : var102) {
         if (var3 != null) {
            break;
         }
      }

      HashMap var108 = new HashMap();
      Iterator var114 = var0.iterator();

      while (true) {
         if (var114.hasNext()) {
            Li4 var117 = (Li4)var114.next();
            String var189 = (String)(Registry.emptyArgs());
            long var39 = 194080076253066315L;
            Object[] var38 = var189;
            var189 = Ref.h(194080076253066315L, var38, var39);

            try {
               var189 = (String)var189;
            } catch (InvocationTargetException var80) {
               throw var80.getTargetException();
            }

            var117.put(var189, var117);
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         var114 = var0.iterator();
         break;
      }

      while (true) {
         if (var114.hasNext()) {
            Li4 var118 = (Li4)var114.next();
            ArrayList var181 = Registry.emptyArgs();
            long var41 = 408177353860141270L;
            Object[] var40 = var181;
            var181 = Ref.h(408177353860141270L, var40, var41);

            try {
               var181 = (ArrayList)var181;
            } catch (InvocationTargetException var79) {
               throw var79.getTargetException();
            }

            var181.clear();
            if (var3 != null) {
               break;
            }

            if (var3 == null) {
               continue;
            }
         }

         var114 = var102.iterator();
         break;
      }

      Lj4_2 var130;
      Object var215;
      Object var10008;
      while (true) {
         label562:
         if (var114.hasNext()) {
            Lj4_2 var119 = (Lj4_2)var114.next();
            String var192 = (String)(Registry.emptyArgs());
            long var43 = 413442976446181537L;
            Object[] var42 = var192;
            var192 = Ref.h(413442976446181537L, var42, var43);

            try {
               var192 = (String)var192;
            } catch (InvocationTargetException var78) {
               throw var78.getTargetException();
            }

            Li4 var128 = (Li4)var119.get(var192);
            if (var3 != null) {
               var130 = (Lj4_2)var128;
               String var204 = (String)(Registry.emptyArgs());
               Object var55 = 194080076253066315L;
               Object[] var54 = var204;
               var10008 = var55;
               var204 = Ref.h(194080076253066315L, var54, (long)var55);

               try {
                  var204 = (String)var204;
               } catch (InvocationTargetException var90) {
                  throw var90.getTargetException();
               }

               Lj4_2 var132 = (Lj4_2)var119.get(var204);
               if (var130 != null) {
                  boolean var200 = true;
               } else {
                  boolean var201 = false;
               }

               if (var132 != null) {
                  boolean var207 = true;
               } else {
                  boolean var208 = false;
               }
               break;
            }

            if (var128 != null) {
               Registry.packArgs(var119);
               long var44 = 366543685241882690L;
               var192 = Ref.h2(366543685241882690L, var44);

               try {
                  var196 = (Boolean)var192;
               } catch (InvocationTargetException var77) {
                  throw var77.getTargetException();
               }

               boolean var13 = var196;
               if (var3 == null) {
                  if (!var13) {
                     ArrayList var10006 = Registry.emptyArgs();
                     long var47 = 408177353860141270L;
                     Object[] var46 = var10006;
                     var10006 = Ref.h(408177353860141270L, var46, var47);

                     try {
                        var10006 = (ArrayList)var10006;
                     } catch (InvocationTargetException var76) {
                        throw var76.getTargetException();
                     }

                     var10006.add(var119);
                  }
               }
            }

            if (var3 == null) {
               continue;
            }

            for (Li4 var120 : var0) {
               var192 = Registry.emptyArgs();
               long var49 = 408177353860141270L;
               Object[] var48 = var192;
               var192 = Ref.h(408177353860141270L, var48, var49);

               try {
                  var192 = (ArrayList)var192;
               } catch (InvocationTargetException var75) {
                  throw var75.getTargetException();
               }

               ArrayList var129 = var192;
               Registry.packArgs(var129);
               long var50 = 126626936328477255L;
               Ref.h2(126626936328477255L, var50);

               try {
                  ;
               } catch (InvocationTargetException var74) {
                  throw var74.getTargetException();
               }

               if (var3 != null) {
                  break label562;
               }

               if (var3 != null) {
                  break;
               }
            }

            var114 = var102.iterator();
         } else {
            label710: {
               for (Li4 var121 : var0) {
                  ArrayList var184 = (ArrayList)(Registry.emptyArgs());
                  long var139 = 408177353860141270L;
                  Object[] var138 = var184;
                  var184 = Ref.h(408177353860141270L, var138, var139);

                  try {
                     var184 = (ArrayList)var184;
                  } catch (InvocationTargetException var91) {
                     throw var91.getTargetException();
                  }

                  ArrayList var131 = var184;
                  Registry.packArgs(var131);
                  long var140 = 126626936328477255L;
                  Ref.h2(126626936328477255L, var140);

                  try {
                     ;
                  } catch (InvocationTargetException var92) {
                     throw var92.getTargetException();
                  }

                  if (var3 != null) {
                     break label710;
                  }

                  if (var3 != null) {
                     break;
                  }
               }

               var114 = var102.iterator();
            }
         }

         if (!var114.hasNext()) {
            return;
         }

         Lj4_2 var122 = (Lj4_2)var114.next();
         var10008 = Registry.emptyArgs();
         long var53 = 194080076253066315L;
         Object[] var52 = (Object[])var10008;
         var10008 = Ref.h(194080076253066315L, var52, var53);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }

         var130 = (Lj4_2)var122.get(var10008);
         var215 = Registry.emptyArgs();
         long var151 = 194080076253066315L;
         Object[] var147 = (Object[])var215;
         var215 = Ref.h(194080076253066315L, var147, var151);

         try {
            var215 = (String)var215;
         } catch (InvocationTargetException var72) {
            throw var72.getTargetException();
         }

         Lj4_2 var133 = (Lj4_2)var122.get(var215);
         var10008 = var130 != null;
         var215 = var133 != null;
         break;
      }

      label557:
      while (true) {
         long var212 = (long)(var10008 & var215);
         long var14;
         if (var3 == null) {
            if (var212 == false) {
               if (var3 != null || !var114.hasNext()) {
                  break;
               }

               Lj4_2 var123 = (Lj4_2)var114.next();
               var10008 = var5;
               String var10010 = (String)(Registry.emptyArgs());
               long var144 = 194080076253066315L;
               Object[] var141 = var10010;
               var10010 = Ref.h(194080076253066315L, var141, var144);

               try {
                  var10010 = (String)var10010;
               } catch (InvocationTargetException var95) {
                  throw var95.getTargetException();
               }

               var130 = (Lj4_2)var123.get(var10010);
               var215 = var6;
               String var10011 = (String)(Registry.emptyArgs());
               long var152 = 194080076253066315L;
               Object[] var148 = var10011;
               var10011 = Ref.h(194080076253066315L, var148, var152);

               try {
                  var10011 = (String)var10011;
               } catch (InvocationTargetException var96) {
                  throw var96.getTargetException();
               }

               Lj4_2 var134 = (Lj4_2)var123.get(var10011);
               if (var130 != null) {
                  boolean var221 = true;
               } else {
                  boolean var222 = false;
               }

               if (var134 != null) {
                  boolean var235 = true;
               } else {
                  boolean var236 = false;
               }
               continue;
            }

            var14 = (((((((((long)false) ? 1 : 0) ? 1 : 0) ? 1 : 0) != 0) ? 1 : 0) != 0) != 0) ? 1 : 0;
         } else {
            var14 = var212;
         }

         while (var14 < Registry.lookupField(216182060077896093L).getInt(null)) {
            String var15 = "#" + (var14 + 1);
            var10008 = var130;
            var215 = Registry.packArgs(var15);
            long var57 = 242040625560871861L;
            Object[] var56 = (Object[])var215;
            var215 = Ref.h(242040625560871861L, var56, var57);

            try {
               var215 = (Dx4_2)var215;
            } catch (InvocationTargetException var69) {
               throw var69.getTargetException();
            }

            Dx4_2 var16 = (Dx4_2)var215;
            var215 = var130;
            Dx4_2 var223 = (Dx4_2)(Registry.packArgs(var15));
            long var59 = 242040625560871861L;
            Object[] var58 = var223;
            var223 = Ref.h(242040625560871861L, var58, var59);

            try {
               var223 = (Dx4_2)var223;
            } catch (InvocationTargetException var68) {
               throw var68.getTargetException();
            }

            Dx4_2 var17 = var223;
            Object var18 = null;
            if (var3 != null) {
               Lj4_2 var136 = (Lj4_2)var16;
               if (var130 != null) {
                  boolean var226 = true;
               } else {
                  boolean var227 = false;
               }

               if (var136 != null) {
                  boolean var238 = true;
               } else {
                  boolean var239 = false;
               }
               continue label557;
            }

            if (var3 == null) {
               if (var16 != null) {
                  if (var3 == null) {
                     if (var17 != null) {
                        Object[] var237 = Registry.emptyArgs();
                        long var61 = 596400151700218172L;
                        Object[] var60 = var237;
                        Ref.h(596400151700218172L, var60, var61);
                        ArrayList var10013 = (ArrayList)(Registry.emptyArgs());
                        long var63 = 596400151700218172L;
                        Object[] var62 = var10013;
                        Registry.packArgs(var17, Ref.h(596400151700218172L, var62, var63));
                        long var64 = 357523341468946780L;
                        var10013 = Ref.h2(357523341468946780L, var64);

                        try {
                           var10013 = (ArrayList)var10013;
                        } catch (InvocationTargetException var71) {
                           throw var71.getTargetException();
                        }

                        ArrayList var19 = var10013;
                        Object[] var10014 = Registry.packArgs(var19);
                        long var67 = 228847008563462370L;
                        Object[] var66 = var10014;
                        Ref.h(228847008563462370L, var66, var67);

                        try {
                           ;
                        } catch (InvocationTargetException var70) {
                           throw var70.getTargetException();
                        }
                     } else if (var3 == null) {
                        if (var16 != null) {
                           if (var3 == null) {
                              if (var17 == null) {
                                 ;
                              }
                           }
                        }
                     } else if (var3 == null) {
                        if (var16 == null) {
                           ;
                        }
                     }
                  } else if (var3 == null) {
                     if (var17 != null) {
                        if (var3 == null) {
                           if (var17 == null) {
                              ;
                           }
                        }
                     }
                  } else if (var3 == null) {
                     if (var17 == null) {
                        ;
                     }
                  }
               } else if (var3 == null) {
                  if (var16 != null) {
                     if (var3 == null) {
                        if (var17 == null) {
                           ;
                        }
                     }
                  }
               } else if (var3 == null) {
                  if (var16 == null) {
                     ;
                  }
               }
            } else if (var3 == null) {
               if (var16 != null) {
                  if (var3 == null) {
                     if (var17 == null) {
                        ;
                     }
                  }
               }
            } else if (var3 == null) {
               if (var16 == null) {
                  ;
               }
            }

            var14++;
            if (var3 != null) {
               if (var3 != null || !var114.hasNext()) {
                  return;
               }

               Lj4_2 var124 = (Lj4_2)var114.next();
               String var10016 = (String)(Registry.emptyArgs());
               long var145 = 194080076253066315L;
               Object[] var142 = var10016;
               var10016 = Ref.h(194080076253066315L, var142, var145);

               try {
                  var10016 = (String)var10016;
               } catch (InvocationTargetException var93) {
                  throw var93.getTargetException();
               }

               var130 = (Lj4_2)var124.get(var10016);
               String var10017 = (String)(Registry.emptyArgs());
               long var153 = 194080076253066315L;
               Object[] var149 = var10017;
               var10017 = Ref.h(194080076253066315L, var149, var153);

               try {
                  var10017 = (String)var10017;
               } catch (InvocationTargetException var94) {
                  throw var94.getTargetException();
               }

               Lj4_2 var135 = (Lj4_2)var124.get(var10017);
               if (var130 != null) {
                  boolean var249 = true;
               } else {
                  boolean var250 = false;
               }

               if (var135 != null) {
                  boolean var253 = true;
               } else {
                  boolean var254 = false;
               }
               continue label557;
            }
         }

         if (var3 != null || !var114.hasNext()) {
            break;
         }

         Lj4_2 var125 = (Lj4_2)var114.next();
         var10008 = var5;
         String var228 = (String)(Registry.emptyArgs());
         long var146 = 194080076253066315L;
         Object[] var143 = var228;
         var228 = Ref.h(194080076253066315L, var143, var146);

         try {
            var228 = (String)var228;
         } catch (InvocationTargetException var97) {
            throw var97.getTargetException();
         }

         var130 = (Lj4_2)var125.get(var228);
         var215 = var6;
         String var240 = (String)(Registry.emptyArgs());
         long var154 = 194080076253066315L;
         Object[] var150 = var240;
         var240 = Ref.h(194080076253066315L, var150, var154);

         try {
            var240 = (String)var240;
         } catch (InvocationTargetException var98) {
            throw var98.getTargetException();
         }

         Lj4_2 var137 = (Lj4_2)var125.get(var240);
         if (var130 != null) {
            boolean var231 = true;
         } else {
            boolean var232 = false;
         }

         if (var137 != null) {
            boolean var243 = true;
         } else {
            boolean var244 = false;
         }
      }
   }

   public static ArrayList N(Oc2 var0) {
      int[] var1;
      ArrayList var2;
      int[] var3;
      byte var4;
      label341: {
         int[] var10000 = AppendCarriageReturnCRPanel.Y();
         var2 = new ArrayList();
         var1 = var10000;
         var3 = null;
         var4 = 0;
         Oc2 var99 = var0;
         if (var1 == null) {
            if (var0.size() <= 0) {
               break label341;
            }

            var99 = var0;
         }

         O0 var5 = var99.V(0);
         int var100 = (var5.containsKey(a(-8585, 16722))) ? 1 : 0;
         if (var1 == null) {
            if (var100 != 0) {
               break label341;
            }

            var4 = 1;
            var100 = var0.size();
         }

         Registry.packArgs(var100);
         long var33 = 500045436464195984L;
         Object var10001 = Ref.h2(500045436464195984L, var33);

         try {
            var10001 = (int[])var10001;
         } catch (InvocationTargetException var94) {
            throw var94.getTargetException();
         }

         var3 = (int[])var10001;
      }

      Object var95 = 0;

      label326:
      while (true) {
         Object var102 = var95;

         label323:
         while (var102 < var0.size()) {
            Li4 var6 = new Li4();
            var2.add(var6);
            O0 var7 = var0.V((int)var95);
            var102 = Registry.packArgs(var6, var7);
            long var35 = 272456164038541053L;
            Ref.h2(272456164038541053L, var35);

            try {
               ;
            } catch (InvocationTargetException var78) {
               throw var78.getTargetException();
            }

            String var8 = var7.C$String(a(-8592, 24204));
            Object[] var10003 = Registry.packArgs(var8);
            long var38 = 193904661956891993L;
            Object[] var37 = var10003;
            Ref.h(193904661956891993L, var37, var38);

            try {
               ;
            } catch (InvocationTargetException var77) {
               throw var77.getTargetException();
            }

            String var9 = var7.C$String(a(-8586, -1718));
            Object[] var10004 = Registry.packArgs(var9);
            long var40 = 416906230259364838L;
            Object[] var39 = var10004;
            Ref.h(416906230259364838L, var39, var40);

            try {
               ;
            } catch (InvocationTargetException var76) {
               throw var76.getTargetException();
            }

            int var10 = 0;
            if (var1 != null) {
               return var2;
            }

            label320: {
               int var103 = var4;
               if (var1 == null) {
                  if (var4 != 0) {
                     var10 = var3[var95];
                     if (var1 == null) {
                        break label320;
                     }
                  }

                  var103 = var7.b(a(-8585, 16722));
               }

               var10 = var103;
            }

            Object[] var10005 = Registry.packArgs(var10);
            long var42 = 470936572593593753L;
            Object[] var41 = var10005;
            Ref.h(470936572593593753L, var41, var42);

            try {
               ;
            } catch (InvocationTargetException var93) {
               throw var93.getTargetException();
            }

            Oc2 var11;
            int[] var12;
            byte var13;
            label344: {
               var11 = var7.J(a(-8588, 28666));
               var12 = null;
               var13 = 0;
               Oc2 var104 = var11;
               if (var1 == null) {
                  if (var11.size() <= 0) {
                     break label344;
                  }

                  var104 = var11;
               }

               label306: {
                  label345: {
                     O0 var14 = var104.V(0);
                     var105 = var14.containsKey(a(-8585, 16722));
                     if (var1 == null) {
                        if (var105 == 0) {
                           var13 = 1;
                           if (var1 == null) {
                              break label345;
                           }
                        }

                        var105 = var14.b(a(-8585, 16722));
                     }

                     if (var1 != null) {
                        break label306;
                     }

                     if (var105 == 0) {
      boolean var105;
      boolean var105;
                        var13 = 1;
                     }
                  }

                  var105 = var13;
               }

               if (var1 == null) {
                  if (var105 == 0) {
                     break label344;
                  }

                  var105 = var11.size();
               }

               Registry.packArgs(var105);
               long var43 = 500045436464195984L;
               Object var10006 = Ref.h2(500045436464195984L, var43);

               try {
                  var10006 = (int[])var10006;
               } catch (InvocationTargetException var92) {
                  throw var92.getTargetException();
               }

               var12 = (int[])var10006;
            }

            int var97 = 0;

            while (var97 < var11.size()) {
               O0 var15 = var11.V(var97);
               String var16 = var15.C$String(a(-8584, -2347));
               String var17 = var15.C$String(a(-8592, 24204));
               String var18 = var15.C$String(a(-8586, -1718));
               boolean var19 = true;
               boolean var107 = var15.containsKey(a(-8587, 26368));
               if (var1 != null) {
                  continue label323;
               }

               label286: {
                  if (var1 == null) {
                     if (!var107) {
                        break label286;
                     }

                     var107 = var15.G(a(-8587, 26368));
                  }

                  var19 = var107;
               }

               Lj4_2 var20 = new Lj4_2();
               Registry.packArgs(var20, var15);
               long var45 = 272456164038541053L;
               Ref.h2(272456164038541053L, var45);

               try {
                  ;
               } catch (InvocationTargetException var91) {
                  throw var91.getTargetException();
               }

               Object[] var10008 = Registry.packArgs(var16);
               long var48 = 372027305840941998L;
               Object[] var47 = var10008;
               Ref.h(372027305840941998L, var47, var48);

               try {
                  ;
               } catch (InvocationTargetException var90) {
                  throw var90.getTargetException();
               }

               Object[] var10009 = Registry.packArgs(var17);
               long var50 = 193904661956891993L;
               Object[] var49 = var10009;
               Ref.h(193904661956891993L, var49, var50);

               try {
                  ;
               } catch (InvocationTargetException var89) {
                  throw var89.getTargetException();
               }

               Object[] var10010 = Registry.packArgs(var19);
               long var52 = 533048980031250758L;
               Object[] var51 = var10010;
               Ref.h(533048980031250758L, var51, var52);

               try {
                  ;
               } catch (InvocationTargetException var88) {
                  throw var88.getTargetException();
               }

               Object[] var10011 = Registry.packArgs(var9);
               long var54 = 579965879482954180L;
               Object[] var53 = var10011;
               Ref.h(579965879482954180L, var53, var54);

               try {
                  ;
               } catch (InvocationTargetException var87) {
                  throw var87.getTargetException();
               }

               Object[] var10012 = Registry.packArgs(var18);
               long var56 = 416906230259364838L;
               Object[] var55 = var10012;
               Ref.h(416906230259364838L, var55, var56);

               try {
                  ;
               } catch (InvocationTargetException var86) {
                  throw var86.getTargetException();
               }

               int var98;
               label279: {
                  boolean var21 = false;
                  int var108 = var13;
                  if (var1 == null) {
                     if (var13 != 0) {
                        var98 = var12[var97];
                        if (var1 == null) {
                           break label279;
                        }
                     }

                     var108 = var15.b(a(-8585, 16722));
                  }

                  var98 = var108;
               }

               Object[] var10013 = Registry.packArgs(var98);
               long var58 = 470936572593593753L;
               Object[] var57 = var10013;
               Ref.h(470936572593593753L, var57, var58);

               try {
                  ;
               } catch (InvocationTargetException var85) {
                  throw var85.getTargetException();
               }

               boolean var109 = var15.containsKey(a(-8578, 28192));
               label271:
               if (var1 == null) {
                  if (var109) {
                     O0 var22 = var15.D(a(-8578, 28192));
                     Iterator var23 = var22.entrySet().iterator();

                     label267:
                     do {
                        Lj4_2 var110 = var23.hasNext();

                        while (var110 != false) {
                           Entry var24 = (Entry)var23.next();
                           String var25 = (String)var24.getKey();
                           Oc2 var26 = (Oc2)var24.getValue();
                           var110 = var20;
                           Object[] var10014 = Registry.packArgs(var25);
                           long var60 = 242040625560871861L;
                           Object[] var59 = var10014;
                           Ref.h(242040625560871861L, var59, var60);

                           try {
                              ;
                           } catch (InvocationTargetException var80) {
                              throw var80.getTargetException();
                           }

                           if (var1 != null) {
                              break label271;
                           }

                           int var28 = 0;

                           while (true) {
                              if (var28 >= var26.size()) {
                                 continue label267;
                              }

                              O0 var29 = (O0)var26.get(var28);
                              Registry.packArgs(var29);
                              long var61 = 412540338604713415L;
                              Object var10015 = Ref.h2(412540338604713415L, var61);

                              try {
                                 var10015 = (L1)var10015;
                              } catch (InvocationTargetException var84) {
                                 throw var84.getTargetException();
                              }

                              L1 var30 = (L1)var10015;
                              if (var1 == null) {
                                 Object[] var10016 = Registry.emptyArgs();
                                 long var64 = 542058094445767607L;
                                 Object[] var63 = var10016;
                                 Registry.packArgs(Ref.h(542058094445767607L, var63, var64));
                                 long var65 = 330094358428833085L;
                                 Object var10017 = Ref.h2(330094358428833085L, var65);

                                 try {
                                    var115 = (Boolean)var10017;
                                 } catch (InvocationTargetException var83) {
                                    throw var83.getTargetException();
                                 }

                                 if (var1 != null) {
                                    break;
                                 }

                                 if (!var115) {
                                    boolean var116 = var29.containsKey(a(-8590, -13204));
                                    if (var1 == null) {
                                       if (!var116) {
                                          long var31 = Registry.lookupField(250137832701362425L).getLong(null)
                                             - (long)(var95 * a(17116, 653507205623955746L) * a(17322, 2548841518271610965L));
                                          Object[] var10018 = Registry.e(var31);
                                          long var68 = 250873246822364857L;
                                          Object[] var67 = var10018;
                                          Ref.h(250873246822364857L, var67, var68);

                                          try {
                                             ;
                                          } catch (InvocationTargetException var82) {
                                             throw var82.getTargetException();
                                          }
                                       }

                                       ArrayList var117 = Registry.emptyArgs();
                                       long var70 = 596400151700218172L;
                                       Object[] var69 = var117;
                                       var117 = Ref.h(596400151700218172L, var69, var70);

                                       try {
                                          var117 = (ArrayList)var117;
                                       } catch (InvocationTargetException var81) {
                                          throw var81.getTargetException();
                                       }

                                       var117.add(var30);
                                    }
                                 }

                                 var28++;
                              }

                              if (var1 != null) {
                                 continue label267;
                              }
                           }
                        }
                        break;
                     } while (var1 == null);
                  }

                  ArrayList var111 = Registry.emptyArgs();
                  long var72 = 408177353860141270L;
                  Object[] var71 = var111;
                  var111 = Ref.h(408177353860141270L, var71, var72);

                  try {
                     var111 = (ArrayList)var111;
                  } catch (InvocationTargetException var79) {
                     throw var79.getTargetException();
                  }

                  var111.add(var20);
               }

               var97++;
               if (var1 != null) {
                  break;
               }
            }

            var95++;
            if (var1 == null) {
               continue label326;
            }
            break;
         }

         Registry.packArgs(var2);
         long var73 = 126626936328477255L;
         Ref.h2(126626936328477255L, var73);

         try {
            return var2;
         } catch (InvocationTargetException var75) {
            throw var75.getTargetException();
         }
      }
   }

   public static Oc2 y(ArrayList var0) {
      int[] var10000 = AppendCarriageReturnCRPanel.Y();
      Oc2 var2 = new Oc2();
      int[] var1 = var10000;
      Object var3 = 0;

      label178:
      while (true) {
         var10000 = (int[])var3;

         Object var87;
         label175:
         while (var10000 < var0.size()) {
            Li4 var4 = (Li4)var0.get((int)var3);
            var10000 = (int[])var4;
            Object[] var10001 = Registry.emptyArgs();
            long var20 = 408177353860141270L;
            Object[] var19 = var10001;
            var10001 = Ref.h(408177353860141270L, var19, var20);

            try {
               var10001 = (ArrayList)var10001;
            } catch (InvocationTargetException var49) {
               throw var49.getTargetException();
            }

            ArrayList var5 = var10001;
            O0 var6 = new O0();
            String var10002 = a(-8579, 23635);
            Object[] var10004 = Registry.emptyArgs();
            long var22 = 286931176286176762L;
            Object[] var21 = var10004;
            var10004 = Ref.h(286931176286176762L, var21, var22);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }

            var10002.C(var4, var10004);
            String var10003 = a(-8589, -23222);
            Object[] var10005 = Registry.emptyArgs();
            long var24 = 194080076253066315L;
            Object[] var23 = var10005;
            var10005 = Ref.h(194080076253066315L, var23, var24);

            try {
               var10005 = (String)var10005;
            } catch (InvocationTargetException var47) {
               throw var47.getTargetException();
            }

            var10003.C(var4, var10005);
            String var63 = a(-8582, -14659);
            Object[] var10006 = Registry.emptyArgs();
            long var26 = 145535910876897139L;
            Object[] var25 = var10006;
            var10006 = Ref.h(145535910876897139L, var25, var26);

            try {
               var68 = (Integer)var10006;
            } catch (InvocationTargetException var46) {
               throw var46.getTargetException();
            }

            var63.C(var4, var68);
            Registry.packArgs(var4, var6);
            long var27 = 622166953529806027L;
            Ref.h2(622166953529806027L, var27);

            try {
               ;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }

            Oc2 var7 = new Oc2();
            var6.C(a(-8583, -32120), var7);

            label172:
            while (true) {
               if (var1 != null) {
                  return var2;
               }

               var2.add(var6);
               int var8 = 0;

               while (true) {
                  if (var8 >= var5.size()) {
                     break label172;
                  }

                  Lj4_2 var9 = (Lj4_2)var5.get(var8);
                  O0 var10 = new O0();
                  var7.add(var10);
                  var87 = var10;
                  String var69 = a(-8592, 24204);
                  Object[] var10008 = Registry.emptyArgs();
                  long var30 = 286931176286176762L;
                  Object[] var29 = var10008;
                  var10008 = Ref.h(286931176286176762L, var29, var30);

                  try {
                     var10008 = (String)var10008;
                  } catch (InvocationTargetException var55) {
                     throw var55.getTargetException();
                  }

                  var69.C(var9, var10008);
                  String var10007 = a(-8591, -25303);
                  Object[] var10009 = Registry.emptyArgs();
                  long var32 = 547398689030025911L;
                  Object[] var31 = var10009;
                  var10009 = Ref.h(547398689030025911L, var31, var32);

                  try {
                     var10009 = (String)var10009;
                  } catch (InvocationTargetException var54) {
                     throw var54.getTargetException();
                  }

                  var10007.C(var9, var10009);
                  String var72 = a(-8586, -1718);
                  Object[] var10010 = Registry.emptyArgs();
                  long var34 = 194080076253066315L;
                  Object[] var33 = var10010;
                  var10010 = Ref.h(194080076253066315L, var33, var34);

                  try {
                     var10010 = (String)var10010;
                  } catch (InvocationTargetException var53) {
                     throw var53.getTargetException();
                  }

                  var72.C(var9, var10010);
                  String var75 = a(-8580, -28301);
                  Object[] var10011 = Registry.emptyArgs();
                  long var36 = 135618565837694791L;
                  Object[] var35 = var10011;
                  var10011 = Ref.h(135618565837694791L, var35, var36);

                  try {
                     var79 = (Boolean)var10011;
                  } catch (InvocationTargetException var52) {
                     throw var52.getTargetException();
                  }

                  var75.C(var9, var79);
                  Registry.packArgs(var9, var10);
                  long var37 = 622166953529806027L;
                  Ref.h2(622166953529806027L, var37);

                  try {
                     ;
                  } catch (InvocationTargetException var51) {
                     throw var51.getTargetException();
                  }

                  O0 var11 = new O0();
                  var10.C(a(-8581, -4315), var11);
                  if (var1 != null) {
                     continue label175;
                  }

                  int var12 = 0;

                  while (var12 < Registry.lookupField(216182060077896093L).getInt(null)) {
                     String var13 = "#" + (var12 + 1);
                     var10011 = Registry.packArgs(var13);
                     long var40 = 242040625560871861L;
                     Object[] var39 = var10011;
                     var10011 = Ref.h(242040625560871861L, var39, var40);

                     try {
                        var10011 = (Dx4_2)var10011;
                     } catch (InvocationTargetException var50) {
                        throw var50.getTargetException();
                     }

                     Dx4_2 var14 = var10011;
                     label152:
                     if (var1 == null) {
                        if (var1 != null) {
                           continue label172;
                        }

                        if (var14 != null) {
                           Oc2 var15 = new Oc2();
                           Object[] var10012 = Registry.emptyArgs();
                           long var42 = 596400151700218172L;
                           Object[] var41 = var10012;
                           var10012 = Ref.h(596400151700218172L, var41, var42);

                           try {
                              var10012 = (ArrayList)var10012;
                           } catch (InvocationTargetException var57) {
                              throw var57.getTargetException();
                           }

                           for (L1 var17 : var10012) {
                              Registry.packArgs(var17);
                              long var43 = 487998346758576618L;
                              Object var10013 = Ref.h2(487998346758576618L, var43);

                              try {
                                 var10013 = (O0)var10013;
                              } catch (InvocationTargetException var56) {
                                 throw var56.getTargetException();
                              }

                              O0 var18 = (O0)var10013;
                              var15.add(var18);
                              if (var1 != null) {
                                 break label152;
                              }

                              if (var1 != null) {
                                 break;
                              }
                           }

                           var11.C(var13, var15);
                        }

                        var12++;
                     }

                     if (var1 != null) {
                        break;
                     }
                  }

                  var8++;
                  if (var1 != null) {
                     break label172;
                  }
               }
            }

            var3++;
            var87 = var1;
            if (var1 == null) {
               continue label178;
            }

            return var1;
         }

         return (Oc2)var87;
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -8592) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 210;
               break;
            case 1:
               var10000 = 106;
               break;
            case 2:
               var10000 = 244;
               break;
            case 3:
               var10000 = 147;
               break;
            case 4:
               var10000 = 82;
               break;
            case 5:
               var10000 = 222;
               break;
            case 6:
               var10000 = 43;
               break;
            case 7:
               var10000 = 217;
               break;
            case 8:
               var10000 = 86;
               break;
            case 9:
               var10000 = 14;
               break;
            case 10:
               var10000 = 130;
               break;
            case 11:
               var10000 = 145;
               break;
            case 12:
               var10000 = 186;
               break;
            case 13:
               var10000 = 79;
               break;
            case 14:
               var10000 = 245;
               break;
            case 15:
               var10000 = 250;
               break;
            case 16:
               var10000 = 135;
               break;
            case 17:
               var10000 = 166;
               break;
            case 18:
               var10000 = 207;
               break;
            case 19:
               var10000 = 12;
               break;
            case 20:
               var10000 = 148;
               break;
            case 21:
               var10000 = 134;
               break;
            case 22:
               var10000 = 205;
               break;
            case 23:
               var10000 = 168;
               break;
            case 24:
               var10000 = 105;
               break;
            case 25:
               var10000 = 35;
               break;
            case 26:
               var10000 = 241;
               break;
            case 27:
               var10000 = 216;
               break;
            case 28:
               var10000 = 235;
               break;
            case 29:
               var10000 = 192;
               break;
            case 30:
               var10000 = 77;
               break;
            case 31:
               var10000 = 182;
               break;
            case 32:
               var10000 = 170;
               break;
            case 33:
               var10000 = 92;
               break;
            case 34:
               var10000 = 126;
               break;
            case 35:
               var10000 = 32;
               break;
            case 36:
               var10000 = 151;
               break;
            case 37:
               var10000 = 65;
               break;
            case 38:
               var10000 = 62;
               break;
            case 39:
               var10000 = 97;
               break;
            case 40:
               var10000 = 17;
               break;
            case 41:
               var10000 = 71;
               break;
            case 42:
               var10000 = 13;
               break;
            case 43:
               var10000 = 236;
               break;
            case 44:
               var10000 = 22;
               break;
            case 45:
               var10000 = 89;
               break;
            case 46:
               var10000 = 220;
               break;
            case 47:
               var10000 = 117;
               break;
            case 48:
               var10000 = 20;
               break;
            case 49:
               var10000 = 251;
               break;
            case 50:
               var10000 = 206;
               break;
            case 51:
               var10000 = 139;
               break;
            case 52:
               var10000 = 118;
               break;
            case 53:
               var10000 = 30;
               break;
            case 54:
               var10000 = 28;
               break;
            case 55:
               var10000 = 101;
               break;
            case 56:
               var10000 = 133;
               break;
            case 57:
               var10000 = 165;
               break;
            case 58:
               var10000 = 185;
               break;
            case 59:
               var10000 = 9;
               break;
            case 60:
               var10000 = 193;
               break;
            case 61:
               var10000 = 45;
               break;
            case 62:
               var10000 = 178;
               break;
            case 63:
               var10000 = 214;
               break;
            case 64:
               var10000 = 119;
               break;
            case 65:
               var10000 = 2;
               break;
            case 66:
               var10000 = 194;
               break;
            case 67:
               var10000 = 221;
               break;
            case 68:
               var10000 = 174;
               break;
            case 69:
               var10000 = 47;
               break;
            case 70:
               var10000 = 44;
               break;
            case 71:
               var10000 = 100;
               break;
            case 72:
               var10000 = 198;
               break;
            case 73:
               var10000 = 239;
               break;
            case 74:
               var10000 = 189;
               break;
            case 75:
               var10000 = 8;
               break;
            case 76:
               var10000 = 231;
               break;
            case 77:
               var10000 = 247;
               break;
            case 78:
               var10000 = 177;
               break;
            case 79:
               var10000 = 16;
               break;
            case 80:
               var10000 = 153;
               break;
            case 81:
               var10000 = 1;
               break;
            case 82:
               var10000 = 103;
               break;
            case 83:
               var10000 = 171;
               break;
            case 84:
               var10000 = 87;
               break;
            case 85:
               var10000 = 37;
               break;
            case 86:
               var10000 = 3;
               break;
            case 87:
               var10000 = 248;
               break;
            case 88:
               var10000 = 240;
               break;
            case 89:
               var10000 = 252;
               break;
            case 90:
               var10000 = 90;
               break;
            case 91:
               var10000 = 25;
               break;
            case 92:
               var10000 = 156;
               break;
            case 93:
               var10000 = 84;
               break;
            case 94:
               var10000 = 33;
               break;
            case 95:
               var10000 = 38;
               break;
            case 96:
               var10000 = 219;
               break;
            case 97:
               var10000 = 40;
               break;
            case 98:
               var10000 = 237;
               break;
            case 99:
               var10000 = 81;
               break;
            case 100:
               var10000 = 50;
               break;
            case 101:
               var10000 = 167;
               break;
            case 102:
               var10000 = 232;
               break;
            case 103:
               var10000 = 7;
               break;
            case 104:
               var10000 = 94;
               break;
            case 105:
               var10000 = 141;
               break;
            case 106:
               var10000 = 179;
               break;
            case 107:
               var10000 = 55;
               break;
            case 108:
               var10000 = 175;
               break;
            case 109:
               var10000 = 137;
               break;
            case 110:
               var10000 = 91;
               break;
            case 111:
               var10000 = 243;
               break;
            case 112:
               var10000 = 18;
               break;
            case 113:
               var10000 = 107;
               break;
            case 114:
               var10000 = 120;
               break;
            case 115:
               var10000 = 23;
               break;
            case 116:
               var10000 = 190;
               break;
            case 117:
               var10000 = 173;
               break;
            case 118:
               var10000 = 4;
               break;
            case 119:
               var10000 = 125;
               break;
            case 120:
               var10000 = 128;
               break;
            case 121:
               var10000 = 56;
               break;
            case 122:
               var10000 = 74;
               break;
            case 123:
               var10000 = 184;
               break;
            case 124:
               var10000 = 253;
               break;
            case 125:
               var10000 = 109;
               break;
            case 126:
               var10000 = 204;
               break;
            case 127:
               var10000 = 127;
               break;
            case 128:
               var10000 = 238;
               break;
            case 129:
               var10000 = 197;
               break;
            case 130:
               var10000 = 149;
               break;
            case 131:
               var10000 = 157;
               break;
            case 132:
               var10000 = 76;
               break;
            case 133:
               var10000 = 246;
               break;
            case 134:
               var10000 = 52;
               break;
            case 135:
               var10000 = 152;
               break;
            case 136:
               var10000 = 255;
               break;
            case 137:
               var10000 = 19;
               break;
            case 138:
               var10000 = 99;
               break;
            case 139:
               var10000 = 129;
               break;
            case 140:
               var10000 = 211;
               break;
            case 141:
               var10000 = 72;
               break;
            case 142:
               var10000 = 113;
               break;
            case 143:
               var10000 = 24;
               break;
            case 144:
               var10000 = 187;
               break;
            case 145:
               var10000 = 115;
               break;
            case 146:
               var10000 = 140;
               break;
            case 147:
               var10000 = 27;
               break;
            case 148:
               var10000 = 108;
               break;
            case 149:
               var10000 = 144;
               break;
            case 150:
               var10000 = 142;
               break;
            case 151:
               var10000 = 254;
               break;
            case 152:
               var10000 = 181;
               break;
            case 153:
               var10000 = 234;
               break;
            case 154:
               var10000 = 212;
               break;
            case 155:
               var10000 = 80;
               break;
            case 156:
               var10000 = 154;
               break;
            case 157:
               var10000 = 138;
               break;
            case 158:
               var10000 = 164;
               break;
            case 159:
               var10000 = 78;
               break;
            case 160:
               var10000 = 208;
               break;
            case 161:
               var10000 = 31;
               break;
            case 162:
               var10000 = 110;
               break;
            case 163:
               var10000 = 146;
               break;
            case 164:
               var10000 = 143;
               break;
            case 165:
               var10000 = 60;
               break;
            case 166:
               var10000 = 201;
               break;
            case 167:
               var10000 = 180;
               break;
            case 168:
               var10000 = 36;
               break;
            case 169:
               var10000 = 0;
               break;
            case 170:
               var10000 = 163;
               break;
            case 171:
               var10000 = 196;
               break;
            case 172:
               var10000 = 54;
               break;
            case 173:
               var10000 = 51;
               break;
            case 174:
               var10000 = 111;
               break;
            case 175:
               var10000 = 42;
               break;
            case 176:
               var10000 = 233;
               break;
            case 177:
               var10000 = 49;
               break;
            case 178:
               var10000 = 96;
               break;
            case 179:
               var10000 = 161;
               break;
            case 180:
               var10000 = 203;
               break;
            case 181:
               var10000 = 202;
               break;
            case 182:
               var10000 = 114;
               break;
            case 183:
               var10000 = 132;
               break;
            case 184:
               var10000 = 249;
               break;
            case 185:
               var10000 = 41;
               break;
            case 186:
               var10000 = 69;
               break;
            case 187:
               var10000 = 64;
               break;
            case 188:
               var10000 = 104;
               break;
            case 189:
               var10000 = 95;
               break;
            case 190:
               var10000 = 218;
               break;
            case 191:
               var10000 = 158;
               break;
            case 192:
               var10000 = 242;
               break;
            case 193:
               var10000 = 215;
               break;
            case 194:
               var10000 = 53;
               break;
            case 195:
               var10000 = 58;
               break;
            case 196:
               var10000 = 169;
               break;
            case 197:
               var10000 = 226;
               break;
            case 198:
               var10000 = 229;
               break;
            case 199:
               var10000 = 34;
               break;
            case 200:
               var10000 = 155;
               break;
            case 201:
               var10000 = 162;
               break;
            case 202:
               var10000 = 29;
               break;
            case 203:
               var10000 = 59;
               break;
            case 204:
               var10000 = 61;
               break;
            case 205:
               var10000 = 116;
               break;
            case 206:
               var10000 = 200;
               break;
            case 207:
               var10000 = 21;
               break;
            case 208:
               var10000 = 131;
               break;
            case 209:
               var10000 = 88;
               break;
            case 210:
               var10000 = 57;
               break;
            case 211:
               var10000 = 5;
               break;
            case 212:
               var10000 = 98;
               break;
            case 213:
               var10000 = 123;
               break;
            case 214:
               var10000 = 223;
               break;
            case 215:
               var10000 = 85;
               break;
            case 216:
               var10000 = 195;
               break;
            case 217:
               var10000 = 83;
               break;
            case 218:
               var10000 = 102;
               break;
            case 219:
               var10000 = 26;
               break;
            case 220:
               var10000 = 121;
               break;
            case 221:
               var10000 = 122;
               break;
            case 222:
               var10000 = 6;
               break;
            case 223:
               var10000 = 213;
               break;
            case 224:
               var10000 = 63;
               break;
            case 225:
               var10000 = 75;
               break;
            case 226:
               var10000 = 227;
               break;
            case 227:
               var10000 = 39;
               break;
            case 228:
               var10000 = 46;
               break;
            case 229:
               var10000 = 230;
               break;
            case 230:
               var10000 = 199;
               break;
            case 231:
               var10000 = 11;
               break;
            case 232:
               var10000 = 66;
               break;
            case 233:
               var10000 = 48;
               break;
            case 234:
               var10000 = 70;
               break;
            case 235:
               var10000 = 224;
               break;
            case 236:
               var10000 = 183;
               break;
            case 237:
               var10000 = 112;
               break;
            case 238:
               var10000 = 225;
               break;
            case 239:
               var10000 = 176;
               break;
            case 240:
               var10000 = 191;
               break;
            case 241:
               var10000 = 209;
               break;
            case 242:
               var10000 = 68;
               break;
            case 243:
               var10000 = 159;
               break;
            case 244:
               var10000 = 172;
               break;
            case 245:
               var10000 = 228;
               break;
            case 246:
               var10000 = 150;
               break;
            case 247:
               var10000 = 73;
               break;
            case 248:
               var10000 = 188;
               break;
            case 249:
               var10000 = 15;
               break;
            case 250:
               var10000 = 67;
               break;
            case 251:
               var10000 = 10;
               break;
            case 252:
               var10000 = 93;
               break;
            case 253:
               var10000 = 124;
               break;
            case 254:
               var10000 = 136;
               break;
            default:
               var10000 = 160;
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
            int var8 = var7 % 2;
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1023;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[15];
      int var11 = 0;
      String var10 = "=\u0085;\u008c\u0007\\½»L¬\u0003\u0096\u000bJ\u0089\"C²m\u009b\f\u001fDÖ\u0002B\u0083\b@¶8-Ü/\u0098)\tõjÑBPÁÜ¯ì\u0002Kt\u0005\u000ecu!N\u0007\u0014\u0016²9\u008d\u00ad²\b\u0017@Òó\u0081ô3R\u0005g\"X\të\r\u008c&ÏüÒ©Øô¼üñmá\tf4£\u0089\u001e¸\u0015\u0080Õ";
      int var12 = "=\u0085;\u008c\u0007\\½»L¬\u0003\u0096\u000bJ\u0089\"C²m\u009b\f\u001fDÖ\u0002B\u0083\b@¶8-Ü/\u0098)\tõjÑBPÁÜ¯ì\u0002Kt\u0005\u000ecu!N\u0007\u0014\u0016²9\u008d\u00ad²\b\u0017@Òó\u0081ô3R\u0005g\"X\të\r\u008c&ÏüÒ©Øô¼üñmá\tf4£\u0089\u001e¸\u0015\u0080Õ"
         .length();
      char var9 = 4;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 70;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 22;
                        break;
                     case 1:
                        var58 = 119;
                        break;
                     case 2:
                        var58 = 30;
                        break;
                     case 3:
                        var58 = 116;
                        break;
                     case 4:
                        var58 = 55;
                        break;
                     case 5:
                        var58 = 36;
                        break;
                     default:
                        var58 = 66;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[15];
                     long var0 = 7454250973774587374L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "ÚÄµ(k)fSU pd\u007f.dð";
                     int var5 = "ÚÄµ(k)fSU pd\u007f.dð".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[2];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "±Æ+e\r \u0086ËiÓ\u009ay\u0013\t\u0081ÆC\u0086";
                  var12 = "±Æ+e\r \u0086ËiÓ\u009ay\u0013\t\u0081ÆC\u0086".length();
                  var9 = 4;
                  var16 = -1;
            }

            var10000 = 99;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}






