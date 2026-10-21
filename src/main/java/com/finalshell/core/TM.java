package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.TC3;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.ImportExportPanel;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class TM extends DefaultCellEditor {
   public Ne4 v;
   public com.finalshell.ui.panel.Wb2 L;
   public final ShowDeletedPanel J;
   public final ImportExportPanel T;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public TM(ImportExportPanel var1, JTextField var2, ShowDeletedPanel var3) {
      super(var2);
      this.T = var1;
      this.J = var3;
      DN var10001 = new DN();
      long var5 = 205795460956385135L;
      DN var4 = var10001;
      Ref.s(205795460956385135L, var4, var5);
      com.finalshell.ui.panel.Wb2 var10002 = new com.finalshell.ui.panel.Wb2();
      long var7 = 341837417288837533L;
      com.finalshell.ui.panel.Wb2 var6 = var10002;
      Ref.s(341837417288837533L, var6, var7);
      Object var8 = 205795460956385135L;
      Ne4 var10003 = (Ne4)Ref.g(205795460956385135L, var8);
      Object var10 = 341837417288837533L;
      this.v((com.finalshell.ui.panel.Wb2)Ref.g(341837417288837533L, var10));
      Object var12 = 205795460956385135L;
      ((Ne4)Ref.g(205795460956385135L, var12)).F(0);
      Object var14 = 205795460956385135L;
      Ne4 var10006 = (Ne4)Ref.g(205795460956385135L, var14);
      Object var16 = 341837417288837533L;
      this.v((com.finalshell.ui.panel.Wb2)Ref.g(341837417288837533L, var16));
      Object var18 = 205795460956385135L;
      ((Ne4)Ref.g(205795460956385135L, var18)).I(0, 0, 1, 0);
      Object var20 = 205795460956385135L;
      ((Ne4)Ref.g(205795460956385135L, var20)).d(1, 4, 0, 0);
      Object var22 = 205795460956385135L;
      ((Ne4)Ref.g(205795460956385135L, var22)).addKeyListener(new com.finalshell.ui.listener.Yp2(this));
      Object var24 = 205795460956385135L;
      ((Ne4)Ref.g(205795460956385135L, var24)).addFocusListener(new TC3(this));
   }

   @Override
   public boolean shouldSelectCell(EventObject var1) {
      return super.shouldSelectCell(var1);
   }

   @Override
   public Object getCellEditorValue() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ldc2_w 123645524365861271
      // 004: astore 11
      // 006: ldc2_w 123645524365861271
      // 009: aload 11
      // 00b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 00e: ldc2_w 259710391705259359
      // 011: astore 13
      // 013: ldc2_w 259710391705259359
      // 016: aload 13
      // 018: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01b: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 01e: astore 2
      // 01f: invokestatic com/finalshell/ui/panel/AA.z ()Ljava/lang/String;
      // 022: aload 2
      // 023: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 026: astore 3
      // 027: astore 1
      // 028: aload 0
      // 029: ldc2_w 205795460956385135
      // 02c: astore 15
      // 02e: ldc2_w 205795460956385135
      // 031: aload 15
      // 033: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 036: checkcast com/finalshell/core/Ne4
      // 039: invokevirtual com/finalshell/core/Ne4.getText ()Ljava/lang/String;
      // 03c: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 03f: astore 4
      // 041: aload 3
      // 042: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 045: ldc com/finalshell/ui/model/Ck4
      // 047: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 04a: aload 1
      // 04b: ifnonnull 266
      // 04e: ifeq 24b
      // 051: goto 058
      // 054: invokestatic com/finalshell/core/TM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 057: athrow
      // 058: aload 3
      // 059: checkcast com/finalshell/ui/model/Ck4
      // 05c: astore 5
      // 05e: new java/io/File
      // 061: dup
      // 062: aload 5
      // 064: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 067: ldc2_w 272998330038223631
      // 06a: astore 18
      // 06c: astore 17
      // 06e: ldc2_w 272998330038223631
      // 071: aload 17
      // 073: aload 18
      // 075: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 078: checkcast java/io/File
      // 07b: goto 082
      // 07e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 081: athrow
      // 082: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 085: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 088: astore 6
      // 08a: aload 6
      // 08c: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 08f: astore 7
      // 091: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 094: ldc2_w 270389152141252877
      // 097: astore 19
      // 099: ldc2_w 270389152141252877
      // 09c: aload 19
      // 09e: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a1: goto 0a8
      // 0a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ab: ldc2_w 410905379772103887
      // 0ae: astore 22
      // 0b0: astore 21
      // 0b2: ldc2_w 410905379772103887
      // 0b5: aload 21
      // 0b7: aload 22
      // 0b9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0bc: goto 0c3
      // 0bf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c2: athrow
      // 0c3: aload 7
      // 0c5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c8: ldc2_w 489768706953623433
      // 0cb: astore 24
      // 0cd: astore 23
      // 0cf: ldc2_w 489768706953623433
      // 0d2: aload 23
      // 0d4: aload 24
      // 0d6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d9: checkcast com/finalshell/core/Lv4_2
      // 0dc: goto 0e3
      // 0df: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: astore 8
      // 0e5: aload 8
      // 0e7: aload 1
      // 0e8: ifnonnull 18c
      // 0eb: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0ee: ldc2_w 286931176286176762
      // 0f1: astore 26
      // 0f3: astore 25
      // 0f5: ldc2_w 286931176286176762
      // 0f8: aload 25
      // 0fa: aload 26
      // 0fc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0ff: checkcast java/lang/String
      // 102: goto 109
      // 105: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 108: athrow
      // 109: aload 4
      // 10b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 10e: ifne 247
      // 111: goto 118
      // 114: invokestatic com/finalshell/core/TM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 117: athrow
      // 118: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 11b: ldc2_w 270389152141252877
      // 11e: astore 27
      // 120: ldc2_w 270389152141252877
      // 123: aload 27
      // 125: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 128: goto 12f
      // 12b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 132: ldc2_w 410905379772103887
      // 135: astore 30
      // 137: astore 29
      // 139: ldc2_w 410905379772103887
      // 13c: aload 29
      // 13e: aload 30
      // 140: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 143: goto 14a
      // 146: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 149: athrow
      // 14a: aload 5
      // 14c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 14f: ldc2_w 605430732347023634
      // 152: astore 32
      // 154: astore 31
      // 156: ldc2_w 605430732347023634
      // 159: aload 31
      // 15b: aload 32
      // 15d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 160: goto 167
      // 163: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 166: athrow
      // 167: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 16a: ldc2_w 489768706953623433
      // 16d: astore 34
      // 16f: astore 33
      // 171: ldc2_w 489768706953623433
      // 174: aload 33
      // 176: aload 34
      // 178: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17b: checkcast com/finalshell/core/Lv4_2
      // 17e: goto 185
      // 181: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 184: athrow
      // 185: goto 18c
      // 188: invokestatic com/finalshell/core/TM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18b: athrow
      // 18c: astore 9
      // 18e: aload 9
      // 190: invokestatic java/lang/System.currentTimeMillis ()J
      // 193: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 196: ldc2_w 379623615202365815
      // 199: astore 36
      // 19b: astore 35
      // 19d: ldc2_w 379623615202365815
      // 1a0: aload 35
      // 1a2: aload 36
      // 1a4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1a7: pop
      // 1a8: goto 1af
      // 1ab: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ae: athrow
      // 1af: aload 9
      // 1b1: aload 4
      // 1b3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1b6: ldc2_w 193904661956891993
      // 1b9: astore 38
      // 1bb: astore 37
      // 1bd: ldc2_w 193904661956891993
      // 1c0: aload 37
      // 1c2: aload 38
      // 1c4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c7: pop
      // 1c8: goto 1cf
      // 1cb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ce: athrow
      // 1cf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d2: ldc2_w 270389152141252877
      // 1d5: astore 39
      // 1d7: ldc2_w 270389152141252877
      // 1da: aload 39
      // 1dc: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1df: goto 1e6
      // 1e2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e5: athrow
      // 1e6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1e9: ldc2_w 410905379772103887
      // 1ec: astore 42
      // 1ee: astore 41
      // 1f0: ldc2_w 410905379772103887
      // 1f3: aload 41
      // 1f5: aload 42
      // 1f7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fa: goto 201
      // 1fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 200: athrow
      // 201: aload 9
      // 203: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 206: ldc2_w 370860320396635908
      // 209: astore 44
      // 20b: astore 43
      // 20d: ldc2_w 370860320396635908
      // 210: aload 43
      // 212: aload 44
      // 214: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 217: pop
      // 218: goto 21f
      // 21b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21e: athrow
      // 21f: aload 9
      // 221: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 224: ldc2_w 510288519500652836
      // 227: astore 46
      // 229: astore 45
      // 22b: ldc2_w 510288519500652836
      // 22e: aload 45
      // 230: aload 46
      // 232: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 235: pop
      // 236: goto 23d
      // 239: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: goto 247
      // 240: astore 10
      // 242: aload 10
      // 244: invokevirtual java/lang/Exception.printStackTrace ()V
      // 247: aload 1
      // 248: ifnull 40d
      // 24b: aload 3
      // 24c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 24f: aload 1
      // 250: ifnonnull 40e
      // 253: goto 25a
      // 256: invokestatic com/finalshell/core/TM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 259: athrow
      // 25a: ldc com/finalshell/ui/model/Tf4
      // 25c: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 25f: goto 266
      // 262: invokestatic com/finalshell/core/TM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 265: athrow
      // 266: ifeq 40d
      // 269: aload 3
      // 26a: checkcast com/finalshell/ui/model/Tf4
      // 26d: astore 5
      // 26f: aload 4
      // 271: astore 6
      // 273: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 276: ldc2_w 270389152141252877
      // 279: astore 47
      // 27b: ldc2_w 270389152141252877
      // 27e: aload 47
      // 280: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 283: goto 28a
      // 286: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 289: athrow
      // 28a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 28d: ldc2_w 410905379772103887
      // 290: astore 50
      // 292: astore 49
      // 294: ldc2_w 410905379772103887
      // 297: aload 49
      // 299: aload 50
      // 29b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29e: goto 2a5
      // 2a1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a4: athrow
      // 2a5: aload 5
      // 2a7: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2aa: ldc2_w 179612178163941306
      // 2ad: astore 52
      // 2af: astore 51
      // 2b1: ldc2_w 179612178163941306
      // 2b4: aload 51
      // 2b6: aload 52
      // 2b8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2bb: goto 2c2
      // 2be: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2c1: athrow
      // 2c2: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2c5: ldc2_w 133273064107181210
      // 2c8: astore 54
      // 2ca: astore 53
      // 2cc: ldc2_w 133273064107181210
      // 2cf: aload 53
      // 2d1: aload 54
      // 2d3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d6: checkcast com/finalshell/core/LO3
      // 2d9: goto 2e0
      // 2dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2df: athrow
      // 2e0: astore 7
      // 2e2: aload 7
      // 2e4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2e7: ldc2_w 286931176286176762
      // 2ea: astore 56
      // 2ec: astore 55
      // 2ee: ldc2_w 286931176286176762
      // 2f1: aload 55
      // 2f3: aload 56
      // 2f5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2f8: checkcast java/lang/String
      // 2fb: goto 302
      // 2fe: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 301: athrow
      // 302: astore 8
      // 304: aload 1
      // 305: ifnonnull 401
      // 308: aload 8
      // 30a: aload 6
      // 30c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 30f: ifne 3d0
      // 312: goto 319
      // 315: invokestatic com/finalshell/core/TM.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 318: athrow
      // 319: aload 7
      // 31b: aload 4
      // 31d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 320: ldc2_w 193904661956891993
      // 323: astore 58
      // 325: astore 57
      // 327: ldc2_w 193904661956891993
      // 32a: aload 57
      // 32c: aload 58
      // 32e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 331: pop
      // 332: goto 339
      // 335: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 338: athrow
      // 339: aload 7
      // 33b: invokestatic java/lang/System.currentTimeMillis ()J
      // 33e: invokestatic com/finalshell/reflect/Registry.e (J)[Ljava/lang/Object;
      // 341: ldc2_w 379623615202365815
      // 344: astore 60
      // 346: astore 59
      // 348: ldc2_w 379623615202365815
      // 34b: aload 59
      // 34d: aload 60
      // 34f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 352: pop
      // 353: goto 35a
      // 356: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 359: athrow
      // 35a: aload 7
      // 35c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 35f: ldc2_w 627686680651717230
      // 362: astore 62
      // 364: astore 61
      // 366: ldc2_w 627686680651717230
      // 369: aload 61
      // 36b: aload 62
      // 36d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 370: pop
      // 371: goto 378
      // 374: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 377: athrow
      // 378: goto 382
      // 37b: astore 9
      // 37d: aload 9
      // 37f: invokevirtual java/lang/Exception.printStackTrace ()V
      // 382: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 385: ldc2_w 270389152141252877
      // 388: astore 63
      // 38a: ldc2_w 270389152141252877
      // 38d: aload 63
      // 38f: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 392: goto 399
      // 395: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 398: athrow
      // 399: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 39c: ldc2_w 410905379772103887
      // 39f: astore 66
      // 3a1: astore 65
      // 3a3: ldc2_w 410905379772103887
      // 3a6: aload 65
      // 3a8: aload 66
      // 3aa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3ad: goto 3b4
      // 3b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3b3: athrow
      // 3b4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3b7: ldc2_w 307298854249019333
      // 3ba: astore 68
      // 3bc: astore 67
      // 3be: ldc2_w 307298854249019333
      // 3c1: aload 67
      // 3c3: aload 68
      // 3c5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3c8: pop
      // 3c9: goto 3d0
      // 3cc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3cf: athrow
      // 3d0: aload 0
      // 3d1: ldc2_w 123645524365861271
      // 3d4: astore 69
      // 3d6: ldc2_w 123645524365861271
      // 3d9: aload 69
      // 3db: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3de: aload 2
      // 3df: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 3e2: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 3e5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3e8: ldc2_w 276002133797788160
      // 3eb: astore 72
      // 3ed: astore 71
      // 3ef: ldc2_w 276002133797788160
      // 3f2: aload 71
      // 3f4: aload 72
      // 3f6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3f9: pop
      // 3fa: goto 401
      // 3fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 400: athrow
      // 401: new com/finalshell/task/XL
      // 404: dup
      // 405: aload 0
      // 406: aload 2
      // 407: invokespecial com/finalshell/task/XL.<init> (Lcom/finalshell/core/TM;Ljavax/swing/tree/DefaultMutableTreeNode;)V
      // 40a: invokestatic javax/swing/SwingUtilities.invokeLater (Ljava/lang/Runnable;)V
      // 40d: aload 3
      // 40e: areturn
   }

   @Override
   public Component getTreeCellEditorComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6) {
      Object var7;
      TM var71;
      label136: {
         String var10;
         label137: {
            short var10000 = -12986;
            Object var14 = 123645524365861271L;
            Ref.g(123645524365861271L, var14);
            long var17 = 259710391705259359L;
            Ref.s(259710391705259359L, var2, var17);
            short var10003 = -21603;
            String var10004 = com.finalshell.ui.panel.AA.z();
            Object var18 = 123645524365861271L;
            Object var10006 = Ref.g(123645524365861271L, var18);
            Object var20 = 259710391705259359L;
            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)Ref.g(259710391705259359L, var20);
            var7 = var10006;
            Object var9 = var8.getUserObject();
            var10 = a((int)var10004, (int)this);
            var71 = (TM)(var9.getClass().equals(com.finalshell.ui.model.Ck4.class));
            if (var7 == null) {
               if (var71 == null) {
                  com.finalshell.ui.model.Ck4 var11 = (com.finalshell.ui.model.Ck4)var9;
                  Registry.emptyArgs();
                  long var22 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var22);
                  var10006 = Registry.emptyArgs();
                  long var25 = 410905379772103887L;
                  Object[] var24 = (Object[])var10006;
                  Ref.h(410905379772103887L, var24, var25);
                  Lv4_2 var10008 = (Lv4_2)(Registry.emptyArgs());
                  long var27 = 605430732347023634L;
                  Object var26 = var10008;
                  var10008 = Registry.packArgs(Ref.h(605430732347023634L, var26, var27));
                  long var29 = 489768706953623433L;
                  Object var28 = var10008;
                  var10008 = Ref.h(489768706953623433L, var28, var29);

                  try {
                     var10008 = (Lv4_2)var10008;
                  } catch (InvocationTargetException var67) {
                     throw var67.getTargetException();
                  }

                  Lv4_2 var12 = var10008;
                  if (var7 == null) {
                     if (var12 != null) {
                        String var10009 = (String)(Registry.emptyArgs());
                        long var31 = 286931176286176762L;
                        Object var30 = var10009;
                        var10009 = Ref.h(286931176286176762L, var30, var31);

                        try {
                           var10009 = (String)var10009;
                        } catch (InvocationTargetException var66) {
                           throw var66.getTargetException();
                        }

                        var10 = var10009;
                     }

                     Object var32 = 341837417288837533L;
                     com.finalshell.ui.panel.Wb2 var89 = (com.finalshell.ui.panel.Wb2)Ref.g(341837417288837533L, var32);
                     Object[] var10010 = Registry.packArgs(var11);
                     long var34 = 169066270618240407L;
                     Object var10011 = Ref.h2(169066270618240407L, var34);

                     try {
                        var10011 = (ImageIcon)var10011;
                     } catch (InvocationTargetException var65) {
                        throw var65.getTargetException();
                     }

                     var10010.t(var10011.getImage());
                  }

                  if (var7 == null) {
                     break label137;
                  }
               }

               var71 = (TM)(var9.getClass().equals(Tf4.class));
            }

            if (var7 != null) {
               break label136;
            }

            if (var71 == null) {
               Tf4 var68 = (Tf4)var9;
               File var10005 = Registry.emptyArgs();
               long var37 = 543633160597441792L;
               Object var36 = var10005;
               var10005 = Ref.h(543633160597441792L, var36, var37);

               try {
                  var10005 = (File)var10005;
               } catch (InvocationTargetException var64) {
                  throw var64.getTargetException();
               }

               label142: {
                  String var70;
                  label120: {
                     var70 = var10005.getName();
                     String var74 = var70;
                     if (var7 == null) {
                        if (!var70.equals(a(-12985, 11616))) {
                           break label120;
                        }

                        var74 = var70;
                     }

                     var10 = var74;
                     if (var7 == null) {
                        break label142;
                     }
                  }

                  Registry.emptyArgs();
                  long var38 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var38);
                  Object[] var10007 = Registry.emptyArgs();
                  long var41 = 410905379772103887L;
                  Object[] var40 = var10007;
                  Ref.h(410905379772103887L, var40, var41);
                  Object[] var84 = Registry.packArgs(var70);
                  long var43 = 133273064107181210L;
                  Object[] var42 = var84;
                  Ref.h(133273064107181210L, var42, var43);

                  try {
                     ;
                  } catch (InvocationTargetException var63) {
                     throw var63.getTargetException();
                  }

                  String var90 = (String)(Registry.emptyArgs());
                  long var45 = 286931176286176762L;
                  Object var44 = var90;
                  var90 = Ref.h(286931176286176762L, var44, var45);

                  try {
                     var90 = (String)var90;
                  } catch (InvocationTargetException var62) {
                     throw var62.getTargetException();
                  }

                  var10 = var90;
               }

               Object var46 = 341837417288837533L;
               var10006 = (com.finalshell.ui.panel.Wb2)Ref.g(341837417288837533L, var46);
               Object[] var77 = Registry.packArgs(var68, var4);
               long var48 = 237585746261529104L;
               Object var85 = Ref.h2(237585746261529104L, var48);

               try {
                  var85 = (ImageIcon)var85;
               } catch (InvocationTargetException var61) {
                  throw var61.getTargetException();
               }

               var77.t(var85.getImage());
            }
         }

         var71 = this;
         Object var50 = 205795460956385135L;
         ((Ne4)Ref.g(205795460956385135L, var50)).setText(var10);
         Object var52 = 205795460956385135L;
         Registry.packArgs(this, ((Ne4)Ref.g(205795460956385135L, var52)).getFont());
         long var54 = 408611976812192060L;
         Object var78 = Ref.h2(408611976812192060L, var54);

         try {
            var79 = (Integer)var78;
         } catch (InvocationTargetException var60) {
            throw var60.getTargetException();
         }

         int var80 = var79 + a(15974, 3145035658750436380L);
      }

      TM var69 = var71;
      if (var7 == null) {
         if (var69 < a(22060, 2537572981719092311L)) {
            var69 = (TM)(a(4902, 436208838433868126L));
         }

         Object var56 = 205795460956385135L;
         ((Ne4)Ref.g(205795460956385135L, var56)).M((int)var69);
         SwingUtilities.invokeLater(new com.finalshell.task.NM(this));
      }

      Object var58 = 205795460956385135L;
      return (Ne4)Ref.g(205795460956385135L, var58);
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      String var10000 = com.finalshell.ui.panel.AA.z();
      boolean var3 = false;
      String var2 = var10000;
      EventObject var22 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return true;
         }

         var22 = var1;
      }

      boolean var23 = var22 instanceof MouseEvent;
      if (var2 == null) {
         if (var23) {
            MouseEvent var4 = (MouseEvent)var1;
            Object var7 = 123645524365861271L;
            Ref.g(123645524365861271L, var7);
            Object var9 = 593306439561595691L;
            Ref.g(593306439561595691L, var9);
            Integer var10003 = (Integer)(Registry.packArgs(var4.getPoint()));
            long var12 = 379754982100791858L;
            Object var11 = var10003;
            var10003 = Ref.h(379754982100791858L, var11, var12);

            try {
               var10003 = (Integer)var10003;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            Object var5 = var10003;
            var10003 = (Integer)((Object[])var5);
            if (var2 == null) {
               if (var5 == null) {
                  return false;
               }

               var10003 = var4.getClickCount();
            }

            Object var6;
            label63: {
               label62: {
                  var6 = var10003;
                  TM var27 = (TM)var6;
                  int var10004 = 1;
                  if (var2 == null) {
                     if (var6 != null) {
                        break label62;
                     }

                     var27 = this;
                     Object var13 = 123645524365861271L;
                     var10004 = Registry.lookupField(609521738479829265L).getInt(Ref.g(123645524365861271L, var13));
                     if (var2 != null) {
                        break label63;
                     }

                     byte var10005 = 2;
                  }

                  if (var27 != var10004) {
                     boolean var28 = true;
                     break label63;
                  }
               }

               boolean var29 = false;
            }

            Object var15 = 123645524365861271L;
            Registry.lookupField(609521738479829265L).setInt(Ref.g(123645524365861271L, var15), (int)var6);
            Object var30 = var6;
            byte var31 = 1;
            if (var2 == null) {
               if (var6 != null) {
                  Object var17 = 123645524365861271L;
                  Registry.lookupField(281199022400540961L).setBoolean(Ref.g(123645524365861271L, var17), false);
                  new com.finalshell.task.Ax2(this).start();
               }

               var30 = var6;
               if (var2 != null) {
                  return (boolean)this;
               }

               var31 = 2;
            }

            if (var30 == var31) {
               Object var19 = 123645524365861271L;
               Registry.lookupField(281199022400540961L).setBoolean(Ref.g(123645524365861271L, var19), true);
            }
         }

         var23 = false;
      }

      return var23;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -12986) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 237;
               break;
            case 1:
               var10000 = 78;
               break;
            case 2:
               var10000 = 114;
               break;
            case 3:
               var10000 = 155;
               break;
            case 4:
               var10000 = 153;
               break;
            case 5:
               var10000 = 34;
               break;
            case 6:
               var10000 = 207;
               break;
            case 7:
               var10000 = 195;
               break;
            case 8:
               var10000 = 23;
               break;
            case 9:
               var10000 = 159;
               break;
            case 10:
               var10000 = 168;
               break;
            case 11:
               var10000 = 81;
               break;
            case 12:
               var10000 = 2;
               break;
            case 13:
               var10000 = 63;
               break;
            case 14:
               var10000 = 243;
               break;
            case 15:
               var10000 = 13;
               break;
            case 16:
               var10000 = 247;
               break;
            case 17:
               var10000 = 83;
               break;
            case 18:
               var10000 = 95;
               break;
            case 19:
               var10000 = 45;
               break;
            case 20:
               var10000 = 161;
               break;
            case 21:
               var10000 = 238;
               break;
            case 22:
               var10000 = 181;
               break;
            case 23:
               var10000 = 40;
               break;
            case 24:
               var10000 = 135;
               break;
            case 25:
               var10000 = 104;
               break;
            case 26:
               var10000 = 140;
               break;
            case 27:
               var10000 = 14;
               break;
            case 28:
               var10000 = 219;
               break;
            case 29:
               var10000 = 16;
               break;
            case 30:
               var10000 = 88;
               break;
            case 31:
               var10000 = 204;
               break;
            case 32:
               var10000 = 24;
               break;
            case 33:
               var10000 = 154;
               break;
            case 34:
               var10000 = 120;
               break;
            case 35:
               var10000 = 8;
               break;
            case 36:
               var10000 = 125;
               break;
            case 37:
               var10000 = 38;
               break;
            case 38:
               var10000 = 71;
               break;
            case 39:
               var10000 = 208;
               break;
            case 40:
               var10000 = 31;
               break;
            case 41:
               var10000 = 60;
               break;
            case 42:
               var10000 = 55;
               break;
            case 43:
               var10000 = 109;
               break;
            case 44:
               var10000 = 141;
               break;
            case 45:
               var10000 = 211;
               break;
            case 46:
               var10000 = 218;
               break;
            case 47:
               var10000 = 136;
               break;
            case 48:
               var10000 = 0;
               break;
            case 49:
               var10000 = 143;
               break;
            case 50:
               var10000 = 206;
               break;
            case 51:
               var10000 = 111;
               break;
            case 52:
               var10000 = 110;
               break;
            case 53:
               var10000 = 250;
               break;
            case 54:
               var10000 = 223;
               break;
            case 55:
               var10000 = 21;
               break;
            case 56:
               var10000 = 75;
               break;
            case 57:
               var10000 = 19;
               break;
            case 58:
               var10000 = 47;
               break;
            case 59:
               var10000 = 232;
               break;
            case 60:
               var10000 = 80;
               break;
            case 61:
               var10000 = 156;
               break;
            case 62:
               var10000 = 215;
               break;
            case 63:
               var10000 = 56;
               break;
            case 64:
               var10000 = 167;
               break;
            case 65:
               var10000 = 212;
               break;
            case 66:
               var10000 = 188;
               break;
            case 67:
               var10000 = 182;
               break;
            case 68:
               var10000 = 20;
               break;
            case 69:
               var10000 = 93;
               break;
            case 70:
               var10000 = 194;
               break;
            case 71:
               var10000 = 106;
               break;
            case 72:
               var10000 = 145;
               break;
            case 73:
               var10000 = 134;
               break;
            case 74:
               var10000 = 177;
               break;
            case 75:
               var10000 = 115;
               break;
            case 76:
               var10000 = 175;
               break;
            case 77:
               var10000 = 190;
               break;
            case 78:
               var10000 = 220;
               break;
            case 79:
               var10000 = 96;
               break;
            case 80:
               var10000 = 150;
               break;
            case 81:
               var10000 = 33;
               break;
            case 82:
               var10000 = 18;
               break;
            case 83:
               var10000 = 94;
               break;
            case 84:
               var10000 = 68;
               break;
            case 85:
               var10000 = 230;
               break;
            case 86:
               var10000 = 67;
               break;
            case 87:
               var10000 = 122;
               break;
            case 88:
               var10000 = 43;
               break;
            case 89:
               var10000 = 225;
               break;
            case 90:
               var10000 = 32;
               break;
            case 91:
               var10000 = 149;
               break;
            case 92:
               var10000 = 119;
               break;
            case 93:
               var10000 = 179;
               break;
            case 94:
               var10000 = 79;
               break;
            case 95:
               var10000 = 76;
               break;
            case 96:
               var10000 = 184;
               break;
            case 97:
               var10000 = 165;
               break;
            case 98:
               var10000 = 42;
               break;
            case 99:
               var10000 = 180;
               break;
            case 100:
               var10000 = 70;
               break;
            case 101:
               var10000 = 198;
               break;
            case 102:
               var10000 = 170;
               break;
            case 103:
               var10000 = 52;
               break;
            case 104:
               var10000 = 226;
               break;
            case 105:
               var10000 = 201;
               break;
            case 106:
               var10000 = 192;
               break;
            case 107:
               var10000 = 248;
               break;
            case 108:
               var10000 = 74;
               break;
            case 109:
               var10000 = 246;
               break;
            case 110:
               var10000 = 217;
               break;
            case 111:
               var10000 = 82;
               break;
            case 112:
               var10000 = 85;
               break;
            case 113:
               var10000 = 191;
               break;
            case 114:
               var10000 = 163;
               break;
            case 115:
               var10000 = 64;
               break;
            case 116:
               var10000 = 91;
               break;
            case 117:
               var10000 = 28;
               break;
            case 118:
               var10000 = 172;
               break;
            case 119:
               var10000 = 5;
               break;
            case 120:
               var10000 = 138;
               break;
            case 121:
               var10000 = 84;
               break;
            case 122:
               var10000 = 253;
               break;
            case 123:
               var10000 = 61;
               break;
            case 124:
               var10000 = 124;
               break;
            case 125:
               var10000 = 205;
               break;
            case 126:
               var10000 = 123;
               break;
            case 127:
               var10000 = 133;
               break;
            case 128:
               var10000 = 101;
               break;
            case 129:
               var10000 = 108;
               break;
            case 130:
               var10000 = 185;
               break;
            case 131:
               var10000 = 254;
               break;
            case 132:
               var10000 = 164;
               break;
            case 133:
               var10000 = 26;
               break;
            case 134:
               var10000 = 41;
               break;
            case 135:
               var10000 = 214;
               break;
            case 136:
               var10000 = 228;
               break;
            case 137:
               var10000 = 129;
               break;
            case 138:
               var10000 = 116;
               break;
            case 139:
               var10000 = 196;
               break;
            case 140:
               var10000 = 183;
               break;
            case 141:
               var10000 = 59;
               break;
            case 142:
               var10000 = 46;
               break;
            case 143:
               var10000 = 27;
               break;
            case 144:
               var10000 = 235;
               break;
            case 145:
               var10000 = 239;
               break;
            case 146:
               var10000 = 118;
               break;
            case 147:
               var10000 = 113;
               break;
            case 148:
               var10000 = 132;
               break;
            case 149:
               var10000 = 176;
               break;
            case 150:
               var10000 = 48;
               break;
            case 151:
               var10000 = 169;
               break;
            case 152:
               var10000 = 102;
               break;
            case 153:
               var10000 = 147;
               break;
            case 154:
               var10000 = 35;
               break;
            case 155:
               var10000 = 97;
               break;
            case 156:
               var10000 = 240;
               break;
            case 157:
               var10000 = 245;
               break;
            case 158:
               var10000 = 216;
               break;
            case 159:
               var10000 = 171;
               break;
            case 160:
               var10000 = 54;
               break;
            case 161:
               var10000 = 234;
               break;
            case 162:
               var10000 = 30;
               break;
            case 163:
               var10000 = 148;
               break;
            case 164:
               var10000 = 15;
               break;
            case 165:
               var10000 = 36;
               break;
            case 166:
               var10000 = 152;
               break;
            case 167:
               var10000 = 209;
               break;
            case 168:
               var10000 = 162;
               break;
            case 169:
               var10000 = 11;
               break;
            case 170:
               var10000 = 231;
               break;
            case 171:
               var10000 = 50;
               break;
            case 172:
               var10000 = 6;
               break;
            case 173:
               var10000 = 73;
               break;
            case 174:
               var10000 = 193;
               break;
            case 175:
               var10000 = 66;
               break;
            case 176:
               var10000 = 51;
               break;
            case 177:
               var10000 = 69;
               break;
            case 178:
               var10000 = 3;
               break;
            case 179:
               var10000 = 144;
               break;
            case 180:
               var10000 = 166;
               break;
            case 181:
               var10000 = 77;
               break;
            case 182:
               var10000 = 112;
               break;
            case 183:
               var10000 = 105;
               break;
            case 184:
               var10000 = 72;
               break;
            case 185:
               var10000 = 142;
               break;
            case 186:
               var10000 = 251;
               break;
            case 187:
               var10000 = 128;
               break;
            case 188:
               var10000 = 39;
               break;
            case 189:
               var10000 = 229;
               break;
            case 190:
               var10000 = 200;
               break;
            case 191:
               var10000 = 22;
               break;
            case 192:
               var10000 = 241;
               break;
            case 193:
               var10000 = 233;
               break;
            case 194:
               var10000 = 4;
               break;
            case 195:
               var10000 = 242;
               break;
            case 196:
               var10000 = 90;
               break;
            case 197:
               var10000 = 186;
               break;
            case 198:
               var10000 = 146;
               break;
            case 199:
               var10000 = 130;
               break;
            case 200:
               var10000 = 137;
               break;
            case 201:
               var10000 = 199;
               break;
            case 202:
               var10000 = 7;
               break;
            case 203:
               var10000 = 58;
               break;
            case 204:
               var10000 = 249;
               break;
            case 205:
               var10000 = 174;
               break;
            case 206:
               var10000 = 127;
               break;
            case 207:
               var10000 = 9;
               break;
            case 208:
               var10000 = 197;
               break;
            case 209:
               var10000 = 202;
               break;
            case 210:
               var10000 = 98;
               break;
            case 211:
               var10000 = 25;
               break;
            case 212:
               var10000 = 173;
               break;
            case 213:
               var10000 = 252;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 189;
               break;
            case 216:
               var10000 = 221;
               break;
            case 217:
               var10000 = 87;
               break;
            case 218:
               var10000 = 100;
               break;
            case 219:
               var10000 = 160;
               break;
            case 220:
               var10000 = 86;
               break;
            case 221:
               var10000 = 158;
               break;
            case 222:
               var10000 = 178;
               break;
            case 223:
               var10000 = 1;
               break;
            case 224:
               var10000 = 244;
               break;
            case 225:
               var10000 = 255;
               break;
            case 226:
               var10000 = 92;
               break;
            case 227:
               var10000 = 227;
               break;
            case 228:
               var10000 = 117;
               break;
            case 229:
               var10000 = 89;
               break;
            case 230:
               var10000 = 53;
               break;
            case 231:
               var10000 = 29;
               break;
            case 232:
               var10000 = 49;
               break;
            case 233:
               var10000 = 107;
               break;
            case 234:
               var10000 = 17;
               break;
            case 235:
               var10000 = 57;
               break;
            case 236:
               var10000 = 99;
               break;
            case 237:
               var10000 = 203;
               break;
            case 238:
               var10000 = 139;
               break;
            case 239:
               var10000 = 126;
               break;
            case 240:
               var10000 = 121;
               break;
            case 241:
               var10000 = 187;
               break;
            case 242:
               var10000 = 44;
               break;
            case 243:
               var10000 = 10;
               break;
            case 244:
               var10000 = 62;
               break;
            case 245:
               var10000 = 12;
               break;
            case 246:
               var10000 = 131;
               break;
            case 247:
               var10000 = 224;
               break;
            case 248:
               var10000 = 213;
               break;
            case 249:
               var10000 = 37;
               break;
            case 250:
               var10000 = 65;
               break;
            case 251:
               var10000 = 222;
               break;
            case 252:
               var10000 = 103;
               break;
            case 253:
               var10000 = 157;
               break;
            case 254:
               var10000 = 236;
               break;
            default:
               var10000 = 210;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6778;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[2];
      int var11 = 0;
      String var10 = "å¤T\u0004Íg×\u0004";
      int var12 = "å¤T\u0004Íg×\u0004".length();
      char var9 = 3;
      int var8 = -1;

      while (true) {
         char[] var10002;
         label47: {
            char[] var10003 = var10.substring(++var8, var8 + var9).toCharArray();
            int var10004 = var10003.length;
            int var14 = 0;
            byte var23 = 16;
            var10002 = var10003;
            int var16 = var10004;
            byte var27;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var27 = 16;
               var10006 = var14;
            } else {
               var23 = 16;
               var16 = var10004;
               if (var10004 <= var14) {
                  break label47;
               }

               var10005 = var10003;
               var27 = 16;
               var10006 = var14;
            }

            while (true) {
               char var40 = var10005[var10006];
               byte var41;
               switch (var14 % 7) {
                  case 0:
                     var41 = 24;
                     break;
                  case 1:
                     var41 = 107;
                     break;
                  case 2:
                     var41 = 30;
                     break;
                  case 3:
                     var41 = 123;
                     break;
                  case 4:
                     var41 = 30;
                     break;
                  case 5:
                     var41 = 38;
                     break;
                  default:
                     var41 = 97;
               }

               var10005[var10006] = (char)(var40 ^ var27 ^ var41);
               var14++;
               if (var23 == 0) {
                  var10006 = var23;
                  var10005 = var10002;
                  var27 = var23;
               } else {
                  if (var16 <= var14) {
                     break;
                  }

                  var10005 = var10002;
                  var27 = var23;
                  var10006 = var14;
               }
            }
         }

         String var25 = new String(var10002).intern();
         int var18 = -1;
         var13[var11++] = var25;
         if ((var8 += var9) >= var12) {
            a = var13;
            b = new String[2];
            long var0 = 6575199048586802430L;
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "Â\u001b\u00adX\u001fA\u0010ü/\u009f*Ä\u0004~x%\u001f\u0080\u0093ñ<<=,";
            int var5 = "Â\u001b\u00adX\u001fA\u0010ü/\u009f*Ä\u0004~x%\u001f\u0080\u0093ñ<<=,".length();
            byte var2 = 0;

            do {
               var18 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
               var18 = var3++;
               long var31 = (
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
               byte var26 = -1;
               var6[var18] = var31;
            } while (var2 < var5);

            c = var6;
            d = new Integer[3];
            return;
         }

         var9 = var10.charAt(var8);
      }
   }
   private static int var79;
}





