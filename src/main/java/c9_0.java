/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from c9
 */
public final class c9_0 {
    private static final String[] a;
    private static final String[] b;

    public static Document i() throws gG {
        Document document = null;
        try {
            document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        }
        catch (ParserConfigurationException parserConfigurationException) {
            throw new gG(parserConfigurationException);
        }
        return document;
    }

    public static Document g(File file) throws gG {
        InputStream inputStream = c9_0.o(file);
        return c9_0.L(inputStream);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Document L(InputStream var0) throws gG {
        var2_1 = null;
        var1_2 = D5.K();
        try {
            var3_3 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            var2_1 = var3_3.parse(var0);
        }
        catch (ParserConfigurationException var3_5) {
            try {
                throw new gG(var3_5);
                catch (SAXException var3_6) {
                    throw new gG(c9_0.a(8347, -6024), var3_6);
                }
                catch (IOException var3_7) {
                    throw new gG(c9_0.a(8332, 11937), var3_7);
                }
            }
            catch (Throwable var4_8) {
                try {
                    v0 = var0;
                    if (var1_2 != 0) {
                        if (v0 == null) throw var4_8;
                    }
                    ** GOTO lbl25
                }
                catch (IOException v1) {
                    throw c9_0.a(v1);
                }
                try {
                    v0 = var0;
lbl25:
                    // 2 sources

                    v0.close();
                    throw var4_8;
                }
                catch (IOException var5_9) {
                    // empty catch block
                }
                throw var4_8;
            }
        }
        try {
            v2 = var0;
            if (var1_2 != 0) {
                if (v2 == null) return var2_1;
            }
            ** GOTO lbl40
        }
        catch (IOException v3) {
            throw c9_0.a(v3);
        }
        try {
            v2 = var0;
lbl40:
            // 2 sources

            v2.close();
            return var2_1;
        }
        catch (IOException var3_4) {
            return var2_1;
        }
    }

    public static Element P(String string) throws gG {
        Document document = c9_0.i();
        Element element = document.createElement(string);
        document.appendChild(element);
        return element;
    }

    public static Element Q(InputStream inputStream) throws gG {
        return c9_0.L(inputStream).getDocumentElement();
    }

    public static Element M(File file) throws gG {
        return c9_0.g(file).getDocumentElement();
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Element A(String string) throws gG {
        String string2;
        block9: {
            int n10 = D5.e();
            string2 = string;
            if (n10 != 0) break block9;
            try {
                block10: {
                    if (string2 == null) throw new gG(c9_0.a(8324, 18662));
                    break block10;
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        throw c9_0.a(unsupportedEncodingException);
                    }
                }
                string2 = string.trim();
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw c9_0.a(unsupportedEncodingException);
            }
        }
        try {
            if (string2.length() < 1) {
                throw new gG(c9_0.a(8324, 18662));
            }
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw c9_0.a(unsupportedEncodingException);
        }
        byte[] byArray = null;
        try {
            byArray = string.getBytes(c9_0.a(8325, -23994));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new gG(c9_0.a(8327, 838), unsupportedEncodingException);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return c9_0.L(byteArrayInputStream).getDocumentElement();
    }

    public static List c(Element element, String string) {
        NodeList nodeList = element.getElementsByTagName(string);
        int n10 = D5.e();
        ArrayList<Element> arrayList = new ArrayList<Element>();
        int n11 = 0;
        while (n11 < nodeList.getLength()) {
            block5: {
                block6: {
                    Node node = nodeList.item(n11);
                    try {
                        try {
                            if (n10 != 0) break block5;
                            if (!(node instanceof Element)) break block6;
                        }
                        catch (gG gG2) {
                            throw c9_0.a(gG2);
                        }
                        arrayList.add((Element)node);
                    }
                    catch (gG gG3) {
                        throw c9_0.a(gG3);
                    }
                }
                ++n11;
            }
            if (n10 == 0) continue;
        }
        return arrayList;
    }

    public static Element c(Element element, String string) {
        List list;
        block4: {
            List list2;
            block5: {
                list2 = c9_0.c(element, string);
                int n10 = D5.K();
                try {
                    try {
                        list = list2;
                        if (n10 == 0) break block4;
                        if (!list.isEmpty()) break block5;
                    }
                    catch (gG gG2) {
                        throw c9_0.a(gG2);
                    }
                    return null;
                }
                catch (gG gG3) {
                    throw c9_0.a(gG3);
                }
            }
            list = list2.get(0);
        }
        return (Element)((Object)list);
    }

    public static List k(Element element, String string) {
        NodeList nodeList = element.getElementsByTagName(string);
        int n10 = D5.e();
        ArrayList<Element> arrayList = new ArrayList<Element>();
        int n11 = 0;
        while (n11 < nodeList.getLength()) {
            block7: {
                block8: {
                    Node node = nodeList.item(n11);
                    try {
                        try {
                            try {
                                if (n10 != 0) break block7;
                                if (!(node instanceof Element)) break block8;
                            }
                            catch (gG gG2) {
                                throw c9_0.a(gG2);
                            }
                            if (node.getParentNode() != element) break block8;
                        }
                        catch (gG gG3) {
                            throw c9_0.a(gG3);
                        }
                        arrayList.add((Element)node);
                    }
                    catch (gG gG4) {
                        throw c9_0.a(gG4);
                    }
                }
                ++n11;
            }
            if (n10 == 0) continue;
        }
        return arrayList;
    }

    public static Element k(Element element, String string) {
        List list;
        block4: {
            List list2;
            block5: {
                list2 = c9_0.k(element, string);
                int n10 = D5.e();
                try {
                    try {
                        list = list2;
                        if (n10 != 0) break block4;
                        if (!list.isEmpty()) break block5;
                    }
                    catch (gG gG2) {
                        throw c9_0.a(gG2);
                    }
                    return null;
                }
                catch (gG gG3) {
                    throw c9_0.a(gG3);
                }
            }
            list = list2.get(0);
        }
        return (Element)((Object)list);
    }

    public static String x(Element element, String string) {
        String string2;
        block3: {
            Element element2;
            block2: {
                string2 = null;
                Element element3 = c9_0.c(element, string);
                int n10 = D5.K();
                try {
                    element2 = element3;
                    if (n10 == 0) break block2;
                    if (element2 == null) break block3;
                }
                catch (gG gG2) {
                    throw c9_0.a(gG2);
                }
                element2 = element3;
            }
            string2 = element2.getTextContent();
        }
        return string2;
    }

    public static Element U(Element element, String string) {
        Element element2 = element.getOwnerDocument().createElement(string);
        element.appendChild(element2);
        return element2;
    }

    public static Element c(Element element, String string, String string2) {
        Element element2 = c9_0.U(element, string);
        element2.setTextContent(string2);
        return element2;
    }

    public static void a(Element element, Element element2) {
        Node node = element.getOwnerDocument().importNode(element2, true);
        element.appendChild(node);
    }

    public static Element e(Element element, String string, String string2) {
        Element element2;
        block3: {
            String string3;
            block2: {
                element2 = c9_0.U(element, string);
                int n10 = D5.e();
                try {
                    string3 = string2;
                    if (n10 != 0) break block2;
                    if (string3 != null) break block3;
                }
                catch (gG gG2) {
                    throw c9_0.a(gG2);
                }
                string3 = "";
            }
            string2 = string3;
        }
        CDATASection cDATASection = element2.getOwnerDocument().createCDATASection(string2);
        element2.appendChild(cDATASection);
        return element2;
    }

    public static String q(Node node) throws gG {
        String string = null;
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Properties properties = transformer.getOutputProperties();
            properties.setProperty(c9_0.a(8328, 5993), c9_0.a(8333, 5846));
            transformer.setOutputProperties(properties);
            StringWriter stringWriter = new StringWriter();
            transformer.transform(new DOMSource(node), new StreamResult(stringWriter));
            string = stringWriter.toString();
            string = string.replaceAll(c9_0.a(8348, 23672), " ");
        }
        catch (TransformerException transformerException) {
            throw new gG(c9_0.a(8336, -28721), transformerException);
        }
        return string;
    }

    public static String x(Node node) throws gG {
        String string;
        String string2 = null;
        int n10 = D5.e();
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Properties properties = transformer.getOutputProperties();
            properties.setProperty(c9_0.a(8351, -5323), c9_0.a(8331, 11872));
            properties.setProperty(c9_0.a(8322, -26452), c9_0.a(8320, 21596));
            transformer.setOutputProperties(properties);
            StringWriter stringWriter = new StringWriter();
            transformer.transform(new DOMSource(node), new StreamResult(stringWriter));
            string2 = stringWriter.toString();
            string2 = string2.replaceAll(c9_0.a(8349, 4449), " ");
        }
        catch (TransformerException transformerException) {
            throw new gG(c9_0.a(8321, 11031), transformerException);
        }
        try {
            string = string2;
            if (ky_2.F() != null) {
                D5.i(++n10);
            }
        }
        catch (TransformerException transformerException) {
            throw c9_0.a(transformerException);
        }
        return string;
    }

    public static String d(File file) throws gG {
        Element element = c9_0.M(file);
        return c9_0.x(element);
    }

    public static String Q(InputStream inputStream) throws gG {
        Element element = c9_0.Q(inputStream);
        return c9_0.x(element);
    }

    /*
     * Unable to fully structure code
     */
    public static void y(Node var0, File var1_1) throws gG {
        block14: {
            var3_2 = null;
            var2_3 = D5.K();
            var4_4 = TransformerFactory.newInstance().newTransformer();
            var5_7 = var4_4.getOutputProperties();
            var5_7.setProperty(c9_0.a(8329, -29258), c9_0.a(8341, 997));
            var5_7.setProperty(c9_0.a(8326, 8437), c9_0.a(8331, 11872));
            var4_4.setOutputProperties(var5_7);
            var6_8 = new DOMSource(var0);
            var3_2 = c9_0.f(var1_1);
            var7_9 = new StreamResult(var3_2);
            var4_4.transform(var6_8, var7_9);
            v0 = var3_2;
            if (var2_3 == 0) ** GOTO lbl20
            if (v0 == null) break block14;
            try {
                v0 = var3_2;
lbl20:
                // 2 sources

                v0.close();
            }
            catch (IOException var4_5) {}
            break block14;
            catch (TransformerException var4_6) {
                try {
                    throw new gG(c9_0.a(8321, 11031), var4_6);
                }
                catch (Throwable var8_10) {
                    block13: {
                        try {
                            v1 = var3_2;
                            if (var2_3 != 0) {
                                if (v1 == null) break block13;
                            }
                            ** GOTO lbl39
                        }
                        catch (IOException v2) {
                            throw c9_0.a(v2);
                        }
                        try {
                            v1 = var3_2;
lbl39:
                            // 2 sources

                            v1.close();
                        }
                        catch (IOException var9_11) {
                            // empty catch block
                        }
                    }
                    throw var8_10;
                }
            }
        }
    }

    public static void O(Node node, File file) throws gG {
        c9_0.k(node, c9_0.o(file));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void k(Node var0, InputStream var1_1) throws gG {
        var2_2 = D5.e();
        try {
            var3_3 = new StreamSource(var1_1);
            var4_7 = SchemaFactory.newInstance(c9_0.a(8334, -11022)).newSchema(var3_3);
            var5_8 = var4_7.newValidator();
            var5_8.validate(new DOMSource(var0));
            v0 = var1_1;
            if (var2_2 == 0) {
            }
            ** GOTO lbl35
        }
        catch (SAXException var3_5) {
            try {
                throw new gG(c9_0.a(8337, 9179), var3_5);
                catch (IOException var3_6) {
                    throw new gG(c9_0.a(8344, 8492), var3_6);
                }
            }
            catch (Throwable var6_9) {
                try {
                    v1 = var1_1;
                    if (var2_2 == 0) {
                        if (v1 == null) throw var6_9;
                    }
                    ** GOTO lbl27
                }
                catch (IOException v2) {
                    throw c9_0.a(v2);
                }
                try {
                    v1 = var1_1;
lbl27:
                    // 2 sources

                    v1.close();
                    throw var6_9;
                }
                catch (IOException var7_10) {
                    // empty catch block
                }
                throw var6_9;
            }
        }
        if (v0 == null) return;
        try {
            v0 = var1_1;
lbl35:
            // 2 sources

            v0.close();
            return;
        }
        catch (IOException var3_4) {
            return;
        }
    }

    public static String o(String string, File file) throws gG {
        String string2;
        String string3 = null;
        int n10 = D5.e();
        try {
            StreamSource streamSource = new StreamSource(file);
            Transformer transformer = TransformerFactory.newInstance().newTransformer(streamSource);
            Properties properties = transformer.getOutputProperties();
            properties.setProperty(c9_0.a(8338, -8996), c9_0.a(8331, 11872));
            transformer.setOutputProperties(properties);
            StreamSource streamSource2 = new StreamSource(new StringReader(string));
            StreamResult streamResult = new StreamResult(new StringWriter());
            transformer.transform(streamSource2, streamResult);
            string3 = streamResult.getWriter().toString();
        }
        catch (TransformerException transformerException) {
            throw new gG(c9_0.a(8321, 11031), transformerException);
        }
        try {
            string2 = string3;
            if (n10 != 0) {
                ky_2.K(new String[3]);
            }
        }
        catch (TransformerException transformerException) {
            throw c9_0.a(transformerException);
        }
        return string2;
    }

    public static void W(Element element, String string, String string2) {
        element.setAttributeNS(c9_0.a(8323, 3651), c9_0.a(8340, 13661), string);
        element.setAttributeNS(c9_0.a(8350, 6680), c9_0.a(8345, -20930), c9_0.a(8335, 16273));
        element.setAttributeNS(c9_0.a(8346, 25570), c9_0.a(8339, -21529), string2);
    }

    public static String J(String string) throws gG {
        Element element = c9_0.P(c9_0.a(8343, -23877));
        element.setTextContent(string);
        return c9_0.q(element.getFirstChild());
    }

    private static InputStream o(File file) throws gG {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new gG(c9_0.a(8330, 8579), fileNotFoundException);
        }
        return fileInputStream;
    }

    private static OutputStream f(File file) throws gG {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new gG(c9_0.a(8342, -1485), fileNotFoundException);
        }
        return fileOutputStream;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var5 = new String[32];
                var3_1 = 0;
                var2_2 = "\u00f4\u0002@z\u0018h\u009f~\u00fa\u0087\u0012\u00c8\u00b8\u0096\u0003S_\u008a h:\u00d9\u0019x\u00db\u009c\u0018D(\u00ebh\f{e\u009c\u008cT\u00ab\u00d9\u00f0\u00e2m\u00d6\u00feF\u00c1\u00af\u00b7\u00f5;\u00c2)\u00f4\nJ\u001f\n\u001b\u00d2\u0000\u008d+\u00d2\b+w\u0081\u001d\u0010d8\u00df\u0082\"#\u00ce7E\u00f8\u00cf\u0090\u00f9\u00dfC\u0095\u00e5\u0095U\u000f\u0013\u00a1\u00cf[\u0014\u00e5a\u0092L\u00b8\u00a23\u0091\u00e1r\u0005F\u00acg\u00d8\u00aa\u0096\u00a5\u00c47\u0006~\u00c9\u00beL\u00c1!\u0012\u009b\u00b8\u00ad-\u00b1\u008e1.\u0083\u00a7 \u00a0\u0001Iz\u009cf\u00f8\u0003\u00b8\u0086\u00f7\u0011\u00bd\u001ei\u00f9?\u001c!|w\u00ca\u00dc\u00b9\u00bfp\u0090\u00d0\u00d0\u0005\u00b0Mj\u008ex\u0006\u00f7\u008d\u001b\u00a3f`\u0014\u0010\u0016\u00dc\u00f8\u009c3\u00f8t\u001e\u00a0\u0091\u00b4\u0016\u00b5\u0099\u00ee4\u00dd!\u0097\u0005=t\u00db\u00a9N\u0013p\t\u00d0\u001b\fS\u00db\u00e6/\u00dcC\u00c0.\u00cb\u00be\u008a\u00a9\u00d6\u00f8\b\u00c7\u0088\u0097\t\u001ac\u0004\u0091\u001dj\u00d3\u0099$p|\u009d\u00ecd\u00b6\u00ef\u00bb\u008c\u0001u\u00d3\u008e\u00bd\u00eb\u00e4\u00f8Dl\u0003\u00fe\u00f8\u00d8LI\u0006\u00bb\n\f\u00b6\u00fe\u00ac\u0006\u009a?(\u0010zx\u001d\u00db\u0095\u00af\u00ec\u00b6eE\u00cf\u007f\u00d2\u008c7\u00e0\u0090\u00f8\u00e1?\u00fb\u00dd,>]\u00b4 \u00e5\u009c\u00bb\u00c0%\u0006\u00d6w?\u00fc\u00e2\u008b\u000e\u0000~\u00de\u00f5\u00cb\u0099\u00e5@\u00b5@\u00fb0\u0085\u0089\t`U\u00d2\u00d0K*\u00cd\u0095\u00cd)\u00ce\u0001\r~\u00e27\u00cf\u0085.\u009b\u00a6\u001e\u00a5\u00b5PE*o\u007f\u00bej\u000e>K\u0094\u00f5\u008c\u00d9\u001e;\u000e\u001b\u00af\u00ee\u00d24\u00e7?\u00bcJ\u00f8\u000f;\u00ee\u00b9\u00e7%\u00dfi\u001b\u001e\u0095\u00bb\u00a8e\u0087<\u0005|\u00d1Q@;\u0003\u00bf\u00d4)\u0012\u00f2~\u0080\u00f5\u0014\u0095\u0085M\u0015\u00cb\u00f2-[\u00f81\u00aa\u000f>\u0003\u009a\u00c6\u008d\u0013\u00e8m\u00c3\u0097n\u00c2\u0097\u00d4\u00a6\u009ar\b\b\u00d2z\u00a91\u00b2\u00eb\u0012\u00ab6\u00ab\u00fca\u00bc9m\u00c8MQ\u0002W-\u00adt#\u0014";
                var4_3 = "\u00f4\u0002@z\u0018h\u009f~\u00fa\u0087\u0012\u00c8\u00b8\u0096\u0003S_\u008a h:\u00d9\u0019x\u00db\u009c\u0018D(\u00ebh\f{e\u009c\u008cT\u00ab\u00d9\u00f0\u00e2m\u00d6\u00feF\u00c1\u00af\u00b7\u00f5;\u00c2)\u00f4\nJ\u001f\n\u001b\u00d2\u0000\u008d+\u00d2\b+w\u0081\u001d\u0010d8\u00df\u0082\"#\u00ce7E\u00f8\u00cf\u0090\u00f9\u00dfC\u0095\u00e5\u0095U\u000f\u0013\u00a1\u00cf[\u0014\u00e5a\u0092L\u00b8\u00a23\u0091\u00e1r\u0005F\u00acg\u00d8\u00aa\u0096\u00a5\u00c47\u0006~\u00c9\u00beL\u00c1!\u0012\u009b\u00b8\u00ad-\u00b1\u008e1.\u0083\u00a7 \u00a0\u0001Iz\u009cf\u00f8\u0003\u00b8\u0086\u00f7\u0011\u00bd\u001ei\u00f9?\u001c!|w\u00ca\u00dc\u00b9\u00bfp\u0090\u00d0\u00d0\u0005\u00b0Mj\u008ex\u0006\u00f7\u008d\u001b\u00a3f`\u0014\u0010\u0016\u00dc\u00f8\u009c3\u00f8t\u001e\u00a0\u0091\u00b4\u0016\u00b5\u0099\u00ee4\u00dd!\u0097\u0005=t\u00db\u00a9N\u0013p\t\u00d0\u001b\fS\u00db\u00e6/\u00dcC\u00c0.\u00cb\u00be\u008a\u00a9\u00d6\u00f8\b\u00c7\u0088\u0097\t\u001ac\u0004\u0091\u001dj\u00d3\u0099$p|\u009d\u00ecd\u00b6\u00ef\u00bb\u008c\u0001u\u00d3\u008e\u00bd\u00eb\u00e4\u00f8Dl\u0003\u00fe\u00f8\u00d8LI\u0006\u00bb\n\f\u00b6\u00fe\u00ac\u0006\u009a?(\u0010zx\u001d\u00db\u0095\u00af\u00ec\u00b6eE\u00cf\u007f\u00d2\u008c7\u00e0\u0090\u00f8\u00e1?\u00fb\u00dd,>]\u00b4 \u00e5\u009c\u00bb\u00c0%\u0006\u00d6w?\u00fc\u00e2\u008b\u000e\u0000~\u00de\u00f5\u00cb\u0099\u00e5@\u00b5@\u00fb0\u0085\u0089\t`U\u00d2\u00d0K*\u00cd\u0095\u00cd)\u00ce\u0001\r~\u00e27\u00cf\u0085.\u009b\u00a6\u001e\u00a5\u00b5PE*o\u007f\u00bej\u000e>K\u0094\u00f5\u008c\u00d9\u001e;\u000e\u001b\u00af\u00ee\u00d24\u00e7?\u00bcJ\u00f8\u000f;\u00ee\u00b9\u00e7%\u00dfi\u001b\u001e\u0095\u00bb\u00a8e\u0087<\u0005|\u00d1Q@;\u0003\u00bf\u00d4)\u0012\u00f2~\u0080\u00f5\u0014\u0095\u0085M\u0015\u00cb\u00f2-[\u00f81\u00aa\u000f>\u0003\u009a\u00c6\u008d\u0013\u00e8m\u00c3\u0097n\u00c2\u0097\u00d4\u00a6\u009ar\b\b\u00d2z\u00a91\u00b2\u00eb\u0012\u00ab6\u00ab\u00fca\u00bc9m\u00c8MQ\u0002W-\u00adt#\u0014".length();
                var1_4 = 14;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 20;
                    v1 = ++var0_5;
                    v2 = var2_2.substring(v1, v1 + var1_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "p\"\u00b0\u00b4l-9\u00f00\u00ce\u00afAi\u0017\u00f04\u0003\u00e6\u00e6\u00cf\u00120\u00afM\u0096\u008d\u00f5\u0095\u009a@\u00ae\u00c0\u00e4\u0087.\u00c5\u001bx\r";
                    var4_3 = "p\"\u00b0\u00b4l-9\u00f00\u00ce\u00afAi\u0017\u00f04\u0003\u00e6\u00e6\u00cf\u00120\u00afM\u0096\u008d\u00f5\u0095\u009a@\u00ae\u00c0\u00e4\u0087.\u00c5\u001bx\r".length();
                    var1_4 = 20;
                    var0_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 107;
                        v5 = ++var0_5;
                        v2 = var2_2.substring(v5, v5 + var1_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v4.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 11;
                            break;
                        }
                        case 1: {
                            v15 = 91;
                            break;
                        }
                        case 2: {
                            v15 = 50;
                            break;
                        }
                        case 3: {
                            v15 = 41;
                            break;
                        }
                        case 4: {
                            v15 = 83;
                            break;
                        }
                        case 5: {
                            v15 = 26;
                            break;
                        }
                        default: {
                            v15 = 61;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        c9_0.a = var5;
        c9_0.b = new String[32];
    }

    private static String a(int n10, int n11) {
        int n12 = (n10 ^ 0x208C) & 0xFFFF;
        if (b[n12] == null) {
            int n13;
            int n14;
            char[] cArray = a[n12].toCharArray();
            switch (cArray[0] & 0xFF) {
                case 0: {
                    n14 = 193;
                    break;
                }
                case 1: {
                    n14 = 92;
                    break;
                }
                case 2: {
                    n14 = 133;
                    break;
                }
                case 3: {
                    n14 = 32;
                    break;
                }
                case 4: {
                    n14 = 143;
                    break;
                }
                case 5: {
                    n14 = 125;
                    break;
                }
                case 6: {
                    n14 = 113;
                    break;
                }
                case 7: {
                    n14 = 91;
                    break;
                }
                case 8: {
                    n14 = 104;
                    break;
                }
                case 9: {
                    n14 = 59;
                    break;
                }
                case 10: {
                    n14 = 67;
                    break;
                }
                case 11: {
                    n14 = 150;
                    break;
                }
                case 12: {
                    n14 = 121;
                    break;
                }
                case 13: {
                    n14 = 22;
                    break;
                }
                case 14: {
                    n14 = 189;
                    break;
                }
                case 15: {
                    n14 = 207;
                    break;
                }
                case 16: {
                    n14 = 93;
                    break;
                }
                case 17: {
                    n14 = 140;
                    break;
                }
                case 18: {
                    n14 = 80;
                    break;
                }
                case 19: {
                    n14 = 147;
                    break;
                }
                case 20: {
                    n14 = 162;
                    break;
                }
                case 21: {
                    n14 = 243;
                    break;
                }
                case 22: {
                    n14 = 25;
                    break;
                }
                case 23: {
                    n14 = 79;
                    break;
                }
                case 24: {
                    n14 = 255;
                    break;
                }
                case 25: {
                    n14 = 221;
                    break;
                }
                case 26: {
                    n14 = 61;
                    break;
                }
                case 27: {
                    n14 = 34;
                    break;
                }
                case 28: {
                    n14 = 230;
                    break;
                }
                case 29: {
                    n14 = 56;
                    break;
                }
                case 30: {
                    n14 = 205;
                    break;
                }
                case 31: {
                    n14 = 197;
                    break;
                }
                case 32: {
                    n14 = 196;
                    break;
                }
                case 33: {
                    n14 = 141;
                    break;
                }
                case 34: {
                    n14 = 229;
                    break;
                }
                case 35: {
                    n14 = 241;
                    break;
                }
                case 36: {
                    n14 = 28;
                    break;
                }
                case 37: {
                    n14 = 16;
                    break;
                }
                case 38: {
                    n14 = 90;
                    break;
                }
                case 39: {
                    n14 = 202;
                    break;
                }
                case 40: {
                    n14 = 2;
                    break;
                }
                case 41: {
                    n14 = 142;
                    break;
                }
                case 42: {
                    n14 = 225;
                    break;
                }
                case 43: {
                    n14 = 210;
                    break;
                }
                case 44: {
                    n14 = 45;
                    break;
                }
                case 45: {
                    n14 = 57;
                    break;
                }
                case 46: {
                    n14 = 195;
                    break;
                }
                case 47: {
                    n14 = 112;
                    break;
                }
                case 48: {
                    n14 = 95;
                    break;
                }
                case 49: {
                    n14 = 6;
                    break;
                }
                case 50: {
                    n14 = 97;
                    break;
                }
                case 51: {
                    n14 = 129;
                    break;
                }
                case 52: {
                    n14 = 103;
                    break;
                }
                case 53: {
                    n14 = 204;
                    break;
                }
                case 54: {
                    n14 = 199;
                    break;
                }
                case 55: {
                    n14 = 216;
                    break;
                }
                case 56: {
                    n14 = 27;
                    break;
                }
                case 57: {
                    n14 = 214;
                    break;
                }
                case 58: {
                    n14 = 175;
                    break;
                }
                case 59: {
                    n14 = 46;
                    break;
                }
                case 60: {
                    n14 = 37;
                    break;
                }
                case 61: {
                    n14 = 166;
                    break;
                }
                case 62: {
                    n14 = 236;
                    break;
                }
                case 63: {
                    n14 = 94;
                    break;
                }
                case 64: {
                    n14 = 128;
                    break;
                }
                case 65: {
                    n14 = 23;
                    break;
                }
                case 66: {
                    n14 = 251;
                    break;
                }
                case 67: {
                    n14 = 47;
                    break;
                }
                case 68: {
                    n14 = 102;
                    break;
                }
                case 69: {
                    n14 = 58;
                    break;
                }
                case 70: {
                    n14 = 187;
                    break;
                }
                case 71: {
                    n14 = 171;
                    break;
                }
                case 72: {
                    n14 = 62;
                    break;
                }
                case 73: {
                    n14 = 163;
                    break;
                }
                case 74: {
                    n14 = 109;
                    break;
                }
                case 75: {
                    n14 = 10;
                    break;
                }
                case 76: {
                    n14 = 161;
                    break;
                }
                case 77: {
                    n14 = 198;
                    break;
                }
                case 78: {
                    n14 = 39;
                    break;
                }
                case 79: {
                    n14 = 244;
                    break;
                }
                case 80: {
                    n14 = 191;
                    break;
                }
                case 81: {
                    n14 = 250;
                    break;
                }
                case 82: {
                    n14 = 254;
                    break;
                }
                case 83: {
                    n14 = 249;
                    break;
                }
                case 84: {
                    n14 = 118;
                    break;
                }
                case 85: {
                    n14 = 222;
                    break;
                }
                case 86: {
                    n14 = 110;
                    break;
                }
                case 87: {
                    n14 = 70;
                    break;
                }
                case 88: {
                    n14 = 172;
                    break;
                }
                case 89: {
                    n14 = 156;
                    break;
                }
                case 90: {
                    n14 = 228;
                    break;
                }
                case 91: {
                    n14 = 164;
                    break;
                }
                case 92: {
                    n14 = 203;
                    break;
                }
                case 93: {
                    n14 = 153;
                    break;
                }
                case 94: {
                    n14 = 9;
                    break;
                }
                case 95: {
                    n14 = 138;
                    break;
                }
                case 96: {
                    n14 = 176;
                    break;
                }
                case 97: {
                    n14 = 170;
                    break;
                }
                case 98: {
                    n14 = 148;
                    break;
                }
                case 99: {
                    n14 = 66;
                    break;
                }
                case 100: {
                    n14 = 152;
                    break;
                }
                case 101: {
                    n14 = 98;
                    break;
                }
                case 102: {
                    n14 = 29;
                    break;
                }
                case 103: {
                    n14 = 145;
                    break;
                }
                case 104: {
                    n14 = 146;
                    break;
                }
                case 105: {
                    n14 = 160;
                    break;
                }
                case 106: {
                    n14 = 213;
                    break;
                }
                case 107: {
                    n14 = 242;
                    break;
                }
                case 108: {
                    n14 = 123;
                    break;
                }
                case 109: {
                    n14 = 169;
                    break;
                }
                case 110: {
                    n14 = 227;
                    break;
                }
                case 111: {
                    n14 = 0;
                    break;
                }
                case 112: {
                    n14 = 107;
                    break;
                }
                case 113: {
                    n14 = 74;
                    break;
                }
                case 114: {
                    n14 = 155;
                    break;
                }
                case 115: {
                    n14 = 201;
                    break;
                }
                case 116: {
                    n14 = 173;
                    break;
                }
                case 117: {
                    n14 = 38;
                    break;
                }
                case 118: {
                    n14 = 87;
                    break;
                }
                case 119: {
                    n14 = 211;
                    break;
                }
                case 120: {
                    n14 = 238;
                    break;
                }
                case 121: {
                    n14 = 233;
                    break;
                }
                case 122: {
                    n14 = 33;
                    break;
                }
                case 123: {
                    n14 = 115;
                    break;
                }
                case 124: {
                    n14 = 177;
                    break;
                }
                case 125: {
                    n14 = 247;
                    break;
                }
                case 126: {
                    n14 = 181;
                    break;
                }
                case 127: {
                    n14 = 55;
                    break;
                }
                case 128: {
                    n14 = 179;
                    break;
                }
                case 129: {
                    n14 = 209;
                    break;
                }
                case 130: {
                    n14 = 35;
                    break;
                }
                case 131: {
                    n14 = 119;
                    break;
                }
                case 132: {
                    n14 = 135;
                    break;
                }
                case 133: {
                    n14 = 190;
                    break;
                }
                case 134: {
                    n14 = 1;
                    break;
                }
                case 135: {
                    n14 = 52;
                    break;
                }
                case 136: {
                    n14 = 73;
                    break;
                }
                case 137: {
                    n14 = 50;
                    break;
                }
                case 138: {
                    n14 = 53;
                    break;
                }
                case 139: {
                    n14 = 106;
                    break;
                }
                case 140: {
                    n14 = 60;
                    break;
                }
                case 141: {
                    n14 = 96;
                    break;
                }
                case 142: {
                    n14 = 219;
                    break;
                }
                case 143: {
                    n14 = 174;
                    break;
                }
                case 144: {
                    n14 = 131;
                    break;
                }
                case 145: {
                    n14 = 17;
                    break;
                }
                case 146: {
                    n14 = 188;
                    break;
                }
                case 147: {
                    n14 = 19;
                    break;
                }
                case 148: {
                    n14 = 86;
                    break;
                }
                case 149: {
                    n14 = 8;
                    break;
                }
                case 150: {
                    n14 = 81;
                    break;
                }
                case 151: {
                    n14 = 252;
                    break;
                }
                case 152: {
                    n14 = 232;
                    break;
                }
                case 153: {
                    n14 = 224;
                    break;
                }
                case 154: {
                    n14 = 89;
                    break;
                }
                case 155: {
                    n14 = 40;
                    break;
                }
                case 156: {
                    n14 = 159;
                    break;
                }
                case 157: {
                    n14 = 44;
                    break;
                }
                case 158: {
                    n14 = 75;
                    break;
                }
                case 159: {
                    n14 = 186;
                    break;
                }
                case 160: {
                    n14 = 13;
                    break;
                }
                case 161: {
                    n14 = 183;
                    break;
                }
                case 162: {
                    n14 = 12;
                    break;
                }
                case 163: {
                    n14 = 30;
                    break;
                }
                case 164: {
                    n14 = 246;
                    break;
                }
                case 165: {
                    n14 = 49;
                    break;
                }
                case 166: {
                    n14 = 65;
                    break;
                }
                case 167: {
                    n14 = 130;
                    break;
                }
                case 168: {
                    n14 = 111;
                    break;
                }
                case 169: {
                    n14 = 26;
                    break;
                }
                case 170: {
                    n14 = 83;
                    break;
                }
                case 171: {
                    n14 = 194;
                    break;
                }
                case 172: {
                    n14 = 18;
                    break;
                }
                case 173: {
                    n14 = 88;
                    break;
                }
                case 174: {
                    n14 = 215;
                    break;
                }
                case 175: {
                    n14 = 76;
                    break;
                }
                case 176: {
                    n14 = 127;
                    break;
                }
                case 177: {
                    n14 = 132;
                    break;
                }
                case 178: {
                    n14 = 184;
                    break;
                }
                case 179: {
                    n14 = 82;
                    break;
                }
                case 180: {
                    n14 = 15;
                    break;
                }
                case 181: {
                    n14 = 36;
                    break;
                }
                case 182: {
                    n14 = 124;
                    break;
                }
                case 183: {
                    n14 = 11;
                    break;
                }
                case 184: {
                    n14 = 245;
                    break;
                }
                case 185: {
                    n14 = 248;
                    break;
                }
                case 186: {
                    n14 = 217;
                    break;
                }
                case 187: {
                    n14 = 122;
                    break;
                }
                case 188: {
                    n14 = 42;
                    break;
                }
                case 189: {
                    n14 = 208;
                    break;
                }
                case 190: {
                    n14 = 185;
                    break;
                }
                case 191: {
                    n14 = 154;
                    break;
                }
                case 192: {
                    n14 = 105;
                    break;
                }
                case 193: {
                    n14 = 235;
                    break;
                }
                case 194: {
                    n14 = 168;
                    break;
                }
                case 195: {
                    n14 = 68;
                    break;
                }
                case 196: {
                    n14 = 108;
                    break;
                }
                case 197: {
                    n14 = 78;
                    break;
                }
                case 198: {
                    n14 = 120;
                    break;
                }
                case 199: {
                    n14 = 21;
                    break;
                }
                case 200: {
                    n14 = 5;
                    break;
                }
                case 201: {
                    n14 = 149;
                    break;
                }
                case 202: {
                    n14 = 137;
                    break;
                }
                case 203: {
                    n14 = 180;
                    break;
                }
                case 204: {
                    n14 = 234;
                    break;
                }
                case 205: {
                    n14 = 54;
                    break;
                }
                case 206: {
                    n14 = 192;
                    break;
                }
                case 207: {
                    n14 = 85;
                    break;
                }
                case 208: {
                    n14 = 63;
                    break;
                }
                case 209: {
                    n14 = 41;
                    break;
                }
                case 210: {
                    n14 = 51;
                    break;
                }
                case 211: {
                    n14 = 226;
                    break;
                }
                case 212: {
                    n14 = 7;
                    break;
                }
                case 213: {
                    n14 = 114;
                    break;
                }
                case 214: {
                    n14 = 4;
                    break;
                }
                case 215: {
                    n14 = 167;
                    break;
                }
                case 216: {
                    n14 = 239;
                    break;
                }
                case 217: {
                    n14 = 136;
                    break;
                }
                case 218: {
                    n14 = 117;
                    break;
                }
                case 219: {
                    n14 = 220;
                    break;
                }
                case 220: {
                    n14 = 99;
                    break;
                }
                case 221: {
                    n14 = 126;
                    break;
                }
                case 222: {
                    n14 = 72;
                    break;
                }
                case 223: {
                    n14 = 71;
                    break;
                }
                case 224: {
                    n14 = 43;
                    break;
                }
                case 225: {
                    n14 = 31;
                    break;
                }
                case 226: {
                    n14 = 134;
                    break;
                }
                case 227: {
                    n14 = 69;
                    break;
                }
                case 228: {
                    n14 = 144;
                    break;
                }
                case 229: {
                    n14 = 77;
                    break;
                }
                case 230: {
                    n14 = 139;
                    break;
                }
                case 231: {
                    n14 = 20;
                    break;
                }
                case 232: {
                    n14 = 116;
                    break;
                }
                case 233: {
                    n14 = 231;
                    break;
                }
                case 234: {
                    n14 = 165;
                    break;
                }
                case 235: {
                    n14 = 14;
                    break;
                }
                case 236: {
                    n14 = 48;
                    break;
                }
                case 237: {
                    n14 = 158;
                    break;
                }
                case 238: {
                    n14 = 206;
                    break;
                }
                case 239: {
                    n14 = 101;
                    break;
                }
                case 240: {
                    n14 = 200;
                    break;
                }
                case 241: {
                    n14 = 84;
                    break;
                }
                case 242: {
                    n14 = 3;
                    break;
                }
                case 243: {
                    n14 = 182;
                    break;
                }
                case 244: {
                    n14 = 100;
                    break;
                }
                case 245: {
                    n14 = 240;
                    break;
                }
                case 246: {
                    n14 = 178;
                    break;
                }
                case 247: {
                    n14 = 64;
                    break;
                }
                case 248: {
                    n14 = 223;
                    break;
                }
                case 249: {
                    n14 = 253;
                    break;
                }
                case 250: {
                    n14 = 212;
                    break;
                }
                case 251: {
                    n14 = 218;
                    break;
                }
                case 252: {
                    n14 = 237;
                    break;
                }
                case 253: {
                    n14 = 24;
                    break;
                }
                case 254: {
                    n14 = 151;
                    break;
                }
                default: {
                    n14 = 157;
                }
            }
            int n15 = n14;
            int n16 = (n11 & 0xFF) - n15;
            if (n16 < 0) {
                n16 += 256;
            }
            if ((n13 = ((n11 & 0xFFFF) >>> 8) - n15) < 0) {
                n13 += 256;
            }
            int n17 = 0;
            while (n17 < cArray.length) {
                int n18 = n17 % 2;
                int n19 = n17;
                char[] cArray2 = cArray;
                char c2 = cArray[n19];
                if (n18 == 0) {
                    cArray2[n19] = (char)(c2 ^ n16);
                    n16 = ((n16 >>> 3 | n16 << 5) ^ cArray[n17]) & 0xFF;
                } else {
                    cArray2[n19] = (char)(c2 ^ n13);
                    n13 = ((n13 >>> 3 | n13 << 5) ^ cArray[n17]) & 0xFF;
                }
                ++n17;
            }
            c9_0.b[n12] = new String(cArray).intern();
        }
        return b[n12];
    }
}

