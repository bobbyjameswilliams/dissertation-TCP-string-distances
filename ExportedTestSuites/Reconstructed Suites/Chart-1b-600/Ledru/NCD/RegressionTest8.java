package org.jfree.chart.renderer.category;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesCreateEntities(10);
        org.jfree.chart.ChartColor chartColor21 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color22 = chartColor21.darker();
        lineAndShapeRenderer2.setSeriesFillPaint(100, (java.awt.Paint) color22);
        java.awt.Paint paint25 = lineAndShapeRenderer2.getSeriesFillPaint((-7839));
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((-100), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNull(paint25);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer14.setBaseURLGenerator(categoryURLGenerator15);
        java.awt.Shape shape18 = lineAndShapeRenderer14.getLegendShape(0);
        lineAndShapeRenderer14.setAutoPopulateSeriesStroke(false);
        java.awt.Font font22 = lineAndShapeRenderer14.getSeriesItemLabelFont(0);
        lineAndShapeRenderer14.setUseSeriesOffset(true);
        java.awt.Shape shape26 = null;
        lineAndShapeRenderer14.setSeriesShape((int) (short) 10, shape26, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = lineAndShapeRenderer14.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition29);
        java.lang.Object obj31 = null;
        boolean boolean32 = itemLabelPosition29.equals(obj31);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        java.awt.Stroke stroke19 = null;
        lineAndShapeRenderer2.setSeriesStroke(10, stroke19);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Paint paint23 = lineAndShapeRenderer2.getBaseFillPaint();
        java.lang.Boolean boolean25 = lineAndShapeRenderer2.getSeriesLinesVisible((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-52));
        java.lang.Object obj28 = null;
        boolean boolean29 = itemLabelPosition27.equals(obj28);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryAxis15.getLabelInsets();
        java.lang.String str21 = rectangleInsets20.toString();
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rectangleInsets20.trim(rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str21, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean15 = lineAndShapeRenderer2.getBaseShapesFilled();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) '#', (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color24 = java.awt.Color.BLUE;
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color24);
        java.awt.Shape shape26 = lineAndShapeRenderer23.getBaseShape();
        lineAndShapeRenderer2.setSeriesShape(11, shape26, false);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = null;
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState34 = lineAndShapeRenderer2.initialise(graphics2D29, rectangle2D30, categoryPlot31, categoryDataset32, plotRenderingInfo33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot14.getDomainAxisForDataset(2);
        java.awt.Font font18 = categoryAxis17.getTickLabelFont();
        java.awt.Paint paint19 = categoryAxis17.getTickLabelPaint();
        categoryAxis17.setMinorTickMarksVisible(false);
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = null;
        double double26 = categoryAxis17.getCategoryStart((-12517568), 3, rectangle2D24, rectangleEdge25);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxis17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        categoryPlot14.configureDomainAxes();
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot14.getRangeAxisLocation();
        org.jfree.chart.plot.Marker marker20 = null;
        org.jfree.chart.util.Layer layer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = categoryPlot14.removeRangeMarker(2, marker20, layer21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        org.jfree.data.UnknownKeyException unknownKeyException20 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray21 = unknownKeyException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = unknownKeyException20.getSuppressed();
        boolean boolean23 = standardCategorySeriesLabelGenerator15.equals((java.lang.Object) unknownKeyException20);
        java.lang.String str24 = unknownKeyException20.toString();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str24, "org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryAxis15.getLabelInsets();
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D24 = rectangleInsets20.createAdjustedRectangle(rectangle2D21, lengthAdjustmentType22, lengthAdjustmentType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
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
        boolean boolean23 = lineAndShapeRenderer2.isItemLabelVisible((int) (byte) 100, 52, false);
        boolean boolean24 = lineAndShapeRenderer2.getBaseShapesFilled();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setTickLabelsVisible(false);
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color10 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem6.setLinePaint((java.awt.Paint) color10);
        boolean boolean12 = legendItem6.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = lineAndShapeRenderer15.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape25 = lineAndShapeRenderer15.lookupLegendShape(8);
        legendItem6.setLine(shape25);
        boolean boolean27 = categoryAxis1.equals((java.lang.Object) shape25);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = categoryAxis1.getTickLabelInsets();
        double double29 = rectangleInsets28.getLeft();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean5 = categoryAxis1.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer9.setSeriesToolTipGenerator(10, categoryToolTipGenerator13);
        boolean boolean15 = lineAndShapeRenderer9.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke17 = null;
        lineAndShapeRenderer9.setSeriesStroke((int) 'a', stroke17, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor21 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color22 = java.awt.Color.yellow;
        boolean boolean23 = itemLabelAnchor21.equals((java.lang.Object) color22);
        lineAndShapeRenderer9.setSeriesFillPaint((int) ' ', (java.awt.Paint) color22);
        categoryAxis1.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color22);
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) "hi!", "DatasetRenderingOrder.REVERSE");
        java.awt.Font font29 = categoryAxis1.getLabelFont();
        float float30 = categoryAxis1.getTickMarkInsideLength();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator12, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color21 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer17.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = lineAndShapeRenderer17.getBaseToolTipGenerator();
        java.lang.Boolean boolean25 = lineAndShapeRenderer17.getSeriesVisible((int) (short) -1);
        boolean boolean26 = lineAndShapeRenderer17.getBaseItemLabelsVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = lineAndShapeRenderer17.getSeriesNegativeItemLabelPosition(35);
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition28, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = lineAndShapeRenderer2.getPlot();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNull(categoryPlot33);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator13 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        boolean boolean15 = standardCategorySeriesLabelGenerator13.equals((java.lang.Object) 100L);
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator13);
        java.awt.Stroke stroke18 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Shape shape20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesShape((-10411212), shape20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(stroke18);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint17 = renderAttributes16.getDefaultPaint();
        java.awt.Stroke stroke18 = renderAttributes16.getDefaultOutlineStroke();
        java.awt.Paint paint20 = renderAttributes16.getSeriesFillPaint((-52));
        java.awt.Stroke stroke21 = renderAttributes16.getDefaultStroke();
        java.awt.Shape shape22 = renderAttributes16.getDefaultShape();
        java.awt.Paint paint24 = renderAttributes16.getSeriesFillPaint((-716));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot14.getDataRange(valueAxis16);
        org.jfree.chart.axis.AxisLocation axisLocation18 = categoryPlot14.getRangeAxisLocation();
        categoryPlot14.configureDomainAxes();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        categoryPlot14.removeChangeListener(plotChangeListener20);
        org.jfree.chart.util.Layer layer22 = null;
        java.util.Collection collection23 = categoryPlot14.getDomainMarkers(layer22);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(collection23);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot4.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot4.getDomainAxisEdge((int) (short) 100);
        java.awt.Paint paint26 = categoryPlot4.getRangeGridlinePaint();
        boolean boolean27 = categoryPlot4.isDomainGridlinesVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot4.panRangeAxes((double) (byte) 10, plotRenderingInfo29, point2D30);
        categoryPlot4.setForegroundAlpha((float) (short) 0);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
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
        java.awt.Paint paint35 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryURLGenerator28);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        barRenderer0.setItemMargin((double) 192);
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
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator21 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("{0}");
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator21);
        java.lang.Boolean boolean24 = lineAndShapeRenderer2.getSeriesCreateEntities(255);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation26 = null;
        boolean boolean27 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation26);
        lineAndShapeRenderer2.setUseFillPaint(true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(categoryToolTipGenerator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator4, false);
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        categoryPlot12.removeChangeListener(plotChangeListener26);
        java.awt.Color color31 = java.awt.Color.getHSBColor((-1.0f), (float) (short) 0, (float) 10L);
        categoryPlot12.setNoDataMessagePaint((java.awt.Paint) color31);
        java.awt.Paint paint33 = categoryPlot12.getNoDataMessagePaint();
        lineAndShapeRenderer2.setSeriesPaint(10, paint33);
        java.lang.Object obj35 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge((int) ' ');
        boolean boolean18 = categoryPlot14.isRangeZeroBaselineVisible();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.plot.Marker marker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        boolean boolean23 = categoryPlot14.removeDomainMarker((int) '#', marker21, layer22);
        categoryPlot14.setRangeGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.awt.Paint paint24 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = lineAndShapeRenderer2.getSeriesURLGenerator((-1));
        boolean boolean27 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(font19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryURLGenerator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        lineAndShapeRenderer28.setBaseURLGenerator(categoryURLGenerator29);
        java.awt.Shape shape32 = lineAndShapeRenderer28.getLegendShape(0);
        lineAndShapeRenderer28.setAutoPopulateSeriesStroke(false);
        java.awt.Font font36 = lineAndShapeRenderer28.getSeriesItemLabelFont(0);
        lineAndShapeRenderer28.setUseSeriesOffset(true);
        java.awt.Shape shape40 = null;
        lineAndShapeRenderer28.setSeriesShape((int) (short) 10, shape40, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = lineAndShapeRenderer28.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor44 = itemLabelPosition43.getTextAnchor();
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 0, itemLabelPosition43, false);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor47 = itemLabelPosition43.getItemLabelAnchor();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNull(font36);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(itemLabelAnchor47);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean5 = categoryAxis1.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer9.setBaseURLGenerator(categoryURLGenerator10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer9.setSeriesToolTipGenerator(10, categoryToolTipGenerator13);
        boolean boolean15 = lineAndShapeRenderer9.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke17 = null;
        lineAndShapeRenderer9.setSeriesStroke((int) 'a', stroke17, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor21 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color22 = java.awt.Color.yellow;
        boolean boolean23 = itemLabelAnchor21.equals((java.lang.Object) color22);
        lineAndShapeRenderer9.setSeriesFillPaint((int) ' ', (java.awt.Paint) color22);
        categoryAxis1.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color22);
        double double26 = categoryAxis1.getLabelAngle();
        boolean boolean27 = categoryAxis1.isMinorTickMarksVisible();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
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
        org.jfree.chart.util.SortOrder sortOrder33 = categoryPlot4.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryItemRenderer30);
        org.junit.Assert.assertNotNull(sortOrder33);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot14);
        org.jfree.chart.JFreeChart jFreeChart16 = plotChangeEvent15.getChart();
        java.lang.Object obj17 = plotChangeEvent15.getSource();
        org.jfree.chart.plot.Plot plot18 = plotChangeEvent15.getPlot();
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType19 = plotChangeEvent15.getType();
        org.jfree.chart.JFreeChart jFreeChart20 = plotChangeEvent15.getChart();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(jFreeChart16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(chartChangeEventType19);
        org.junit.Assert.assertNull(jFreeChart20);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        barRenderer0.setSeriesItemLabelsVisible(10, true);
        java.awt.Color color36 = java.awt.Color.pink;
        barRenderer0.setBasePaint((java.awt.Paint) color36, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.LegendItem legendItem5 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString6 = legendItem5.getAttributedLabel();
        java.lang.String str7 = legendItem5.getDescription();
        legendItem5.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color13 = java.awt.Color.BLUE;
        lineAndShapeRenderer12.setBaseItemLabelPaint((java.awt.Paint) color13);
        java.awt.Shape shape15 = lineAndShapeRenderer12.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity17 = new org.jfree.chart.entity.ChartEntity(shape15, "");
        legendItem5.setShape(shape15);
        barRenderer0.setBaseShape(shape15, true);
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape15, "ItemLabelAnchor.INSIDE10", "ItemLabelAnchor.INSIDE10");
        java.lang.String str24 = chartEntity23.getToolTipText();
        chartEntity23.setURLText("Category Plot");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertNull(attributedString6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ItemLabelAnchor.INSIDE10" + "'", str24, "ItemLabelAnchor.INSIDE10");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        double double20 = itemLabelPosition19.getAngle();
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor21 = itemLabelPosition19.getItemLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor22 = itemLabelPosition19.getTextAnchor();
        java.lang.String str23 = textAnchor22.toString();
        java.awt.Shape shape28 = null;
        org.jfree.chart.ChartColor chartColor33 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color34 = chartColor33.darker();
        org.jfree.chart.LegendItem legendItem35 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor33);
        int int36 = chartColor33.getAlpha();
        org.jfree.chart.LegendItem legendItem37 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape28, (java.awt.Paint) chartColor33);
        boolean boolean38 = textAnchor22.equals((java.lang.Object) legendItem37);
        java.awt.Shape shape39 = legendItem37.getLine();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "TextAnchor.BOTTOM_CENTER" + "'", str23, "TextAnchor.BOTTOM_CENTER");
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 255 + "'", int36 == 255);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        boolean boolean26 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation25);
        java.lang.Boolean boolean28 = lineAndShapeRenderer2.getSeriesVisibleInLegend((int) '4');
        java.lang.Boolean boolean30 = lineAndShapeRenderer2.getSeriesShapesVisible((-52));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(boolean30);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        java.awt.Shape shape25 = lineAndShapeRenderer22.getBaseShape();
        java.awt.Stroke stroke26 = lineAndShapeRenderer22.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke26, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesURLGenerator((-1), categoryURLGenerator30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
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
        org.jfree.chart.axis.AxisSpace axisSpace26 = null;
        categoryPlot12.setFixedDomainAxisSpace(axisSpace26);
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.RenderingSource renderingSource31 = null;
        categoryPlot12.select(0.0d, (double) 100L, rectangle2D30, renderingSource31);
        org.jfree.chart.LegendItemCollection legendItemCollection33 = categoryPlot12.getFixedLegendItems();
        boolean boolean34 = lineAndShapeRenderer2.equals((java.lang.Object) legendItemCollection33);
        java.lang.Object obj35 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(legendItemCollection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition(0);
        java.awt.Font font8 = lineAndShapeRenderer2.getBaseLegendTextFont();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color16 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer12.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color16);
        java.awt.Paint paint18 = lineAndShapeRenderer12.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer12.setSeriesURLGenerator(97, categoryURLGenerator20, false);
        lineAndShapeRenderer12.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = lineAndShapeRenderer12.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 0, itemLabelPosition29, true);
        java.awt.Shape shape33 = lineAndShapeRenderer2.lookupSeriesShape(0);
        org.jfree.chart.entity.ChartEntity chartEntity35 = new org.jfree.chart.entity.ChartEntity(shape33, "java.awt.Color[r=223,g=255,b=190]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.awt.Color color27 = java.awt.Color.GRAY;
        lineAndShapeRenderer2.setSeriesFillPaint(100, (java.awt.Paint) color27, false);
        java.awt.Stroke stroke33 = lineAndShapeRenderer2.getItemStroke(8, (-254), true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(categoryAxis19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(11, categoryItemLabelGenerator31);
        double double33 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        lineAndShapeRenderer2.setSeriesCreateEntities(100, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.0d + "'", double33 == 2.0d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = categoryPlot14.getDomainAxisForDataset(2);
        java.awt.Font font18 = categoryAxis17.getTickLabelFont();
        java.awt.Paint paint19 = categoryAxis17.getTickLabelPaint();
        categoryAxis17.setMinorTickMarksVisible(false);
        double double22 = categoryAxis17.getLowerMargin();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions23 = categoryAxis17.getCategoryLabelPositions();
        java.lang.Object obj24 = categoryAxis17.clone();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxis17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.05d + "'", double22 == 0.05d);
        org.junit.Assert.assertNotNull(categoryLabelPositions23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.data.Range range26 = lineAndShapeRenderer2.findRangeBounds(categoryDataset24, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator29);
        int int31 = lineAndShapeRenderer2.getRowCount();
        java.awt.Stroke stroke33 = lineAndShapeRenderer2.getSeriesOutlineStroke((-16777216));
        lineAndShapeRenderer2.clearSeriesPaints(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(stroke33);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        java.awt.Shape shape30 = lineAndShapeRenderer26.getLegendShape(0);
        lineAndShapeRenderer26.setAutoPopulateSeriesStroke(false);
        java.awt.Font font34 = lineAndShapeRenderer26.getSeriesItemLabelFont(0);
        lineAndShapeRenderer26.setUseSeriesOffset(true);
        java.awt.Font font38 = null;
        lineAndShapeRenderer26.setSeriesItemLabelFont((int) (short) 1, font38, false);
        java.awt.Stroke stroke44 = lineAndShapeRenderer26.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer2.setBaseStroke(stroke44);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNull(font34);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true, false);
        java.awt.Font font16 = lineAndShapeRenderer2.getSeriesItemLabelFont((int) (byte) -1);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.chart.LegendItem legendItem19 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString20 = legendItem19.getAttributedLabel();
        java.lang.String str21 = legendItem19.getDescription();
        legendItem19.setSeriesKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        java.awt.Shape shape29 = lineAndShapeRenderer26.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity31 = new org.jfree.chart.entity.ChartEntity(shape29, "");
        legendItem19.setShape(shape29);
        org.jfree.chart.entity.ChartEntity chartEntity35 = new org.jfree.chart.entity.ChartEntity(shape29, "ItemLabelAnchor.OUTSIDE6", "ChartChangeEventType.GENERAL");
        lineAndShapeRenderer2.setBaseLegendShape(shape29);
        org.jfree.chart.entity.ChartEntity chartEntity37 = new org.jfree.chart.entity.ChartEntity(shape29);
        chartEntity37.setURLText("ChartChangeEventType.NEW_DATASET");
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(attributedString20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(shape29);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        org.jfree.chart.plot.Plot plot20 = categoryAxis15.getPlot();
        categoryAxis15.setMinorTickMarkInsideLength((float) (byte) 0);
        float float23 = categoryAxis15.getTickMarkInsideLength();
        categoryAxis15.setAxisLineVisible(false);
        int int26 = categoryAxis15.getCategoryLabelPositionOffset();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getItemStroke(100, 0, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible(4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        java.awt.Shape shape18 = lineAndShapeRenderer15.getBaseShape();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer21.setBaseURLGenerator(categoryURLGenerator22);
        java.awt.Shape shape25 = lineAndShapeRenderer21.getLegendShape(0);
        lineAndShapeRenderer21.setAutoPopulateSeriesStroke(false);
        java.awt.Font font29 = lineAndShapeRenderer21.getSeriesItemLabelFont(0);
        lineAndShapeRenderer21.setUseSeriesOffset(true);
        java.awt.Font font33 = null;
        lineAndShapeRenderer21.setSeriesItemLabelFont((int) (short) 1, font33, false);
        java.awt.Stroke stroke39 = lineAndShapeRenderer21.getItemOutlineStroke(0, 1, false);
        lineAndShapeRenderer15.setBaseStroke(stroke39, true);
        lineAndShapeRenderer15.clearSeriesStrokes(true);
        java.awt.Stroke stroke44 = lineAndShapeRenderer15.getBaseOutlineStroke();
        lineAndShapeRenderer2.setSeriesOutlineStroke((int) ' ', stroke44, true);
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNull(font29);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint17 = renderAttributes16.getDefaultPaint();
        java.awt.Stroke stroke18 = renderAttributes16.getDefaultOutlineStroke();
        java.awt.Paint paint20 = renderAttributes16.getSeriesFillPaint((-52));
        java.awt.Stroke stroke21 = renderAttributes16.getDefaultStroke();
        java.awt.Shape shape22 = renderAttributes16.getDefaultShape();
        java.awt.Paint paint23 = renderAttributes16.getDefaultOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(paint23);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color23 = java.awt.Color.BLUE;
        lineAndShapeRenderer22.setBaseItemLabelPaint((java.awt.Paint) color23);
        java.awt.Shape shape25 = lineAndShapeRenderer22.getBaseShape();
        java.awt.Stroke stroke26 = lineAndShapeRenderer22.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke26, true);
        boolean boolean32 = lineAndShapeRenderer2.getItemCreateEntity(255, (int) (byte) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisible((-254), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        categoryPlot14.setFixedRangeAxisSpace(axisSpace17);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot14.setRangeAxis(valueAxis19);
        categoryPlot14.setDomainCrosshairRowKey((java.lang.Comparable) 192, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot14.getRenderer();
        categoryPlot14.setDomainCrosshairRowKey((java.lang.Comparable) 0.0d, false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(categoryItemRenderer24);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean15 = lineAndShapeRenderer2.getBaseShapesFilled();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) '#', (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color24 = java.awt.Color.BLUE;
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color24);
        java.awt.Shape shape26 = lineAndShapeRenderer23.getBaseShape();
        lineAndShapeRenderer2.setSeriesShape(11, shape26, false);
        org.jfree.chart.plot.Plot plot29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.entity.PlotEntity plotEntity30 = new org.jfree.chart.entity.PlotEntity(shape26, plot29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.data.Range range17 = categoryPlot14.getDataRange(valueAxis16);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.data.Range range19 = categoryPlot14.getDataRange(valueAxis18);
        org.jfree.chart.axis.CategoryAxis[] categoryAxisArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot14.setDomainAxes(categoryAxisArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNull(range19);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        boolean boolean7 = legendItem1.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color11 = java.awt.Color.BLUE;
        lineAndShapeRenderer10.setBaseItemLabelPaint((java.awt.Paint) color11);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer10.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape20 = lineAndShapeRenderer10.lookupLegendShape(8);
        legendItem1.setLine(shape20);
        java.lang.String str22 = legendItem1.getToolTipText();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color26 = java.awt.Color.BLUE;
        lineAndShapeRenderer25.setBaseItemLabelPaint((java.awt.Paint) color26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer25.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color32 = java.awt.Color.darkGray;
        lineAndShapeRenderer25.setBaseOutlinePaint((java.awt.Paint) color32, true);
        legendItem1.setLinePaint((java.awt.Paint) color32);
        legendItem1.setDatasetIndex(0);
        legendItem1.setSeriesIndex(100);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(categoryItemLabelGenerator31);
        org.junit.Assert.assertNotNull(color32);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge17 = categoryPlot14.getDomainAxisEdge((int) ' ');
        categoryPlot14.setNotify(false);
        org.jfree.chart.axis.AxisLocation axisLocation21 = categoryPlot14.getDomainAxisLocation((int) '4');
        categoryPlot14.clearDomainMarkers(0);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot14.setRenderers(categoryItemRendererArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertNotNull(axisLocation21);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Stroke stroke19 = renderAttributes16.getItemStroke(1, (int) (short) 1);
        java.awt.Stroke stroke21 = renderAttributes16.getSeriesStroke((-1));
        java.awt.Stroke stroke22 = renderAttributes16.getDefaultOutlineStroke();
        java.lang.Boolean boolean23 = renderAttributes16.getDefaultLabelVisible();
        java.awt.Paint paint26 = renderAttributes16.getItemPaint(100, 10295828);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(paint26);
    }
}
