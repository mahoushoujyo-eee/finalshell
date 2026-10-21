package com.finalshell.core;

import com.finalshell.ui.model.Ks2_2;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Ul2 extends UT_2 {
   public final Type J;
   public int v;
   public X4 Y;
   public static long[] c;
   public static Integer[] d;

   public Ul2(IG var1, java.lang.Class var2, Ph2 var3) {
      label37: {
         Ky4[] var10000 = ZS.p();
         super(var2, var3);
         Type var5 = var3.a;
         Ky4[] var4 = var10000;
         Type var9 = var5;
         if (var4 == null) {
            if (!(var5 instanceof ParameterizedType)) {
               break label37;
            }

            var9 = ((ParameterizedType)var3.a).getActualTypeArguments()[0];
         }

         Type var6 = var9;
         label24:
         if (var4 == null) {
            if (var6 instanceof WildcardType) {
               WildcardType var7 = (WildcardType)var6;
               Type[] var8 = var7.getUpperBounds();
               if (var4 != null) {
                  break label24;
               }

               if (var8.length == 1) {
                  var6 = var8[0];
               }
            }

            this.J = var6;
         }

         if (var4 == null) {
            return;
         }
      }

      this.J = Object.class;
   }

   @Override
   public int f() {
      return a(25269, 7417536562036152064L);
   }

   @Override
   public void y(Yn4 var1, Object var2, Type var3, Map var4) {
      WildcardType var10;
      Ky4[] var5;
      Object var11;
      label67: {
         label57: {
            label56: {
               label62: {
                  Ky4[] var10000 = ZS.p();
                  P7 var6 = var1.N;
                  int var7 = var6.P();
                  var5 = var10000;
                  var10 = var7;
                  int var10001 = a(22986, 3225542231451413628L);
                  if (var5 == null) {
                     if (var7 == var10001) {
                        break label56;
                     }

                     var10 = var7;
                     if (var5 != null) {
                        break label62;
                     }

                     var10001 = 4;
                  }

                  if (var10 != var10001) {
                     break label57;
                  }

                  var11 = var6.z();
                  if (var5 != null) {
                     break label67;
                  }

                  var10 = var11.length();
               }

               if (var10 != 0) {
                  break label57;
               }
            }

            var11 = var2;
            break label67;
         }

         ArrayList var8 = new ArrayList();
         XM3 var9 = var1.A$xM_3();
         var1.L(var9, var2, this.p.I);
         Ul2 var12 = this;
         Object var13 = var1;
         if (var5 == null) {
            this.w(var1, var3, var8);
            var1.z(var9);
            if (var2 == null) {
               var4.put(this.p.I, var8);
               if (var5 == null) {
                  return;
               }
            }

            var12 = this;
            var13 = var2;
         }

         var12.D(var13, var8);
         return;
      }

      label31: {
         if (var5 == null) {
            if (var11 != null) {
               break label31;
            }

            var4.put(this.p.I, null);
         }

         if (var5 == null) {
            return;
         }
      }

      this.S(var2, null);
   }

   public final void w(Yn4 var1, Type var2, Collection var3) {
      Ky4[] var4;
      Type var5;
      X4 var6;
      label261: {
         Ky4[] var10000 = ZS.p();
         var5 = this.J;
         var4 = var10000;
         var6 = this.Y;
         boolean var34 = var2 instanceof ParameterizedType;
         if (var4 == null) {
            if (var34) {
               label263: {
                  boolean var35 = var5 instanceof TypeVariable;
                  if (var4 == null) {
                     if (var35) {
                        TypeVariable var7;
                        ParameterizedType var8;
                        java.lang.Class var9;
                        label248: {
                           var7 = (TypeVariable)var5;
                           var8 = (ParameterizedType)var2;
                           var9 = null;
                           Type var36 = var8.getRawType();
                           if (var4 == null) {
                              if (!(var36 instanceof java.lang.Class)) {
                                 break label248;
                              }

                              var36 = var8.getRawType();
                           }

                           var9 = (java.lang.Class)var36;
                        }

                        int var10;
                        label242: {
                           var10 = -1;
                           if (var9 != null) {
                              int var11 = 0;
                              int var12 = var9.getTypeParameters().length;

                              while (var11 < var12) {
                                 TypeVariable var13 = var9.getTypeParameters()[var11];
                                 if (var4 == null) {
                                    var37 = var13.getName().equals(var7.getName());
                                    if (var4 != null) {
                                       break label242;
                                    }

                                    if (var37 != 0) {
                                       var10 = var11;
                                       if (var4 == null) {
                                          break;
                                       }
                                    }

                                    var11++;
                                 }

                                 if (var4 != null) {
      WildcardType var37;
                                    break;
                                 }
                              }
                           }

                           var37 = var10;
                        }

                        label225: {
                           if (var4 == null) {
                              if (var37 == -1) {
                                 break label225;
                              }

                              var5 = var8.getActualTypeArguments()[var10];
                              var37 = var5.equals(this.J);
                           }

                           if (var37 == 0) {
                              var6 = var1.L().h(var5);
                           }
                        }

                        if (var4 == null) {
                           break label261;
                        }
                     }

                     var38 = var5;
                     if (var4 != null) {
                        break label263;
                     }

                     var35 = var5 instanceof ParameterizedType;
                  }

                  if (!var35) {
                     break label261;
                  }

                  var38 = var5;
               }

               label268: {
                  ParameterizedType var16;
                  Type[] var19;
                  label269: {
                     var16 = (ParameterizedType)var38;
                     var19 = var16.getActualTypeArguments();
                     int var39 = var19.length;
                     if (var4 == null) {
                        if (var39 != 1) {
                           break label268;
                        }

                        var40 = var19[0];
                        if (var4 != null) {
                           break label269;
                        }

                        var39 = var40 instanceof TypeVariable;
                     }

                     if (var39 == 0) {
                        break label268;
                     }

                     var40 = var19[0];
                  }

                  TypeVariable var22;
                  ParameterizedType var26;
                  java.lang.Class var29;
                  label202: {
                     var22 = (TypeVariable)var40;
                     var26 = (ParameterizedType)var2;
                     var29 = null;
                     Type var41 = var26.getRawType();
                     if (var4 == null) {
                        if (!(var41 instanceof java.lang.Class)) {
                           break label202;
                        }

                        var41 = var26.getRawType();
                     }

                     var29 = (java.lang.Class)var41;
                  }

                  int var31;
                  label196: {
                     var31 = -1;
                     if (var29 != null) {
                        int var33 = 0;
                        int var14 = var29.getTypeParameters().length;

                        while (var33 < var14) {
                           TypeVariable var15 = var29.getTypeParameters()[var33];
                           if (var4 == null) {
                              var42 = var15.getName().equals(var22.getName());
                              if (var4 != null) {
                                 break label196;
                              }

                              if (var42 != 0) {
                                 var31 = var33;
                                 if (var4 == null) {
                                    break;
                                 }
                              }

                              var33++;
                           }

                           if (var4 != null) {
                              break;
                           }
                        }
                     }

                     var42 = var31;
                  }

                  if (var42 != -1) {
                     var19[0] = var26.getActualTypeArguments()[var31];
                     var5 = HI.V(new HK(var19, var16.getOwnerType(), var16.getRawType()));
                  }
               }

               if (var4 == null) {
                  break label261;
               }
            }

            var34 = var5 instanceof TypeVariable;
         }

         label273: {
            if (var4 == null) {
               if (!var34) {
                  break label261;
               }

               var43 = var2;
               if (var4 != null) {
                  break label273;
               }

               var34 = var2 instanceof java.lang.Class;
            }

            if (!var34) {
               break label261;
            }

            var43 = var2;
         }

         java.lang.Class var17 = (java.lang.Class)var43;
         TypeVariable var20 = (TypeVariable)var5;
         var17.getTypeParameters();
         int var23 = 0;
         int var27 = var17.getTypeParameters().length;

         while (var23 < var27) {
            TypeVariable var30 = var17.getTypeParameters()[var23];
            if (var4 == null) {
               if (var30.getName().equals(var20.getName())) {
                  Type[] var32 = var30.getBounds();
                  Type[] var44 = var32;
                  if (var4 == null) {
                     if (var32.length != 1) {
                        break;
                     }

                     var44 = var32;
                  }

                  var5 = var44[0];
                  if (var4 == null) {
                     break;
                  }
               }

               var23++;
            }

            if (var4 != null) {
               break;
            }
         }
      }

      P7 var18 = var1.N;
      int var21 = var18.P();
      if (var21 == a(8589, 1692806367274292281L)) {
         label143: {
            X4 var45 = var6;
            if (var4 == null) {
               if (var6 != null) {
                  break label143;
               }

               var45 = this.Y = var1.L().h(var5);
            }

            var6 = var45;
            this.v = this.Y.j();
         }

         var18.S(this.v);
         int var24 = 0;

         do {
            Object var47;
            label134: {
               label133: {
                  int var10001;
                  label285: {
                     if (var18.w(Ks2_2.AllowArbitraryCommas)) {
                        do {
                           var46 = var18.P();
                           var10001 = a(16009, 6183676592630123321L);
                           if (var4 != null) {
                              break label285;
                           }

                           if (var46 != var10001) {
                              break;
                           }

                           var18.K();
                           if (var4 != null) {
                              break label133;
                           }
                        } while (var4 == null);
                     }

                     var47 = var18;
                     if (var4 != null) {
                        break label134;
                     }

                     var46 = var18.P();
                     var10001 = a(14702, 1946729681533160671L);
                  }

                  if (var46 == var10001 && var4 == null) {
                     break;
                  }
               }

               var47 = var6.z(var1, var5, var24);
            }

            Object var28 = var47;
            var3.add(var28);
            var1.b(var3);
            if (var4 == null) {
               if (var18.P() == a(14935, 7448782495277764576L)) {
                  var18.S(this.v);
               }

               var24++;
            }
         } while (var4 == null);

         var18.S(a(14935, 7448782495277764576L));
         if (var4 == null) {
            return;
         }
      }

      Object var48 = var6;
      if (var4 == null) {
         if (var6 == null) {
            var6 = this.Y = var1.L().h(var5);
         }

         var48 = var6.z(var1, var5, 0);
      }

      Object var25 = var48;
      var3.add(var25);
      var1.b(var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30132;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6745192190414285224L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "#\u001av\u0092Q\u0086½\u009fKAú\u0086SÂþ¦a3}I¢ÏEÜhZè\u0012\u0093L&X";
      int var5 = "#\u001av\u0092Q\u0086½\u009fKAú\u0086SÂþ¦a3}I¢ÏEÜhZè\u0012\u0093L&X".length();
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
                     c = var6;
                     d = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "´|E0vü\"\u0081\u0019¯üø\u0086\u001f¥x";
                  var5 = "´|E0vü\"\u0081\u0019¯üø\u0086\u001f¥x".length();
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
}






