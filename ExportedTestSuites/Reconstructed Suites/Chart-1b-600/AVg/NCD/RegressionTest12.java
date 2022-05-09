package org.jfree.chart.renderer.category;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = keyedObjects0.getKey((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Shape shape10 = lineAndShapeRenderer2.lookupSeriesShape(1);
        lineAndShapeRenderer2.setSeriesCreateEntities(100, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("TextAnchor.BOTTOM_CENTER", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable2 = keyedObjects2D0.getRowKey((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        boolean boolean7 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, 0);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean11 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        java.lang.String str6 = categoryAxis1.getCategoryLabelToolTip((java.lang.Comparable) "TextAnchor.BOTTOM_CENTER");
        java.lang.String str8 = categoryAxis1.getCategoryLabelToolTip((java.lang.Comparable) 3.0d);
        categoryAxis1.setCategoryMargin((double) 9);
        categoryAxis1.setUpperMargin(5.0d);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.awt.Paint paint8 = lineAndShapeRenderer2.getSeriesOutlinePaint(2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        boolean boolean7 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        org.jfree.data.UnknownKeyException unknownKeyException3 = new org.jfree.data.UnknownKeyException("ItemLabelAnchor.OUTSIDE6");
        java.lang.Throwable[] throwableArray4 = unknownKeyException3.getSuppressed();
        boolean boolean5 = shapeList0.equals((java.lang.Object) unknownKeyException3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("DatasetRenderingOrder.REVERSE");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name DatasetRenderingOrder.REVERSE, locale en_GB");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(50, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        boolean boolean7 = legendItem6.isLineVisible();
        java.text.AttributedString attributedString8 = legendItem6.getAttributedLabel();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(attributedString8);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity8 = new org.jfree.chart.entity.ChartEntity(shape5, "", "java.awt.Color[r=255,g=255,b=255]");
        java.awt.Shape shape9 = chartEntity8.getArea();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Shape shape10 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 1, shape10, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getBaseStroke();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getSeriesFillPaint(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        boolean boolean6 = legendItem1.isShapeFilled();
        java.lang.Object obj7 = legendItem1.clone();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.lang.Object obj0 = null;
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.event.ChartChangeEvent chartChangeEvent2 = new org.jfree.chart.event.ChartChangeEvent(obj0, jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        java.awt.Font font8 = lineAndShapeRenderer0.getItemLabelFont(11, 2, false);
        java.awt.Paint paint10 = lineAndShapeRenderer0.getSeriesPaint((-1));
        boolean boolean11 = lineAndShapeRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.awt.Color color4 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator8 = new org.jfree.chart.util.DefaultShadowGenerator((int) '#', color4, (float) 4, 0, 29.0d);
        int int9 = color4.getGreen();
        int int10 = color4.getBlue();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity8 = new org.jfree.chart.entity.ChartEntity(shape5, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]", "ItemLabelAnchor.OUTSIDE6");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        boolean boolean7 = legendItem1.isShapeOutlineVisible();
        java.lang.String str8 = legendItem1.getDescription();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        categoryAxis1.setMaximumCategoryLabelWidthRatio((float) 5);
        java.lang.String str7 = categoryAxis1.getLabel();
        java.lang.Object obj8 = null;
        boolean boolean9 = categoryAxis1.equals(obj8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesStroke((int) '4');
        java.awt.Paint paint8 = lineAndShapeRenderer2.getSeriesOutlinePaint((-254));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("ChartEntity: tooltip = GradientPaintTransformType.HORIZONTAL");
        org.jfree.data.UnknownKeyException unknownKeyException3 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException3);
        java.lang.String str5 = unknownKeyException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jfree.data.UnknownKeyException: AxisLocation.BOTTOM_OR_RIGHT" + "'", str5, "org.jfree.data.UnknownKeyException: AxisLocation.BOTTOM_OR_RIGHT");
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Paint paint6 = lineAndShapeRenderer2.getBasePaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getFillPaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = new org.jfree.chart.LegendItemCollection();
        boolean boolean5 = objectList1.equals((java.lang.Object) legendItemCollection4);
        java.lang.Object obj6 = null;
        boolean boolean7 = legendItemCollection4.equals(obj6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        boolean boolean4 = legendItem1.isShapeVisible();
        legendItem1.setShapeVisible(false);
        boolean boolean7 = legendItem1.isShapeVisible();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        java.lang.String str8 = legendItem6.getURLText();
        java.awt.Stroke stroke9 = legendItem6.getLineStroke();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        org.jfree.chart.util.UnitType unitType3 = rectangleInsets0.getUnitType();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = new org.jfree.chart.util.RectangleInsets(unitType3, (-1.6776955E7d), (double) 1.0f, (double) 0L, (double) 8);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertNotNull(unitType3);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor(35, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Green");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        org.jfree.chart.LegendItem legendItem4 = lineAndShapeRenderer0.getLegendItem(0, 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = lineAndShapeRenderer0.getBaseItemLabelGenerator();
        java.awt.Shape shape7 = lineAndShapeRenderer0.lookupLegendShape((-1656));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNull(legendItem4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor(500, (int) (short) 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Red");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Shape shape1 = defaultDrawingSupplier0.getNextShape();
        java.awt.Stroke stroke2 = defaultDrawingSupplier0.getNextOutlineStroke();
        java.awt.Paint paint3 = defaultDrawingSupplier0.getNextFillPaint();
        java.awt.Stroke stroke4 = defaultDrawingSupplier0.getNextStroke();
        java.awt.Stroke stroke5 = defaultDrawingSupplier0.getNextOutlineStroke();
        java.awt.Stroke stroke6 = defaultDrawingSupplier0.getNextOutlineStroke();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("TextAnchor.CENTER", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        int int7 = categoryAxis1.getCategoryLabelPositionOffset();
        double double8 = categoryAxis1.getLabelAngle();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        legendItem6.setSeriesIndex((int) (byte) 100);
        java.awt.Paint paint12 = legendItem6.getLinePaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        categoryAxis1.setCategoryLabelPositionOffset(255);
        categoryAxis1.configure();
        categoryAxis1.setCategoryLabelPositionOffset(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer0 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        java.lang.Object obj1 = standardGradientPaintTransformer0.clone();
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType2 = standardGradientPaintTransformer0.getType();
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType3 = standardGradientPaintTransformer0.getType();
        java.lang.String str4 = gradientPaintTransformType3.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(gradientPaintTransformType2);
        org.junit.Assert.assertNotNull(gradientPaintTransformType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GradientPaintTransformType.VERTICAL" + "'", str4, "GradientPaintTransformType.VERTICAL");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        org.jfree.chart.LegendItem legendItem4 = lineAndShapeRenderer0.getLegendItem(0, 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = lineAndShapeRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = lineAndShapeRenderer0.getBasePaint();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNull(legendItem4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("-3,-3,3,3");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name -3,-3,3,3, locale en_GB");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.trimWidth((double) (-10289251));
        double double7 = rectangleInsets4.getTop();
        double double9 = rectangleInsets4.calculateBottomInset((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0289271E7d) + "'", double6 == (-1.0289271E7d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryAxis1.getLabelInsets();
        java.lang.String str5 = categoryAxis1.getLabelURL();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.setValue((-1.0d), (java.lang.Comparable) (-5.0d), (java.lang.Comparable) 3);
        int int8 = defaultCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.setValue((-1.0d), (java.lang.Comparable) (-5.0d), (java.lang.Comparable) 3);
        defaultCategoryDataset0.clearSelection();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color1 = java.awt.Color.yellow;
        boolean boolean2 = itemLabelAnchor0.equals((java.lang.Object) color1);
        java.awt.Color color3 = color1.brighter();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Font font8 = lineAndShapeRenderer2.getItemLabelFont(3, (int) ' ', true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(itemLabelPosition9);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.BOTTOM_CENTER");
        java.awt.Color color3 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        categoryAxis1.setTickLabelPaint((java.lang.Comparable) (-1.6776955E7d), (java.awt.Paint) color3);
        categoryAxis1.setUpperMargin((double) 100L);
        categoryAxis1.setLabelURL("ItemLabelAnchor.INSIDE7");
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        int int2 = keyedObjects0.getItemCount();
        int int3 = keyedObjects0.getItemCount();
        int int4 = keyedObjects0.getItemCount();
        org.jfree.chart.util.SortOrder sortOrder5 = org.jfree.chart.util.SortOrder.ASCENDING;
        keyedObjects0.sortByObjects(sortOrder5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(sortOrder5);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        org.jfree.chart.entity.ChartEntity chartEntity9 = new org.jfree.chart.entity.ChartEntity(shape5, "{0}");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        java.lang.String str3 = categoryAxis1.getLabelURL();
        double double4 = categoryAxis1.getUpperMargin();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.05d + "'", double4 == 0.05d);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        java.awt.Shape shape7 = lineAndShapeRenderer2.getBaseShape();
        lineAndShapeRenderer2.setBaseShapesVisible(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        lineAndShapeRenderer2.clearSeriesPaints(true);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        int int6 = legendItem1.getSeriesIndex();
        java.awt.Paint paint7 = legendItem1.getLinePaint();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        boolean boolean4 = legendItem1.isShapeVisible();
        legendItem1.setDatasetIndex(0);
        java.awt.Paint paint7 = legendItem1.getLinePaint();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        org.jfree.chart.util.UnitType unitType3 = rectangleInsets0.getUnitType();
        double double5 = rectangleInsets0.calculateLeftInset((double) (-12517568));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertNotNull(unitType3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name hi!, locale en_GB");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint9 = null;
        lineAndShapeRenderer2.setBasePaint(paint9, true);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, false);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color1 = java.awt.Color.decode("PlotEntity: tooltip = java.awt.Color[r=64,g=255,b=64]");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"PlotEntity: tooltip = java.awt.Color[r=64,g=255,b=64]\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        float float1 = categoryAxis0.getMinorTickMarkInsideLength();
        boolean boolean2 = categoryAxis0.isTickLabelsVisible();
        float float3 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        categoryAxis0.setTickMarkOutsideLength((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color1 = java.awt.Color.decode("GradientPaintTransformType.HORIZONTAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"GradientPaintTransformType.HORIZONTAL\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        legendItem1.setFillPaint((java.awt.Paint) chartColor5);
        java.lang.String str7 = legendItem1.getDescription();
        java.lang.Comparable comparable8 = legendItem1.getSeriesKey();
        java.lang.Object obj9 = legendItem1.clone();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(comparable8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Font font6 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor((int) (byte) -1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Red");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor1 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE6;
        boolean boolean2 = rectangleInsets0.equals((java.lang.Object) itemLabelAnchor1);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertNotNull(itemLabelAnchor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (byte) 1, categoryToolTipGenerator8, false);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        java.lang.Object obj2 = categoryAxis1.clone();
        double double3 = categoryAxis1.getCategoryMargin();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions4 = categoryAxis1.getCategoryLabelPositions();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2d + "'", double3 == 0.2d);
        org.junit.Assert.assertNotNull(categoryLabelPositions4);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        java.util.List list8 = keyedObjects2D0.getColumnKeys();
        keyedObjects2D0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int3 = defaultCategoryDataset0.getRowCount();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState4 = defaultCategoryDataset0.getSelectionState();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState4);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        boolean boolean5 = categoryAxis1.isVisible();
        boolean boolean6 = categoryAxis1.isTickLabelsVisible();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        java.lang.Object obj4 = legendItem1.clone();
        boolean boolean5 = legendItem1.isShapeOutlineVisible();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        java.awt.Font font3 = categoryAxis1.getTickLabelFont();
        java.awt.Paint paint4 = categoryAxis1.getLabelPaint();
        java.awt.Stroke stroke5 = categoryAxis1.getAxisLineStroke();
        categoryAxis1.setUpperMargin((double) (byte) 1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Paint paint9 = lineAndShapeRenderer2.getItemLabelPaint((int) '4', 0, true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.entity.ChartEntity chartEntity1 = new org.jfree.chart.entity.ChartEntity(shape0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'area' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = new org.jfree.chart.LegendItemCollection();
        boolean boolean5 = objectList1.equals((java.lang.Object) legendItemCollection4);
        int int6 = objectList1.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryURLGenerator6);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = new org.jfree.chart.LegendItemCollection();
        boolean boolean5 = objectList1.equals((java.lang.Object) legendItemCollection4);
        java.util.Iterator iterator6 = legendItemCollection4.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        lineAndShapeRenderer0.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Color color8 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        lineAndShapeRenderer0.setBaseOutlinePaint((java.awt.Paint) color8);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType2 = org.jfree.chart.event.ChartChangeEventType.GENERAL;
        java.lang.String str3 = chartChangeEventType2.toString();
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent4 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) "org.jfree.chart.ChartColor[r=0,g=8,b=32]", jFreeChart1, chartChangeEventType2);
        org.junit.Assert.assertNotNull(chartChangeEventType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChartChangeEventType.GENERAL" + "'", str3, "ChartChangeEventType.GENERAL");
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.event.ChartChangeEvent chartChangeEvent1 = new org.jfree.chart.event.ChartChangeEvent(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        java.lang.Throwable[] throwableArray2 = unknownKeyException1.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException4 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        org.jfree.data.UnknownKeyException unknownKeyException6 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        unknownKeyException4.addSuppressed((java.lang.Throwable) unknownKeyException6);
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException6);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0d);
        selectableValue2.setSelected(false);
        boolean boolean5 = selectableValue2.isSelected();
        boolean boolean6 = shapeList0.equals((java.lang.Object) selectableValue2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        int int3 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator5);
        org.jfree.chart.LegendItem legendItem9 = lineAndShapeRenderer2.getLegendItem(50, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(legendItem9);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Paint paint4 = lineAndShapeRenderer2.getSeriesPaint((int) ' ');
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 100);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        boolean boolean5 = categoryAxis1.isVisible();
        categoryAxis1.setTickLabelsVisible(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0d);
        java.lang.Number number2 = selectableValue1.getValue();
        java.lang.Number number3 = selectableValue1.getValue();
        java.lang.Number number4 = selectableValue1.getValue();
        java.lang.Number number5 = selectableValue1.getValue();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 1.0d + "'", number2, 1.0d);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0d + "'", number3, 1.0d);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0d + "'", number4, 1.0d);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1.0d + "'", number5, 1.0d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        legendItem1.setFillPaint((java.awt.Paint) chartColor5);
        java.lang.String str7 = legendItem1.getDescription();
        java.awt.Paint paint8 = legendItem1.getLabelPaint();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10L, (double) 100, (double) 10.0f, (double) (byte) 10);
        double double6 = rectangleInsets4.calculateRightOutset((double) (byte) 100);
        double double7 = rectangleInsets4.getBottom();
        double double8 = rectangleInsets4.getLeft();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = abstractCategoryDataset0.getGroup();
        java.lang.String str2 = datasetGroup1.getID();
        java.lang.Object obj3 = datasetGroup1.clone();
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NOID" + "'", str2, "NOID");
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor(0, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Blue");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        legendItem6.setLineVisible(false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        java.awt.Font font3 = categoryAxis1.getTickLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryAxis1.getLabelInsets();
        categoryAxis1.setFixedDimension((-1.0d));
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        java.lang.Object obj2 = categoryAxis1.clone();
        boolean boolean3 = categoryAxis1.isVisible();
        java.awt.Paint paint4 = categoryAxis1.getLabelPaint();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setTickLabelsVisible(false);
        categoryAxis1.setLowerMargin(16.0d);
        java.lang.Class<?> wildcardClass7 = categoryAxis1.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setShadowVisible(true);
        barRenderer0.setSeriesVisible(0, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.BarPainter barPainter7 = barRenderer0.getBarPainter();
        java.awt.Font font9 = barRenderer0.getSeriesItemLabelFont(255);
        org.junit.Assert.assertNotNull(barPainter7);
        org.junit.Assert.assertNull(font9);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        java.lang.Object obj5 = categoryAxis1.clone();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions6 = categoryAxis1.getCategoryLabelPositions();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(categoryLabelPositions6);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color1 = java.awt.Color.decode("ChartChangeEventType.NEW_DATASET");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ChartChangeEventType.NEW_DATASET\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setTickLabelsVisible(false);
        double double5 = categoryAxis1.getLowerMargin();
        categoryAxis1.setMinorTickMarkInsideLength((float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05d + "'", double5 == 0.05d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setLabelToolTip("java.awt.Color[r=255,g=255,b=255]");
        categoryAxis1.setMaximumCategoryLabelLines((int) (short) 0);
        categoryAxis1.setVisible(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.Object obj1 = null;
        org.jfree.data.KeyedObject keyedObject2 = new org.jfree.data.KeyedObject((java.lang.Comparable) "java.awt.Color[r=255,g=255,b=255]", obj1);
        java.lang.Comparable comparable3 = keyedObject2.getKey();
        java.lang.Comparable comparable4 = keyedObject2.getKey();
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "java.awt.Color[r=255,g=255,b=255]" + "'", comparable3, "java.awt.Color[r=255,g=255,b=255]");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "java.awt.Color[r=255,g=255,b=255]" + "'", comparable4, "java.awt.Color[r=255,g=255,b=255]");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.ValueAxis valueAxis6 = null;
        categoryPlot4.setRangeAxis(52, valueAxis6, true);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer1 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType0);
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType2 = standardGradientPaintTransformer1.getType();
        java.lang.Object obj3 = standardGradientPaintTransformer1.clone();
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertNotNull(gradientPaintTransformType2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        java.lang.Object obj5 = categoryAxis1.clone();
        double double6 = categoryAxis1.getUpperMargin();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05d + "'", double6 == 0.05d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setTickLabelsVisible(false);
        categoryAxis1.setLowerMargin(16.0d);
        double double7 = categoryAxis1.getLabelAngle();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Color color2 = java.awt.Color.BLACK;
        int int3 = color2.getGreen();
        paintList0.setPaint(11, (java.awt.Paint) color2);
        java.awt.Color color6 = java.awt.Color.cyan;
        paintList0.setPaint((int) (byte) 100, (java.awt.Paint) color6);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Shape shape1 = defaultDrawingSupplier0.getNextShape();
        java.lang.Object obj2 = defaultDrawingSupplier0.clone();
        java.awt.Stroke stroke3 = defaultDrawingSupplier0.getNextOutlineStroke();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Shape shape1 = defaultDrawingSupplier0.getNextShape();
        java.awt.Paint paint2 = defaultDrawingSupplier0.getNextOutlinePaint();
        java.awt.Paint paint3 = defaultDrawingSupplier0.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer4 = legendItem1.getFillPaintTransformer();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(gradientPaintTransformer4);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.extendWidth((double) 10L);
        double double3 = rectangleInsets0.getTop();
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.0d + "'", double2 == 16.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0d + "'", double3 == 3.0d);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        java.lang.Object obj4 = legendItem1.clone();
        java.lang.Object obj5 = legendItem1.clone();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color1 = java.awt.Color.decode("AxisLocation.TOP_OR_RIGHT");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AxisLocation.TOP_OR_RIGHT\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Stroke stroke1 = defaultDrawingSupplier0.getNextOutlineStroke();
        java.awt.Shape shape2 = defaultDrawingSupplier0.getNextShape();
        java.awt.Paint paint3 = defaultDrawingSupplier0.getNextFillPaint();
        java.awt.Paint paint4 = defaultDrawingSupplier0.getNextFillPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        boolean boolean3 = categoryAxis1.isAxisLineVisible();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        categoryAxis1.setLowerMargin((double) 10L);
        float float4 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
        boolean boolean5 = categoryAxis1.isTickLabelsVisible();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0f, false);
        java.lang.Number number3 = selectableValue2.getValue();
        boolean boolean4 = selectableValue2.isSelected();
        selectableValue2.setSelected(false);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0f + "'", number3, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Paint paint1 = defaultDrawingSupplier0.getNextFillPaint();
        java.awt.Stroke stroke2 = defaultDrawingSupplier0.getNextStroke();
        java.awt.Paint paint3 = defaultDrawingSupplier0.getNextFillPaint();
        java.awt.Paint paint4 = defaultDrawingSupplier0.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape((int) '#', shape2);
        java.awt.Shape shape5 = shapeList0.getShape((-10));
        java.awt.Shape shape7 = null;
        shapeList0.setShape(32, shape7);
        java.lang.Object obj9 = shapeList0.clone();
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.LegendItemCollection legendItemCollection0 = new org.jfree.chart.LegendItemCollection();
        org.jfree.chart.LegendItemCollection legendItemCollection1 = new org.jfree.chart.LegendItemCollection();
        java.util.Iterator iterator2 = legendItemCollection1.iterator();
        legendItemCollection0.addAll(legendItemCollection1);
        int int4 = legendItemCollection1.getItemCount();
        java.util.Iterator iterator5 = legendItemCollection1.iterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE5;
        org.jfree.chart.text.TextAnchor textAnchor1 = org.jfree.chart.text.TextAnchor.TOP_LEFT;
        org.jfree.chart.text.TextAnchor textAnchor2 = org.jfree.chart.text.TextAnchor.BASELINE_RIGHT;
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor0, textAnchor1, textAnchor2, 0.0d);
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertNotNull(textAnchor1);
        org.junit.Assert.assertNotNull(textAnchor2);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Stroke stroke1 = defaultDrawingSupplier0.getNextOutlineStroke();
        java.awt.Shape shape2 = defaultDrawingSupplier0.getNextShape();
        java.awt.Paint paint3 = defaultDrawingSupplier0.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
        java.lang.String str1 = gradientPaintTransformType0.toString();
        java.lang.String str2 = gradientPaintTransformType0.toString();
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GradientPaintTransformType.HORIZONTAL" + "'", str1, "GradientPaintTransformType.HORIZONTAL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GradientPaintTransformType.HORIZONTAL" + "'", str2, "GradientPaintTransformType.HORIZONTAL");
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("GradientPaintTransformType.HORIZONTAL");
        java.lang.Object obj2 = datasetGroup1.clone();
        java.lang.String str3 = datasetGroup1.getID();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GradientPaintTransformType.HORIZONTAL" + "'", str3, "GradientPaintTransformType.HORIZONTAL");
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        java.lang.Object obj4 = null;
        keyedObjects2D0.setObject(obj4, (java.lang.Comparable) 1.0f, (java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        org.jfree.data.UnknownKeyException unknownKeyException3 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException3);
        org.jfree.data.UnknownKeyException unknownKeyException6 = new org.jfree.data.UnknownKeyException("SortOrder.ASCENDING");
        unknownKeyException3.addSuppressed((java.lang.Throwable) unknownKeyException6);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Paint paint1 = defaultDrawingSupplier0.getNextFillPaint();
        java.awt.Stroke stroke2 = defaultDrawingSupplier0.getNextStroke();
        java.awt.Paint paint3 = defaultDrawingSupplier0.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        java.lang.String str2 = unknownKeyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]" + "'", str2, "org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) 2.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color1 = java.awt.Color.decode("PlotOrientation.VERTICAL");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"PlotOrientation.VERTICAL\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(2);
        java.awt.Shape shape6 = shapeList0.getShape((int) '#');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        float[] floatArray3 = null;
        float[] floatArray4 = java.awt.Color.RGBtoHSB((int) '#', (-10411212), (-716), floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.83334535, 297464.2, 0.13725491]");
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color1 = java.awt.Color.decode("NOID");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"NOID\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double0 = org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.0d + "'", double0 == 3.0d);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        double double3 = categoryAxis1.getCategoryMargin();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2d + "'", double3 == 0.2d);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.LegendItemCollection legendItemCollection3 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = lineAndShapeRenderer2.getURLGenerator((int) 'a', 52, false);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNull(categoryURLGenerator7);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double2 = barRenderer0.getItemMargin();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        org.jfree.chart.LegendItem legendItem4 = lineAndShapeRenderer0.getLegendItem(0, 0);
        lineAndShapeRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNull(legendItem4);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        categoryAxis1.setMinorTickMarkInsideLength((float) (short) -1);
        int int4 = categoryAxis1.getCategoryLabelPositionOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        java.util.List list4 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateLeftOutset(0.2d);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Stroke stroke1 = defaultDrawingSupplier0.getNextStroke();
        java.awt.Paint paint2 = defaultDrawingSupplier0.getNextFillPaint();
        java.awt.Paint paint3 = defaultDrawingSupplier0.getNextFillPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        float float2 = categoryAxis1.getMinorTickMarkInsideLength();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.awt.Color color1 = org.jfree.chart.ChartColor.VERY_DARK_CYAN;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color1);
        java.lang.Comparable comparable3 = legendItem2.getSeriesKey();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(comparable3);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        java.lang.Object obj4 = objectList1.clone();
        java.lang.Object obj5 = objectList1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        legendItem6.setSeriesIndex(52);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        java.awt.color.ColorSpace colorSpace7 = color5.getColorSpace();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(colorSpace7);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.lang.Object obj1 = defaultDrawingSupplier0.clone();
        java.awt.Paint paint2 = defaultDrawingSupplier0.getNextPaint();
        java.awt.Stroke stroke3 = defaultDrawingSupplier0.getNextStroke();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        barRenderer0.setSeriesVisibleInLegend(192, (java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0f, false);
        boolean boolean3 = selectableValue2.isSelected();
        java.lang.Number number4 = selectableValue2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0f + "'", number4, 1.0f);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.jfree.chart.entity.ChartEntity chartEntity3 = new org.jfree.chart.entity.ChartEntity(shape0, "org.jfree.chart.ChartColor[r=0,g=8,b=32]", "org.jfree.chart.ChartColor[r=0,g=8,b=32]");
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Color color1 = java.awt.Color.decode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.awt.Color color2 = java.awt.Color.getColor("hi!", (int) (byte) 10);
        java.lang.Object obj3 = null;
        boolean boolean4 = color2.equals(obj3);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.trimWidth((double) (-10));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.0d) + "'", double2 == (-16.0d));
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setItemMargin((double) 10.0f);
        double double3 = barRenderer0.getMaximumBarWidth();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        java.awt.Stroke stroke3 = barRenderer0.getSeriesOutlineStroke(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke3);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setShadowXOffset((double) 1L);
        org.junit.Assert.assertNull(itemLabelPosition1);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        java.lang.Object obj2 = categoryAxis1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        boolean boolean2 = lineAndShapeRenderer0.getBaseShapesVisible();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        legendItem1.setDatasetIndex((int) (short) -1);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.awt.Color color3 = java.awt.Color.getColor("hi!", (int) (byte) 10);
        java.awt.Color color4 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", color3);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setItemMargin((double) 10.0f);
        barRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Shape shape6 = barRenderer0.lookupSeriesShape(1);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        java.lang.Object obj1 = keyedObjects0.clone();
        int int3 = keyedObjects0.getIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.BOTTOM_CENTER");
        java.lang.Object obj2 = null;
        boolean boolean3 = categoryAxis1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        java.lang.String str2 = unknownKeyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.UnknownKeyException: AxisLocation.BOTTOM_OR_RIGHT" + "'", str2, "org.jfree.data.UnknownKeyException: AxisLocation.BOTTOM_OR_RIGHT");
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setShadowVisible(true);
        barRenderer0.setSeriesVisible(0, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.BarPainter barPainter7 = barRenderer0.getBarPainter();
        barRenderer0.setBase(29.0d);
        org.junit.Assert.assertNotNull(barPainter7);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setShadowVisible(true);
        boolean boolean3 = barRenderer0.getShadowsVisible();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.awt.Color color0 = org.jfree.chart.ChartColor.DARK_GREEN;
        int int1 = color0.getAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        int int4 = keyedObjects2D0.getRowIndex((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double5 = rectangleInsets4.getRight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        java.lang.Object obj2 = datasetGroup1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("ItemLabelAnchor.OUTSIDE6");
        java.lang.Object obj2 = standardCategorySeriesLabelGenerator1.clone();
        java.lang.Object obj3 = standardCategorySeriesLabelGenerator1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.configure();
        categoryAxis0.setMinorTickMarkInsideLength((float) (byte) 10);
        java.awt.Font font4 = categoryAxis0.getLabelFont();
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL;
        boolean boolean2 = gradientPaintTransformType0.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        java.lang.Object obj5 = objectList1.get(50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        int int2 = keyedObjects0.getItemCount();
        java.lang.Object obj3 = keyedObjects0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setItemMargin((double) 10.0f);
        double double3 = barRenderer0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        categoryAxis1.setAxisLineVisible(false);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("java.awt.Color[r=128,g=128,b=128]");
        java.lang.String str2 = datasetGroup1.getID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.awt.Color[r=128,g=128,b=128]" + "'", str2, "java.awt.Color[r=128,g=128,b=128]");
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ItemLabelAnchor.OUTSIDE5" + "'", str1, "ItemLabelAnchor.OUTSIDE5");
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.BOTTOM_CENTER");
        java.awt.Paint paint3 = categoryAxis1.getTickLabelPaint((java.lang.Comparable) 1L);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ItemLabelAnchor.OUTSIDE6" + "'", str1, "ItemLabelAnchor.OUTSIDE6");
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        double double0 = org.jfree.chart.axis.ValueAxis.DEFAULT_AUTO_RANGE_MINIMUM_SIZE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-8d + "'", double0 == 1.0E-8d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Shape shape1 = defaultDrawingSupplier0.getNextShape();
        java.lang.Object obj2 = defaultDrawingSupplier0.clone();
        java.lang.Object obj3 = defaultDrawingSupplier0.clone();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0d);
        java.lang.Number number2 = selectableValue1.getValue();
        selectableValue1.setSelected(false);
        selectableValue1.setSelected(false);
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 1.0d + "'", number2, 1.0d);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE7;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ItemLabelAnchor.INSIDE7" + "'", str1, "ItemLabelAnchor.INSIDE7");
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) 8, (float) (-1656), (float) (byte) 10);
        int int4 = color3.getAlpha();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 255 + "'", int4 == 255);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        categoryAxis1.setLabelAngle(15.0d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.lang.Object obj1 = defaultDrawingSupplier0.clone();
        java.awt.Paint paint2 = defaultDrawingSupplier0.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_BLUE;
        int int1 = color0.getGreen();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 100);
        java.lang.Number number2 = selectableValue1.getValue();
        java.lang.Number number3 = selectableValue1.getValue();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 100 + "'", number2, 100);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.chart.util.UnitType unitType0 = org.jfree.chart.util.UnitType.RELATIVE;
        java.lang.String str1 = unitType0.toString();
        org.junit.Assert.assertNotNull(unitType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnitType.RELATIVE" + "'", str1, "UnitType.RELATIVE");
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        java.lang.Boolean boolean3 = lineAndShapeRenderer0.getSeriesCreateEntities((-1));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Font font2 = barRenderer0.getLegendTextFont(3);
        java.awt.Shape shape3 = barRenderer0.getBaseShape();
        org.junit.Assert.assertNull(font2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getItemStroke((int) (short) 0, 0, true);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("ItemLabelAnchor.OUTSIDE6");
        java.lang.String str2 = unknownKeyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.UnknownKeyException: ItemLabelAnchor.OUTSIDE6" + "'", str2, "org.jfree.data.UnknownKeyException: ItemLabelAnchor.OUTSIDE6");
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        int int1 = color0.getRed();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setCategoryLabelPositionOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(false);
        java.awt.Shape shape2 = renderAttributes1.getDefaultShape();
        java.awt.Paint paint4 = renderAttributes1.getSeriesPaint(0);
        org.junit.Assert.assertNull(shape2);
        org.junit.Assert.assertNull(paint4);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        int int1 = color0.getAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.Comparable comparable3 = legendItem1.getSeriesKey();
        legendItem1.setSeriesIndex(50);
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(comparable3);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        double double1 = lineAndShapeRenderer0.getItemMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0E-8d);
        java.lang.Number number2 = selectableValue1.getValue();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 1.0E-8d + "'", number2, 1.0E-8d);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        java.lang.Throwable[] throwableArray2 = unknownKeyException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Shape shape3 = lineAndShapeRenderer2.getBaseShape();
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.lang.Object obj1 = defaultDrawingSupplier0.clone();
        java.awt.Paint paint2 = defaultDrawingSupplier0.getNextFillPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jfree.chart.util.StrokeList strokeList0 = new org.jfree.chart.util.StrokeList();
        java.awt.Stroke stroke2 = strokeList0.getStroke(5);
        java.awt.Stroke stroke4 = strokeList0.getStroke((int) (byte) -1);
        java.lang.Object obj5 = strokeList0.clone();
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.TOP_CENTER");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.START;
        java.lang.String str1 = categoryAnchor0.toString();
        org.junit.Assert.assertNotNull(categoryAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CategoryAnchor.START" + "'", str1, "CategoryAnchor.START");
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setShadowVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(itemLabelPosition3);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.awt.Color color0 = java.awt.Color.WHITE;
        java.lang.String str1 = color0.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.awt.Color[r=255,g=255,b=255]" + "'", str1, "java.awt.Color[r=255,g=255,b=255]");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.awt.Color color0 = java.awt.Color.gray;
        java.lang.String str1 = color0.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.awt.Color[r=128,g=128,b=128]" + "'", str1, "java.awt.Color[r=128,g=128,b=128]");
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.awt.Color color2 = java.awt.Color.getColor("org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", (-7839));
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Stroke stroke1 = defaultDrawingSupplier0.getNextStroke();
        java.awt.Shape shape2 = defaultDrawingSupplier0.getNextShape();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = paintList0.getPaint(0);
        java.awt.Paint paint4 = paintList0.getPaint(9);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(paint4);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 100);
        boolean boolean2 = selectableValue1.isSelected();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 6.0d);
        java.lang.Number number2 = selectableValue1.getValue();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 6.0d + "'", number2, 6.0d);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator0 = new org.jfree.chart.util.DefaultShadowGenerator();
        int int1 = defaultShadowGenerator0.calculateOffsetX();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.ChartChangeEvent[source=java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0]]");
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.chart.util.BooleanList booleanList0 = new org.jfree.chart.util.BooleanList();
        booleanList0.setBoolean((int) (byte) 100, (java.lang.Boolean) false);
        java.lang.Boolean boolean5 = booleanList0.getBoolean((int) (byte) 0);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator0 = new org.jfree.chart.util.DefaultShadowGenerator();
        int int1 = defaultShadowGenerator0.getShadowSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        org.jfree.chart.util.UnitType unitType5 = rectangleInsets4.getUnitType();
        org.junit.Assert.assertNotNull(unitType5);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.awt.Color color0 = java.awt.Color.white;
        int int1 = color0.getTransparency();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        boolean boolean0 = org.jfree.chart.renderer.category.BarRenderer.getDefaultShadowsVisible();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) 1.0d);
        objectList1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = paintList0.getPaint((int) (short) 10);
        org.junit.Assert.assertNull(paint2);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("");
        java.awt.Shape shape2 = legendItem1.getLine();
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.awt.Color color1 = java.awt.Color.getColor("PlotEntity: tooltip = java.awt.Color[r=64,g=255,b=64]");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.awt.Color color0 = java.awt.Color.LIGHT_GRAY;
        int int1 = color0.getGreen();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 192 + "'", int1 == 192);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double double0 = org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2d + "'", double0 == 0.2d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, true);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.awt.Color color2 = java.awt.Color.getColor("ItemLabelAnchor.OUTSIDE6", (int) '4');
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.awt.Paint paint0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.awt.Color color1 = null;
        java.awt.Color color2 = java.awt.Color.getColor("java.awt.Color[r=64,g=255,b=64]", color1);
        org.junit.Assert.assertNull(color2);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) (short) 10, (float) (short) 1, (float) '4');
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        categoryAxis1.configure();
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_GREEN;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        double double0 = org.jfree.chart.axis.CategoryAxis.DEFAULT_CATEGORY_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2d + "'", double0 == 0.2d);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        float float0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 2.0f + "'", float0 == 2.0f);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.awt.Color color0 = java.awt.Color.YELLOW;
        java.awt.Color color1 = color0.brighter();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int int3 = java.awt.Color.HSBtoRGB((float) (-16776961), (float) 10, (float) 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1656) + "'", int3 == (-1656));
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int int3 = java.awt.Color.HSBtoRGB((float) 100L, (float) '4', (float) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-563) + "'", int3 == (-563));
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.TOP_CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        boolean boolean0 = org.jfree.chart.axis.ValueAxis.DEFAULT_INVERTED;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        java.awt.Color color2 = java.awt.Color.getColor("", 24);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.awt.Shape[] shapeArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
        org.junit.Assert.assertNotNull(shapeArray0);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1L);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("java.awt.Color[r=0,g=0,b=0]");
        legendItem1.setDescription("CategoryAnchor.START");
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) (-16777216), (float) 1L, (float) (byte) 100);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.awt.Color color1 = java.awt.Color.getColor("GradientPaintTransformType.CENTER_VERTICAL");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.awt.Stroke stroke0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_STROKE;
        org.junit.Assert.assertNotNull(stroke0);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.awt.Font font0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        org.junit.Assert.assertNotNull(font0);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_RED;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 33, 32.0d, 15.0d, (double) (-10289251));
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        double double0 = org.jfree.chart.axis.ValueAxis.DEFAULT_LOWER_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.05d + "'", double0 == 0.05d);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 100.0f, 0.2d, (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.awt.Color color1 = java.awt.Color.getColor("SortOrder.ASCENDING");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 4, 16.0d, (double) (byte) 1, (-16.0d));
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("");
        categoryAxis1.setMinorTickMarksVisible(false);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0d);
        selectableValue1.setSelected(false);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) (-12517568), false);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("CategoryAnchor.MIDDLE");
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, false);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 10.0f, false);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) (short) -1);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 1L, true);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) (short) 1);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.awt.Color color2 = java.awt.Color.getColor("", 3);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor(10, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 15);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.chart.renderer.category.BarRenderer.setDefaultShadowsVisible(false);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 10);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape((int) '#', shape2);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.awt.Color color2 = java.awt.Color.getColor("java.awt.Color[r=0,g=0,b=255]", 128);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("GradientPaintTransformType.HORIZONTAL");
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE8;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.CENTER;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("java.awt.Color[r=192,g=192,b=0]");
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("ChartEntity: tooltip = ");
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) (-10.0d), false);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("java.awt.Color[r=255,g=255,b=255]");
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int0 = org.jfree.chart.axis.ValueAxis.MAXIMUM_TICK_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 50, false);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.awt.Color color1 = java.awt.Color.getColor("");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.awt.Color color0 = java.awt.Color.RED;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("ChartEntity: tooltip = GradientPaintTransformType.HORIZONTAL");
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]");
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets(43.0d, (-32.0d), (double) 1.0f, 0.0d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 2.0f, 104.0d, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("rect");
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.awt.Color color1 = java.awt.Color.getColor("{0}");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.awt.Color color0 = java.awt.Color.MAGENTA;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.awt.Color color1 = java.awt.Color.getColor("hi!");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.awt.Color color0 = java.awt.Color.CYAN;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        legendItem1.setURLText("");
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("NOID");
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("hi!");
    }
}
