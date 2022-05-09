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
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator8, true);
        java.awt.Paint paint11 = null;
        lineAndShapeRenderer2.setBasePaint(paint11);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color9 = java.awt.Color.darkGray;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color9, true);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, false);
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) true);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.BOTTOM_CENTER");
        java.awt.Color color22 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        categoryAxis20.setTickLabelPaint((java.lang.Comparable) (-1.6776955E7d), (java.awt.Paint) color22);
        lineAndShapeRenderer2.setSeriesFillPaint(10, (java.awt.Paint) color22);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test6004() throws Throwable {
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
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = lineAndShapeRenderer2.getLegendItems();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot21.getDatasetRenderingOrder();
        categoryPlot21.setBackgroundImageAlignment(3);
        java.awt.Stroke stroke29 = categoryPlot21.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = categoryPlot21.getDomainAxis();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(categoryAxis30);
    }

    @Test
    public void test6007() throws Throwable {
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
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.START;
        java.lang.String str1 = categoryAnchor0.toString();
        org.junit.Assert.assertNotNull(categoryAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CategoryAnchor.START" + "'", str1, "CategoryAnchor.START");
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        java.lang.Comparable comparable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.addValue((double) 100.0f, (java.lang.Comparable) 6.0d, comparable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(33, (-1), true);
        lineAndShapeRenderer2.setDefaultEntityRadius((-7839));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = lineAndShapeRenderer2.getSeriesURLGenerator((-1));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(categoryURLGenerator20);
    }

    @Test
    public void test6011() throws Throwable {
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
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        org.jfree.chart.plot.Plot plot11 = categoryPlot10.getParent();
        org.jfree.chart.util.SortOrder sortOrder12 = categoryPlot10.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(sortOrder12);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        java.lang.Object obj1 = keyedObjects0.clone();
        int int3 = keyedObjects0.getIndex((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6014() throws Throwable {
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
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(drawingSupplier13);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) '#', categoryItemLabelGenerator12);
        java.lang.Boolean boolean15 = lineAndShapeRenderer2.getSeriesShapesFilled(0);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator13);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 10, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
    }

    @Test
    public void test6018() throws Throwable {
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
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        java.lang.Boolean boolean22 = lineAndShapeRenderer2.getSeriesLinesVisible((int) (byte) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition(100, itemLabelPosition24, false);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(8, (java.lang.Boolean) false);
        lineAndShapeRenderer2.clearSeriesStrokes(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        java.awt.Paint paint10 = null;
        lineAndShapeRenderer2.setSeriesFillPaint((int) (short) 1, paint10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15, true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        lineAndShapeRenderer7.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        lineAndShapeRenderer7.setBaseItemLabelsVisible(false, true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.getItemOutlineStroke(0, 1, false);
        java.lang.Boolean boolean22 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(8);
        boolean boolean23 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6023() throws Throwable {
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
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator11);
        org.jfree.chart.ChartColor chartColor16 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) chartColor16);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.awt.Color color2 = java.awt.Color.getColor("hi!", (int) (byte) 10);
        java.lang.Object obj3 = null;
        boolean boolean4 = color2.equals(obj3);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6026() throws Throwable {
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
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Stroke stroke1 = defaultDrawingSupplier0.getNextStroke();
        java.awt.Shape shape2 = defaultDrawingSupplier0.getNextShape();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setSeriesShapesFilled(3, (java.lang.Boolean) false);
        java.awt.Shape shape21 = lineAndShapeRenderer2.lookupLegendShape(2);
        java.awt.Color color23 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(192, (java.awt.Paint) color23, false);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float29 = categoryAxis28.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis28, valueAxis30, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = categoryPlot40.getRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean46 = lineAndShapeRenderer44.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator48 = null;
        lineAndShapeRenderer44.setSeriesURLGenerator(0, categoryURLGenerator48, false);
        java.awt.Color color51 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace52 = color51.getColorSpace();
        lineAndShapeRenderer44.setBaseFillPaint((java.awt.Paint) color51);
        categoryPlot40.setDomainCrosshairPaint((java.awt.Paint) color51);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor55 = categoryPlot40.getDomainGridlinePosition();
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot40);
        boolean boolean57 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        java.awt.Paint paint61 = lineAndShapeRenderer2.getBasePaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNull(categoryItemLabelGenerator39);
        org.junit.Assert.assertNotNull(categoryItemRenderer41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(colorSpace52);
        org.junit.Assert.assertNotNull(categoryAnchor55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(paint61);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        java.lang.String str6 = categoryAxis1.getCategoryLabelToolTip((java.lang.Comparable) "TextAnchor.BOTTOM_CENTER");
        int int7 = categoryAxis1.getCategoryLabelPositionOffset();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, true);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(renderAttributes11);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setSeriesLinesVisible((int) ' ', false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
    }

    @Test
    public void test6032() throws Throwable {
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
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (short) 100, false);
        java.awt.Stroke stroke21 = lineAndShapeRenderer2.getSeriesOutlineStroke(100);
        lineAndShapeRenderer2.setSeriesVisible(0, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(stroke21);
    }

    @Test
    public void test6034() throws Throwable {
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
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double2 = barRenderer0.getItemMargin();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        boolean boolean17 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint18 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity8 = new org.jfree.chart.entity.ChartEntity(shape5, "", "java.awt.Color[r=255,g=255,b=255]");
        org.jfree.chart.entity.ChartEntity chartEntity11 = new org.jfree.chart.entity.ChartEntity(shape5, "DatasetRenderingOrder.FORWARD", "DatasetRenderingOrder.REVERSE");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(false);
        java.awt.Shape shape2 = renderAttributes1.getDefaultShape();
        java.awt.Paint paint4 = renderAttributes1.getSeriesPaint(0);
        org.junit.Assert.assertNull(shape2);
        org.junit.Assert.assertNull(paint4);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        legendItem1.setDatasetIndex((int) (short) -1);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test6040() throws Throwable {
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
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        lineAndShapeRenderer2.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(100, (java.lang.Boolean) false, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("ItemLabelAnchor.OUTSIDE6");
        java.lang.String str2 = unknownKeyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.UnknownKeyException: ItemLabelAnchor.OUTSIDE6" + "'", str2, "org.jfree.data.UnknownKeyException: ItemLabelAnchor.OUTSIDE6");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        java.awt.Shape shape19 = lineAndShapeRenderer15.getLegendShape(0);
        lineAndShapeRenderer15.setAutoPopulateSeriesStroke(false);
        java.awt.Font font23 = lineAndShapeRenderer15.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = null;
        lineAndShapeRenderer15.setBaseToolTipGenerator(categoryToolTipGenerator24);
        org.jfree.chart.ChartColor chartColor29 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) chartColor29);
        lineAndShapeRenderer2.setSeriesPaint((int) '#', (java.awt.Paint) chartColor29, true);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        double double25 = categoryPlot21.getRangeCrosshairValue();
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        int int27 = categoryPlot21.getRangeAxisCount();
        java.awt.Color color28 = java.awt.Color.BLUE;
        categoryPlot21.setRangeMinorGridlinePaint((java.awt.Paint) color28);
        java.awt.Stroke stroke30 = categoryPlot21.getRangeMinorGridlineStroke();
        categoryPlot21.clearRangeMarkers();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        categoryPlot21.axisChanged(axisChangeEvent32);
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot21.getRangeAxisLocation(10);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder36 = categoryPlot21.getDatasetRenderingOrder();
        float float37 = categoryPlot21.getBackgroundAlpha();
        categoryPlot21.clearSelection();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(datasetRenderingOrder36);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel10 = null;
        java.awt.Rectangle rectangle11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.AffineTransform affineTransform13 = null;
        java.awt.RenderingHints renderingHints14 = null;
        java.awt.PaintContext paintContext15 = chartColor9.createContext(colorModel10, rectangle11, rectangle2D12, affineTransform13, renderingHints14);
        java.awt.Color color16 = java.awt.Color.getColor("", (java.awt.Color) chartColor9);
        categoryPlot4.setDomainCrosshairPaint((java.awt.Paint) color16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace18);
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.RenderingSource renderingSource23 = null;
        categoryPlot4.select(0.0d, (double) 100L, rectangle2D22, renderingSource23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot4.panRangeAxes((-1.0289282E7d), plotRenderingInfo26, point2D27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer30 = categoryPlot4.getRendererForDataset(categoryDataset29);
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        categoryPlot4.addChangeListener(plotChangeListener31);
        java.lang.Comparable comparable33 = null;
        categoryPlot4.setDomainCrosshairRowKey(comparable33);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryItemRenderer30);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = categoryPlot14.getDomainAxis();
        categoryAxis15.setLabelAngle(3.0d);
        categoryAxis15.setLabelToolTip("hi!");
        categoryAxis15.clearCategoryLabelToolTips();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        java.awt.geom.Rectangle2D rectangle2D1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D4 = rectangleInsets0.createOutsetRectangle(rectangle2D1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        boolean boolean5 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        java.awt.Font font7 = lineAndShapeRenderer2.lookupLegendTextFont(100);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesCreateEntities(10);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        float[] floatArray3 = null;
        float[] floatArray4 = java.awt.Color.RGBtoHSB((int) '#', (-10411212), (-716), floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.83334535, 297464.2, 0.13725491]");
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double5 = rectangleInsets4.getRight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test6051() throws Throwable {
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
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.data.Range range7 = lineAndShapeRenderer2.findRangeBounds(categoryDataset6);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(2, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0d);
        java.lang.Number number2 = selectableValue1.getValue();
        selectableValue1.setSelected(false);
        selectableValue1.setSelected(false);
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 1.0d + "'", number2, 1.0d);
    }

    @Test
    public void test6054() throws Throwable {
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
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        org.jfree.chart.entity.ChartEntity chartEntity3 = new org.jfree.chart.entity.ChartEntity(shape0, "org.jfree.chart.ChartColor[r=0,g=8,b=32]", "org.jfree.chart.ChartColor[r=0,g=8,b=32]");
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        double double3 = categoryAxis1.getCategoryMargin();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.2d + "'", double3 == 0.2d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        lineAndShapeRenderer2.setUseSeriesOffset(false);
        lineAndShapeRenderer2.setBaseCreateEntities(true, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        java.awt.Stroke stroke6 = categoryAxis1.getAxisLineStroke();
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) 72.0d, "RectangleInsets[t=10.0,l=100.0,b=10.0,r=10.0]");
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.lang.Object obj2 = null;
        keyedObjects2D0.addObject(obj2, (java.lang.Comparable) 4.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = keyedObjects2D0.getObject((-12517568), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6060() throws Throwable {
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
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.ChartColor chartColor17 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel18 = null;
        java.awt.Rectangle rectangle19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.AffineTransform affineTransform21 = null;
        java.awt.RenderingHints renderingHints22 = null;
        java.awt.PaintContext paintContext23 = chartColor17.createContext(colorModel18, rectangle19, rectangle2D20, affineTransform21, renderingHints22);
        java.awt.Color color24 = java.awt.Color.getColor("", (java.awt.Color) chartColor17);
        categoryPlot12.setDomainCrosshairPaint((java.awt.Paint) color24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot12.zoomRangeAxes((double) 100.0f, plotRenderingInfo27, point2D28);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot12.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot12.getDomainAxisEdge((int) (short) 100);
        java.awt.Paint paint34 = categoryPlot12.getRangeGridlinePaint();
        java.awt.Stroke stroke35 = categoryPlot12.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot12.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo38, point2D39);
        float float41 = categoryPlot12.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.axis.AxisLocation axisLocation48 = null;
        categoryPlot46.setRangeAxisLocation(97, axisLocation48, false);
        java.awt.Stroke stroke51 = categoryPlot46.getOutlineStroke();
        boolean boolean52 = categoryPlot46.isDomainZoomable();
        org.jfree.chart.util.SortOrder sortOrder53 = categoryPlot46.getColumnRenderingOrder();
        categoryPlot12.setRowRenderingOrder(sortOrder53);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.data.Range range56 = categoryPlot12.getDataRange(valueAxis55);
        boolean boolean57 = lineAndShapeRenderer2.hasListener((java.util.EventListener) categoryPlot12);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator59 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("");
        lineAndShapeRenderer2.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator59);
        java.awt.Color color64 = java.awt.Color.getHSBColor((-1.0f), (float) (short) 0, (float) 10L);
        lineAndShapeRenderer2.setBaseLegendTextPaint((java.awt.Paint) color64);
        java.awt.Paint paint66 = lineAndShapeRenderer2.getBaseOutlinePaint();
        java.awt.Paint paint70 = lineAndShapeRenderer2.getItemOutlinePaint(52, (int) (short) 10, false);
        boolean boolean73 = lineAndShapeRenderer2.getItemShapeVisible((int) (short) 1, 97);
        org.jfree.data.category.CategoryDataset categoryDataset74 = null;
        org.jfree.data.Range range75 = lineAndShapeRenderer2.findRangeBounds(categoryDataset74);
        int int76 = lineAndShapeRenderer2.getColumnCount();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sortOrder53);
        org.junit.Assert.assertNull(range56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(range75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getItemOutlinePaint(100, (int) (short) 100, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test6063() throws Throwable {
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
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator12);
        boolean boolean16 = lineAndShapeRenderer2.getItemShapeVisible(0, 3);
        java.awt.Paint paint18 = lineAndShapeRenderer2.getSeriesItemLabelPaint(255);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color9 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer5.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis12, valueAxis13, categoryItemRenderer14);
        org.jfree.chart.ChartColor chartColor20 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel21 = null;
        java.awt.Rectangle rectangle22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.awt.geom.AffineTransform affineTransform24 = null;
        java.awt.RenderingHints renderingHints25 = null;
        java.awt.PaintContext paintContext26 = chartColor20.createContext(colorModel21, rectangle22, rectangle2D23, affineTransform24, renderingHints25);
        java.awt.Color color27 = java.awt.Color.getColor("", (java.awt.Color) chartColor20);
        categoryPlot15.setDomainCrosshairPaint((java.awt.Paint) color27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot15.zoomRangeAxes((double) 100.0f, plotRenderingInfo30, point2D31);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot15.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = categoryPlot15.getDomainAxisEdge((int) (short) 100);
        java.awt.Paint paint37 = categoryPlot15.getRangeGridlinePaint();
        java.awt.Stroke stroke38 = categoryPlot15.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        java.awt.geom.Point2D point2D42 = null;
        categoryPlot15.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo41, point2D42);
        float float44 = categoryPlot15.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = null;
        org.jfree.chart.axis.ValueAxis valueAxis47 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer48 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot(categoryDataset45, categoryAxis46, valueAxis47, categoryItemRenderer48);
        org.jfree.chart.axis.AxisLocation axisLocation51 = null;
        categoryPlot49.setRangeAxisLocation(97, axisLocation51, false);
        java.awt.Stroke stroke54 = categoryPlot49.getOutlineStroke();
        boolean boolean55 = categoryPlot49.isDomainZoomable();
        org.jfree.chart.util.SortOrder sortOrder56 = categoryPlot49.getColumnRenderingOrder();
        categoryPlot15.setRowRenderingOrder(sortOrder56);
        org.jfree.chart.axis.ValueAxis valueAxis58 = null;
        org.jfree.data.Range range59 = categoryPlot15.getDataRange(valueAxis58);
        boolean boolean60 = lineAndShapeRenderer5.hasListener((java.util.EventListener) categoryPlot15);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator62 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("");
        lineAndShapeRenderer5.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator62);
        java.awt.Paint paint64 = lineAndShapeRenderer5.getBaseLegendTextPaint();
        java.awt.Paint paint66 = lineAndShapeRenderer5.getLegendTextPaint(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot67 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        boolean boolean69 = lineAndShapeRenderer5.isSeriesVisibleInLegend((int) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator73 = lineAndShapeRenderer5.getToolTipGenerator((-10411212), 24, true);
        java.lang.Boolean boolean75 = lineAndShapeRenderer5.getSeriesVisibleInLegend((-16777216));
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(paintContext26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryAxis34);
        org.junit.Assert.assertNotNull(rectangleEdge36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(sortOrder56);
        org.junit.Assert.assertNull(range59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(paint64);
        org.junit.Assert.assertNull(paint66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator73);
        org.junit.Assert.assertNull(boolean75);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color6 = chartColor5.darker();
        org.jfree.chart.LegendItem legendItem7 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor5);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator11 = new org.jfree.chart.util.DefaultShadowGenerator(10, (java.awt.Color) chartColor5, 0.0f, (int) '4', (double) (byte) 0);
        int int12 = defaultShadowGenerator11.calculateOffsetX();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 42 + "'", int12 == 42);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        boolean boolean10 = lineAndShapeRenderer2.isSeriesVisible(1);
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        org.jfree.chart.entity.ChartEntity chartEntity8 = new org.jfree.chart.entity.ChartEntity(shape5);
        chartEntity8.setURLText("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6070() throws Throwable {
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
    public void test6071() throws Throwable {
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
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        java.awt.Font font7 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 10);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.getItemOutlineStroke(0, 1, false);
        java.awt.Shape shape22 = lineAndShapeRenderer2.lookupLegendShape((int) ' ');
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test6074() throws Throwable {
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
    public void test6075() throws Throwable {
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
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.awt.Color color1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) -1, color1, (float) (-1), (int) ' ', (-1.6776955E7d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'color' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        java.lang.String str3 = rectangleInsets0.toString();
        double double5 = rectangleInsets0.trimHeight((double) (short) 10);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str3, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.awt.Shape shape4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color11 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer7.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color11);
        java.awt.Paint paint13 = lineAndShapeRenderer7.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = lineAndShapeRenderer7.getLegendItems();
        java.awt.Font font15 = null;
        lineAndShapeRenderer7.setBaseItemLabelFont(font15, true);
        java.awt.Paint paint19 = lineAndShapeRenderer7.getSeriesOutlinePaint((-1));
        java.awt.Paint paint23 = lineAndShapeRenderer7.getItemPaint(0, (int) '4', true);
        org.jfree.chart.LegendItem legendItem24 = new org.jfree.chart.LegendItem("hi!", "org.jfree.chart.event.ChartChangeEvent[source=1]", "org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]", "", shape4, paint23);
        legendItem24.setLineVisible(true);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        java.awt.Paint paint15 = lineAndShapeRenderer2.getItemPaint((-12517568), (int) 'a', false);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel10 = null;
        java.awt.Rectangle rectangle11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.AffineTransform affineTransform13 = null;
        java.awt.RenderingHints renderingHints14 = null;
        java.awt.PaintContext paintContext15 = chartColor9.createContext(colorModel10, rectangle11, rectangle2D12, affineTransform13, renderingHints14);
        java.awt.Color color16 = java.awt.Color.getColor("", (java.awt.Color) chartColor9);
        categoryPlot4.setDomainCrosshairPaint((java.awt.Paint) color16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace18);
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.RenderingSource renderingSource23 = null;
        categoryPlot4.select(0.0d, (double) 100L, rectangle2D22, renderingSource23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot4.panRangeAxes((-1.0289282E7d), plotRenderingInfo26, point2D27);
        categoryPlot4.configureDomainAxes();
        org.jfree.chart.axis.AxisSpace axisSpace30 = null;
        categoryPlot4.setFixedRangeAxisSpace(axisSpace30, false);
        boolean boolean33 = categoryPlot4.isDomainPannable();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test6082() throws Throwable {
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
    public void test6083() throws Throwable {
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
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("ChartChangeEventType.GENERAL");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name ChartChangeEventType.GENERAL, locale en_GB");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = null;
        lineAndShapeRenderer2.setSeriesPaint(100, paint12, true);
        lineAndShapeRenderer2.setSeriesLinesVisible(11, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        java.lang.Object obj13 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test6087() throws Throwable {
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
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.chart.util.UnitType unitType0 = org.jfree.chart.util.UnitType.RELATIVE;
        java.lang.String str1 = unitType0.toString();
        org.junit.Assert.assertNotNull(unitType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnitType.RELATIVE" + "'", str1, "UnitType.RELATIVE");
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel10 = null;
        java.awt.Rectangle rectangle11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.AffineTransform affineTransform13 = null;
        java.awt.RenderingHints renderingHints14 = null;
        java.awt.PaintContext paintContext15 = chartColor9.createContext(colorModel10, rectangle11, rectangle2D12, affineTransform13, renderingHints14);
        java.awt.Color color16 = java.awt.Color.getColor("", (java.awt.Color) chartColor9);
        categoryPlot4.setDomainCrosshairPaint((java.awt.Paint) color16);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        categoryPlot4.removeChangeListener(plotChangeListener18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = null;
        categoryPlot4.setRenderer((int) (byte) 0, categoryItemRenderer21, true);
        float float24 = categoryPlot4.getForegroundAlpha();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test6090() throws Throwable {
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
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        java.lang.Throwable[] throwableArray2 = unknownKeyException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator13);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.trimWidth((double) (-10));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.0d) + "'", double2 == (-16.0d));
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable3 = defaultCategoryDataset0.getRowKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6095() throws Throwable {
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
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryPlot14.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot14.getRangeAxisForDataset((int) '4');
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot14.setInsets(rectangleInsets18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(valueAxis17);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(renderAttributes11);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.awt.Color color1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator(100, color1, (float) (-12517568), (int) (byte) 1, (double) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'color' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getItemStroke((int) (short) 0, 0, true);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color6 = chartColor5.darker();
        org.jfree.chart.LegendItem legendItem7 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor5);
        int int8 = chartColor5.getAlpha();
        java.awt.image.ColorModel colorModel9 = null;
        java.awt.Rectangle rectangle10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.AffineTransform affineTransform12 = null;
        java.awt.RenderingHints renderingHints13 = null;
        java.awt.PaintContext paintContext14 = chartColor5.createContext(colorModel9, rectangle10, rectangle2D11, affineTransform12, renderingHints13);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator18 = new org.jfree.chart.util.DefaultShadowGenerator((-10289251), (java.awt.Color) chartColor5, (float) (byte) 100, (-7839), (double) (short) 10);
        int int19 = defaultShadowGenerator18.getDistance();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 255 + "'", int8 == 255);
        org.junit.Assert.assertNotNull(paintContext14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-7839) + "'", int19 == (-7839));
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.configure();
        categoryAxis0.setMinorTickMarkInsideLength((float) (byte) 10);
        java.awt.Font font4 = categoryAxis0.getLabelFont();
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test6102() throws Throwable {
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
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setItemMargin((double) 10.0f);
        double double3 = barRenderer0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        java.awt.Font font7 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Shape shape9 = lineAndShapeRenderer2.lookupSeriesShape(2);
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(true);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        lineAndShapeRenderer2.setBaseCreateEntities(false, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.Locale locale1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("CategoryAnchor.MIDDLE", locale1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6108() throws Throwable {
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
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        java.lang.Object obj13 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator0 = new org.jfree.chart.util.DefaultShadowGenerator();
        int int1 = defaultShadowGenerator0.getShadowSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6111() throws Throwable {
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
    public void test6112() throws Throwable {
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
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.chart.util.BooleanList booleanList0 = new org.jfree.chart.util.BooleanList();
        booleanList0.setBoolean((int) (byte) 100, (java.lang.Boolean) false);
        java.lang.Boolean boolean5 = booleanList0.getBoolean((int) (byte) 0);
        org.junit.Assert.assertNull(boolean5);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(33, (-1), true);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        java.lang.Object obj19 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.awt.Color color0 = java.awt.Color.WHITE;
        java.lang.String str1 = color0.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.awt.Color[r=255,g=255,b=255]" + "'", str1, "java.awt.Color[r=255,g=255,b=255]");
    }

    @Test
    public void test6116() throws Throwable {
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
    public void test6117() throws Throwable {
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
    public void test6118() throws Throwable {
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
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.TOP_CENTER");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
    }

    @Test
    public void test6120() throws Throwable {
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
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        lineAndShapeRenderer2.setSeriesShapesVisible(1, false);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (byte) 100, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        java.awt.Shape shape16 = legendItem1.getShape();
        java.lang.String str17 = legendItem1.getLabel();
        int int18 = legendItem1.getSeriesIndex();
        java.lang.Comparable comparable19 = legendItem1.getSeriesKey();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(comparable19);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        lineAndShapeRenderer7.setSeriesVisibleInLegend(0, (java.lang.Boolean) false);
        lineAndShapeRenderer7.setSeriesVisible(0, (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(255, (java.lang.Boolean) false);
        lineAndShapeRenderer2.removeAnnotations();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(2, (java.lang.Boolean) false);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6125() throws Throwable {
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
    public void test6126() throws Throwable {
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
    public void test6127() throws Throwable {
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
    public void test6128() throws Throwable {
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
    public void test6129() throws Throwable {
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
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        float float2 = categoryAxis1.getMinorTickMarkInsideLength();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.CENTER_HORIZONTAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer1 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = null;
        lineAndShapeRenderer4.setLegendItemURLGenerator(categorySeriesLabelGenerator11);
        java.awt.Paint paint14 = lineAndShapeRenderer4.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer4.getSelectedItemAttributes();
        java.awt.Color color17 = java.awt.Color.BLUE;
        renderAttributes15.setSeriesFillPaint((int) 'a', (java.awt.Paint) color17);
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float21 = categoryAxis20.getTickMarkInsideLength();
        categoryAxis20.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean24 = categoryAxis20.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        lineAndShapeRenderer28.setBaseURLGenerator(categoryURLGenerator29);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = null;
        lineAndShapeRenderer28.setSeriesToolTipGenerator(10, categoryToolTipGenerator32);
        boolean boolean34 = lineAndShapeRenderer28.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke36 = null;
        lineAndShapeRenderer28.setSeriesStroke((int) 'a', stroke36, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor40 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color41 = java.awt.Color.yellow;
        boolean boolean42 = itemLabelAnchor40.equals((java.lang.Object) color41);
        lineAndShapeRenderer28.setSeriesFillPaint((int) ' ', (java.awt.Paint) color41);
        categoryAxis20.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color41);
        renderAttributes15.setDefaultOutlinePaint((java.awt.Paint) color41);
        boolean boolean46 = gradientPaintTransformType0.equals((java.lang.Object) renderAttributes15);
        java.lang.String str47 = gradientPaintTransformType0.toString();
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer48 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType0);
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GradientPaintTransformType.CENTER_HORIZONTAL" + "'", str47, "GradientPaintTransformType.CENTER_HORIZONTAL");
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_BLUE;
        int int1 = color0.getGreen();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test6133() throws Throwable {
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
    public void test6134() throws Throwable {
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
    public void test6135() throws Throwable {
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
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = paintList0.getPaint(0);
        java.awt.Paint paint4 = paintList0.getPaint(9);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(paint4);
    }

    @Test
    public void test6137() throws Throwable {
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
    public void test6138() throws Throwable {
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
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        int int11 = lineAndShapeRenderer2.getDefaultEntityRadius();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test6140() throws Throwable {
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
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) 8, (float) (-1656), (float) (byte) 10);
        int int4 = color3.getAlpha();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 255 + "'", int4 == 255);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font10 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        boolean boolean7 = legendItem1.isShapeOutlineVisible();
        legendItem1.setToolTipText("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0E-8d);
        java.lang.Number number2 = selectableValue1.getValue();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 1.0E-8d + "'", number2, 1.0E-8d);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        java.lang.Object obj2 = datasetGroup1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE7;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ItemLabelAnchor.INSIDE7" + "'", str1, "ItemLabelAnchor.INSIDE7");
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) 1.0d);
        objectList1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setUseOutlinePaint(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
    }

    @Test
    public void test6149() throws Throwable {
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
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.awt.Color color0 = java.awt.Color.gray;
        java.lang.String str1 = color0.toString();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.awt.Color[r=128,g=128,b=128]" + "'", str1, "java.awt.Color[r=128,g=128,b=128]");
    }

    @Test
    public void test6151() throws Throwable {
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
    public void test6152() throws Throwable {
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
    public void test6153() throws Throwable {
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
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer21.setBaseURLGenerator(categoryURLGenerator22);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer21.setSeriesToolTipGenerator(10, categoryToolTipGenerator25);
        boolean boolean27 = lineAndShapeRenderer21.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke29 = null;
        lineAndShapeRenderer21.setSeriesStroke((int) 'a', stroke29, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor33 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color34 = java.awt.Color.yellow;
        boolean boolean35 = itemLabelAnchor33.equals((java.lang.Object) color34);
        lineAndShapeRenderer21.setSeriesFillPaint((int) ' ', (java.awt.Paint) color34);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color40 = java.awt.Color.BLUE;
        lineAndShapeRenderer39.setBaseItemLabelPaint((java.awt.Paint) color40);
        java.awt.Stroke stroke43 = lineAndShapeRenderer39.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis46 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float47 = categoryAxis46.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color52 = java.awt.Color.BLUE;
        lineAndShapeRenderer51.setBaseItemLabelPaint((java.awt.Paint) color52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = lineAndShapeRenderer51.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis46, valueAxis48, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer59 = categoryPlot58.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis61 = lineAndShapeRenderer39.getRangeAxis(categoryPlot58, (int) '4');
        boolean boolean62 = categoryPlot58.isRangeCrosshairVisible();
        lineAndShapeRenderer21.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot58);
        org.jfree.chart.entity.PlotEntity plotEntity64 = new org.jfree.chart.entity.PlotEntity(shape18, (org.jfree.chart.plot.Plot) categoryPlot58);
        boolean boolean65 = categoryPlot58.isDomainPannable();
        java.awt.Paint paint66 = categoryPlot58.getDomainGridlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset68 = categoryPlot58.getDataset((int) (byte) 1);
        java.awt.Font font69 = categoryPlot58.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNull(stroke43);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNull(categoryItemLabelGenerator57);
        org.junit.Assert.assertNotNull(categoryItemRenderer59);
        org.junit.Assert.assertNull(valueAxis61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNull(categoryDataset68);
        org.junit.Assert.assertNotNull(font69);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.lang.Object obj1 = defaultDrawingSupplier0.clone();
        java.awt.Paint paint2 = defaultDrawingSupplier0.getNextFillPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.util.Locale locale1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("ItemLabelAnchor.INSIDE10", locale1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator12);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, false);
        lineAndShapeRenderer2.setUseSeriesOffset(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        categoryAxis1.setAxisLineVisible(false);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.awt.Color color3 = java.awt.Color.getColor("hi!", (int) (byte) 10);
        java.awt.Color color4 = java.awt.Color.getColor("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", color3);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        java.lang.Object obj2 = categoryAxis1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6161() throws Throwable {
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
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.util.Locale locale1 = null;
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.ResourceBundle resourceBundle3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("GradientPaintTransformType.VERTICAL", locale1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.awt.Color color0 = java.awt.Color.white;
        int int1 = color0.getTransparency();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test6164() throws Throwable {
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
    public void test6165() throws Throwable {
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
    public void test6166() throws Throwable {
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
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.BOTTOM_CENTER");
        java.lang.Object obj2 = null;
        boolean boolean3 = categoryAxis1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        java.awt.Shape shape19 = lineAndShapeRenderer15.getLegendShape(0);
        lineAndShapeRenderer15.setAutoPopulateSeriesStroke(false);
        java.awt.Font font23 = lineAndShapeRenderer15.getSeriesItemLabelFont(0);
        lineAndShapeRenderer15.setUseSeriesOffset(true);
        java.awt.Shape shape27 = null;
        lineAndShapeRenderer15.setSeriesShape((int) (short) 10, shape27, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = lineAndShapeRenderer15.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor31 = itemLabelPosition30.getTextAnchor();
        barRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition30);
        org.jfree.chart.renderer.category.BarPainter barPainter33 = barRenderer0.getBarPainter();
        barRenderer0.setBaseSeriesVisibleInLegend(false, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
        org.junit.Assert.assertNotNull(barPainter33);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.ShadowGenerator shadowGenerator5 = categoryPlot4.getShadowGenerator();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot4.getRangeMarkers((-52), layer7);
        categoryPlot4.setForegroundAlpha((float) (short) 1);
        org.junit.Assert.assertNotNull(shadowGenerator5);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.ChartChangeEvent[source=java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0]]");
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float7 = categoryAxis6.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis8 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color12 = java.awt.Color.BLUE;
        lineAndShapeRenderer11.setBaseItemLabelPaint((java.awt.Paint) color12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = lineAndShapeRenderer11.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot(categoryDataset4, categoryAxis6, valueAxis8, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer11);
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot18.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.data.Range range21 = categoryPlot18.getDataRange(valueAxis20);
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.Marker marker23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D3, categoryPlot18, valueAxis22, marker23, rectangle2D24);
        java.lang.Boolean boolean27 = lineAndShapeRenderer2.getSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator28, true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(categoryAxis19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNull(boolean27);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(255, (java.lang.Boolean) false);
        lineAndShapeRenderer2.removeAnnotations();
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        barRenderer0.setSeriesVisibleInLegend(192, (java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        java.lang.Boolean boolean3 = lineAndShapeRenderer0.getSeriesCreateEntities((-1));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Font font2 = barRenderer0.getLegendTextFont(3);
        java.awt.Shape shape3 = barRenderer0.getBaseShape();
        org.junit.Assert.assertNull(font2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.renderer.RenderAttributes renderAttributes9 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape11 = renderAttributes9.getSeriesShape(4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(renderAttributes9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        boolean boolean0 = org.jfree.chart.renderer.category.BarRenderer.getDefaultShadowsVisible();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setShadowXOffset((double) 1L);
        org.junit.Assert.assertNull(itemLabelPosition1);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setShadowVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(itemLabelPosition3);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryPlot14.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot14.getRangeAxisForDataset((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot14.getRangeAxisLocation((int) '4');
        categoryPlot14.setRangeMinorGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        int int3 = java.awt.Color.HSBtoRGB((float) (-16776961), (float) 10, (float) 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1656) + "'", int3 == (-1656));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        java.awt.Paint paint10 = null;
        lineAndShapeRenderer2.setSeriesFillPaint((int) (short) 1, paint10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15, false);
        lineAndShapeRenderer2.setBaseShapesFilled(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test6184() throws Throwable {
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
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        java.awt.Stroke stroke9 = categoryPlot4.getOutlineStroke();
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.RenderingSource renderingSource13 = null;
        categoryPlot4.select((double) (-10289251), (double) (byte) 100, rectangle2D12, renderingSource13);
        categoryPlot4.setAnchorValue(21.0d);
        categoryPlot4.setRangeZeroBaselineVisible(false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) true, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = lineAndShapeRenderer2.getPlot();
        java.awt.Shape shape14 = lineAndShapeRenderer2.getLegendShape((int) (byte) 10);
        lineAndShapeRenderer2.clearSeriesPaints(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.awt.Color color2 = java.awt.Color.getColor("org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", (-7839));
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        java.lang.Object obj5 = objectList1.get(50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(255);
        lineAndShapeRenderer2.setUseFillPaint(false);
        lineAndShapeRenderer2.setBaseShapesVisible(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(shape16);
    }

    @Test
    public void test6190() throws Throwable {
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
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("java.awt.Color[r=0,g=0,b=0]");
        legendItem1.setDescription("CategoryAnchor.START");
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        int int1 = color0.getAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double double0 = org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2d + "'", double0 == 0.2d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        float float0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 2.0f + "'", float0 == 2.0f);
    }

    @Test
    public void test6195() throws Throwable {
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
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.awt.Color color1 = null;
        java.awt.Color color2 = java.awt.Color.getColor("java.awt.Color[r=64,g=255,b=64]", color1);
        org.junit.Assert.assertNull(color2);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 100);
        boolean boolean2 = selectableValue1.isSelected();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setShadowVisible(true);
        boolean boolean3 = barRenderer0.getShadowsVisible();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.BOTTOM_CENTER");
        java.awt.Paint paint3 = categoryAxis1.getTickLabelPaint((java.lang.Comparable) 1L);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test6200() throws Throwable {
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
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        double double1 = lineAndShapeRenderer0.getItemMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot21.getDomainAxisEdge();
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float29 = categoryAxis28.getTickMarkInsideLength();
        categoryAxis28.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean32 = categoryAxis28.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = null;
        lineAndShapeRenderer36.setBaseURLGenerator(categoryURLGenerator37);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = null;
        lineAndShapeRenderer36.setSeriesToolTipGenerator(10, categoryToolTipGenerator40);
        boolean boolean42 = lineAndShapeRenderer36.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke44 = null;
        lineAndShapeRenderer36.setSeriesStroke((int) 'a', stroke44, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor48 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color49 = java.awt.Color.yellow;
        boolean boolean50 = itemLabelAnchor48.equals((java.lang.Object) color49);
        lineAndShapeRenderer36.setSeriesFillPaint((int) ' ', (java.awt.Paint) color49);
        categoryAxis28.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color49);
        categoryPlot21.setDomainAxis(categoryAxis28);
        categoryAxis28.setMaximumCategoryLabelLines((int) (byte) 10);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor48);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.awt.Shape[] shapeArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.createStandardSeriesShapes();
        org.junit.Assert.assertNotNull(shapeArray0);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int0 = org.jfree.chart.axis.ValueAxis.MAXIMUM_TICK_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape((int) '#', shape2);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.awt.Color color0 = java.awt.Color.YELLOW;
        java.awt.Color color1 = color0.brighter();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        boolean boolean0 = org.jfree.chart.axis.ValueAxis.DEFAULT_INVERTED;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, true);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot21.getDomainAxisEdge();
        boolean boolean27 = categoryPlot21.isRangeZeroBaselineVisible();
        boolean boolean28 = categoryPlot21.isDomainZoomable();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        categoryPlot21.axisChanged(axisChangeEvent29);
        org.jfree.chart.util.ShadowGenerator shadowGenerator31 = categoryPlot21.getShadowGenerator();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rectangleEdge26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shadowGenerator31);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setItemMargin((double) 10.0f);
        barRenderer0.setBaseSeriesVisibleInLegend(false);
        java.awt.Shape shape6 = barRenderer0.lookupSeriesShape(1);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.TOP_CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("ChartEntity: tooltip = GradientPaintTransformType.HORIZONTAL");
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.awt.Color color0 = java.awt.Color.LIGHT_GRAY;
        int int1 = color0.getGreen();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 192 + "'", int1 == 192);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        double double15 = lineAndShapeRenderer2.getItemMargin();
        java.awt.Color color16 = java.awt.Color.WHITE;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color16);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getItemLabelPaint((-12517568), (int) (byte) 0, false);
        java.awt.Paint paint23 = lineAndShapeRenderer2.lookupLegendTextPaint((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(paint23);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 33, 32.0d, 15.0d, (double) (-10289251));
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        org.jfree.chart.util.UnitType unitType5 = rectangleInsets4.getUnitType();
        org.junit.Assert.assertNotNull(unitType5);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 6.0d);
        java.lang.Number number2 = selectableValue1.getValue();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 6.0d + "'", number2, 6.0d);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.awt.Color color1 = java.awt.Color.getColor("PlotEntity: tooltip = java.awt.Color[r=64,g=255,b=64]");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 100.0f, 0.2d, (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test6223() throws Throwable {
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
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        double double0 = org.jfree.chart.axis.ValueAxis.DEFAULT_LOWER_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.05d + "'", double0 == 0.05d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        int int1 = color0.getRed();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.awt.Stroke stroke0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_STROKE;
        org.junit.Assert.assertNotNull(stroke0);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0d);
        selectableValue1.setSelected(false);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]");
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        lineAndShapeRenderer2.setUseOutlinePaint(true);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float16 = categoryAxis15.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = lineAndShapeRenderer20.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis15, valueAxis17, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer20);
        boolean boolean28 = categoryPlot27.canSelectByPoint();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = categoryPlot27.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = categoryPlot27.getDrawingSupplier();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = null;
        categoryPlot27.datasetChanged(datasetChangeEvent31);
        java.util.List list33 = categoryPlot27.getCategories();
        categoryPlot27.mapDatasetToDomainAxis((int) (short) 100, 0);
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot27);
        org.jfree.chart.LegendItemCollection legendItemCollection38 = categoryPlot27.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(legendItemCollection29);
        org.junit.Assert.assertNotNull(drawingSupplier30);
        org.junit.Assert.assertNull(list33);
        org.junit.Assert.assertNotNull(legendItemCollection38);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Object obj15 = categoryPlot14.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double18 = rectangleInsets16.extendWidth((double) 10L);
        double double20 = rectangleInsets16.extendWidth((double) (short) -1);
        double double21 = rectangleInsets16.getRight();
        categoryPlot14.setInsets(rectangleInsets16, false);
        org.jfree.chart.util.UnitType unitType24 = rectangleInsets16.getUnitType();
        java.lang.String str25 = unitType24.toString();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 16.0d + "'", double18 == 16.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.0d + "'", double21 == 3.0d);
        org.junit.Assert.assertNotNull(unitType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UnitType.ABSOLUTE" + "'", str25, "UnitType.ABSOLUTE");
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("hi!");
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        java.awt.Color color18 = java.awt.Color.getColor("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", (int) (short) 1);
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) (byte) 0, (java.awt.Paint) color18, false);
        lineAndShapeRenderer2.setSeriesShapesFilled(0, false);
        java.awt.Paint paint24 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = lineAndShapeRenderer2.getURLGenerator((int) (byte) -1, (int) (short) 0, true);
        lineAndShapeRenderer2.setSeriesShapesVisible(0, (java.lang.Boolean) false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator32, false);
        lineAndShapeRenderer2.setSeriesVisible((int) (short) 1, (java.lang.Boolean) false, true);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) ' ', (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryURLGenerator28);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int int3 = java.awt.Color.HSBtoRGB((float) 100L, (float) '4', (float) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-563) + "'", int3 == (-563));
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        double double0 = org.jfree.chart.axis.CategoryAxis.DEFAULT_CATEGORY_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2d + "'", double0 == 0.2d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_RED;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        double double0 = org.jfree.chart.axis.ValueAxis.DEFAULT_AUTO_RANGE_MINIMUM_SIZE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-8d + "'", double0 == 1.0E-8d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double0 = org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.0d + "'", double0 == 3.0d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) (short) 10, (float) (short) 1, (float) '4');
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test6244() throws Throwable {
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
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Shape shape3 = lineAndShapeRenderer2.getBaseShape();
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = paintList0.getPaint((int) (short) 10);
        org.junit.Assert.assertNull(paint2);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("");
        java.awt.Shape shape2 = legendItem1.getLine();
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        categoryAxis1.setLabelAngle(15.0d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setCategoryLabelPositionOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape19 = renderAttributes16.getItemShape((int) (byte) 10, 35);
        java.awt.Paint paint21 = renderAttributes16.getSeriesPaint((-52));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.awt.Font font0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        org.junit.Assert.assertNotNull(font0);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.awt.Color color2 = java.awt.Color.getColor("java.awt.Color[r=0,g=0,b=255]", 128);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer0.setItemMargin((double) 10.0f);
        double double3 = barRenderer0.getMaximumBarWidth();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator0 = new org.jfree.chart.util.DefaultShadowGenerator();
        int int1 = defaultShadowGenerator0.calculateOffsetX();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.awt.Paint paint0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.lang.Object obj1 = defaultDrawingSupplier0.clone();
        java.awt.Paint paint2 = defaultDrawingSupplier0.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor(10, (int) '#', (int) (byte) 10);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        legendItem1.setURLText("");
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.awt.Color color0 = java.awt.Color.MAGENTA;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.awt.Color color1 = java.awt.Color.getColor("GradientPaintTransformType.CENTER_VERTICAL");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("");
        categoryAxis1.setMinorTickMarksVisible(false);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.chart.renderer.category.BarRenderer.setDefaultShadowsVisible(false);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.ChartColor chartColor17 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel18 = null;
        java.awt.Rectangle rectangle19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.AffineTransform affineTransform21 = null;
        java.awt.RenderingHints renderingHints22 = null;
        java.awt.PaintContext paintContext23 = chartColor17.createContext(colorModel18, rectangle19, rectangle2D20, affineTransform21, renderingHints22);
        java.awt.Color color24 = java.awt.Color.getColor("", (java.awt.Color) chartColor17);
        categoryPlot12.setDomainCrosshairPaint((java.awt.Paint) color24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot12.zoomRangeAxes((double) 100.0f, plotRenderingInfo27, point2D28);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot12.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot12.getDomainAxisEdge((int) (short) 100);
        java.awt.Paint paint34 = categoryPlot12.getRangeGridlinePaint();
        java.awt.Stroke stroke35 = categoryPlot12.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot12.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo38, point2D39);
        float float41 = categoryPlot12.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.axis.AxisLocation axisLocation48 = null;
        categoryPlot46.setRangeAxisLocation(97, axisLocation48, false);
        java.awt.Stroke stroke51 = categoryPlot46.getOutlineStroke();
        boolean boolean52 = categoryPlot46.isDomainZoomable();
        org.jfree.chart.util.SortOrder sortOrder53 = categoryPlot46.getColumnRenderingOrder();
        categoryPlot12.setRowRenderingOrder(sortOrder53);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.data.Range range56 = categoryPlot12.getDataRange(valueAxis55);
        boolean boolean57 = lineAndShapeRenderer2.hasListener((java.util.EventListener) categoryPlot12);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator59 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("");
        lineAndShapeRenderer2.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator59);
        java.lang.Boolean boolean62 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 0);
        boolean boolean64 = lineAndShapeRenderer2.isSeriesItemLabelsVisible(100);
        java.awt.Color color69 = java.awt.Color.getHSBColor((float) '4', (float) (-1L), (float) 33);
        lineAndShapeRenderer2.setSeriesPaint((int) (byte) 10, (java.awt.Paint) color69);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer74 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color78 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer74.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color78);
        java.awt.Paint paint80 = lineAndShapeRenderer74.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator82 = null;
        lineAndShapeRenderer74.setSeriesURLGenerator(97, categoryURLGenerator82, false);
        java.awt.Shape shape88 = lineAndShapeRenderer74.getItemShape(33, (-1), true);
        lineAndShapeRenderer2.setSeriesShape(10, shape88, false);
        java.awt.Paint paint92 = null;
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) 'a', paint92, true);
        java.awt.Font font96 = lineAndShapeRenderer2.getSeriesItemLabelFont(10295828);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sortOrder53);
        org.junit.Assert.assertNull(range56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(color69);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNull(paint80);
        org.junit.Assert.assertNotNull(shape88);
        org.junit.Assert.assertNull(font96);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) (-16777216), (float) 1L, (float) (byte) 100);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel10 = null;
        java.awt.Rectangle rectangle11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.AffineTransform affineTransform13 = null;
        java.awt.RenderingHints renderingHints14 = null;
        java.awt.PaintContext paintContext15 = chartColor9.createContext(colorModel10, rectangle11, rectangle2D12, affineTransform13, renderingHints14);
        java.awt.Color color16 = java.awt.Color.getColor("", (java.awt.Color) chartColor9);
        categoryPlot4.setDomainCrosshairPaint((java.awt.Paint) color16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot4.zoomRangeAxes((double) 100.0f, plotRenderingInfo19, point2D20);
        boolean boolean22 = categoryPlot4.isDomainPannable();
        org.jfree.chart.ChartColor chartColor27 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color28 = chartColor27.darker();
        org.jfree.chart.LegendItem legendItem29 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor27);
        java.lang.String str30 = legendItem29.getToolTipText();
        org.jfree.chart.ChartColor chartColor35 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel36 = null;
        java.awt.Rectangle rectangle37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        java.awt.geom.AffineTransform affineTransform39 = null;
        java.awt.RenderingHints renderingHints40 = null;
        java.awt.PaintContext paintContext41 = chartColor35.createContext(colorModel36, rectangle37, rectangle2D38, affineTransform39, renderingHints40);
        java.awt.Color color42 = java.awt.Color.getColor("", (java.awt.Color) chartColor35);
        legendItem29.setOutlinePaint((java.awt.Paint) chartColor35);
        categoryPlot4.setDomainCrosshairPaint((java.awt.Paint) chartColor35);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color51 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer47.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color51);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator53 = lineAndShapeRenderer47.getBaseToolTipGenerator();
        int int54 = categoryPlot4.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer47);
        org.jfree.chart.ChartColor chartColor60 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color61 = chartColor60.darker();
        org.jfree.chart.LegendItem legendItem62 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor60);
        java.lang.String str63 = legendItem62.getToolTipText();
        legendItem62.setDescription("");
        java.awt.Paint paint66 = legendItem62.getLinePaint();
        org.jfree.data.general.Dataset dataset67 = null;
        legendItem62.setDataset(dataset67);
        java.awt.Paint paint69 = legendItem62.getFillPaint();
        lineAndShapeRenderer47.setSeriesOutlinePaint((int) (short) 1, paint69, false);
        java.awt.Paint paint73 = lineAndShapeRenderer47.lookupLegendTextPaint(0);
        java.awt.Shape shape77 = lineAndShapeRenderer47.getItemShape((int) (byte) 0, (int) (short) 100, false);
        org.jfree.chart.entity.ChartEntity chartEntity78 = new org.jfree.chart.entity.ChartEntity(shape77);
        java.lang.String str79 = chartEntity78.getShapeCoords();
        java.lang.String str80 = chartEntity78.getShapeCoords();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(paintContext41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNull(categoryToolTipGenerator53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNull(paint73);
        org.junit.Assert.assertNotNull(shape77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "-3,-3,3,3" + "'", str79, "-3,-3,3,3");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "-3,-3,3,3" + "'", str80, "-3,-3,3,3");
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, false);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        categoryAxis1.configure();
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.awt.Color color1 = java.awt.Color.getColor("SortOrder.ASCENDING");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.awt.Color color2 = java.awt.Color.getColor("ItemLabelAnchor.OUTSIDE6", (int) '4');
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("NOID");
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE8;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.awt.Color color2 = java.awt.Color.getColor("", 3);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Shape shape16 = renderAttributes13.getSeriesShape((-1));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        lineAndShapeRenderer19.setSeriesToolTipGenerator(10, categoryToolTipGenerator23);
        boolean boolean25 = lineAndShapeRenderer19.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke27 = null;
        lineAndShapeRenderer19.setSeriesStroke((int) 'a', stroke27, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor31 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color32 = java.awt.Color.yellow;
        boolean boolean33 = itemLabelAnchor31.equals((java.lang.Object) color32);
        lineAndShapeRenderer19.setSeriesFillPaint((int) ' ', (java.awt.Paint) color32);
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color32);
        java.awt.Color color37 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        renderAttributes13.setSeriesPaint(4, (java.awt.Paint) color37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean41 = renderAttributes13.getCreateEntity(11, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(color37);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateLeftOutset(0.2d);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float10 = categoryAxis9.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis9, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = categoryPlot21.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis24 = lineAndShapeRenderer2.getRangeAxis(categoryPlot21, (int) '4');
        boolean boolean25 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder26 = categoryPlot21.getDatasetRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot21.zoomDomainAxes(1.0d, (double) (-1L), plotRenderingInfo29, point2D30);
        categoryPlot21.setDomainCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        categoryPlot21.setRangeAxis(100, valueAxis35);
        categoryPlot21.setRangeMinorGridlinesVisible(false);
        categoryPlot21.clearAnnotations();
        java.awt.Stroke stroke40 = categoryPlot21.getOutlineStroke();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.CENTER;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Stroke stroke23 = lineAndShapeRenderer19.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = categoryPlot38.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis41 = lineAndShapeRenderer19.getRangeAxis(categoryPlot38, (int) '4');
        double double42 = categoryPlot38.getRangeCrosshairValue();
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot38);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray44 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot38.setDomainAxes(categoryAxisArray44);
        categoryPlot38.setDomainGridlinesVisible(true);
        java.awt.Color color48 = java.awt.Color.BLUE;
        int int49 = color48.getRed();
        categoryPlot38.setRangeCrosshairPaint((java.awt.Paint) color48);
        boolean boolean51 = categoryPlot38.isSubplot();
        float float52 = categoryPlot38.getBackgroundImageAlpha();
        categoryPlot38.clearSelection();
        categoryPlot38.setRangeCrosshairValue(2.0d, false);
        boolean boolean57 = categoryPlot38.isRangeGridlinesVisible();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertNotNull(categoryItemRenderer39);
        org.junit.Assert.assertNull(valueAxis41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(categoryAxisArray44);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.5f + "'", float52 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 50, false);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 4, 16.0d, (double) (byte) 1, (-16.0d));
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.awt.Color color0 = java.awt.Color.RED;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets(43.0d, (-32.0d), (double) 1.0f, 0.0d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.awt.Color color1 = java.awt.Color.getColor("");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_GREEN;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("ChartEntity: tooltip = ");
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.awt.Color color0 = java.awt.Color.CYAN;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("java.awt.Color[r=255,g=255,b=255]");
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("GradientPaintTransformType.HORIZONTAL");
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 2.0f, 104.0d, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.ChartColor chartColor17 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel18 = null;
        java.awt.Rectangle rectangle19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.AffineTransform affineTransform21 = null;
        java.awt.RenderingHints renderingHints22 = null;
        java.awt.PaintContext paintContext23 = chartColor17.createContext(colorModel18, rectangle19, rectangle2D20, affineTransform21, renderingHints22);
        java.awt.Color color24 = java.awt.Color.getColor("", (java.awt.Color) chartColor17);
        categoryPlot12.setDomainCrosshairPaint((java.awt.Paint) color24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot12.zoomRangeAxes((double) 100.0f, plotRenderingInfo27, point2D28);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot12.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot12.getDomainAxisEdge((int) (short) 100);
        java.awt.Paint paint34 = categoryPlot12.getRangeGridlinePaint();
        java.awt.Stroke stroke35 = categoryPlot12.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot12.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo38, point2D39);
        float float41 = categoryPlot12.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.axis.AxisLocation axisLocation48 = null;
        categoryPlot46.setRangeAxisLocation(97, axisLocation48, false);
        java.awt.Stroke stroke51 = categoryPlot46.getOutlineStroke();
        boolean boolean52 = categoryPlot46.isDomainZoomable();
        org.jfree.chart.util.SortOrder sortOrder53 = categoryPlot46.getColumnRenderingOrder();
        categoryPlot12.setRowRenderingOrder(sortOrder53);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.data.Range range56 = categoryPlot12.getDataRange(valueAxis55);
        boolean boolean57 = lineAndShapeRenderer2.hasListener((java.util.EventListener) categoryPlot12);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator59 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("");
        lineAndShapeRenderer2.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator59);
        java.lang.Boolean boolean62 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 0);
        boolean boolean64 = lineAndShapeRenderer2.isSeriesItemLabelsVisible(100);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        java.awt.Paint paint67 = lineAndShapeRenderer2.getBaseOutlinePaint();
        java.awt.Paint paint68 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.renderer.RenderAttributes renderAttributes69 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape70 = renderAttributes69.getDefaultShape();
        java.awt.Stroke stroke72 = renderAttributes69.getSeriesStroke((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean74 = renderAttributes69.getSeriesLabelVisible((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sortOrder53);
        org.junit.Assert.assertNull(range56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNull(paint68);
        org.junit.Assert.assertNotNull(renderAttributes69);
        org.junit.Assert.assertNull(shape70);
        org.junit.Assert.assertNull(stroke72);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("java.awt.Color[r=192,g=192,b=0]");
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("CategoryAnchor.MIDDLE");
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setBaseSeriesVisible(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.awt.Color color1 = java.awt.Color.getColor("{0}");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) (-12517568), false);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) (-10.0d), false);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) (short) -1);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 15);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 10.0f, false);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.awt.Color color0 = org.jfree.chart.ChartColor.DARK_GREEN;
        int int1 = color0.getAlpha();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 1L, true);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.chart.util.BooleanList booleanList0 = new org.jfree.chart.util.BooleanList();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot15);
        org.jfree.chart.JFreeChart jFreeChart17 = plotChangeEvent16.getChart();
        java.lang.Object obj18 = plotChangeEvent16.getSource();
        org.jfree.chart.plot.Plot plot19 = plotChangeEvent16.getPlot();
        boolean boolean20 = booleanList0.equals((java.lang.Object) plotChangeEvent16);
        java.lang.Object obj21 = booleanList0.clone();
        java.lang.Boolean boolean23 = booleanList0.getBoolean((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNull(jFreeChart17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("rect");
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) (short) 1);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 10);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.awt.Color color1 = java.awt.Color.getColor("hi!");
        org.junit.Assert.assertNull(color1);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = keyedObjects2D0.getRowKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1L);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ItemLabelAnchor.OUTSIDE5" + "'", str1, "ItemLabelAnchor.OUTSIDE5");
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryPlot14.canSelectByPoint();
        java.awt.Color color17 = java.awt.Color.BLUE;
        int int18 = color17.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator22 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color17, (float) 1L, 10, (double) 0L);
        double double23 = defaultShadowGenerator22.getAngle();
        categoryPlot14.setShadowGenerator((org.jfree.chart.util.ShadowGenerator) defaultShadowGenerator22);
        int int25 = defaultShadowGenerator22.calculateOffsetX();
        double double26 = defaultShadowGenerator22.getAngle();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = null;
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis17, categoryItemRenderer18);
        org.jfree.chart.ChartColor chartColor24 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel25 = null;
        java.awt.Rectangle rectangle26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.AffineTransform affineTransform28 = null;
        java.awt.RenderingHints renderingHints29 = null;
        java.awt.PaintContext paintContext30 = chartColor24.createContext(colorModel25, rectangle26, rectangle2D27, affineTransform28, renderingHints29);
        java.awt.Color color31 = java.awt.Color.getColor("", (java.awt.Color) chartColor24);
        categoryPlot19.setDomainCrosshairPaint((java.awt.Paint) color31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        categoryPlot19.removeChangeListener(plotChangeListener33);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer36 = categoryPlot19.getRenderer(97);
        org.jfree.chart.plot.Plot plot37 = categoryPlot19.getParent();
        double double38 = categoryPlot19.getAnchorValue();
        lineAndShapeRenderer2.setPlot(categoryPlot19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator40);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.ChartColor chartColor51 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel52 = null;
        java.awt.Rectangle rectangle53 = null;
        java.awt.geom.Rectangle2D rectangle2D54 = null;
        java.awt.geom.AffineTransform affineTransform55 = null;
        java.awt.RenderingHints renderingHints56 = null;
        java.awt.PaintContext paintContext57 = chartColor51.createContext(colorModel52, rectangle53, rectangle2D54, affineTransform55, renderingHints56);
        java.awt.Color color58 = java.awt.Color.getColor("", (java.awt.Color) chartColor51);
        categoryPlot46.setDomainCrosshairPaint((java.awt.Paint) color58);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo61 = null;
        java.awt.geom.Point2D point2D62 = null;
        categoryPlot46.zoomRangeAxes((double) 100.0f, plotRenderingInfo61, point2D62);
        org.jfree.chart.axis.CategoryAxis categoryAxis65 = categoryPlot46.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge67 = categoryPlot46.getDomainAxisEdge((int) (short) 100);
        java.awt.Paint paint68 = categoryPlot46.getRangeGridlinePaint();
        java.awt.Stroke stroke69 = categoryPlot46.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo72 = null;
        java.awt.geom.Point2D point2D73 = null;
        categoryPlot46.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo72, point2D73);
        boolean boolean75 = categoryPlot46.canSelectByRegion();
        java.util.List list76 = categoryPlot46.getAnnotations();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent77 = null;
        categoryPlot46.notifyListeners(plotChangeEvent77);
        lineAndShapeRenderer2.setPlot(categoryPlot46);
        org.jfree.chart.plot.PlotOrientation plotOrientation80 = categoryPlot46.getOrientation();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paintContext30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(categoryItemRenderer36);
        org.junit.Assert.assertNull(plot37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(paintContext57);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNull(categoryAxis65);
        org.junit.Assert.assertNotNull(rectangleEdge67);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(plotOrientation80);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        java.awt.Paint[] paintArray0 = new java.awt.Paint[] {};
        java.awt.Paint[] paintArray1 = new java.awt.Paint[] {};
        java.awt.Paint paint2 = null;
        java.awt.Paint[] paintArray3 = new java.awt.Paint[] { paint2 };
        java.awt.Stroke[] strokeArray4 = new java.awt.Stroke[] {};
        java.awt.Stroke stroke5 = null;
        java.awt.Stroke[] strokeArray6 = new java.awt.Stroke[] { stroke5 };
        java.awt.Shape shape7 = null;
        java.awt.Shape[] shapeArray8 = new java.awt.Shape[] { shape7 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier9 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, paintArray3, strokeArray4, strokeArray6, shapeArray8);
        org.jfree.chart.ChartColor chartColor13 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color14 = chartColor13.brighter();
        org.jfree.chart.ChartColor chartColor18 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color19 = chartColor18.brighter();
        org.jfree.chart.ChartColor chartColor23 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        org.jfree.chart.ChartColor chartColor27 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color28 = chartColor27.brighter();
        java.awt.Paint[] paintArray29 = new java.awt.Paint[] { color14, color19, chartColor23, chartColor27 };
        java.awt.Stroke[] strokeArray30 = null;
        java.awt.Stroke stroke31 = null;
        java.awt.Stroke[] strokeArray32 = new java.awt.Stroke[] { stroke31 };
        java.awt.Shape[] shapeArray33 = null;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier34 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray1, paintArray29, strokeArray30, strokeArray32, shapeArray33);
        java.awt.Paint paint35 = defaultDrawingSupplier34.getNextOutlinePaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color42 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer38.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color42);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = lineAndShapeRenderer38.getBaseToolTipGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = null;
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer49 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot(categoryDataset46, categoryAxis47, valueAxis48, categoryItemRenderer49);
        org.jfree.chart.ChartColor chartColor55 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel56 = null;
        java.awt.Rectangle rectangle57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        java.awt.geom.AffineTransform affineTransform59 = null;
        java.awt.RenderingHints renderingHints60 = null;
        java.awt.PaintContext paintContext61 = chartColor55.createContext(colorModel56, rectangle57, rectangle2D58, affineTransform59, renderingHints60);
        java.awt.Color color62 = java.awt.Color.getColor("", (java.awt.Color) chartColor55);
        categoryPlot50.setDomainCrosshairPaint((java.awt.Paint) color62);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo65 = null;
        java.awt.geom.Point2D point2D66 = null;
        categoryPlot50.zoomRangeAxes((double) 100.0f, plotRenderingInfo65, point2D66);
        org.jfree.chart.axis.CategoryAxis categoryAxis69 = categoryPlot50.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge71 = categoryPlot50.getDomainAxisEdge((int) (short) 100);
        java.lang.String str72 = categoryPlot50.getPlotType();
        org.jfree.data.KeyedObject keyedObject73 = new org.jfree.data.KeyedObject((java.lang.Comparable) 100L, (java.lang.Object) categoryPlot50);
        org.jfree.data.category.CategoryDataset categoryDataset74 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis75 = lineAndShapeRenderer38.getDomainAxis(categoryPlot50, categoryDataset74);
        lineAndShapeRenderer38.removeAnnotations();
        lineAndShapeRenderer38.setSeriesShapesFilled((int) (short) 1, (java.lang.Boolean) true);
        boolean boolean80 = defaultDrawingSupplier34.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint81 = defaultDrawingSupplier34.getNextPaint();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(strokeArray4);
        org.junit.Assert.assertNotNull(strokeArray6);
        org.junit.Assert.assertNotNull(shapeArray8);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(paintArray29);
        org.junit.Assert.assertNotNull(strokeArray32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNull(categoryToolTipGenerator44);
        org.junit.Assert.assertNotNull(paintContext61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNull(categoryAxis69);
        org.junit.Assert.assertNotNull(rectangleEdge71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Category Plot" + "'", str72, "Category Plot");
        org.junit.Assert.assertNull(categoryAxis75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer8.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis3, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        org.jfree.chart.axis.AxisLocation axisLocation16 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot15.setRangeAxisLocation(axisLocation16);
        categoryPlot15.configureDomainAxes();
        categoryPlot15.setBackgroundImageAlpha((float) 0);
        boolean boolean21 = categoryPlot15.isRangeZoomable();
        org.jfree.data.KeyedObject keyedObject22 = new org.jfree.data.KeyedObject((java.lang.Comparable) "ItemLabelAnchor.INSIDE10", (java.lang.Object) boolean21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        categoryAxis25.setUpperMargin(10.0d);
        org.jfree.chart.util.ObjectList objectList41 = new org.jfree.chart.util.ObjectList(8);
        int int43 = objectList41.indexOf((java.lang.Object) "hi!");
        boolean boolean44 = categoryAxis25.equals((java.lang.Object) objectList41);
        java.lang.Object obj46 = objectList41.get((int) (byte) 1);
        org.jfree.chart.axis.CategoryAxis categoryAxis48 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj49 = categoryAxis48.clone();
        java.awt.Font font50 = categoryAxis48.getTickLabelFont();
        java.awt.Paint paint51 = categoryAxis48.getLabelPaint();
        java.awt.Stroke stroke52 = categoryAxis48.getAxisLineStroke();
        int int53 = objectList41.indexOf((java.lang.Object) stroke52);
        java.lang.Object obj55 = objectList41.get(192);
        keyedObject22.setObject((java.lang.Object) objectList41);
        org.jfree.chart.util.StrokeList strokeList57 = new org.jfree.chart.util.StrokeList();
        keyedObject22.setObject((java.lang.Object) strokeList57);
        java.lang.Object obj59 = strokeList57.clone();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(obj59);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = null;
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis10, categoryItemRenderer11);
        org.jfree.chart.ChartColor chartColor17 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel18 = null;
        java.awt.Rectangle rectangle19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.AffineTransform affineTransform21 = null;
        java.awt.RenderingHints renderingHints22 = null;
        java.awt.PaintContext paintContext23 = chartColor17.createContext(colorModel18, rectangle19, rectangle2D20, affineTransform21, renderingHints22);
        java.awt.Color color24 = java.awt.Color.getColor("", (java.awt.Color) chartColor17);
        categoryPlot12.setDomainCrosshairPaint((java.awt.Paint) color24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot12.zoomRangeAxes((double) 100.0f, plotRenderingInfo27, point2D28);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = categoryPlot12.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge33 = categoryPlot12.getDomainAxisEdge((int) (short) 100);
        java.awt.Paint paint34 = categoryPlot12.getRangeGridlinePaint();
        java.awt.Stroke stroke35 = categoryPlot12.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        java.awt.geom.Point2D point2D39 = null;
        categoryPlot12.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo38, point2D39);
        float float41 = categoryPlot12.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis43 = null;
        org.jfree.chart.axis.ValueAxis valueAxis44 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer45 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot(categoryDataset42, categoryAxis43, valueAxis44, categoryItemRenderer45);
        org.jfree.chart.axis.AxisLocation axisLocation48 = null;
        categoryPlot46.setRangeAxisLocation(97, axisLocation48, false);
        java.awt.Stroke stroke51 = categoryPlot46.getOutlineStroke();
        boolean boolean52 = categoryPlot46.isDomainZoomable();
        org.jfree.chart.util.SortOrder sortOrder53 = categoryPlot46.getColumnRenderingOrder();
        categoryPlot12.setRowRenderingOrder(sortOrder53);
        org.jfree.chart.axis.ValueAxis valueAxis55 = null;
        org.jfree.data.Range range56 = categoryPlot12.getDataRange(valueAxis55);
        boolean boolean57 = lineAndShapeRenderer2.hasListener((java.util.EventListener) categoryPlot12);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator59 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("");
        lineAndShapeRenderer2.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator59);
        java.lang.Boolean boolean62 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(sortOrder53);
        org.junit.Assert.assertNull(range56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(boolean62);
        org.junit.Assert.assertNotNull(itemLabelPosition63);
    }
}
