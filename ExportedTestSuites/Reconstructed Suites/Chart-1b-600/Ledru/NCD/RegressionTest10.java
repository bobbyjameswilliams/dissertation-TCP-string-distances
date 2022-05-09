package org.jfree.chart.renderer.category;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        java.awt.Stroke stroke16 = legendItem1.getLineStroke();
        legendItem1.setShapeVisible(true);
        boolean boolean19 = legendItem1.isShapeVisible();
        boolean boolean20 = legendItem1.isShapeFilled();
        java.lang.Object obj21 = legendItem1.clone();
        legendItem1.setSeriesIndex(15);
        java.awt.Paint paint24 = legendItem1.getOutlinePaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        java.awt.Shape shape18 = lineAndShapeRenderer2.getBaseShape();
        boolean boolean20 = lineAndShapeRenderer2.isSeriesVisibleInLegend((int) (byte) 100);
        java.awt.Shape shape24 = lineAndShapeRenderer2.getItemShape(0, 500, true);
        boolean boolean28 = lineAndShapeRenderer2.isItemLabelVisible(0, 255, true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
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
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        org.jfree.chart.plot.Plot plot16 = plotChangeEvent15.getPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = plotChangeEvent15.getChart();
        java.lang.String str18 = plotChangeEvent15.toString();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(jFreeChart17);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot14.getFixedLegendItems();
        org.jfree.chart.axis.AxisSpace axisSpace17 = null;
        categoryPlot14.setFixedRangeAxisSpace(axisSpace17, false);
        categoryPlot14.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(legendItemCollection16);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.axis.AxisLocation axisLocation15 = null;
        categoryPlot13.setRangeAxisLocation(97, axisLocation15, false);
        java.awt.Stroke stroke18 = categoryPlot13.getOutlineStroke();
        boolean boolean19 = categoryPlot4.equals((java.lang.Object) stroke18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot4.zoomRangeAxes((double) (-1), 63.0d, plotRenderingInfo22, point2D23);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot4.getDomainAxisLocation();
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(axisLocation25);
    }

    @Test
    public void test4658() throws Throwable {
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
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        categoryAxis15.setCategoryLabelPositionOffset((int) 'a');
        java.lang.String str24 = categoryAxis15.getCategoryLabelToolTip((java.lang.Comparable) "ChartChangeEventType.GENERAL");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        java.awt.Paint paint13 = defaultDrawingSupplier9.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(strokeArray4);
        org.junit.Assert.assertNotNull(strokeArray6);
        org.junit.Assert.assertNotNull(shapeArray8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(paint13);
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
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
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
        boolean boolean19 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (byte) 100);
        java.awt.Paint paint21 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((-100));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(255, (java.lang.Boolean) false);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = null;
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset17 = new org.jfree.data.category.DefaultCategoryDataset();
        int int19 = defaultCategoryDataset17.getColumnIndex((java.lang.Comparable) 3.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState21 = lineAndShapeRenderer2.initialise(graphics2D14, rectangle2D15, categoryPlot16, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset17, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
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
        boolean boolean24 = lineAndShapeRenderer2.getItemCreateEntity(1, 33, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.lang.String str16 = categoryAxis2.getLabelToolTip();
        boolean boolean17 = categoryAxis2.isVisible();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
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
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        categoryAxis15.setAxisLineVisible(true);
        boolean boolean22 = categoryAxis15.isVisible();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
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
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        categoryPlot14.setBackgroundImageAlpha((float) 0);
        boolean boolean20 = categoryPlot14.canSelectByRegion();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.jfree.chart.plot.Plot plot17 = plotChangeEvent15.getPlot();
        java.awt.Font font18 = plot17.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(jFreeChart16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
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
        boolean boolean26 = lineAndShapeRenderer2.getItemLineVisible(24, (int) (short) 0);
        lineAndShapeRenderer2.setBaseCreateEntities(false, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
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
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setTickLabelsVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float6 = categoryAxis5.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis7 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color11 = java.awt.Color.BLUE;
        lineAndShapeRenderer10.setBaseItemLabelPaint((java.awt.Paint) color11);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer10.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset3, categoryAxis5, valueAxis7, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10);
        java.lang.Object obj18 = categoryPlot17.clone();
        java.awt.Stroke stroke19 = categoryPlot17.getDomainCrosshairStroke();
        org.jfree.chart.plot.PlotOrientation plotOrientation20 = categoryPlot17.getOrientation();
        categoryAxis0.addChangeListener((org.jfree.chart.event.AxisChangeListener) categoryPlot17);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(plotOrientation20);
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
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        org.jfree.chart.util.SortOrder sortOrder16 = categoryPlot14.getColumnRenderingOrder();
        java.awt.Paint paint17 = categoryPlot14.getRangeGridlinePaint();
        categoryPlot14.setWeight((-16776961));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(sortOrder16);
        org.junit.Assert.assertNotNull(paint17);
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
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
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
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (byte) 1, false);
        java.awt.Paint paint27 = lineAndShapeRenderer2.getBasePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint27);
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
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        categoryPlot14.setBackgroundImageAlpha((float) 0);
        boolean boolean20 = categoryPlot14.isDomainPannable();
        categoryPlot14.setRangeCrosshairValue((double) 10.0f, false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        java.awt.Stroke stroke16 = categoryPlot14.getDomainCrosshairStroke();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot14.getOrientation();
        boolean boolean18 = categoryPlot14.isDomainGridlinesVisible();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
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
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
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
        java.awt.Paint paint24 = lineAndShapeRenderer2.getItemFillPaint((int) (short) 1, (-10289251), false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        lineAndShapeRenderer2.removeAnnotations();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryToolTipGenerator27);
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
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        categoryAxis2.setTickMarksVisible(true);
        int int18 = categoryAxis2.getCategoryLabelPositionOffset();
        categoryAxis2.setMinorTickMarksVisible(true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
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
        java.awt.Paint paint25 = lineAndShapeRenderer2.lookupSeriesPaint(33);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.data.Range range27 = lineAndShapeRenderer2.findRangeBounds(categoryDataset26);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(range27);
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
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.data.Range range23 = lineAndShapeRenderer2.findRangeBounds(categoryDataset21, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(range23);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        categoryPlot14.setBackgroundImageAlpha((float) 0);
        int int20 = categoryPlot14.getRendererCount();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
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
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.lang.Object obj23 = legendItem1.clone();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(0);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemLabelPaint((-1), 1, false);
        boolean boolean21 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        double double22 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        lineAndShapeRenderer2.setSeriesVisible((int) '#', (java.lang.Boolean) false, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesShapesFilled(0);
        java.awt.Color color19 = java.awt.Color.getColor("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", (int) (short) -1);
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color19, false);
        java.awt.Color color22 = color19.brighter();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        org.jfree.chart.LegendItem legendItem21 = new org.jfree.chart.LegendItem("GradientPaintTransformType.HORIZONTAL");
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer22 = legendItem21.getFillPaintTransformer();
        barRenderer0.setGradientPaintTransformer(gradientPaintTransformer22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer22);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape17 = renderAttributes15.getSeriesShape((int) (byte) 100);
        java.awt.Shape shape20 = renderAttributes15.getItemShape((-52), 35);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint23 = renderAttributes15.getItemLabelPaint((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(shape20);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color8 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer4.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color8);
        java.awt.Paint paint10 = lineAndShapeRenderer4.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer4.setSeriesURLGenerator(97, categoryURLGenerator12, false);
        java.awt.Shape shape18 = lineAndShapeRenderer4.getItemShape(33, (-1), true);
        lineAndShapeRenderer4.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = lineAndShapeRenderer4.getLegendItemToolTipGenerator();
        java.awt.Shape shape25 = lineAndShapeRenderer4.getItemShape((int) (byte) 0, 0, false);
        boolean boolean26 = datasetGroup1.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        boolean boolean28 = lineAndShapeRenderer2.getItemCreateEntity((int) (byte) 0, 1, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = lineAndShapeRenderer2.getURLGenerator((-12517568), (int) (byte) -1, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(categoryURLGenerator32);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
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
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisibleInLegend((-7839), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator20);
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
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator28, false);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, true);
        boolean boolean35 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (byte) 100);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
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
        boolean boolean19 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator13 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        boolean boolean15 = standardCategorySeriesLabelGenerator13.equals((java.lang.Object) 100L);
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator13);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.awt.Shape shape20 = lineAndShapeRenderer2.getBaseShape();
        boolean boolean22 = lineAndShapeRenderer2.isSeriesVisibleInLegend(24);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
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
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        org.jfree.chart.plot.Plot plot16 = plotChangeEvent15.getPlot();
        boolean boolean17 = plot16.isSubplot();
        java.awt.Image image18 = null;
        plot16.setBackgroundImage(image18);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
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
        java.awt.Shape shape22 = lineAndShapeRenderer2.getLegendShape((int) '4');
        boolean boolean23 = lineAndShapeRenderer2.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(font20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
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
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot14.addChangeListener(plotChangeListener16);
        categoryPlot14.setDomainGridlinesVisible(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = categoryPlot14.getDomainAxis((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(categoryAxis21);
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
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.jfree.chart.axis.ValueAxis valueAxis17 = categoryPlot14.getRangeAxis((int) (byte) 10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = categoryPlot14.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesStroke((int) '4');
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(10, (java.lang.Boolean) true);
        boolean boolean12 = lineAndShapeRenderer2.getItemShapeVisible((int) 'a', (int) (byte) 100);
        lineAndShapeRenderer2.setBaseShapesFilled(false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation15);
        java.awt.Color color17 = org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA;
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color17, true);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesCreateEntities((-16776961), (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(color17);
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
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean19 = renderAttributes13.getCreateEntity(1, (int) (short) -1);
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
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((-52), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(stroke18);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisible((-52), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 10, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesShapesFilled((int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
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
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer0 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer4.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = lineAndShapeRenderer4.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape14 = lineAndShapeRenderer4.lookupLegendShape(8);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint15 = standardGradientPaintTransformer0.transform(gradientPaint1, shape14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, false);
        java.awt.Paint paint24 = lineAndShapeRenderer2.getBaseFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator25, true);
        boolean boolean31 = lineAndShapeRenderer2.getItemCreateEntity((int) (byte) 1, 33, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint17 = renderAttributes13.getItemLabelPaint(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot14.zoomRangeAxes((double) (-1.0f), plotRenderingInfo22, point2D23, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.axis.AxisLocation axisLocation6 = null;
        categoryPlot4.setRangeAxisLocation(97, axisLocation6, false);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis10, valueAxis11, categoryItemRenderer12);
        org.jfree.chart.axis.AxisLocation axisLocation15 = null;
        categoryPlot13.setRangeAxisLocation(97, axisLocation15, false);
        java.awt.Stroke stroke18 = categoryPlot13.getOutlineStroke();
        boolean boolean19 = categoryPlot4.equals((java.lang.Object) stroke18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot4.zoomRangeAxes((double) (-1), 63.0d, plotRenderingInfo22, point2D23);
        categoryPlot4.clearDomainMarkers();
        categoryPlot4.setAnchorValue((double) 1);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke16 = renderAttributes13.getSeriesOutlineStroke((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = lineAndShapeRenderer2.getURLGenerator(33, (int) '#', false);
        java.awt.Font font26 = lineAndShapeRenderer2.getItemLabelFont((int) 'a', (int) (byte) -1, true);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisibleInLegend((-7839), (java.lang.Boolean) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNotNull(font26);
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
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        boolean boolean9 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset10 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset10.clear();
        defaultCategoryDataset10.clearSelection();
        org.jfree.data.Range range13 = lineAndShapeRenderer2.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = defaultCategoryDataset10.getGroup();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState15 = defaultCategoryDataset10.getSelectionState();
        org.jfree.data.general.DatasetGroup datasetGroup16 = defaultCategoryDataset10.getGroup();
        defaultCategoryDataset10.fireSelectionEvent();
        defaultCategoryDataset10.addValue(6.00000001d, (java.lang.Comparable) 35.0d, (java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(range13);
        org.junit.Assert.assertNotNull(datasetGroup14);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState15);
        org.junit.Assert.assertNotNull(datasetGroup16);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        lineAndShapeRenderer2.setSeriesLinesVisible(0, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(stroke18);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) -1, (java.lang.Boolean) true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj13 = categoryAxis12.clone();
        categoryAxis12.setMaximumCategoryLabelWidthRatio(0.0f);
        java.awt.Font font17 = categoryAxis12.getTickLabelFont((java.lang.Comparable) "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelFont((int) (byte) -1, font17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        lineAndShapeRenderer2.setSeriesVisible(33, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        legendItem24.setLineVisible(false);
        legendItem24.setDatasetIndex((-1));
        java.lang.String str29 = legendItem24.getLabel();
        java.lang.Comparable comparable30 = legendItem24.getSeriesKey();
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(comparable30);
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
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        org.jfree.chart.plot.Plot plot11 = categoryPlot10.getParent();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = plot11.getForegroundAlpha();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        java.awt.Paint paint19 = legendItem1.getLabelPaint();
        legendItem1.setSeriesKey((java.lang.Comparable) "java.awt.Color[r=64,g=255,b=64]");
        boolean boolean22 = legendItem1.isLineVisible();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup1 = abstractCategoryDataset0.getGroup();
        org.jfree.data.event.DatasetChangeListener datasetChangeListener2 = null;
        abstractCategoryDataset0.addChangeListener(datasetChangeListener2);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset4 = new org.jfree.data.category.DefaultCategoryDataset();
        int int6 = defaultCategoryDataset4.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list7 = defaultCategoryDataset4.getColumnKeys();
        defaultCategoryDataset4.validateObject();
        abstractCategoryDataset0.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset4);
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset4.removeColumn((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(list7);
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
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
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
        legendItem24.setLineVisible(false);
        legendItem24.setDatasetIndex((-1));
        legendItem24.setURLText("java.awt.Color[r=223,g=255,b=190]");
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
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
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.awt.Stroke stroke16 = categoryPlot14.getRangeMinorGridlineStroke();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot14.getLegendItems();
        categoryPlot14.setRangeGridlinesVisible(true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean21 = renderAttributes15.isLabelVisible((int) ' ', 10284987);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(font18);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        boolean boolean23 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Stroke stroke24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseStroke(stroke24, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
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
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double7 = rectangleInsets4.getBottom();
        double double9 = rectangleInsets4.trimHeight((-1.0289271E7d));
        double double11 = rectangleInsets4.calculateRightInset(0.0d);
        double double13 = rectangleInsets4.calculateTopInset(0.0d);
        double double15 = rectangleInsets4.calculateBottomInset((double) (byte) 100);
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D19 = rectangleInsets4.createOutsetRectangle(rectangle2D16, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0289282E7d) + "'", double9 == (-1.0289282E7d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        lineAndShapeRenderer7.setBaseURLGenerator(categoryURLGenerator8);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer7.setSeriesToolTipGenerator(10, categoryToolTipGenerator11);
        boolean boolean13 = lineAndShapeRenderer7.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke15 = null;
        lineAndShapeRenderer7.setSeriesStroke((int) 'a', stroke15, true);
        java.awt.Font font19 = lineAndShapeRenderer7.getSeriesItemLabelFont(0);
        double double20 = lineAndShapeRenderer7.getItemMargin();
        java.awt.Color color21 = java.awt.Color.WHITE;
        lineAndShapeRenderer7.setBaseOutlinePaint((java.awt.Paint) color21);
        categoryAxis1.setLabelPaint((java.awt.Paint) color21);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(font19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(color21);
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
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape20, "TextAnchor.BOTTOM_CENTER");
        chartEntity23.setToolTipText("org.jfree.chart.ChartColor[r=0,g=8,b=32]");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
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
        java.awt.Paint paint24 = lineAndShapeRenderer2.getItemOutlinePaint((int) (short) 100, (int) (byte) 1, false);
        java.awt.Paint paint25 = lineAndShapeRenderer2.getBaseFillPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseShape(shape19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint16);
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
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
            java.awt.geom.Rectangle2D rectangle2D18 = rectangleInsets4.createInsetRectangle(rectangle2D15, false, true);
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
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        boolean boolean16 = categoryPlot14.isRangeZoomable();
        categoryPlot14.setOutlineVisible(true);
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent19 = null;
        categoryPlot14.annotationChanged(annotationChangeEvent19);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
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
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        double double18 = categoryPlot14.getRangeCrosshairValue();
        categoryPlot14.setWeight((int) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        categoryAxis2.setMinorTickMarksVisible(false);
        double double20 = categoryAxis2.getLabelAngle();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
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
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint19 = renderAttributes16.getItemOutlinePaint((-10411212), 100);
        java.awt.Paint paint20 = renderAttributes16.getDefaultPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot14.getFixedLegendItems();
        categoryPlot14.setDomainCrosshairVisible(true);
        java.awt.Paint paint19 = categoryPlot14.getRangeZeroBaselinePaint();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean13 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getSeriesStroke(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape17 = renderAttributes16.getDefaultShape();
        java.awt.Shape shape20 = renderAttributes16.getItemShape(1, 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(shape20);
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
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        categoryPlot14.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = categoryPlot14.getRenderer(255);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(categoryItemRenderer19);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        boolean boolean18 = categoryAxis15.isTickLabelsVisible();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        legendItem24.setLineVisible(false);
        java.lang.Object obj27 = null;
        boolean boolean28 = legendItem24.equals(obj27);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        boolean boolean5 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj8 = categoryAxis7.clone();
        java.awt.Font font9 = categoryAxis7.getTickLabelFont();
        java.awt.Paint paint10 = categoryAxis7.getLabelPaint();
        java.awt.Stroke stroke11 = categoryAxis7.getAxisLineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke11, false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesCreateEntities((int) (byte) -1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        double double18 = categoryPlot14.getAnchorValue();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxis17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
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
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape12 = lineAndShapeRenderer2.lookupLegendShape(8);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(4, categoryURLGenerator14, true);
        java.awt.Font font18 = lineAndShapeRenderer2.lookupLegendTextFont(1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation19 = null;
        org.jfree.chart.util.Layer layer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation19, layer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNull(font18);
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
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot14.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = categoryPlot14.getOutlinePaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis20 = null;
        categoryPlot14.setDomainAxis((int) (short) 0, categoryAxis20);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) false);
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) '#', (java.lang.Boolean) true, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(paint18);
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
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        java.lang.Boolean boolean15 = lineAndShapeRenderer2.getSeriesCreateEntities(52);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Paint paint19 = lineAndShapeRenderer2.getSeriesItemLabelPaint(52);
        java.awt.Stroke stroke21 = lineAndShapeRenderer2.getSeriesStroke((int) (byte) -1);
        java.awt.Paint paint22 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
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
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot14.getLegendItems();
        categoryPlot14.configureDomainAxes();
        java.awt.Stroke stroke18 = categoryPlot14.getRangeCrosshairStroke();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Font font19 = renderAttributes13.getSeriesLabelFont((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean16 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemPaint((int) (byte) 1, 10284987, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesToolTipGenerator((-716), categoryToolTipGenerator22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint20);
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
    public void test4986() throws Throwable {
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
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        org.jfree.chart.plot.Plot plot17 = plotChangeEvent15.getPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = null;
        plotChangeEvent15.setChart(jFreeChart18);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(jFreeChart16);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType0 = org.jfree.chart.event.ChartChangeEventType.NEW_DATASET;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean5 = lineAndShapeRenderer3.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        lineAndShapeRenderer3.setSeriesURLGenerator(0, categoryURLGenerator7, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = lineAndShapeRenderer3.getSeriesToolTipGenerator((int) '#');
        lineAndShapeRenderer3.setSeriesVisible(192, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer3.getSeriesItemLabelGenerator((-1));
        java.awt.Paint paint17 = lineAndShapeRenderer3.getBaseOutlinePaint();
        boolean boolean18 = chartChangeEventType0.equals((java.lang.Object) lineAndShapeRenderer3);
        java.lang.String str19 = chartChangeEventType0.toString();
        org.junit.Assert.assertNotNull(chartChangeEventType0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ChartChangeEventType.NEW_DATASET" + "'", str19, "ChartChangeEventType.NEW_DATASET");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.ChartColor chartColor14 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color15 = chartColor14.darker();
        org.jfree.chart.LegendItem legendItem16 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor14);
        java.lang.Comparable comparable17 = legendItem16.getSeriesKey();
        boolean boolean18 = legendItem16.isShapeVisible();
        legendItem16.setSeriesKey((java.lang.Comparable) 63.0d);
        legendItemCollection9.add(legendItem16);
        java.awt.Paint paint22 = legendItem16.getOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(comparable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint22);
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
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        java.awt.Stroke stroke22 = legendItem1.getLineStroke();
        java.awt.Font font23 = legendItem1.getLabelFont();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNull(font23);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator24);
        lineAndShapeRenderer2.setBaseShapesFilled(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator29, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        categoryAxis15.setAxisLineVisible(true);
        java.lang.String str23 = categoryAxis15.getCategoryLabelToolTip((java.lang.Comparable) (-1.6776955E7d));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(str23);
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
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
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
        legendItem24.setLineVisible(false);
        legendItem24.setDatasetIndex((-1));
        java.lang.String str29 = legendItem24.getLabel();
        org.jfree.data.general.Dataset dataset30 = null;
        legendItem24.setDataset(dataset30);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        org.jfree.chart.LegendItemCollection legendItemCollection16 = categoryPlot14.getLegendItems();
        categoryPlot14.configureDomainAxes();
        java.awt.Color color20 = java.awt.Color.getColor("", 11);
        categoryPlot14.setRangeMinorGridlinePaint((java.awt.Paint) color20);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(color20);
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
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        double double16 = barRenderer0.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = null;
        barRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator17);
        barRenderer0.setItemLabelAnchorOffset(5.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
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
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor19 = itemLabelPosition18.getItemLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor19, textAnchor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'textAnchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(itemLabelAnchor19);
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
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot14.getDomainAxis((int) (short) 100);
        categoryPlot14.clearAnnotations();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNull(categoryAxis19);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation19 = null;
        boolean boolean20 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        lineAndShapeRenderer2.setSeriesLinesVisible(1, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
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
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setItemMargin(104.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 0.0 <= margin < 1.0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
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
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        boolean boolean17 = categoryPlot14.isRangeZoomable();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.isSeriesVisible((-10289251));
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        int int16 = lineAndShapeRenderer2.getPassCount();
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        java.awt.Shape shape18 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.lookupSeriesOutlineStroke((-16776961));
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape17 = renderAttributes15.getSeriesShape((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            renderAttributes15.setSeriesCreateEntity(1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
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
        org.jfree.chart.text.TextAnchor textAnchor22 = itemLabelPosition19.getRotationAnchor();
        java.lang.String str23 = textAnchor22.toString();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "TextAnchor.CENTER" + "'", str23, "TextAnchor.CENTER");
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
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.lookupSeriesShape(11);
        org.jfree.chart.entity.ChartEntity chartEntity18 = new org.jfree.chart.entity.ChartEntity(shape16, "-3,-3,3,3");
        org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator19 = null;
        org.jfree.chart.imagemap.URLTagFragmentGenerator uRLTagFragmentGenerator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = chartEntity18.getImageMapAreaTag(toolTipTagFragmentGenerator19, uRLTagFragmentGenerator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(shape16);
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
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        java.awt.Stroke stroke21 = lineAndShapeRenderer2.getItemStroke(0, (-12517568), true);
        java.awt.Color color23 = java.awt.Color.GREEN;
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) (short) 0, (java.awt.Paint) color23, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(color23);
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
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        java.awt.Paint paint16 = categoryAxis2.getTickMarkPaint();
        java.lang.Object obj17 = categoryAxis2.clone();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj17);
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
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        boolean boolean28 = lineAndShapeRenderer2.getItemCreateEntity(8, (int) (byte) 100, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(categoryURLGenerator29);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        boolean boolean28 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation27);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        boolean boolean17 = lineAndShapeRenderer7.getBaseCreateEntities();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = lineAndShapeRenderer7.getLegendItemURLGenerator();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
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
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        boolean boolean18 = categoryPlot14.isOutlineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot14.setRangeAxis(valueAxis19);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelGenerator((-12517568), categoryItemLabelGenerator21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation18 = categoryPlot14.getOrientation();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(valueAxis17);
        org.junit.Assert.assertNotNull(plotOrientation18);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        org.jfree.chart.util.Layer layer19 = null;
        java.util.Collection collection20 = categoryPlot4.getRangeMarkers((-1), layer19);
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.RenderingSource renderingSource24 = null;
        categoryPlot4.select((-1.0d), (double) (byte) -1, rectangle2D23, renderingSource24);
        categoryPlot4.clearSelection();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(collection20);
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
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        boolean boolean18 = categoryPlot14.isOutlineVisible();
        categoryPlot14.setBackgroundImageAlignment((int) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke18 = renderAttributes13.getItemOutlineStroke(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.lang.String str16 = color13.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(colorSpace14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.awt.Color[r=64,g=255,b=64]" + "'", str16, "java.awt.Color[r=64,g=255,b=64]");
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
    public void test4807() throws Throwable {
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
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        legendItem24.setLineVisible(false);
        legendItem24.setDatasetIndex((-1));
        java.awt.Paint paint29 = legendItem24.getLinePaint();
        boolean boolean30 = legendItem24.isShapeFilled();
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.awt.Stroke stroke16 = categoryPlot14.getRangeCrosshairStroke();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.data.Range range18 = categoryPlot14.getDataRange(valueAxis17);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(range18);
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
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.CENTER_HORIZONTAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer1 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType0);
        java.awt.GradientPaint gradientPaint2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Shape shape8 = lineAndShapeRenderer5.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity11 = new org.jfree.chart.entity.ChartEntity(shape8, "", "java.awt.Color[r=255,g=255,b=255]");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint12 = standardGradientPaintTransformer1.transform(gradientPaint2, shape8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(255);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisibleInLegend((int) (short) -1, (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(shape16);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
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
    public void test4974() throws Throwable {
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
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        java.awt.Font font14 = lineAndShapeRenderer2.getItemLabelFont((int) '4', (int) (short) 10, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesURLGenerator((-16777216), categoryURLGenerator16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(font14);
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
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        java.awt.Stroke stroke22 = lineAndShapeRenderer2.getSeriesStroke(11);
        lineAndShapeRenderer2.setUseFillPaint(false);
        java.awt.Font font26 = lineAndShapeRenderer2.lookupLegendTextFont(192);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNull(font26);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        java.awt.Font font3 = categoryAxis1.getTickLabelFont();
        java.awt.Paint paint4 = categoryAxis1.getLabelPaint();
        java.awt.Stroke stroke5 = categoryAxis1.getAxisLineStroke();
        float float6 = categoryAxis1.getMinorTickMarkInsideLength();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = categoryAxis1.getLabelInsets();
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D11 = rectangleInsets7.createInsetRectangle(rectangle2D8, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets7);
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
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        categoryAxis15.setAxisLineVisible(true);
        java.lang.Object obj22 = categoryAxis15.clone();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(obj22);
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
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation16 = categoryPlot14.getOrientation();
        categoryPlot14.clearDomainAxes();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = categoryPlot14.getDomainAxis((-10));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(plotOrientation16);
        org.junit.Assert.assertNull(categoryAxis19);
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
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        lineAndShapeRenderer2.setSeriesVisible((int) '4', (java.lang.Boolean) false);
        java.awt.Paint paint24 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator25, true);
        int int28 = lineAndShapeRenderer2.getColumnCount();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
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
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator12, false);
        boolean boolean17 = lineAndShapeRenderer2.getItemVisible((int) (short) 10, 0);
        java.awt.Stroke stroke18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseStroke(stroke18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
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
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        boolean boolean16 = categoryPlot14.isRangeZoomable();
        categoryPlot14.setOutlineVisible(true);
        float float19 = categoryPlot14.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
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
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double12 = rectangleInsets4.calculateRightOutset((double) (short) 10);
        double double14 = rectangleInsets4.calculateLeftOutset((double) '#');
        double double16 = rectangleInsets4.calculateLeftInset((double) (short) 10);
        double double18 = rectangleInsets4.calculateBottomInset(21.0d);
        double double19 = rectangleInsets4.getRight();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
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
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        boolean boolean28 = lineAndShapeRenderer2.getItemCreateEntity(8, (int) (byte) 100, false);
        java.awt.Paint paint30 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint30);
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
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor14 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color15 = java.awt.Color.yellow;
        boolean boolean16 = itemLabelAnchor14.equals((java.lang.Object) color15);
        lineAndShapeRenderer2.setSeriesFillPaint((int) ' ', (java.awt.Paint) color15);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) false);
        org.jfree.chart.renderer.RenderAttributes renderAttributes21 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Stroke stroke22 = renderAttributes21.getDefaultStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renderAttributes21);
        org.junit.Assert.assertNull(stroke22);
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
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes6 = lineAndShapeRenderer2.getSelectedItemAttributes();
        renderAttributes6.setDefaultLabelVisible((java.lang.Boolean) true);
        java.awt.Paint paint9 = renderAttributes6.getDefaultPaint();
        java.awt.Paint paint12 = renderAttributes6.getItemOutlinePaint((-100), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            renderAttributes6.setSeriesLabelVisible((int) (short) 1, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(renderAttributes6);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNull(paint12);
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
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
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
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
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
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
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
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesOutlinePaint((-563), paint19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(legendItem17);
        org.junit.Assert.assertNotNull(paint19);
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
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        categoryPlot14.setRangeCrosshairLockedOnData(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot14);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
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
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset21 = new org.jfree.data.category.DefaultCategoryDataset();
        int int23 = defaultCategoryDataset21.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list24 = defaultCategoryDataset21.getColumnKeys();
        org.jfree.data.Range range26 = lineAndShapeRenderer2.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset21, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(range26);
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
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation12, layer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = lineAndShapeRenderer2.getItemMiddle((java.lang.Comparable) (byte) -1, (java.lang.Comparable) (short) 100, categoryDataset11, categoryAxis13, rectangle2D14, rectangleEdge15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean16 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        java.awt.Shape shape18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesShape((int) (byte) -1, shape18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        java.awt.Shape shape10 = defaultDrawingSupplier9.getNextShape();
        java.awt.Paint paint11 = defaultDrawingSupplier9.getNextOutlinePaint();
        java.awt.Shape shape12 = defaultDrawingSupplier9.getNextShape();
        java.awt.Shape shape13 = defaultDrawingSupplier9.getNextShape();
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(strokeArray4);
        org.junit.Assert.assertNotNull(strokeArray6);
        org.junit.Assert.assertNotNull(shapeArray8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        java.awt.Font font20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setLegendTextFont((-1), font20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        boolean boolean11 = legendItem6.isShapeOutlineVisible();
        java.lang.Object obj12 = legendItem6.clone();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            legendItem6.setFillPaintTransformer(gradientPaintTransformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'transformer' attribute.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
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
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesOutlinePaint((-1));
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(true);
        java.awt.Stroke stroke17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseOutlineStroke(stroke17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
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
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        org.jfree.chart.plot.Plot plot11 = categoryPlot10.getParent();
        org.jfree.chart.plot.Marker marker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot10.addRangeMarker(11, marker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNull(plot11);
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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
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
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
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
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape12 = lineAndShapeRenderer2.lookupLegendShape(8);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseFillPaint();
        lineAndShapeRenderer2.setSeriesVisible(1, (java.lang.Boolean) true, false);
        java.awt.Paint paint21 = lineAndShapeRenderer2.getItemOutlinePaint((-12517568), (int) 'a', false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisibleInLegend((-12517568), (java.lang.Boolean) false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint21);
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
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape12 = lineAndShapeRenderer2.lookupLegendShape(8);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(4, categoryURLGenerator14, true);
        java.awt.Font font18 = lineAndShapeRenderer2.lookupLegendTextFont(1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition(0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNull(font18);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
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
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor8 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color9 = java.awt.Color.yellow;
        boolean boolean10 = itemLabelAnchor8.equals((java.lang.Object) color9);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesOutlinePaint((int) (short) -1, (java.awt.Paint) color9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelAnchor8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
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
        java.awt.Shape shape10 = defaultDrawingSupplier9.getNextShape();
        java.awt.Paint paint11 = defaultDrawingSupplier9.getNextOutlinePaint();
        java.awt.Paint paint12 = defaultDrawingSupplier9.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(strokeArray4);
        org.junit.Assert.assertNotNull(strokeArray6);
        org.junit.Assert.assertNotNull(shapeArray8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(paint12);
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
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        categoryPlot10.setDomainCrosshairColumnKey((java.lang.Comparable) (-7.0d));
        org.jfree.chart.plot.Marker marker13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = categoryPlot10.removeRangeMarker(marker13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(stroke9);
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
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        java.awt.Shape shape10 = defaultDrawingSupplier9.getNextShape();
        java.awt.Paint paint11 = defaultDrawingSupplier9.getNextOutlinePaint();
        java.awt.Stroke stroke12 = defaultDrawingSupplier9.getNextOutlineStroke();
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(strokeArray4);
        org.junit.Assert.assertNotNull(strokeArray6);
        org.junit.Assert.assertNotNull(shapeArray8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(stroke12);
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
