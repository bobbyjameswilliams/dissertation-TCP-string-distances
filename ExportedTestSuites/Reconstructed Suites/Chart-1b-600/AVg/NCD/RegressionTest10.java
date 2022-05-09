package org.jfree.chart.renderer.category;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint14 = barRenderer0.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = barRenderer0.getToolTipGenerator((int) '4', (int) (byte) 10, false);
        barRenderer0.setSeriesItemLabelsVisible((int) '#', true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.text.AttributedString attributedString0 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Shape shape9 = lineAndShapeRenderer6.getBaseShape();
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color11 = java.awt.Color.BLUE;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.LegendItem legendItem12 = new org.jfree.chart.LegendItem(attributedString0, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]", "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]", "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]", shape9, stroke10, (java.awt.Paint) color11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryAxis2.isVisible();
        categoryAxis2.setCategoryLabelPositionOffset(10);
        categoryAxis2.setLabelAngle(104.0d);
        categoryAxis2.setCategoryMargin((-10.0d));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        lineAndShapeRenderer2.setUseFillPaint(true);
        java.awt.Stroke stroke26 = lineAndShapeRenderer2.lookupSeriesOutlineStroke((int) (byte) 10);
        java.awt.Paint paint28 = lineAndShapeRenderer2.getSeriesFillPaint((int) '#');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNull(categoryURLGenerator29);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            legendItemCollection15.addAll(legendItemCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        int int9 = defaultShadowGenerator6.calculateOffsetY();
        java.awt.image.BufferedImage bufferedImage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage11 = defaultShadowGenerator6.createDropShadow(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        lineAndShapeRenderer2.setUseOutlinePaint(true);
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.Marker marker21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D18, categoryPlot19, valueAxis20, marker21, rectangle2D22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint18 = null;
        renderAttributes16.setSeriesFillPaint(10284987, paint18);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        boolean boolean26 = lineAndShapeRenderer2.isItemLabelVisible(0, (int) (byte) -1, true);
        double double27 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        lineAndShapeRenderer2.setBaseSeriesVisible(true, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.0d + "'", double27 == 2.0d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        int int5 = defaultCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.setValue((double) ' ', (java.lang.Comparable) "AxisLocation.BOTTOM_OR_RIGHT", (java.lang.Comparable) 104.0d);
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeRow((java.lang.Comparable) "ItemLabelAnchor.INSIDE10");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (ItemLabelAnchor.INSIDE10) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        java.awt.Paint paint32 = lineAndShapeRenderer2.lookupSeriesPaint((int) (short) -1);
        lineAndShapeRenderer2.setBaseShapesVisible(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator35, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setIncludeBaseInRange(false);
        barRenderer0.setBaseSeriesVisibleInLegend(false, true);
        double double19 = barRenderer0.getItemMargin();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = null;
        barRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset((double) 'a');
        double double10 = rectangleInsets4.calculateBottomOutset((double) 100);
        java.lang.Object obj11 = null;
        boolean boolean12 = rectangleInsets4.equals(obj11);
        double double14 = rectangleInsets4.calculateBottomOutset((double) 100.0f);
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D16 = rectangleInsets4.createInsetRectangle(rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState14 = lineAndShapeRenderer2.createState(plotRenderingInfo13);
        java.awt.Shape shape15 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Paint paint19 = lineAndShapeRenderer2.getItemPaint((int) (short) 0, (int) (short) 100, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(categoryItemRendererState14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = lineAndShapeRenderer7.getSeriesToolTipGenerator(255);
        double double17 = lineAndShapeRenderer7.getItemLabelAnchorOffset();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 2.0d + "'", double17 == 2.0d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        java.awt.Stroke stroke6 = categoryAxis1.getAxisLineStroke();
        java.awt.Stroke stroke7 = categoryAxis1.getAxisLineStroke();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 100);
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = categoryAxis1.getCategoryLabelToolTip(comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Shape shape23 = lineAndShapeRenderer20.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape23);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator25);
        boolean boolean27 = lineAndShapeRenderer2.getUseSeriesOffset();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        java.awt.Paint[] paintArray5 = new java.awt.Paint[] {};
        java.awt.Paint[] paintArray6 = new java.awt.Paint[] {};
        java.awt.Paint paint7 = null;
        java.awt.Paint[] paintArray8 = new java.awt.Paint[] { paint7 };
        java.awt.Stroke[] strokeArray9 = new java.awt.Stroke[] {};
        java.awt.Stroke stroke10 = null;
        java.awt.Stroke[] strokeArray11 = new java.awt.Stroke[] { stroke10 };
        java.awt.Shape shape12 = null;
        java.awt.Shape[] shapeArray13 = new java.awt.Shape[] { shape12 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier14 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray5, paintArray6, paintArray8, strokeArray9, strokeArray11, shapeArray13);
        boolean boolean15 = rectangleInsets4.equals((java.lang.Object) defaultDrawingSupplier14);
        java.awt.Paint paint16 = defaultDrawingSupplier14.getNextOutlinePaint();
        java.lang.Object obj17 = defaultDrawingSupplier14.clone();
        java.awt.Shape shape18 = defaultDrawingSupplier14.getNextShape();
        java.lang.Object obj19 = defaultDrawingSupplier14.clone();
        org.junit.Assert.assertNotNull(paintArray5);
        org.junit.Assert.assertNotNull(paintArray6);
        org.junit.Assert.assertNotNull(paintArray8);
        org.junit.Assert.assertNotNull(strokeArray9);
        org.junit.Assert.assertNotNull(strokeArray11);
        org.junit.Assert.assertNotNull(shapeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 0);
        boolean boolean23 = lineAndShapeRenderer2.isItemLabelVisible(5, 255, true);
        java.awt.Paint paint27 = lineAndShapeRenderer2.getItemFillPaint(192, (-254), true);
        lineAndShapeRenderer2.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        boolean boolean8 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation7);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer11.setBaseURLGenerator(categoryURLGenerator12);
        java.awt.Shape shape15 = lineAndShapeRenderer11.getLegendShape(0);
        lineAndShapeRenderer11.setAutoPopulateSeriesStroke(false);
        java.awt.Font font19 = lineAndShapeRenderer11.getSeriesItemLabelFont(0);
        java.awt.Paint paint21 = lineAndShapeRenderer11.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = lineAndShapeRenderer11.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition22);
        java.awt.Stroke stroke25 = lineAndShapeRenderer2.getSeriesStroke(0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(font19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNull(stroke25);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = lineAndShapeRenderer7.getBaseShapesFilled();
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer7.getSelectedItemAttributes();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(renderAttributes16);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator23, true);
        boolean boolean28 = lineAndShapeRenderer2.getItemVisible((int) '#', 0);
        int int29 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator11, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = lineAndShapeRenderer2.getPlot();
        lineAndShapeRenderer2.setSeriesVisible(4, (java.lang.Boolean) true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryPlot14);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 100, false);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.axis.AxisLocation axisLocation16 = null;
        categoryPlot14.setRangeAxisLocation(97, axisLocation16, false);
        java.awt.Stroke stroke19 = categoryPlot14.getOutlineStroke();
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot14);
        java.awt.Stroke stroke21 = categoryPlot14.getRangeZeroBaselineStroke();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Color color8 = java.awt.Color.GRAY;
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator12 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 0, color8, 1.0f, (-1), 10.0d);
        lineAndShapeRenderer2.setSeriesPaint(0, (java.awt.Paint) color8, false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisible((-10), (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray2 = unknownKeyException1.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException4 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException4);
        org.jfree.data.UnknownKeyException unknownKeyException7 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray8 = unknownKeyException7.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException10 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException7.addSuppressed((java.lang.Throwable) unknownKeyException10);
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException7);
        org.jfree.data.UnknownKeyException unknownKeyException14 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.jfree.data.UnknownKeyException unknownKeyException16 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.ChartChangeEvent[source=1]");
        unknownKeyException14.addSuppressed((java.lang.Throwable) unknownKeyException16);
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException14);
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            unknownKeyException14.addSuppressed(throwable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) 'a');
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 0, (java.lang.Boolean) false);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        float float9 = defaultShadowGenerator6.getShadowOpacity();
        java.awt.image.BufferedImage bufferedImage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage11 = defaultShadowGenerator6.createDropShadow(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.ChartColor chartColor15 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color16 = chartColor15.darker();
        org.jfree.chart.LegendItem legendItem17 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor15);
        org.jfree.chart.LegendItem legendItem18 = new org.jfree.chart.LegendItem("", (java.awt.Paint) chartColor15);
        java.lang.String str19 = legendItem18.getURLText();
        legendItemCollection9.add(legendItem18);
        legendItem18.setSeriesIndex((-10411212));
        legendItem18.setDescription("org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = lineAndShapeRenderer2.getToolTipGenerator((int) ' ', (int) (short) 1, true);
        boolean boolean22 = lineAndShapeRenderer2.isItemLabelVisible((int) (short) 100, 10284987, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        java.awt.Font font19 = lineAndShapeRenderer2.getItemLabelFont((int) (short) 0, 0, false);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator21 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator21);
        java.awt.Paint paint24 = lineAndShapeRenderer2.lookupSeriesFillPaint(15);
        boolean boolean25 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        boolean boolean19 = lineAndShapeRenderer2.isSeriesVisible((int) (short) 100);
        java.awt.Stroke stroke21 = lineAndShapeRenderer2.getSeriesOutlineStroke((-16776961));
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, false);
        lineAndShapeRenderer2.setBaseCreateEntities(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(stroke21);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (byte) 10, categoryToolTipGenerator18, true);
        boolean boolean21 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        java.awt.Stroke stroke23 = lineAndShapeRenderer2.getSeriesStroke(100);
        lineAndShapeRenderer2.setSeriesShapesFilled((int) (short) 10, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(stroke23);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint18 = renderAttributes16.getSeriesOutlinePaint(97);
        java.awt.Stroke stroke19 = renderAttributes16.getDefaultOutlineStroke();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNull(stroke19);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        java.awt.Paint paint31 = lineAndShapeRenderer2.getBasePaint();
        java.lang.Boolean boolean33 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(1);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Color color15 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color15);
        java.awt.Paint paint19 = renderAttributes13.getItemFillPaint((int) (short) 1, 11);
        java.awt.Paint paint22 = renderAttributes13.getItemPaint((-16776961), 2);
        renderAttributes13.setDefaultLabelVisible((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        java.lang.Boolean boolean18 = lineAndShapeRenderer2.getSeriesShapesVisible(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 0, categoryURLGenerator20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        boolean boolean25 = lineAndShapeRenderer2.getItemCreateEntity((int) (byte) 100, (int) (byte) -1, true);
        lineAndShapeRenderer2.setSeriesVisible(500, (java.lang.Boolean) true, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
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
        java.awt.Font font29 = lineAndShapeRenderer2.getSeriesItemLabelFont((int) (byte) 0);
        int int30 = lineAndShapeRenderer2.getRowCount();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNull(font29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer17.setBaseURLGenerator(categoryURLGenerator18);
        java.awt.Paint paint21 = lineAndShapeRenderer17.getSeriesOutlinePaint(0);
        java.awt.Font font22 = lineAndShapeRenderer17.getBaseItemLabelFont();
        java.awt.Shape shape24 = lineAndShapeRenderer17.lookupSeriesShape(2);
        lineAndShapeRenderer2.setBaseShape(shape24, false);
        java.awt.Paint paint28 = lineAndShapeRenderer2.lookupSeriesFillPaint((-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        java.awt.Stroke stroke24 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) ' ');
        boolean boolean25 = lineAndShapeRenderer2.getUseSeriesOffset();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator15 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        boolean boolean17 = standardCategorySeriesLabelGenerator15.equals((java.lang.Object) 100L);
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator19);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = lineAndShapeRenderer2.getDrawingSupplier();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(drawingSupplier17);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        boolean boolean21 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation20);
        java.lang.Boolean boolean23 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (byte) 1);
        boolean boolean24 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        boolean boolean22 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = lineAndShapeRenderer2.getToolTipGenerator(0, 52, true);
        java.awt.Paint paint26 = lineAndShapeRenderer2.getItemPaint((int) (byte) -1, (int) (short) 0, true);
        java.awt.Paint paint27 = lineAndShapeRenderer2.getBaseFillPaint();
        java.awt.Shape shape31 = lineAndShapeRenderer2.getItemShape(10284987, (-16777216), false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(shape31);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesVisible(0);
        java.awt.Stroke stroke28 = lineAndShapeRenderer2.getItemOutlineStroke(0, 0, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        int int25 = color22.getAlpha();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 255 + "'", int25 == 255);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryAxis2.isVisible();
        categoryAxis2.setCategoryLabelPositionOffset((int) (short) 10);
        categoryAxis2.setMinorTickMarkInsideLength((float) (-16776961));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        double double4 = rectangleInsets0.trimWidth((double) '#');
        double double6 = rectangleInsets0.calculateLeftInset((double) 0.0f);
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D10 = rectangleInsets0.createAdjustedRectangle(rectangle2D7, lengthAdjustmentType8, lengthAdjustmentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 29.0d + "'", double4 == 29.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = categoryPlot4.getDomainAxis();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis20);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        org.jfree.chart.plot.Marker marker9 = null;
        boolean boolean10 = categoryPlot4.removeDomainMarker(marker9);
        categoryPlot4.setRangeGridlinesVisible(false);
        java.awt.Paint paint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeZeroBaselinePaint(paint13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        lineAndShapeRenderer2.setDrawOutlines(false);
        double double21 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = lineAndShapeRenderer2.getPlot();
        lineAndShapeRenderer2.setSeriesVisibleInLegend(5, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
        org.junit.Assert.assertNull(categoryPlot22);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = barRenderer0.getNegativeItemLabelPositionFallback();
        barRenderer0.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = barRenderer0.getSeriesToolTipGenerator((-16777206));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        java.awt.Stroke stroke31 = lineAndShapeRenderer2.getBaseOutlineStroke();
        lineAndShapeRenderer2.setSeriesCreateEntities(128, (java.lang.Boolean) false, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        java.lang.Object obj2 = categoryAxis1.clone();
        boolean boolean3 = categoryAxis1.isVisible();
        java.awt.Paint paint5 = categoryAxis1.getTickLabelPaint((java.lang.Comparable) "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double12 = rectangleInsets10.trimWidth((double) (-10289251));
        double double14 = rectangleInsets10.calculateTopOutset(0.0d);
        double double16 = rectangleInsets10.calculateTopOutset((double) 100.0f);
        double double18 = rectangleInsets10.extendWidth((double) (byte) 1);
        categoryAxis1.setLabelInsets(rectangleInsets10, true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0289271E7d) + "'", double12 == (-1.0289271E7d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 21.0d + "'", double18 == 21.0d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) 'a');
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 0, (java.lang.Boolean) false);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator23);
        java.awt.Paint paint26 = lineAndShapeRenderer2.getSeriesItemLabelPaint((int) '4');
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(97, false);
        java.awt.Font font33 = lineAndShapeRenderer2.getItemLabelFont((int) '#', 100, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(font33);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getSeriesPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(false);
        java.awt.Paint paint25 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator26);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator29);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        int int17 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator20);
        java.awt.Font font22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        lineAndShapeRenderer2.setBaseLegendTextFont(font22);
        java.awt.Paint paint24 = lineAndShapeRenderer2.getBasePaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(categoryURLGenerator18);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
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
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        java.lang.Boolean boolean25 = lineAndShapeRenderer2.getSeriesVisible(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        keyedObjects0.addObject((java.lang.Comparable) 0L, (java.lang.Object) axisLocation2);
        keyedObjects0.clear();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = new org.jfree.chart.LegendItemCollection();
        java.util.Iterator iterator8 = legendItemCollection7.iterator();
        java.lang.Object obj9 = null;
        boolean boolean10 = legendItemCollection7.equals(obj9);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects0.insertValue(15, (java.lang.Comparable) 6.00000001d, (java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        boolean boolean11 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getURLGenerator(0, 24, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10295828, categoryToolTipGenerator17, false);
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.awt.Paint paint22 = lineAndShapeRenderer2.getSeriesPaint((int) '#');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesCreateEntities(10);
        boolean boolean17 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Shape shape11 = lineAndShapeRenderer8.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity13 = new org.jfree.chart.entity.ChartEntity(shape11, "");
        legendItem1.setShape(shape11);
        org.jfree.chart.entity.ChartEntity chartEntity17 = new org.jfree.chart.entity.ChartEntity(shape11, "ItemLabelAnchor.OUTSIDE6", "ChartChangeEventType.GENERAL");
        java.awt.Shape shape18 = chartEntity17.getArea();
        org.jfree.chart.entity.ChartEntity chartEntity21 = new org.jfree.chart.entity.ChartEntity(shape18, "AxisLocation.BOTTOM_OR_RIGHT", "java.awt.Color[r=255,g=255,b=0]");
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
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
        java.awt.Stroke stroke31 = lineAndShapeRenderer2.getItemStroke(1, (int) (byte) 1, false);
        java.lang.Boolean boolean33 = lineAndShapeRenderer2.getSeriesVisibleInLegend((-10411212));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(boolean33);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) 'a');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer2.getItemLabelGenerator(24, (int) (short) 100, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        boolean boolean17 = lineAndShapeRenderer2.isSeriesVisibleInLegend(3);
        java.lang.Boolean boolean19 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(15);
        boolean boolean21 = lineAndShapeRenderer2.isSeriesVisibleInLegend(3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (byte) 1, categoryToolTipGenerator23);
        java.awt.Paint paint26 = lineAndShapeRenderer2.lookupSeriesPaint((int) ' ');
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        boolean boolean3 = barRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.BarRenderer barRenderer5 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean6 = barRenderer5.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer9.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer9.getBaseNegativeItemLabelPosition();
        barRenderer5.setNegativeItemLabelPositionFallback(itemLabelPosition16);
        barRenderer0.setSeriesPositiveItemLabelPosition(50, itemLabelPosition16, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getSeriesPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        boolean boolean23 = lineAndShapeRenderer2.getUseSeriesOffset();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition(1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        int int20 = lineAndShapeRenderer2.getPassCount();
        java.awt.Stroke stroke24 = lineAndShapeRenderer2.getItemOutlineStroke(10, (-10), true);
        java.lang.Object obj25 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean15 = renderAttributes13.getSeriesLabelVisible((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesCreateEntities(10);
        boolean boolean17 = lineAndShapeRenderer2.getAutoPopulateSeriesShape();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = lineAndShapeRenderer2.getPlot();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryPlot18);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        java.awt.Paint paint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseFillPaint(paint21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) "TextAnchor.BOTTOM_CENTER");
        int int11 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 0.2d);
        java.util.List list12 = keyedObjects2D0.getRowKeys();
        java.lang.Comparable comparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn(comparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            renderAttributes13.setSeriesLabelPaint((int) (short) 1, paint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Stroke stroke33 = lineAndShapeRenderer2.getItemStroke(9, 10, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        java.awt.Color color15 = org.jfree.chart.ChartColor.LIGHT_YELLOW;
        barRenderer0.setSeriesFillPaint(3, (java.awt.Paint) color15, true);
        barRenderer0.setShadowYOffset((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color17 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem13.setLinePaint((java.awt.Paint) color17);
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color17);
        java.lang.Object obj20 = lineAndShapeRenderer2.clone();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = lineAndShapeRenderer2.getSeriesToolTipGenerator((-1656));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesLinesVisible(0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = lineAndShapeRenderer2.getItemLabelGenerator(0, (int) (short) 1, true);
        boolean boolean19 = lineAndShapeRenderer2.getAutoPopulateSeriesFillPaint();
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Shape shape23 = lineAndShapeRenderer20.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape23);
        java.awt.Paint paint25 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        java.awt.Paint paint26 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = lineAndShapeRenderer2.getSeriesURLGenerator((int) '#');
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categoryURLGenerator28);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        java.awt.Font font8 = lineAndShapeRenderer2.lookupLegendTextFont((int) (byte) 0);
        boolean boolean9 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Font font11 = lineAndShapeRenderer2.lookupLegendTextFont(500);
        java.awt.Paint paint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseFillPaint(paint12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(font11);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = lineAndShapeRenderer2.getSeriesToolTipGenerator(4);
        org.jfree.chart.renderer.RenderAttributes renderAttributes23 = lineAndShapeRenderer2.getSelectedItemAttributes();
        boolean boolean27 = lineAndShapeRenderer2.getItemCreateEntity(0, (int) (byte) -1, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
        org.junit.Assert.assertNotNull(renderAttributes23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color17 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem13.setLinePaint((java.awt.Paint) color17);
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color17);
        java.awt.Paint paint23 = lineAndShapeRenderer2.getItemLabelPaint((int) '#', (int) (byte) 1, true);
        java.awt.Shape shape25 = null;
        lineAndShapeRenderer2.setSeriesShape(192, shape25);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke((int) (byte) 0);
        boolean boolean18 = lineAndShapeRenderer2.getItemVisible((int) (short) -1, 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((-254));
        java.awt.Paint paint24 = lineAndShapeRenderer2.getItemLabelPaint((int) (byte) -1, (-16776961), false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesCreateEntities(10);
        boolean boolean17 = lineAndShapeRenderer2.getUseSeriesOffset();
        java.awt.Paint paint18 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Color color15 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color15);
        java.awt.Paint paint19 = renderAttributes13.getItemFillPaint((int) (short) 1, 11);
        java.awt.Paint paint22 = renderAttributes13.getItemPaint((-16776961), 2);
        java.awt.Paint paint25 = renderAttributes13.getItemOutlinePaint(0, 1);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double14 = barRenderer0.getMaximumBarWidth();
        boolean boolean15 = barRenderer0.isDrawBarOutline();
        barRenderer0.setShadowXOffset((double) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        java.awt.Color color7 = java.awt.Color.gray;
        categoryAxis1.setTickMarkPaint((java.awt.Paint) color7);
        float[] floatArray11 = new float[] { 4, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = color7.getColorComponents(floatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[0.5019608, 0.5019608]");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot14.getInsets();
        categoryPlot14.clearSelection();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.Boolean boolean16 = lineAndShapeRenderer7.getSeriesItemLabelsVisible((int) '#');
        double double17 = lineAndShapeRenderer7.getItemMargin();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        int int16 = categoryAxis15.getCategoryLabelPositionOffset();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray1 = org.jfree.chart.ChartColor.createDefaultPaintArray();
        java.awt.Stroke[] strokeArray2 = null;
        java.awt.Stroke[] strokeArray3 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Shape[] shapeArray4 = null;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier5 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, strokeArray2, strokeArray3, shapeArray4);
        java.awt.Stroke stroke6 = defaultDrawingSupplier5.getNextOutlineStroke();
        java.awt.Paint paint7 = defaultDrawingSupplier5.getNextFillPaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = defaultDrawingSupplier5.getNextShape();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(strokeArray3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        java.awt.Paint paint31 = lineAndShapeRenderer2.getBasePaint();
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 0, 11, true);
        java.awt.Font font30 = lineAndShapeRenderer2.getItemLabelFont(11, 11, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(font30);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        boolean boolean18 = lineAndShapeRenderer2.getItemVisible((-16777216), 35);
        boolean boolean19 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        boolean boolean11 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, (int) '4');
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesFillPaint();
        java.awt.Color color13 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace14 = color13.getColorSpace();
        lineAndShapeRenderer2.setBasePaint((java.awt.Paint) color13);
        org.jfree.chart.LegendItem legendItem18 = lineAndShapeRenderer2.getLegendItem((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(colorSpace14);
        org.junit.Assert.assertNull(legendItem18);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator12, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.getItemShape(97, 97, true);
        org.jfree.chart.entity.ChartEntity chartEntity21 = new org.jfree.chart.entity.ChartEntity(shape18, "java.awt.Color[r=223,g=255,b=190]", "java.awt.Color[r=223,g=255,b=190]");
        java.lang.String str22 = chartEntity21.getURLText();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.awt.Color[r=223,g=255,b=190]" + "'", str22, "java.awt.Color[r=223,g=255,b=190]");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.drawOutline(graphics2D12, categoryPlot13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.ChartColor chartColor15 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color16 = chartColor15.darker();
        org.jfree.chart.LegendItem legendItem17 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor15);
        org.jfree.chart.LegendItem legendItem18 = new org.jfree.chart.LegendItem("", (java.awt.Paint) chartColor15);
        java.lang.String str19 = legendItem18.getURLText();
        legendItemCollection9.add(legendItem18);
        java.lang.Object obj21 = legendItemCollection9.clone();
        java.util.Iterator iterator22 = legendItemCollection9.iterator();
        java.lang.Object obj23 = legendItemCollection9.clone();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getSeriesPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((-7839));
        java.awt.Stroke stroke28 = lineAndShapeRenderer2.getItemStroke(10284987, (int) (byte) 1, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesStroke((int) '4');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Shape shape14 = lineAndShapeRenderer10.getLegendShape(0);
        lineAndShapeRenderer10.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.jfree.chart.text.TextAnchor textAnchor19 = itemLabelPosition18.getTextAnchor();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(1, itemLabelPosition18);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor21 = itemLabelPosition18.getItemLabelAnchor();
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor22 = itemLabelPosition18.getItemLabelAnchor();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(itemLabelAnchor21);
        org.junit.Assert.assertNotNull(itemLabelAnchor22);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Shape shape11 = lineAndShapeRenderer8.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity13 = new org.jfree.chart.entity.ChartEntity(shape11, "");
        legendItem1.setShape(shape11);
        boolean boolean15 = legendItem1.isShapeFilled();
        legendItem1.setLineVisible(false);
        legendItem1.setURLText("");
        org.jfree.data.general.Dataset dataset20 = legendItem1.getDataset();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataset20);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        boolean boolean19 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (short) 1);
        boolean boolean21 = lineAndShapeRenderer2.isSeriesVisible((-12517568));
        java.awt.Paint paint22 = lineAndShapeRenderer2.getBaseOutlinePaint();
        boolean boolean23 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
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
        java.awt.Paint paint21 = lineAndShapeRenderer2.getSeriesFillPaint(0);
        java.awt.Stroke stroke23 = lineAndShapeRenderer2.lookupSeriesStroke(35);
        boolean boolean24 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        boolean boolean19 = lineAndShapeRenderer2.isItemLabelVisible((int) (byte) 100, 1, false);
        java.awt.Color color21 = java.awt.Color.BLUE;
        int int22 = color21.getRed();
        lineAndShapeRenderer2.setSeriesItemLabelPaint(100, (java.awt.Paint) color21);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer2.getItemLabelGenerator(100, (int) (short) 1, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Color color15 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color15);
        java.awt.Paint paint19 = renderAttributes13.getItemOutlinePaint(0, (-12517568));
        renderAttributes13.setDefaultCreateEntity((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        int int19 = defaultShadowGenerator18.getShadowSize();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 255 + "'", int8 == 255);
        org.junit.Assert.assertNotNull(paintContext14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-10289251) + "'", int19 == (-10289251));
    }

    @Test
    public void test5113() throws Throwable {
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
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator13);
        org.jfree.chart.LegendItem legendItem17 = lineAndShapeRenderer2.getLegendItem(0, (int) (short) 100);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator19 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator19);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator25);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(legendItem17);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        boolean boolean21 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation20);
        java.lang.Boolean boolean23 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Font font24 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(categoryItemLabelGenerator26);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
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
        java.awt.Stroke stroke10 = defaultDrawingSupplier9.getNextOutlineStroke();
        java.awt.Paint paint11 = defaultDrawingSupplier9.getNextOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke12 = defaultDrawingSupplier9.getNextStroke();
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
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator23);
        java.awt.Paint paint26 = lineAndShapeRenderer2.getSeriesItemLabelPaint((int) '4');
        org.jfree.chart.LegendItemCollection legendItemCollection27 = lineAndShapeRenderer2.getLegendItems();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(legendItemCollection27);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        legendItem24.setDescription("hi!");
        java.awt.Paint paint27 = legendItem24.getLinePaint();
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        boolean boolean19 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (short) 1);
        boolean boolean21 = lineAndShapeRenderer2.isSeriesVisible((-12517568));
        java.awt.Paint paint22 = lineAndShapeRenderer2.getBaseOutlinePaint();
        java.awt.Paint paint26 = lineAndShapeRenderer2.getItemOutlinePaint(100, 9, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(3);
        java.awt.Shape shape25 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseShape(shape25);
        int int27 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        boolean boolean19 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (short) 1);
        boolean boolean21 = lineAndShapeRenderer2.isSeriesVisible((-12517568));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) (byte) 100, (int) (byte) 10, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getLegendTextPaint(0);
        boolean boolean17 = lineAndShapeRenderer2.getAutoPopulateSeriesFillPaint();
        java.awt.Paint paint19 = lineAndShapeRenderer2.lookupSeriesPaint(0);
        lineAndShapeRenderer2.setBaseCreateEntities(true, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        legendItem1.setToolTipText("java.awt.Color[r=255,g=255,b=255]");
        java.lang.Object obj20 = legendItem1.clone();
        java.awt.Paint paint21 = legendItem1.getLabelPaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double5 = categoryAxis4.getFixedDimension();
        org.jfree.chart.plot.Plot plot6 = categoryAxis4.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = categoryAxis4.getLabelInsets();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions8 = categoryAxis4.getCategoryLabelPositions();
        categoryAxis1.setCategoryLabelPositions(categoryLabelPositions8);
        java.awt.Color color13 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        categoryAxis1.setAxisLinePaint((java.awt.Paint) color13);
        categoryAxis1.setCategoryLabelPositionOffset((int) (short) 100);
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions17 = categoryAxis1.getCategoryLabelPositions();
        float float18 = categoryAxis1.getTickMarkOutsideLength();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(categoryLabelPositions8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(categoryLabelPositions17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesVisibleInLegend((int) (byte) -1);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesPaint(255);
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.Color color11 = java.awt.Color.cyan;
        java.awt.Stroke stroke12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.drawDomainLine(graphics2D7, categoryPlot8, rectangle2D9, (double) 0.5f, (java.awt.Paint) color11, stroke12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        java.lang.Object obj31 = lineAndShapeRenderer2.clone();
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        int int8 = defaultShadowGenerator6.calculateOffsetX();
        int int9 = defaultShadowGenerator6.calculateOffsetX();
        java.awt.image.BufferedImage bufferedImage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage11 = defaultShadowGenerator6.createDropShadow(bufferedImage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color17 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem13.setLinePaint((java.awt.Paint) color17);
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color17);
        java.awt.Paint paint23 = lineAndShapeRenderer2.getItemLabelPaint((int) '#', (int) (byte) 1, true);
        java.awt.Shape shape27 = lineAndShapeRenderer2.getItemShape((int) 'a', 0, true);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape27);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double14 = barRenderer0.getItemMargin();
        boolean boolean15 = barRenderer0.getShadowsVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        int int7 = lineAndShapeRenderer2.getRowCount();
        boolean boolean8 = lineAndShapeRenderer2.getBaseShapesVisible();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator9, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.plot.Marker marker17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D14, categoryPlot15, valueAxis16, marker17, rectangle2D18);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        lineAndShapeRenderer2.setSeriesVisible(192, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((-1));
        java.awt.Paint paint16 = lineAndShapeRenderer2.getBaseOutlinePaint();
        java.awt.Shape shape17 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity20 = new org.jfree.chart.entity.ChartEntity(shape17, "ItemLabelAnchor.INSIDE7", "org.jfree.data.UnknownKeyException: AxisLocation.BOTTOM_OR_RIGHT");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Shape shape23 = lineAndShapeRenderer20.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape23);
        java.awt.Paint paint25 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        java.awt.Paint paint26 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator27, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        boolean boolean19 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation18);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
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
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false, true);
        java.awt.Paint paint29 = lineAndShapeRenderer2.getBaseFillPaint();
        java.lang.Boolean boolean31 = lineAndShapeRenderer2.getSeriesVisibleInLegend((int) '4');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(boolean31);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = barRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = barRenderer0.getSeriesNegativeItemLabelPosition((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator12);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator16, false);
        java.awt.Font font20 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator22);
        java.awt.Paint paint24 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        lineAndShapeRenderer2.setBaseSeriesVisible(false, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(font20);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean15 = categoryAxis2.isVisible();
        float float16 = categoryAxis2.getMinorTickMarkInsideLength();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        java.awt.Font font19 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) 'a', false);
        boolean boolean20 = lineAndShapeRenderer2.getBaseCreateEntities();
        lineAndShapeRenderer2.setSeriesVisible((int) (short) 10, (java.lang.Boolean) false, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        boolean boolean13 = lineAndShapeRenderer2.getBaseSeriesVisible();
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 10, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape18 = lineAndShapeRenderer17.getBaseShape();
        lineAndShapeRenderer2.setBaseShape(shape18, true);
        lineAndShapeRenderer2.setBaseSeriesVisible(false);
        java.awt.Shape shape23 = lineAndShapeRenderer2.getBaseLegendShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        lineAndShapeRenderer2.setDrawOutlines(false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        boolean boolean23 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean24 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        boolean boolean13 = lineAndShapeRenderer2.getBaseSeriesVisible();
        java.awt.Font font14 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Shape shape15 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Shape shape17 = lineAndShapeRenderer2.getSeriesShape(500);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (short) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean22 = lineAndShapeRenderer2.getSeriesVisibleInLegend(32);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        boolean boolean19 = lineAndShapeRenderer2.isItemLabelVisible((int) (byte) 100, 1, false);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getBaseFillPaint();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = lineAndShapeRenderer2.getBaseURLGenerator();
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 0, (java.lang.Boolean) false);
        int int27 = lineAndShapeRenderer2.getDefaultEntityRadius();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        java.awt.Paint[] paintArray5 = new java.awt.Paint[] {};
        java.awt.Paint[] paintArray6 = new java.awt.Paint[] {};
        java.awt.Paint paint7 = null;
        java.awt.Paint[] paintArray8 = new java.awt.Paint[] { paint7 };
        java.awt.Stroke[] strokeArray9 = new java.awt.Stroke[] {};
        java.awt.Stroke stroke10 = null;
        java.awt.Stroke[] strokeArray11 = new java.awt.Stroke[] { stroke10 };
        java.awt.Shape shape12 = null;
        java.awt.Shape[] shapeArray13 = new java.awt.Shape[] { shape12 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier14 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray5, paintArray6, paintArray8, strokeArray9, strokeArray11, shapeArray13);
        boolean boolean15 = rectangleInsets4.equals((java.lang.Object) defaultDrawingSupplier14);
        double double17 = rectangleInsets4.calculateRightOutset((double) 1.0f);
        org.junit.Assert.assertNotNull(paintArray5);
        org.junit.Assert.assertNotNull(paintArray6);
        org.junit.Assert.assertNotNull(paintArray8);
        org.junit.Assert.assertNotNull(strokeArray9);
        org.junit.Assert.assertNotNull(strokeArray11);
        org.junit.Assert.assertNotNull(shapeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        java.awt.Paint paint10 = null;
        lineAndShapeRenderer2.setSeriesFillPaint((int) (short) 1, paint10, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        boolean boolean21 = lineAndShapeRenderer2.isSeriesVisibleInLegend((int) (byte) 100);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator23 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator23);
        java.lang.Object obj25 = standardCategorySeriesLabelGenerator23.clone();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        java.awt.Paint paint18 = lineAndShapeRenderer2.getItemPaint(0, (int) '4', true);
        lineAndShapeRenderer2.setDefaultEntityRadius(0);
        boolean boolean21 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        boolean boolean24 = lineAndShapeRenderer2.getItemShapeVisible(1, 100);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer7.setSeriesURLGenerator((int) (short) 0, categoryURLGenerator20);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
        boolean boolean30 = lineAndShapeRenderer2.getItemVisible((int) 'a', (-16777216));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5151() throws Throwable {
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
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.drawOutline(graphics2D11, categoryPlot12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getLegendTextPaint(0);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        java.awt.Shape shape19 = lineAndShapeRenderer2.getBaseLegendShape();
        boolean boolean22 = lineAndShapeRenderer2.getItemShapeFilled((-1), (int) ' ');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Shape shape23 = lineAndShapeRenderer20.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape23);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator25);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        java.awt.Stroke stroke24 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) ' ');
        lineAndShapeRenderer2.removeAnnotations();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(stroke24);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        java.lang.Object obj2 = categoryAxis1.clone();
        boolean boolean3 = categoryAxis1.isVisible();
        categoryAxis1.setLabel("");
        categoryAxis1.setMinorTickMarkOutsideLength((float) (-1L));
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double14 = rectangleInsets12.calculateTopOutset((double) (byte) 0);
        java.lang.String str15 = rectangleInsets12.toString();
        double double17 = rectangleInsets12.calculateBottomOutset((double) (-1L));
        double double18 = rectangleInsets12.getLeft();
        categoryAxis1.setLabelInsets(rectangleInsets12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str15, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) (byte) 1);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(categoryToolTipGenerator31);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape17 = renderAttributes15.getSeriesShape((int) (byte) 100);
        java.awt.Font font18 = renderAttributes15.getDefaultLabelFont();
        java.awt.Paint paint20 = null;
        renderAttributes15.setSeriesOutlinePaint(1, paint20);
        java.awt.Paint paint22 = renderAttributes15.getDefaultPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(font18);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState5 = defaultCategoryDataset0.getSelectionState();
        int int7 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) "CategoryAnchor.MIDDLE");
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.setSelected((int) '4', (int) (byte) 1, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Font font14 = renderAttributes13.getDefaultLabelFont();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(font14);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        lineAndShapeRenderer2.setBaseSeriesVisible(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 0, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) (short) 100);
        java.awt.Stroke stroke23 = lineAndShapeRenderer2.getItemOutlineStroke(0, 0, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState5 = defaultCategoryDataset0.getSelectionState();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeValue((java.lang.Comparable) "ItemLabelAnchor.INSIDE7", (java.lang.Comparable) "GradientPaintTransformType.HORIZONTAL");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (ItemLabelAnchor.INSIDE7) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState5);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        java.awt.Font font19 = lineAndShapeRenderer2.getItemLabelFont((int) (short) 0, 0, false);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator21 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator21);
        boolean boolean23 = lineAndShapeRenderer2.getUseFillPaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = lineAndShapeRenderer2.getPlot();
        java.awt.Font font13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseItemLabelFont(font13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryPlot12);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        boolean boolean26 = lineAndShapeRenderer2.isItemLabelVisible(0, (int) (byte) -1, true);
        java.awt.Paint paint27 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.awt.Paint paint30 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(paint30);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes6 = lineAndShapeRenderer2.getSelectedItemAttributes();
        renderAttributes6.setDefaultLabelVisible((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = renderAttributes6.getSeriesCreateEntity((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(renderAttributes6);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        java.awt.Font font8 = lineAndShapeRenderer0.getItemLabelFont(11, 2, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = lineAndShapeRenderer0.getBaseToolTipGenerator();
        lineAndShapeRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, true);
        java.awt.Stroke stroke15 = lineAndShapeRenderer0.getSeriesStroke((int) '4');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Shape shape23 = lineAndShapeRenderer19.getLegendShape(0);
        lineAndShapeRenderer19.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = lineAndShapeRenderer19.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        lineAndShapeRenderer0.setSeriesNegativeItemLabelPosition(15, itemLabelPosition27, false);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        java.awt.Paint paint18 = legendItem1.getLinePaint();
        org.jfree.data.general.Dataset dataset19 = legendItem1.getDataset();
        legendItem1.setDescription("java.awt.Color[r=64,g=255,b=64]");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(dataset19);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesVisible(0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.data.Range range27 = lineAndShapeRenderer2.findRangeBounds(categoryDataset25, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(range27);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 10, categoryURLGenerator18, true);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesFillPaint(0);
        lineAndShapeRenderer2.setBaseLinesVisible(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(categoryURLGenerator25);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        java.awt.geom.Point2D point2D12 = null;
        categoryPlot4.zoomDomainAxes(0.0d, (double) (-1), plotRenderingInfo11, point2D12);
        categoryPlot4.setRangeCrosshairLockedOnData(true);
        boolean boolean16 = categoryPlot4.isRangeZoomable();
        org.jfree.chart.util.Layer layer18 = null;
        java.util.Collection collection19 = categoryPlot4.getDomainMarkers((int) 'a', layer18);
        org.jfree.chart.plot.Plot plot20 = categoryPlot4.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(collection19);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 10, categoryURLGenerator18, true);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesFillPaint(0);
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesVisibleInLegend((int) (short) 10);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.trimWidth((double) (-10289251));
        double double8 = rectangleInsets4.calculateTopOutset(0.0d);
        double double10 = rectangleInsets4.calculateLeftInset((double) 0L);
        double double11 = rectangleInsets4.getRight();
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D13 = rectangleInsets4.createOutsetRectangle(rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0289271E7d) + "'", double6 == (-1.0289271E7d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        java.awt.Stroke stroke5 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray6 = new org.jfree.chart.axis.CategoryAxis[] {};
        categoryPlot4.setDomainAxes(categoryAxisArray6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(categoryAxisArray6);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        boolean boolean21 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation20);
        java.lang.Boolean boolean23 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Font font24 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (byte) 0, categoryItemLabelGenerator26);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        categoryAxis15.setMinorTickMarkInsideLength(2.0f);
        categoryAxis15.setLabel("{0}");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.awt.Paint paint15 = categoryAxis2.getLabelPaint();
        boolean boolean16 = categoryAxis2.isMinorTickMarksVisible();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT;
        categoryPlot14.setRangeAxisLocation(axisLocation15);
        categoryPlot14.setWeight((int) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        double double13 = barRenderer0.getBase();
        barRenderer0.removeAnnotations();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = barRenderer0.getToolTipGenerator(2, (int) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        org.jfree.chart.text.TextAnchor textAnchor20 = itemLabelPosition19.getRotationAnchor();
        java.lang.String str21 = textAnchor20.toString();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "TextAnchor.CENTER" + "'", str21, "TextAnchor.CENTER");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke((int) (byte) 0);
        boolean boolean18 = lineAndShapeRenderer2.getItemVisible((int) (short) -1, 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((-254));
        boolean boolean21 = lineAndShapeRenderer2.getUseFillPaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        java.awt.Stroke stroke18 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        java.lang.Boolean boolean21 = lineAndShapeRenderer2.getSeriesShapesVisible(35);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator19, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer2.getNegativeItemLabelPosition(100, (-1), true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer8.setBaseURLGenerator(categoryURLGenerator9);
        java.awt.Shape shape12 = lineAndShapeRenderer8.getLegendShape(0);
        lineAndShapeRenderer8.setAutoPopulateSeriesStroke(false);
        java.awt.Font font16 = lineAndShapeRenderer8.getSeriesItemLabelFont(0);
        lineAndShapeRenderer8.setUseSeriesOffset(true);
        java.awt.Font font20 = null;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 1, font20, false);
        java.awt.Stroke stroke26 = lineAndShapeRenderer8.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke26, true);
        lineAndShapeRenderer2.clearSeriesStrokes(true);
        java.awt.Stroke stroke31 = lineAndShapeRenderer2.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) '4', 192, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.awt.Stroke stroke21 = lineAndShapeRenderer7.getItemStroke((int) '#', 0, false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        java.awt.Paint paint16 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition((int) (byte) 0, itemLabelPosition18);
        lineAndShapeRenderer2.setSeriesLinesVisible(8, false);
        boolean boolean23 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Shape shape11 = lineAndShapeRenderer8.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity13 = new org.jfree.chart.entity.ChartEntity(shape11, "");
        legendItem1.setShape(shape11);
        boolean boolean15 = legendItem1.isShapeFilled();
        legendItem1.setLineVisible(false);
        java.awt.Color color18 = java.awt.Color.GRAY;
        legendItem1.setLinePaint((java.awt.Paint) color18);
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray1 = org.jfree.chart.ChartColor.createDefaultPaintArray();
        java.awt.Stroke[] strokeArray2 = null;
        java.awt.Stroke[] strokeArray3 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Shape[] shapeArray4 = null;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier5 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, strokeArray2, strokeArray3, shapeArray4);
        java.awt.Paint paint6 = defaultDrawingSupplier5.getNextOutlinePaint();
        java.awt.Paint paint7 = defaultDrawingSupplier5.getNextPaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke8 = defaultDrawingSupplier5.getNextStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(strokeArray3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(3);
        boolean boolean25 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = lineAndShapeRenderer2.getToolTipGenerator((int) (byte) 10, (int) (byte) 1, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator29);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        boolean boolean17 = lineAndShapeRenderer2.isItemLabelVisible(0, (int) (byte) 0, false);
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = lineAndShapeRenderer2.getSeriesToolTipGenerator((-1656));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator21);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, true);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(true);
        boolean boolean18 = lineAndShapeRenderer2.getUseSeriesOffset();
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesVisible((int) '#');
        java.awt.Stroke stroke22 = lineAndShapeRenderer2.getSeriesOutlineStroke(50);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(renderAttributes11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(stroke22);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 0, true);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 100, (java.lang.Boolean) false);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, true);
        java.lang.Boolean boolean25 = lineAndShapeRenderer2.getSeriesShapesFilled((-1));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (short) 0, (-1), true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator25);
        lineAndShapeRenderer2.setSeriesShapesFilled((int) (short) 100, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.lang.Boolean boolean25 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(5);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesCreateEntities(10);
        java.awt.Font font17 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font17, true);
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = lineAndShapeRenderer2.getItemLabelGenerator((int) 'a', 0, false);
        boolean boolean19 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getItemStroke(100, 0, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible(4);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBasePaint();
        java.awt.Stroke stroke13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseStroke(stroke13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        lineAndShapeRenderer2.setBaseCreateEntities(true, false);
        java.awt.Paint paint19 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray1 = org.jfree.chart.ChartColor.createDefaultPaintArray();
        java.awt.Stroke[] strokeArray2 = null;
        java.awt.Stroke[] strokeArray3 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Shape[] shapeArray4 = null;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier5 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, strokeArray2, strokeArray3, shapeArray4);
        java.awt.Stroke stroke6 = defaultDrawingSupplier5.getNextOutlineStroke();
        java.awt.Paint paint7 = defaultDrawingSupplier5.getNextFillPaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke8 = defaultDrawingSupplier5.getNextStroke();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(strokeArray3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        lineAndShapeRenderer2.setSeriesVisible(192, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((-1));
        java.awt.Paint paint16 = lineAndShapeRenderer2.getBaseOutlinePaint();
        java.awt.Shape shape17 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Paint paint18 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer2.getItemLabelGenerator((int) (byte) 100, 100, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
        legendItem24.setURLText("TextAnchor.TOP_CENTER");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        boolean boolean21 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator13);
        org.jfree.chart.LegendItem legendItem17 = lineAndShapeRenderer2.getLegendItem(0, (int) (short) 100);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator19 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator19);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = lineAndShapeRenderer2.getToolTipGenerator(100, (-10), false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(legendItem17);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator19, true);
        java.lang.Boolean boolean23 = lineAndShapeRenderer2.getSeriesShapesVisible(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
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
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true, false);
        boolean boolean23 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) false, false);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.data.Range range20 = lineAndShapeRenderer2.findRangeBounds(categoryDataset19);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(range20);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(33, categoryToolTipGenerator17, true);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = lineAndShapeRenderer2.getPlot();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNull(categoryPlot22);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        boolean boolean13 = lineAndShapeRenderer2.getBaseSeriesVisible();
        java.awt.Font font14 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Shape shape15 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Shape shape17 = lineAndShapeRenderer2.getSeriesShape(500);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition(0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        int int20 = lineAndShapeRenderer2.getPassCount();
        java.awt.Font font21 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font21, true);
        lineAndShapeRenderer2.setItemMargin(0.0d);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        int int8 = defaultShadowGenerator6.calculateOffsetX();
        java.awt.image.BufferedImage bufferedImage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage10 = defaultShadowGenerator6.createDropShadow(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double14 = barRenderer0.getShadowYOffset();
        boolean boolean15 = barRenderer0.isDrawBarOutline();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesStroke((int) '4');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer10.setBaseURLGenerator(categoryURLGenerator11);
        java.awt.Shape shape14 = lineAndShapeRenderer10.getLegendShape(0);
        lineAndShapeRenderer10.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.jfree.chart.text.TextAnchor textAnchor19 = itemLabelPosition18.getTextAnchor();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(1, itemLabelPosition18);
        java.lang.Boolean boolean22 = lineAndShapeRenderer2.getSeriesVisibleInLegend((int) (byte) -1);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator18);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        boolean boolean21 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation20);
        java.lang.Boolean boolean23 = lineAndShapeRenderer2.getSeriesVisible((int) ' ');
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getURLGenerator(255, 4, false);
        boolean boolean16 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        int int20 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Color color15 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color15);
        java.awt.Paint paint19 = renderAttributes13.getItemFillPaint((int) (short) 1, 11);
        java.awt.Paint paint20 = renderAttributes13.getDefaultLabelPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        defaultCategoryDataset0.setValue(0.05d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 4);
        defaultCategoryDataset0.validateObject();
        defaultCategoryDataset0.removeColumn((int) (short) 0);
        defaultCategoryDataset0.clearSelection();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState11 = null;
        defaultCategoryDataset0.setSelectionState(categoryDatasetSelectionState11);
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeColumn((java.lang.Comparable) "GradientPaintTransformType.VERTICAL");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (GradientPaintTransformType.VERTICAL) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Stroke stroke10 = lineAndShapeRenderer6.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = lineAndShapeRenderer6.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer6.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer6.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Stroke stroke22 = lineAndShapeRenderer6.getItemStroke((int) (byte) 100, 3, true);
        lineAndShapeRenderer2.setSeriesOutlineStroke(100, stroke22);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true, false);
        double double28 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.0d + "'", double28 == 2.0d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesShapesFilled(0);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (byte) 100, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        float float15 = categoryAxis2.getTickMarkOutsideLength();
        categoryAxis2.setLabelAngle((double) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        java.lang.Boolean boolean18 = lineAndShapeRenderer2.getSeriesShapesVisible(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 0, categoryURLGenerator20);
        java.awt.Shape shape22 = lineAndShapeRenderer2.getBaseLegendShape();
        lineAndShapeRenderer2.setSeriesShapesFilled((int) (byte) 1, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(shape22);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        java.lang.Object obj10 = defaultDrawingSupplier9.clone();
        java.awt.Stroke stroke11 = defaultDrawingSupplier9.getNextOutlineStroke();
        java.awt.Paint paint12 = defaultDrawingSupplier9.getNextOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart13 = null;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent14 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) defaultDrawingSupplier9, jFreeChart13);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType15 = chartChangeEvent14.getType();
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(strokeArray4);
        org.junit.Assert.assertNotNull(strokeArray6);
        org.junit.Assert.assertNotNull(shapeArray8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(chartChangeEventType15);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        int int3 = keyedObjects2D0.getRowCount();
        int int4 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeObject((java.lang.Comparable) "GradientPaintTransformType.CENTER_HORIZONTAL", (java.lang.Comparable) "TextAnchor.HALF_ASCENT_LEFT");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (GradientPaintTransformType.CENTER_HORIZONTAL) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        java.awt.Stroke stroke18 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        lineAndShapeRenderer2.setSeriesShapesFilled((int) (byte) 0, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(3);
        java.awt.Shape shape25 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseShape(shape25);
        java.awt.Stroke stroke28 = lineAndShapeRenderer2.getSeriesStroke((int) '#');
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNull(stroke28);
    }

    @Test
    public void test5228() throws Throwable {
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
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(0);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemLabelPaint((-1), 1, false);
        boolean boolean21 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        java.awt.Paint paint23 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        lineAndShapeRenderer2.setSeriesShapesVisible((int) 'a', (java.lang.Boolean) true);
        java.awt.Font font13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelFont((-16776961), font13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(100, categoryToolTipGenerator22, false);
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent25 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) lineAndShapeRenderer2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNull(drawingSupplier20);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        java.awt.Paint paint18 = lineAndShapeRenderer2.getItemPaint(0, (int) '4', true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        boolean boolean21 = lineAndShapeRenderer2.getUseSeriesOffset();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        int int8 = defaultShadowGenerator6.getDistance();
        java.awt.image.BufferedImage bufferedImage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage10 = defaultShadowGenerator6.createDropShadow(bufferedImage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator3 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator3);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        lineAndShapeRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        java.awt.Shape shape11 = lineAndShapeRenderer7.getLegendShape(0);
        lineAndShapeRenderer7.setAutoPopulateSeriesStroke(false);
        java.awt.Font font15 = lineAndShapeRenderer7.getSeriesItemLabelFont(0);
        lineAndShapeRenderer7.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        lineAndShapeRenderer7.setBaseToolTipGenerator(categoryToolTipGenerator18);
        org.jfree.chart.LegendItem legendItem22 = lineAndShapeRenderer7.getLegendItem(0, (int) (short) 100);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator24 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer7.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator24);
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator24);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(font15);
        org.junit.Assert.assertNull(legendItem22);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
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
        java.awt.Paint paint25 = legendItem24.getFillPaint();
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = lineAndShapeRenderer2.getBaseURLGenerator();
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 0, (java.lang.Boolean) false);
        lineAndShapeRenderer2.setBaseCreateEntities(true, false);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        lineAndShapeRenderer2.removeAnnotations();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator23);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.ChartChangeEvent[source=1]");
        org.jfree.data.UnknownKeyException unknownKeyException3 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray4 = unknownKeyException3.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException6 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException3.addSuppressed((java.lang.Throwable) unknownKeyException6);
        org.jfree.data.UnknownKeyException unknownKeyException9 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray10 = unknownKeyException9.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException12 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException9.addSuppressed((java.lang.Throwable) unknownKeyException12);
        unknownKeyException3.addSuppressed((java.lang.Throwable) unknownKeyException9);
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException9);
        org.jfree.data.UnknownKeyException unknownKeyException17 = new org.jfree.data.UnknownKeyException("org.jfree.chart.event.ChartChangeEvent[source=1]");
        unknownKeyException9.addSuppressed((java.lang.Throwable) unknownKeyException17);
        org.jfree.data.UnknownKeyException unknownKeyException20 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray21 = unknownKeyException20.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException23 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException20.addSuppressed((java.lang.Throwable) unknownKeyException23);
        org.jfree.data.UnknownKeyException unknownKeyException26 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray27 = unknownKeyException26.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException29 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException26.addSuppressed((java.lang.Throwable) unknownKeyException29);
        unknownKeyException20.addSuppressed((java.lang.Throwable) unknownKeyException26);
        unknownKeyException9.addSuppressed((java.lang.Throwable) unknownKeyException26);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test5239() throws Throwable {
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
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesLinesVisible(0);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, true);
        java.awt.Font font19 = lineAndShapeRenderer2.getSeriesItemLabelFont((int) (byte) 1);
        java.lang.Object obj20 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(font19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        org.jfree.chart.plot.Marker marker9 = null;
        boolean boolean10 = categoryPlot4.removeDomainMarker(marker9);
        java.lang.String str11 = categoryPlot4.getPlotType();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent12 = null;
        categoryPlot4.annotationChanged(annotationChangeEvent12);
        java.awt.Stroke stroke14 = categoryPlot4.getRangeMinorGridlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        categoryPlot4.removeChangeListener(plotChangeListener15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesLinesVisible(0);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, true);
        int int18 = lineAndShapeRenderer2.getDefaultEntityRadius();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        boolean boolean12 = lineAndShapeRenderer2.getBaseCreateEntities();
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-12517568), (-1), true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        java.awt.Shape shape19 = null;
        lineAndShapeRenderer2.setBaseLegendShape(shape19);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Shape shape23 = lineAndShapeRenderer20.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape23);
        java.awt.Paint paint25 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        java.awt.Paint paint26 = lineAndShapeRenderer2.getBasePaint();
        lineAndShapeRenderer2.removeAnnotations();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) 'a');
        lineAndShapeRenderer2.clearSeriesPaints(true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(stroke16);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(33, categoryToolTipGenerator17, true);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setItemMargin((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 0.0 <= margin < 1.0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        boolean boolean16 = lineAndShapeRenderer2.getItemCreateEntity((int) 'a', (int) (byte) -1, false);
        boolean boolean17 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = lineAndShapeRenderer2.getSeriesToolTipGenerator((-7839));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        java.awt.Stroke stroke10 = lineAndShapeRenderer2.getSeriesStroke((int) (short) 0);
        java.awt.Paint paint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseItemLabelPaint(paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(stroke10);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        boolean boolean19 = lineAndShapeRenderer2.isItemLabelVisible((int) (byte) 100, 1, false);
        java.awt.Font font21 = lineAndShapeRenderer2.getSeriesItemLabelFont((int) (byte) 0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(font21);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        java.lang.String str18 = legendItem1.getLabel();
        boolean boolean19 = legendItem1.isShapeOutlineVisible();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(100, (java.lang.Boolean) false);
        boolean boolean28 = lineAndShapeRenderer2.getItemShapeVisible((-52), 52);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(true);
        lineAndShapeRenderer2.setDefaultEntityRadius((int) (short) 0);
        int int21 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.ChartColor chartColor15 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color16 = chartColor15.darker();
        org.jfree.chart.LegendItem legendItem17 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor15);
        org.jfree.chart.LegendItem legendItem18 = new org.jfree.chart.LegendItem("", (java.awt.Paint) chartColor15);
        java.lang.String str19 = legendItem18.getURLText();
        legendItemCollection9.add(legendItem18);
        legendItem18.setSeriesIndex((-10411212));
        legendItem18.setSeriesKey((java.lang.Comparable) 52);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5255() throws Throwable {
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
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesCreateEntities(10);
        java.awt.Paint paint18 = lineAndShapeRenderer2.lookupLegendTextPaint((int) (short) -1);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test5257() throws Throwable {
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
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        boolean boolean11 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, (int) '4');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer15.setBaseURLGenerator(categoryURLGenerator16);
        java.awt.Paint paint19 = lineAndShapeRenderer15.getSeriesOutlinePaint(0);
        java.awt.Font font20 = lineAndShapeRenderer15.getBaseItemLabelFont();
        lineAndShapeRenderer2.setSeriesItemLabelFont(2, font20, false);
        boolean boolean23 = lineAndShapeRenderer2.getBaseShapesFilled();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.awt.Paint paint16 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        java.awt.Font font17 = lineAndShapeRenderer2.getBaseItemLabelFont();
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.RenderAttributes renderAttributes21 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint23 = null;
        renderAttributes21.setSeriesFillPaint(50, paint23);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(renderAttributes21);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        boolean boolean4 = legendItem1.isShapeVisible();
        java.awt.Font font5 = legendItem1.getLabelFont();
        int int6 = legendItem1.getDatasetIndex();
        java.awt.Shape shape7 = null;
        // The following exception was thrown during execution in test generation
        try {
            legendItem1.setLine(shape7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'line' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset16, false);
        java.awt.Shape shape20 = lineAndShapeRenderer2.getLegendShape((-12517568));
        boolean boolean21 = lineAndShapeRenderer2.getBaseShapesFilled();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        boolean boolean19 = lineAndShapeRenderer2.isItemLabelVisible((int) (byte) 100, 1, false);
        java.lang.Boolean boolean21 = lineAndShapeRenderer2.getSeriesLinesVisible(128);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean16 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemPaint((int) (byte) 1, 10284987, true);
        java.awt.Stroke stroke22 = lineAndShapeRenderer2.lookupSeriesOutlineStroke((int) 'a');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.extendHeight((double) 10);
        java.lang.String str3 = rectangleInsets0.toString();
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D7 = rectangleInsets0.createInsetRectangle(rectangle2D4, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.0d + "'", double2 == 16.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str3, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke((int) (byte) 0);
        boolean boolean18 = lineAndShapeRenderer2.getItemVisible((int) (short) -1, 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((-254));
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(33, categoryToolTipGenerator17, true);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getBaseOutlinePaint();
        java.awt.Paint paint24 = lineAndShapeRenderer2.getItemLabelPaint(10, 0, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        org.jfree.chart.plot.Marker marker9 = null;
        boolean boolean10 = categoryPlot4.removeDomainMarker(marker9);
        java.lang.String str11 = categoryPlot4.getPlotType();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent12 = null;
        categoryPlot4.annotationChanged(annotationChangeEvent12);
        categoryPlot4.setOutlineVisible(false);
        float float16 = categoryPlot4.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.awt.Paint paint27 = null;
        lineAndShapeRenderer2.setBasePaint(paint27);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Stroke stroke10 = lineAndShapeRenderer6.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = lineAndShapeRenderer6.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer6.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer6.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Stroke stroke22 = lineAndShapeRenderer6.getItemStroke((int) (byte) 100, 3, true);
        lineAndShapeRenderer2.setSeriesOutlineStroke(100, stroke22);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(0, (java.lang.Boolean) true, false);
        boolean boolean28 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.ChartColor chartColor15 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color16 = chartColor15.darker();
        org.jfree.chart.LegendItem legendItem17 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor15);
        org.jfree.chart.LegendItem legendItem18 = new org.jfree.chart.LegendItem("", (java.awt.Paint) chartColor15);
        java.lang.String str19 = legendItem18.getURLText();
        legendItemCollection9.add(legendItem18);
        java.awt.Shape shape21 = legendItem18.getLine();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        java.lang.String str7 = rectangleInsets4.toString();
        double double9 = rectangleInsets4.calculateBottomInset((double) 100.0f);
        double double11 = rectangleInsets4.calculateLeftOutset((double) ' ');
        double double13 = rectangleInsets4.extendHeight((double) '4');
        double double15 = rectangleInsets4.extendHeight((double) 1.0f);
        double double17 = rectangleInsets4.calculateRightOutset((double) (short) -1);
        double double19 = rectangleInsets4.trimHeight((-32.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str7, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 63.0d + "'", double13 == 63.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-43.0d) + "'", double19 == (-43.0d));
    }

    @Test
    public void test5272() throws Throwable {
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
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator23, true);
        boolean boolean26 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.ChartColor chartColor8 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color9 = chartColor8.darker();
        org.jfree.chart.LegendItem legendItem10 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor8);
        int int11 = chartColor8.getAlpha();
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelPaint((-10289251), (java.awt.Paint) chartColor8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 255 + "'", int11 == 255);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer15 = categoryPlot14.getRenderer();
        categoryItemRenderer15.setSeriesItemLabelsVisible(11, false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(2, 5, false);
        java.awt.Color color17 = java.awt.Color.RED;
        int int18 = color17.getTransparency();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color17);
        int int20 = color17.getAlpha();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 255 + "'", int20 == 255);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double12 = rectangleInsets4.calculateRightOutset((double) (short) 10);
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D14 = rectangleInsets4.createOutsetRectangle(rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean15 = lineAndShapeRenderer2.getBaseShapesFilled();
        boolean boolean18 = lineAndShapeRenderer2.getItemShapeFilled((int) (byte) -1, (int) (byte) 10);
        double double19 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.0d + "'", double19 == 2.0d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.data.Range range21 = lineAndShapeRenderer2.findRangeBounds(categoryDataset20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.data.Range range23 = lineAndShapeRenderer2.findRangeBounds(categoryDataset22);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNull(range23);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.LegendItem legendItem15 = lineAndShapeRenderer2.getLegendItem(100, (int) (byte) 0);
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNull(legendItem15);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        int int7 = categoryAxis1.getCategoryLabelPositionOffset();
        float float8 = categoryAxis1.getMinorTickMarkOutsideLength();
        java.awt.Font font9 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryAxis1.setTickLabelFont(font9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 10);
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Font font8 = categoryAxis1.getTickLabelFont(comparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'category' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.data.Range range21 = lineAndShapeRenderer2.findRangeBounds(categoryDataset20);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesCreateEntities((int) (byte) -1, (java.lang.Boolean) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        boolean boolean7 = legendItem6.isLineVisible();
        org.jfree.chart.ChartColor chartColor11 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel12 = null;
        java.awt.Rectangle rectangle13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.AffineTransform affineTransform15 = null;
        java.awt.RenderingHints renderingHints16 = null;
        java.awt.PaintContext paintContext17 = chartColor11.createContext(colorModel12, rectangle13, rectangle2D14, affineTransform15, renderingHints16);
        boolean boolean18 = legendItem6.equals((java.lang.Object) affineTransform15);
        java.awt.Paint paint19 = legendItem6.getLabelPaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paintContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        java.awt.Color color24 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        lineAndShapeRenderer2.setSeriesFillPaint((int) (short) 1, (java.awt.Paint) color24, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator30 = lineAndShapeRenderer2.getToolTipGenerator(8, 11, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryToolTipGenerator30);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        java.lang.String str8 = chartEntity7.getShapeCoords();
        java.awt.Shape shape9 = chartEntity7.getArea();
        boolean boolean11 = chartEntity7.equals((java.lang.Object) (short) 0);
        java.lang.Object obj12 = chartEntity7.clone();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-3,-3,3,3" + "'", str8, "-3,-3,3,3");
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "ChartEntity: tooltip = ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "ChartEntity: tooltip = ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "ChartEntity: tooltip = ");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition(35);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        boolean boolean12 = lineAndShapeRenderer2.getBaseCreateEntities();
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-12517568), (-1), true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        java.awt.Font font19 = lineAndShapeRenderer2.getBaseLegendTextFont();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(font19);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = lineAndShapeRenderer2.getToolTipGenerator(0, 52, true);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 100, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator27, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15);
        java.awt.Shape shape20 = lineAndShapeRenderer2.getItemShape((int) '#', (int) (byte) 10, true);
        java.awt.Shape shape24 = lineAndShapeRenderer2.getItemShape(10284987, 42, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = barRenderer0.getPlot();
        barRenderer0.setItemMargin(6.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(categoryPlot14);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.awt.Stroke stroke15 = categoryAxis2.getTickMarkStroke();
        float float16 = categoryAxis2.getTickMarkInsideLength();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(true);
        lineAndShapeRenderer2.setDefaultEntityRadius((int) (short) 0);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((int) (short) 10);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesLinesVisible(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.lang.Boolean boolean14 = renderAttributes13.getDefaultLabelVisible();
        java.awt.Shape shape17 = renderAttributes13.getItemShape((int) (short) 0, 5);
        java.awt.Paint paint18 = renderAttributes13.getDefaultOutlinePaint();
        renderAttributes13.setDefaultCreateEntity((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Stroke stroke7 = lineAndShapeRenderer2.getSeriesStroke(4);
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.drawOutline(graphics2D8, categoryPlot9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(stroke7);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        boolean boolean18 = lineAndShapeRenderer2.getUseSeriesOffset();
        java.awt.Font font20 = lineAndShapeRenderer2.lookupLegendTextFont((-1));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(font20);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        boolean boolean10 = lineAndShapeRenderer2.getUseOutlinePaint();
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) '#', false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint14 = barRenderer0.getBaseOutlinePaint();
        barRenderer0.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint14 = barRenderer0.getBaseOutlinePaint();
        barRenderer0.setMinimumBarLength((double) 5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        java.awt.Shape shape23 = lineAndShapeRenderer2.getItemShape(10, 10295828, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test5303() throws Throwable {
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
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getURLGenerator((int) 'a', (int) (short) 1, true);
        lineAndShapeRenderer2.setSeriesCreateEntities(192, (java.lang.Boolean) true);
        java.awt.Color color19 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        lineAndShapeRenderer2.setBaseLegendTextPaint((java.awt.Paint) color19);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNotNull(color19);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBasePaint();
        lineAndShapeRenderer2.setBaseCreateEntities(true, false);
        java.awt.Shape shape22 = null;
        lineAndShapeRenderer2.setSeriesShape(10284987, shape22, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (byte) 100, true);
        java.lang.Boolean boolean25 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) 'a');
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = lineAndShapeRenderer2.getURLGenerator((int) (short) 10, 100, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator20, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator18);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisibleInLegend((-100), (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray1 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray2 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray3 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray4 = org.jfree.chart.ChartColor.createDefaultPaintArray();
        java.awt.Stroke[] strokeArray5 = null;
        java.awt.Stroke[] strokeArray6 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Shape[] shapeArray7 = null;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier8 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray3, paintArray4, strokeArray5, strokeArray6, shapeArray7);
        java.awt.Stroke[] strokeArray9 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Shape[] shapeArray10 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_SHAPE_SEQUENCE;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier11 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, paintArray2, strokeArray6, strokeArray9, shapeArray10);
        java.awt.Stroke stroke12 = defaultDrawingSupplier11.getNextStroke();
        java.awt.Paint paint13 = defaultDrawingSupplier11.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray2);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(paintArray4);
        org.junit.Assert.assertNotNull(strokeArray6);
        org.junit.Assert.assertNotNull(strokeArray9);
        org.junit.Assert.assertNotNull(shapeArray10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test5310() throws Throwable {
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
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = lineAndShapeRenderer2.getURLGenerator((int) 'a', 100, false);
        java.awt.Stroke stroke21 = lineAndShapeRenderer2.getBaseStroke();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        boolean boolean16 = lineAndShapeRenderer2.getItemCreateEntity((int) 'a', (int) (byte) -1, false);
        java.lang.Boolean boolean18 = lineAndShapeRenderer2.getSeriesShapesFilled((-10289251));
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.getSeriesStroke((-7839));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(stroke20);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        boolean boolean8 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation7);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Font font14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font14, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = lineAndShapeRenderer2.getURLGenerator(4, (int) (short) 100, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator21);
        boolean boolean26 = lineAndShapeRenderer2.getItemCreateEntity((int) (short) 0, 0, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator27);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(0);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemLabelPaint((-1), 1, false);
        lineAndShapeRenderer2.setSeriesLinesVisible(0, true);
        java.awt.Shape shape25 = lineAndShapeRenderer2.lookupLegendShape(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Shape shape11 = lineAndShapeRenderer8.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity13 = new org.jfree.chart.entity.ChartEntity(shape11, "");
        legendItem1.setShape(shape11);
        boolean boolean15 = legendItem1.isShapeFilled();
        java.lang.Object obj16 = legendItem1.clone();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 0);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getSeriesOutlinePaint(500);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = lineAndShapeRenderer2.getSeriesToolTipGenerator((-1));
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        java.awt.Font font19 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer2.getItemLabelGenerator(4, (int) (byte) -1, false);
        java.lang.Boolean boolean26 = lineAndShapeRenderer2.getSeriesVisible((int) (byte) -1);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNull(boolean26);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Shape shape23 = lineAndShapeRenderer20.getBaseShape();
        lineAndShapeRenderer2.setLegendShape((int) (byte) 1, shape23);
        java.awt.Shape shape26 = lineAndShapeRenderer2.getSeriesShape((-12517568));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNull(shape26);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color17 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem13.setLinePaint((java.awt.Paint) color17);
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color17);
        java.awt.Font font20 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color17 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem13.setLinePaint((java.awt.Paint) color17);
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color17);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.jfree.chart.text.TextAnchor textAnchor18 = itemLabelPosition17.getTextAnchor();
        java.lang.String str19 = textAnchor18.toString();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(textAnchor18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "TextAnchor.BOTTOM_CENTER" + "'", str19, "TextAnchor.BOTTOM_CENTER");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator13);
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getSeriesOutlineStroke((-10));
        org.jfree.chart.LegendItem legendItem19 = new org.jfree.chart.LegendItem("hi!");
        org.jfree.chart.ChartColor chartColor23 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        legendItem19.setFillPaint((java.awt.Paint) chartColor23);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) ' ', (java.awt.Paint) chartColor23);
        java.lang.Object obj26 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Stroke stroke16 = renderAttributes13.getSeriesStroke(8);
        java.awt.Paint paint17 = renderAttributes13.getDefaultFillPaint();
        java.awt.Paint paint19 = renderAttributes13.getSeriesPaint((int) (byte) 0);
        java.awt.Paint paint20 = renderAttributes13.getDefaultLabelPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator19);
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        lineAndShapeRenderer2.setUseFillPaint(true);
        java.awt.Stroke stroke26 = lineAndShapeRenderer2.getSeriesStroke(3);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(stroke26);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        defaultCategoryDataset0.setValue(0.05d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 4);
        defaultCategoryDataset0.validateObject();
        defaultCategoryDataset0.removeColumn((int) (short) 0);
        defaultCategoryDataset0.clearSelection();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState11 = null;
        defaultCategoryDataset0.setSelectionState(categoryDatasetSelectionState11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = defaultCategoryDataset0.getValue(4, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        float float1 = categoryAxis0.getMinorTickMarkInsideLength();
        float float2 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.axis.AxisState axisState4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.util.RectangleEdge rectangleEdge6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = categoryAxis0.refreshTicks(graphics2D3, axisState4, rectangle2D5, rectangleEdge6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Paint paint19 = lineAndShapeRenderer2.lookupLegendTextPaint(24);
        boolean boolean20 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        boolean boolean17 = renderAttributes13.getAllowNull();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        barRenderer0.setShadowVisible(false);
        barRenderer0.setBaseCreateEntities(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        boolean boolean4 = legendItem1.isShapeVisible();
        legendItem1.setShapeVisible(false);
        java.awt.Paint paint7 = legendItem1.getOutlinePaint();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset8 = new org.jfree.data.category.DefaultCategoryDataset();
        int int10 = defaultCategoryDataset8.getColumnIndex((java.lang.Comparable) 3.0d);
        int int11 = defaultCategoryDataset8.getRowCount();
        defaultCategoryDataset8.addValue((double) 0L, (java.lang.Comparable) (short) 10, (java.lang.Comparable) (short) 1);
        legendItem1.setDataset((org.jfree.data.general.Dataset) defaultCategoryDataset8);
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(0);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemLabelPaint((-1), 1, false);
        lineAndShapeRenderer2.setSeriesLinesVisible(0, true);
        java.awt.Paint paint25 = lineAndShapeRenderer2.lookupLegendTextPaint((-7839));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(paint25);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        java.awt.Stroke stroke18 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        boolean boolean17 = lineAndShapeRenderer2.isSeriesVisibleInLegend(3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) (byte) 0);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(11, (java.lang.Boolean) true, false);
        lineAndShapeRenderer2.setUseSeriesOffset(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        lineAndShapeRenderer7.setSeriesVisible((int) (short) 1, (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        java.awt.Paint paint16 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        java.awt.Font font17 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Paint paint21 = lineAndShapeRenderer2.getItemOutlinePaint((int) (short) -1, 0, false);
        java.lang.Object obj22 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Paint paint13 = lineAndShapeRenderer2.getSeriesItemLabelPaint(0);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        lineAndShapeRenderer2.setBaseStroke(stroke14);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getSeriesOutlinePaint((int) (byte) 100);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        java.awt.Paint paint18 = lineAndShapeRenderer2.getItemPaint(0, (int) '4', true);
        lineAndShapeRenderer2.setDefaultEntityRadius(0);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(24, categoryToolTipGenerator23);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        barRenderer0.setShadowVisible(false);
        barRenderer0.setBaseCreateEntities(true, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke19 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100, false);
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean21 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Stroke stroke7 = lineAndShapeRenderer2.getSeriesStroke(4);
        boolean boolean8 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Font font9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseItemLabelFont(font9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        java.awt.Font font8 = lineAndShapeRenderer2.lookupLegendTextFont((int) (byte) 0);
        org.jfree.chart.LegendItem legendItem11 = lineAndShapeRenderer2.getLegendItem((int) (short) 100, (-16776961));
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator13 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        lineAndShapeRenderer2.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setSeriesShapesFilled((int) (byte) 100, true);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNull(legendItem11);
        org.junit.Assert.assertNull(drawingSupplier15);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(5, (java.lang.Boolean) false);
        boolean boolean15 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean18 = lineAndShapeRenderer2.getItemShapeFilled((int) ' ', (int) (byte) -1);
        lineAndShapeRenderer2.clearSeriesPaints(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke19 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100, false);
        lineAndShapeRenderer2.setSeriesVisible((int) (byte) 10, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator24);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke19 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100, false);
        lineAndShapeRenderer2.setSeriesVisible((int) (byte) 10, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator24, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        boolean boolean7 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, 0);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((-20561), itemLabelPosition12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        java.awt.Paint paint19 = lineAndShapeRenderer2.getItemFillPaint(3, (int) (short) 1, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        boolean boolean21 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation20);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        boolean boolean21 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) '4');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        barRenderer0.setShadowYOffset(10.0d);
        barRenderer0.setShadowXOffset(14.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        double double13 = lineAndShapeRenderer2.getItemMargin();
        java.lang.Object obj14 = lineAndShapeRenderer2.clone();
        boolean boolean16 = lineAndShapeRenderer2.isSeriesVisible(3);
        java.awt.Color color17 = java.awt.Color.ORANGE;
        lineAndShapeRenderer2.setBasePaint((java.awt.Paint) color17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setAutoPopulateSeriesPaint(true);
        barRenderer0.setShadowXOffset((double) 8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        int int7 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator24);
        java.awt.Paint paint27 = lineAndShapeRenderer2.getSeriesPaint((int) (short) 10);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint27);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean15 = lineAndShapeRenderer2.getBaseShapesFilled();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) '#', (java.lang.Boolean) false, false);
        org.jfree.chart.LegendItem legendItem22 = lineAndShapeRenderer2.getLegendItem((-1), (int) 'a');
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(legendItem22);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer2.removeAnnotations();
        java.lang.Boolean boolean22 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = barRenderer0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(drawingSupplier14);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean16 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        lineAndShapeRenderer2.setBaseSeriesVisible(false);
        java.awt.Stroke stroke19 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(categoryURLGenerator20);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        java.lang.Object obj7 = categoryAxis1.clone();
        java.awt.Paint paint8 = categoryAxis1.getLabelPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double11 = categoryAxis10.getFixedDimension();
        org.jfree.chart.plot.Plot plot12 = categoryAxis10.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = categoryAxis10.getLabelInsets();
        double double15 = rectangleInsets13.calculateTopInset((double) 1.0f);
        categoryAxis1.setLabelInsets(rectangleInsets13);
        categoryAxis1.setCategoryMargin((double) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        java.awt.Paint paint23 = lineAndShapeRenderer2.getBaseFillPaint();
        java.lang.Boolean boolean25 = lineAndShapeRenderer2.getSeriesCreateEntities((-7839));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(boolean25);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = lineAndShapeRenderer2.getSeriesToolTipGenerator(10);
        java.lang.Boolean boolean17 = lineAndShapeRenderer2.getSeriesVisibleInLegend((-12517568));
        boolean boolean18 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNull(categoryToolTipGenerator15);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator26);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        org.jfree.chart.plot.Marker marker9 = null;
        boolean boolean10 = categoryPlot4.removeDomainMarker(marker9);
        java.lang.String str11 = categoryPlot4.getPlotType();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent12 = null;
        categoryPlot4.annotationChanged(annotationChangeEvent12);
        java.lang.Object obj14 = categoryPlot4.clone();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        java.awt.Paint paint18 = lineAndShapeRenderer2.getItemPaint(0, (int) '4', true);
        lineAndShapeRenderer2.setDefaultEntityRadius(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        java.lang.Comparable comparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = keyedObjects2D0.getObject((java.lang.Comparable) '4', comparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.awt.Shape shape23 = lineAndShapeRenderer2.getItemShape((-1), (int) '4', true);
        java.awt.Color color24 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color24, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator27);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(color24);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        boolean boolean17 = lineAndShapeRenderer2.isSeriesVisibleInLegend(3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) (byte) 0);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        int int16 = legendItem1.getDatasetIndex();
        legendItem1.setLineVisible(true);
        java.awt.Stroke stroke19 = legendItem1.getLineStroke();
        java.awt.Paint paint20 = legendItem1.getLinePaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        java.util.List list7 = keyedObjects2D0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject((java.lang.Comparable) "DatasetRenderingOrder.REVERSE", (java.lang.Comparable) "-3,-3,3,3");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (DatasetRenderingOrder.REVERSE) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        java.lang.Object obj11 = legendItem6.clone();
        java.awt.Paint paint12 = legendItem6.getLabelPaint();
        int int13 = legendItem6.getDatasetIndex();
        java.awt.Stroke stroke14 = legendItem6.getOutlineStroke();
        java.lang.String str15 = legendItem6.getLabel();
        int int16 = legendItem6.getDatasetIndex();
        legendItem6.setDatasetIndex(100);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Paint paint1 = defaultDrawingSupplier0.getNextFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = lineAndShapeRenderer4.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean13 = defaultDrawingSupplier0.equals((java.lang.Object) lineAndShapeRenderer4);
        java.awt.Paint paint14 = defaultDrawingSupplier0.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Paint paint19 = lineAndShapeRenderer2.lookupLegendTextPaint(24);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator20, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Color color15 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color15);
        java.awt.Stroke stroke17 = renderAttributes13.getDefaultStroke();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(stroke17);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Paint paint15 = lineAndShapeRenderer2.getItemPaint((-10289251), (-7839), false);
        java.awt.Stroke stroke17 = lineAndShapeRenderer2.getSeriesOutlineStroke(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(stroke17);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        boolean boolean19 = lineAndShapeRenderer2.getItemShapeVisible(4, 3);
        lineAndShapeRenderer2.setSeriesVisible((int) '#', (java.lang.Boolean) true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) "TextAnchor.BOTTOM_CENTER");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable11 = keyedObjects2D0.getColumnKey((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5377() throws Throwable {
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
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(0);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBaseOutlinePaint();
        boolean boolean19 = lineAndShapeRenderer2.isSeriesVisible((int) (short) 100);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 0);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getSeriesOutlinePaint(500);
        lineAndShapeRenderer2.setDrawOutlines(true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        barRenderer0.setShadowYOffset((-6.0d));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        boolean boolean12 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition(9);
        java.awt.Font font16 = lineAndShapeRenderer2.lookupLegendTextFont(100);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNull(font16);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        java.awt.Paint paint10 = null;
        lineAndShapeRenderer2.setSeriesFillPaint((int) (short) 1, paint10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition(1);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        boolean boolean21 = lineAndShapeRenderer2.isSeriesVisibleInLegend(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        boolean boolean13 = barRenderer0.getIncludeBaseInRange();
        boolean boolean14 = barRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.ChartColor chartColor12 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color13 = chartColor12.darker();
        org.jfree.chart.LegendItem legendItem14 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor12);
        java.lang.Comparable comparable15 = legendItem14.getSeriesKey();
        boolean boolean16 = lineAndShapeRenderer2.equals((java.lang.Object) comparable15);
        lineAndShapeRenderer2.setSeriesShapesFilled(35, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNull(comparable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Paint paint15 = renderAttributes13.getDefaultPaint();
        java.lang.Boolean boolean16 = renderAttributes13.getDefaultCreateEntity();
        java.awt.Paint paint17 = renderAttributes13.getDefaultOutlinePaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.renderer.RenderAttributes renderAttributes14 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = lineAndShapeRenderer2.getPositiveItemLabelPosition(15, (int) (short) 100, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(renderAttributes14);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesVisible(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
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
        lineAndShapeRenderer2.setSeriesVisible((int) (byte) 1, (java.lang.Boolean) false, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        boolean boolean17 = legendItem1.isShapeOutlineVisible();
        java.awt.Stroke stroke18 = legendItem1.getOutlineStroke();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        boolean boolean14 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation15);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Paint paint13 = lineAndShapeRenderer2.getSeriesItemLabelPaint(0);
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        lineAndShapeRenderer2.setBaseStroke(stroke14);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(true);
        lineAndShapeRenderer2.setDefaultEntityRadius((int) (short) 0);
        java.awt.Font font22 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(font22);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (byte) 10, categoryToolTipGenerator18, true);
        java.awt.Paint paint22 = lineAndShapeRenderer2.getSeriesPaint(10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (byte) 10, categoryToolTipGenerator24, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        int int17 = lineAndShapeRenderer2.getRowCount();
        lineAndShapeRenderer2.setSeriesVisible(3, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) (short) 1, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Stroke stroke10 = lineAndShapeRenderer6.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = lineAndShapeRenderer6.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer6.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer6.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Stroke stroke22 = lineAndShapeRenderer6.getItemStroke((int) (byte) 100, 3, true);
        lineAndShapeRenderer2.setSeriesOutlineStroke(100, stroke22);
        boolean boolean24 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setMinimumBarLength(35.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        java.awt.Font font19 = null;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 1, font19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer2.getItemLabelGenerator(4, (int) (byte) -1, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(1, categoryToolTipGenerator26, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = lineAndShapeRenderer2.getBaseURLGenerator();
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = lineAndShapeRenderer2.getSeriesURLGenerator(35);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator23);
        org.junit.Assert.assertNull(categoryURLGenerator28);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean16 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemPaint((int) (byte) 1, 10284987, true);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator18);
        java.lang.Boolean boolean21 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(15);
        java.awt.Paint paint25 = lineAndShapeRenderer2.getItemPaint((int) '4', 0, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 100, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        lineAndShapeRenderer2.setDrawOutlines(false);
        java.awt.Shape shape21 = lineAndShapeRenderer2.getBaseLegendShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = lineAndShapeRenderer2.getURLGenerator(0, 100, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(categoryURLGenerator25);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color9 = java.awt.Color.darkGray;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color9, true);
        java.awt.Stroke stroke12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseStroke(stroke12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        int int19 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 10, categoryURLGenerator18, true);
        lineAndShapeRenderer2.clearSeriesStrokes(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        org.jfree.chart.plot.Plot plot11 = categoryPlot10.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot10.zoomDomainAxes(0.0d, (-5.0d), plotRenderingInfo14, point2D15);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        boolean boolean16 = lineAndShapeRenderer2.getItemCreateEntity((int) 'a', (int) (byte) -1, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = lineAndShapeRenderer2.getSeriesToolTipGenerator((-1));
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (short) 0, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator11, true);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = lineAndShapeRenderer2.getBaseURLGenerator();
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 0, (java.lang.Boolean) false);
        lineAndShapeRenderer2.setSeriesCreateEntities(10284987, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator23);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getURLGenerator(255, 4, false);
        java.awt.Stroke stroke17 = lineAndShapeRenderer2.getSeriesStroke((-16776961));
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (short) 10, (java.lang.Boolean) false);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(8, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNull(stroke17);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        org.jfree.chart.plot.Plot plot11 = categoryPlot10.getParent();
        java.util.List list12 = categoryPlot10.getCategories();
        org.jfree.chart.util.SortOrder sortOrder13 = categoryPlot10.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNull(list12);
        org.junit.Assert.assertNotNull(sortOrder13);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double5 = categoryAxis4.getFixedDimension();
        org.jfree.chart.plot.Plot plot6 = categoryAxis4.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = categoryAxis4.getLabelInsets();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions8 = categoryAxis4.getCategoryLabelPositions();
        categoryAxis1.setCategoryLabelPositions(categoryLabelPositions8);
        java.awt.Color color13 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        categoryAxis1.setAxisLinePaint((java.awt.Paint) color13);
        categoryAxis1.setTickMarksVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(categoryLabelPositions8);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.lang.Boolean boolean14 = renderAttributes13.getDefaultLabelVisible();
        java.awt.Shape shape17 = renderAttributes13.getItemShape((int) (short) 0, 5);
        java.awt.Paint paint18 = renderAttributes13.getDefaultFillPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer4.getBaseNegativeItemLabelPosition();
        barRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition11);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor13 = itemLabelPosition11.getItemLabelAnchor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(itemLabelAnchor13);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (-254));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-254) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setItemMargin(10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 0.0 <= margin < 1.0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset7 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.event.DatasetChangeEvent datasetChangeEvent9 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) shape6, (org.jfree.data.general.Dataset) defaultCategoryDataset7, datasetChangeInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        int int17 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = lineAndShapeRenderer2.getBaseURLGenerator();
        lineAndShapeRenderer2.setSeriesCreateEntities(4, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator23, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(categoryURLGenerator18);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        org.jfree.chart.LegendItem legendItem4 = lineAndShapeRenderer0.getLegendItem(0, 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = lineAndShapeRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer0.setSeriesNegativeItemLabelPosition((-1), itemLabelPosition7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNull(legendItem4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        boolean boolean19 = lineAndShapeRenderer2.getItemCreateEntity(8, (int) (byte) 10, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) (byte) 0, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        boolean boolean22 = lineAndShapeRenderer2.getAutoPopulateSeriesShape();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        boolean boolean5 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        java.lang.String str15 = chartEntity14.getShapeCoords();
        java.awt.Shape shape16 = chartEntity14.getArea();
        lineAndShapeRenderer2.setSeriesShape((int) '#', shape16);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-3,-3,3,3" + "'", str15, "-3,-3,3,3");
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Object obj23 = null;
        boolean boolean24 = lineAndShapeRenderer2.equals(obj23);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Paint paint15 = renderAttributes13.getDefaultPaint();
        java.awt.Stroke stroke16 = renderAttributes13.getDefaultStroke();
        java.awt.Paint paint18 = renderAttributes13.getSeriesFillPaint(255);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke19 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.extendWidth((double) 10L);
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D6 = rectangleInsets0.createAdjustedRectangle(rectangle2D3, lengthAdjustmentType4, lengthAdjustmentType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.0d + "'", double2 == 16.0d);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(2);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Stroke stroke12 = lineAndShapeRenderer8.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = lineAndShapeRenderer8.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer8.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        java.awt.Shape shape22 = lineAndShapeRenderer8.getItemShape(2, 5, false);
        shapeList0.setShape((int) ' ', shape22);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
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
        categoryPlot4.clearRangeMarkers();
        java.util.List list18 = categoryPlot4.getAnnotations();
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        lineAndShapeRenderer0.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color12 = java.awt.Color.BLUE;
        lineAndShapeRenderer11.setBaseItemLabelPaint((java.awt.Paint) color12);
        java.awt.Stroke stroke15 = lineAndShapeRenderer11.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer11.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer11.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer11.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Stroke stroke27 = lineAndShapeRenderer11.getItemStroke((int) (byte) 100, 3, true);
        lineAndShapeRenderer0.setSeriesStroke(15, stroke27, false);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        boolean boolean16 = legendItem1.isShapeOutlineVisible();
        java.lang.String str17 = legendItem1.getDescription();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        int int7 = chartColor4.getAlpha();
        java.awt.image.ColorModel colorModel8 = null;
        java.awt.Rectangle rectangle9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.AffineTransform affineTransform11 = null;
        java.awt.RenderingHints renderingHints12 = null;
        java.awt.PaintContext paintContext13 = chartColor4.createContext(colorModel8, rectangle9, rectangle2D10, affineTransform11, renderingHints12);
        java.lang.String str14 = chartColor4.toString();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 255 + "'", int7 == 255);
        org.junit.Assert.assertNotNull(paintContext13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.jfree.chart.ChartColor[r=97,g=35,b=52]" + "'", str14, "org.jfree.chart.ChartColor[r=97,g=35,b=52]");
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        java.lang.String str8 = chartEntity7.getShapeCoords();
        java.awt.Shape shape9 = chartEntity7.getArea();
        org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator10 = null;
        org.jfree.chart.imagemap.URLTagFragmentGenerator uRLTagFragmentGenerator11 = null;
        java.lang.String str12 = chartEntity7.getImageMapAreaTag(toolTipTagFragmentGenerator10, uRLTagFragmentGenerator11);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-3,-3,3,3" + "'", str8, "-3,-3,3,3");
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((-16776961), itemLabelPosition10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        java.lang.Object obj11 = legendItem6.clone();
        java.awt.Paint paint12 = legendItem6.getLabelPaint();
        int int13 = legendItem6.getDatasetIndex();
        java.awt.Stroke stroke14 = legendItem6.getOutlineStroke();
        java.awt.Paint paint15 = legendItem6.getOutlinePaint();
        java.lang.String str16 = legendItem6.getLabel();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        boolean boolean11 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, (int) '4');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) (byte) 100, (int) (byte) 0, true);
        java.awt.Color color16 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        lineAndShapeRenderer2.setBasePaint((java.awt.Paint) color16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation20 = null;
        boolean boolean21 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation20);
        java.awt.Font font22 = lineAndShapeRenderer2.getBaseLegendTextFont();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(font22);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        lineAndShapeRenderer2.setUseOutlinePaint(true);
        java.lang.Object obj18 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        java.awt.Font font17 = lineAndShapeRenderer2.lookupLegendTextFont(0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(font17);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator26, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.lang.Boolean boolean14 = renderAttributes13.getDefaultLabelVisible();
        java.awt.Shape shape15 = renderAttributes13.getDefaultShape();
        java.awt.Paint paint16 = renderAttributes13.getDefaultLabelPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(paint16);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        java.awt.Shape shape4 = null;
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color10 = chartColor9.darker();
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor9);
        int int12 = chartColor9.getAlpha();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape4, (java.awt.Paint) chartColor9);
        legendItem13.setLineVisible(true);
        java.awt.Font font16 = legendItem13.getLabelFont();
        java.awt.Paint paint17 = legendItem13.getFillPaint();
        boolean boolean18 = legendItem13.isShapeFilled();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 255 + "'", int12 == 255);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        keyedObjects2D0.clear();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int7 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) true);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = keyedObjects2D0.getRowIndex(comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator18);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = lineAndShapeRenderer2.getURLGenerator(192, (int) (byte) 10, true);
        java.awt.Paint paint27 = lineAndShapeRenderer2.getItemOutlinePaint((-2), 0, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator23);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        lineAndShapeRenderer2.setSeriesVisible(192, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setUseSeriesOffset(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (byte) -1, categoryItemLabelGenerator7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D12 = rectangleInsets4.createOutsetRectangle(rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        java.awt.Font font8 = lineAndShapeRenderer0.getItemLabelFont(11, 2, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = lineAndShapeRenderer0.getBaseToolTipGenerator();
        java.awt.Stroke stroke10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer0.setBaseStroke(stroke10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        java.awt.Stroke stroke19 = lineAndShapeRenderer2.getBaseStroke();
        java.awt.Paint paint21 = lineAndShapeRenderer2.lookupSeriesFillPaint((int) (short) -1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        lineAndShapeRenderer2.removeAnnotations();
        java.awt.Paint paint22 = lineAndShapeRenderer2.getSeriesItemLabelPaint(192);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = lineAndShapeRenderer2.getSeriesURLGenerator((int) (byte) 10);
        lineAndShapeRenderer2.setItemLabelAnchorOffset((double) (byte) 100);
        boolean boolean26 = lineAndShapeRenderer2.getItemVisible(2, 10);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) "ItemLabelAnchor.INSIDE7");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (ItemLabelAnchor.INSIDE7) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator23);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator12, false);
        boolean boolean17 = lineAndShapeRenderer2.getItemVisible((int) (short) 10, 0);
        boolean boolean18 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesLinesVisible(0);
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        java.lang.String str8 = chartEntity7.getShapeCoords();
        java.awt.Shape shape9 = chartEntity7.getArea();
        boolean boolean11 = chartEntity7.equals((java.lang.Object) (short) 0);
        java.lang.String str12 = chartEntity7.getShapeType();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-3,-3,3,3" + "'", str8, "-3,-3,3,3");
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "rect" + "'", str12, "rect");
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = lineAndShapeRenderer2.getBaseURLGenerator();
        java.awt.Paint paint27 = lineAndShapeRenderer2.getItemLabelPaint((int) (short) 1, 100, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator23);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 100, false);
        java.awt.Shape shape10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseShape(shape10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        java.awt.Paint paint10 = null;
        lineAndShapeRenderer2.setSeriesFillPaint((int) (short) 1, paint10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition(1);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        java.awt.Shape shape23 = lineAndShapeRenderer2.getItemShape((int) (byte) 10, (-16777206), true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.data.Range range18 = lineAndShapeRenderer2.findRangeBounds(categoryDataset17);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(500, itemLabelPosition23, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(true);
        boolean boolean17 = lineAndShapeRenderer2.getUseFillPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean16 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        lineAndShapeRenderer2.setBaseSeriesVisible(false);
        boolean boolean20 = lineAndShapeRenderer2.isSeriesVisible(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        java.lang.Class<?> wildcardClass13 = lineAndShapeRenderer2.getClass();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        keyedObjects2D0.clear();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        int int7 = keyedObjects2D0.getColumnIndex((java.lang.Comparable) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = keyedObjects2D0.getObject(15, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 15, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(5, (java.lang.Boolean) false);
        boolean boolean15 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        float float1 = categoryAxis0.getMinorTickMarkInsideLength();
        boolean boolean2 = categoryAxis0.isTickLabelsVisible();
        float float3 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        categoryAxis0.setTickMarkOutsideLength((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryAxis0.getTickLabelInsets();
        double double7 = rectangleInsets6.getTop();
        double double8 = rectangleInsets6.getRight();
        double double9 = rectangleInsets6.getTop();
        org.jfree.chart.util.UnitType unitType10 = rectangleInsets6.getUnitType();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertNotNull(unitType10);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.renderer.RenderAttributes renderAttributes14 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setBaseCreateEntities(true, false);
        java.awt.Paint paint19 = lineAndShapeRenderer2.getSeriesFillPaint(5);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(renderAttributes14);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getSeriesURLGenerator(0);
        java.awt.Stroke stroke17 = lineAndShapeRenderer2.lookupSeriesStroke(128);
        lineAndShapeRenderer2.setSeriesShapesVisible(9, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        int int17 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator20);
        java.awt.Font font22 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(categoryURLGenerator18);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Shape shape11 = lineAndShapeRenderer8.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity13 = new org.jfree.chart.entity.ChartEntity(shape11, "");
        legendItem1.setShape(shape11);
        java.lang.String str15 = legendItem1.getToolTipText();
        legendItem1.setURLText("PlotOrientation.VERTICAL");
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        boolean boolean12 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation11);
        lineAndShapeRenderer2.setUseFillPaint(false);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getSeriesPaint(3);
        java.awt.Paint paint18 = lineAndShapeRenderer2.getSeriesFillPaint(1);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseFillPaint();
        boolean boolean14 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = lineAndShapeRenderer2.getPlot();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(categoryPlot15);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        java.lang.String str3 = legendItem1.getDescription();
        legendItem1.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Shape shape11 = lineAndShapeRenderer8.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity13 = new org.jfree.chart.entity.ChartEntity(shape11, "");
        legendItem1.setShape(shape11);
        java.lang.String str15 = legendItem1.getToolTipText();
        java.text.AttributedString attributedString16 = legendItem1.getAttributedLabel();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(attributedString16);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getLegendTextPaint(0);
        java.awt.Stroke stroke18 = lineAndShapeRenderer2.lookupSeriesStroke(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.awt.Color color1 = java.awt.Color.GRAY;
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 0, color1, 1.0f, (-1), 10.0d);
        int int6 = defaultShadowGenerator5.getShadowSize();
        int int7 = defaultShadowGenerator5.getShadowSize();
        int int8 = defaultShadowGenerator5.getDistance();
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        boolean boolean10 = defaultShadowGenerator5.equals((java.lang.Object) paint9);
        float float11 = defaultShadowGenerator5.getShadowOpacity();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(true);
        java.awt.Font font21 = lineAndShapeRenderer2.getItemLabelFont(24, (int) (byte) 0, true);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(1, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) true, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = lineAndShapeRenderer2.getPlot();
        boolean boolean13 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.lang.Boolean boolean15 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) '4');
        lineAndShapeRenderer2.setBaseShapesFilled(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) 100, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5480() throws Throwable {
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
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.util.RectangleInsets.ZERO_INSETS;
        double double2 = rectangleInsets0.extendWidth(0.0d);
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D6 = rectangleInsets0.createAdjustedRectangle(rectangle2D3, lengthAdjustmentType4, lengthAdjustmentType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5482() throws Throwable {
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
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(2, 5, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer2.getItemLabelGenerator((int) (byte) 10, 192, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
    }

    @Test
    public void test5484() throws Throwable {
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
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Stroke stroke17 = lineAndShapeRenderer2.lookupSeriesStroke((int) (byte) 100);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(33, (-1), true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) (byte) 100);
        lineAndShapeRenderer2.setSeriesCreateEntities(97, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.awt.Shape shape23 = lineAndShapeRenderer2.getItemShape((-1), (int) '4', true);
        boolean boolean24 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        java.lang.Object obj11 = legendItem6.clone();
        java.awt.Paint paint12 = legendItem6.getLabelPaint();
        org.jfree.data.general.Dataset dataset13 = legendItem6.getDataset();
        boolean boolean14 = legendItem6.isShapeFilled();
        legendItem6.setDescription("TextAnchor.TOP_CENTER");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(dataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator14);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator18 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator18);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getLegendTextPaint(0);
        boolean boolean17 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(5, (java.lang.Boolean) false);
        boolean boolean15 = lineAndShapeRenderer2.getBaseSeriesVisible();
        java.awt.Shape shape16 = lineAndShapeRenderer2.getBaseShape();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        java.lang.Object obj11 = legendItem6.clone();
        java.awt.Paint paint12 = legendItem6.getLabelPaint();
        org.jfree.data.general.Dataset dataset13 = legendItem6.getDataset();
        boolean boolean14 = legendItem6.isShapeFilled();
        java.awt.Paint paint15 = legendItem6.getLabelPaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(dataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        lineAndShapeRenderer2.setDrawOutlines(false);
        java.awt.Paint paint22 = lineAndShapeRenderer2.getSeriesFillPaint((int) (byte) 0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
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
        java.awt.Paint paint23 = lineAndShapeRenderer2.getItemPaint(35, 0, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        java.awt.Paint paint13 = lineAndShapeRenderer2.getSeriesPaint(0);
        java.awt.Paint paint15 = lineAndShapeRenderer2.getSeriesFillPaint((-10411212));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getLegendShape(0);
        java.awt.Shape shape14 = lineAndShapeRenderer2.lookupSeriesShape((int) (byte) 10);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        boolean boolean18 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        java.awt.Paint paint16 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition((int) (byte) 0, itemLabelPosition18);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(0, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(255);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemOutlinePaint(100, 15, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator13);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor18 = itemLabelPosition17.getTextAnchor();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(textAnchor18);
    }
}
