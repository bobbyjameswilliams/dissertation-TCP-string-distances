package org.jfree.chart.renderer.category;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot21.setOrientation(plotOrientation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer15 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        java.lang.Object obj16 = standardGradientPaintTransformer15.clone();
        barRenderer0.setGradientPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer15);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = null;
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset21 = new org.jfree.data.category.DefaultCategoryDataset();
        int int23 = defaultCategoryDataset21.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list24 = defaultCategoryDataset21.getColumnKeys();
        defaultCategoryDataset21.validateObject();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState27 = barRenderer0.initialise(graphics2D18, rectangle2D19, categoryPlot20, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset21, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.chart.renderer.category.BarRenderer barRenderer1 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean2 = barRenderer1.isDrawBarOutline();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = lineAndShapeRenderer5.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = lineAndShapeRenderer5.getBaseNegativeItemLabelPosition();
        barRenderer1.setNegativeItemLabelPositionFallback(itemLabelPosition12);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = null;
        lineAndShapeRenderer16.setBaseURLGenerator(categoryURLGenerator17);
        java.awt.Shape shape20 = lineAndShapeRenderer16.getLegendShape(0);
        lineAndShapeRenderer16.setAutoPopulateSeriesStroke(false);
        java.awt.Font font24 = lineAndShapeRenderer16.getSeriesItemLabelFont(0);
        lineAndShapeRenderer16.setUseSeriesOffset(true);
        java.awt.Shape shape28 = null;
        lineAndShapeRenderer16.setSeriesShape((int) (short) 10, shape28, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = lineAndShapeRenderer16.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor32 = itemLabelPosition31.getTextAnchor();
        barRenderer1.setPositiveItemLabelPositionFallback(itemLabelPosition31);
        boolean boolean34 = barRenderer1.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter35 = barRenderer1.getBarPainter();
        java.awt.Color color36 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer1.setShadowPaint((java.awt.Paint) color36);
        double double38 = barRenderer1.getShadowXOffset();
        java.awt.Color color39 = org.jfree.chart.ChartColor.VERY_LIGHT_CYAN;
        barRenderer1.setShadowPaint((java.awt.Paint) color39);
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("PlotEntity: tooltip = null", (java.awt.Paint) color39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNull(font24);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNotNull(textAnchor32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(barPainter35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.0d + "'", double38 == 4.0d);
        org.junit.Assert.assertNotNull(color39);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color34 = java.awt.Color.BLUE;
        lineAndShapeRenderer33.setBaseItemLabelPaint((java.awt.Paint) color34);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = lineAndShapeRenderer33.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = lineAndShapeRenderer33.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition40, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        java.awt.Paint paint45 = lineAndShapeRenderer2.getLegendTextPaint((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(categoryAxis19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNull(categoryItemLabelGenerator39);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNull(paint45);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float15 = categoryAxis14.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer19.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis14, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        lineAndShapeRenderer19.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj34 = categoryAxis33.clone();
        java.awt.Font font35 = categoryAxis33.getTickLabelFont();
        lineAndShapeRenderer19.setSeriesItemLabelFont((int) '#', font35);
        lineAndShapeRenderer2.setBaseItemLabelFont(font35);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        boolean boolean39 = lineAndShapeRenderer2.getUseFillPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.jfree.chart.plot.CategoryMarker categoryMarker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot21.addDomainMarker(10, categoryMarker38, layer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.awt.Stroke stroke39 = renderAttributes13.getDefaultStroke();
        java.awt.Paint paint41 = renderAttributes13.getSeriesFillPaint((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean43 = renderAttributes13.getSeriesLabelVisible(5);
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
        org.junit.Assert.assertNull(stroke39);
        org.junit.Assert.assertNull(paint41);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setTickLabelsVisible(false);
        double double5 = categoryAxis1.getLowerMargin();
        categoryAxis1.configure();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Stroke stroke13 = lineAndShapeRenderer9.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float17 = categoryAxis16.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis16, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer29 = categoryPlot28.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis31 = lineAndShapeRenderer9.getRangeAxis(categoryPlot28, (int) '4');
        boolean boolean32 = categoryPlot28.isRangeCrosshairVisible();
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder33 = categoryPlot28.getDatasetRenderingOrder();
        categoryPlot28.setBackgroundImageAlignment(3);
        java.awt.Stroke stroke36 = categoryPlot28.getRangeGridlineStroke();
        categoryAxis1.setTickMarkStroke(stroke36);
        float float38 = categoryAxis1.getTickMarkOutsideLength();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05d + "'", double5 == 0.05d);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(categoryItemRenderer29);
        org.junit.Assert.assertNull(valueAxis31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder33);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 2.0f + "'", float38 == 2.0f);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = null;
        categoryPlot21.setDrawingSupplier(drawingSupplier34, true);
        boolean boolean37 = categoryPlot21.isDomainZoomable();
        categoryPlot21.setBackgroundImageAlpha(0.0f);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        boolean boolean27 = categoryPlot21.canSelectByPoint();
        categoryPlot21.setNotify(true);
        org.jfree.chart.plot.Marker marker31 = null;
        org.jfree.chart.util.Layer layer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot21.addRangeMarker(4, marker31, layer32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType1 = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer2 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType1);
        org.jfree.chart.axis.CategoryAxis categoryAxis4 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float5 = categoryAxis4.getTickMarkInsideLength();
        categoryAxis4.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean8 = categoryAxis4.isVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        lineAndShapeRenderer12.setBaseURLGenerator(categoryURLGenerator13);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        lineAndShapeRenderer12.setSeriesToolTipGenerator(10, categoryToolTipGenerator16);
        boolean boolean18 = lineAndShapeRenderer12.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke20 = null;
        lineAndShapeRenderer12.setSeriesStroke((int) 'a', stroke20, true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor24 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color25 = java.awt.Color.yellow;
        boolean boolean26 = itemLabelAnchor24.equals((java.lang.Object) color25);
        lineAndShapeRenderer12.setSeriesFillPaint((int) ' ', (java.awt.Paint) color25);
        categoryAxis4.setTickLabelPaint((java.lang.Comparable) false, (java.awt.Paint) color25);
        boolean boolean29 = standardGradientPaintTransformer2.equals((java.lang.Object) color25);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator33 = new org.jfree.chart.util.DefaultShadowGenerator(0, color25, (float) 2, 100, (double) (short) 100);
        java.lang.String str34 = color25.toString();
        org.junit.Assert.assertNotNull(gradientPaintTransformType1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.awt.Color[r=255,g=255,b=0]" + "'", str34, "java.awt.Color[r=255,g=255,b=0]");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = categoryPlot38.getDomainAxis();
        java.awt.Stroke stroke40 = categoryPlot38.getRangeCrosshairStroke();
        lineAndShapeRenderer2.setSeriesOutlineStroke(1, stroke40, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator43);
        java.awt.Stroke stroke46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer2.setSeriesOutlineStroke(15, stroke46);
        java.awt.Stroke stroke51 = lineAndShapeRenderer2.getItemStroke((-10), 128, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertNotNull(categoryAxis39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        lineAndShapeRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Paint paint7 = lineAndShapeRenderer3.getSeriesOutlinePaint(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean12 = lineAndShapeRenderer10.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        lineAndShapeRenderer10.setSeriesURLGenerator(0, categoryURLGenerator14, false);
        java.awt.Color color17 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace18 = color17.getColorSpace();
        lineAndShapeRenderer10.setBaseFillPaint((java.awt.Paint) color17);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        lineAndShapeRenderer22.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Shape shape26 = lineAndShapeRenderer22.getLegendShape(0);
        lineAndShapeRenderer22.setAutoPopulateSeriesStroke(false);
        java.awt.Font font30 = lineAndShapeRenderer22.getSeriesItemLabelFont(0);
        lineAndShapeRenderer22.setUseSeriesOffset(true);
        java.awt.Font font34 = null;
        lineAndShapeRenderer22.setSeriesItemLabelFont((int) (short) 1, font34, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = lineAndShapeRenderer22.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        lineAndShapeRenderer10.setBasePositiveItemLabelPosition(itemLabelPosition38, false);
        lineAndShapeRenderer3.setBasePositiveItemLabelPosition(itemLabelPosition38, true);
        barRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition38);
        java.awt.Color color44 = org.jfree.chart.ChartColor.VERY_LIGHT_BLUE;
        barRenderer0.setShadowPaint((java.awt.Paint) color44);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = barRenderer0.getPositiveItemLabelPosition((-16776961), (int) (short) 100, false);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(colorSpace18);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(font30);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float22 = categoryAxis21.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis21, valueAxis23, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer26);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot33.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.data.Range range36 = categoryPlot33.getDataRange(valueAxis35);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot33.getRangeAxisLocation();
        categoryPlot33.configureDomainAxes();
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot33);
        java.awt.Paint paint40 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        categoryPlot33.setDomainGridlinePaint(paint40);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator32);
        org.junit.Assert.assertNotNull(categoryAxis34);
        org.junit.Assert.assertNull(range36);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.awt.Stroke stroke39 = renderAttributes13.getDefaultStroke();
        java.lang.Boolean boolean40 = renderAttributes13.getDefaultCreateEntity();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint42 = renderAttributes13.getSeriesLabelPaint((int) '4');
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
        org.junit.Assert.assertNull(stroke39);
        org.junit.Assert.assertNull(boolean40);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot21.getRowRenderingOrder();
        boolean boolean35 = categoryPlot21.isDomainPannable();
        boolean boolean36 = categoryPlot21.isRangeGridlinesVisible();
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
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        boolean boolean20 = lineAndShapeRenderer2.getDrawOutlines();
        java.awt.Paint paint22 = lineAndShapeRenderer2.lookupSeriesFillPaint((int) (byte) -1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer26.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean35 = lineAndShapeRenderer26.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem37 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color41 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem37.setLinePaint((java.awt.Paint) color41);
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color41);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesOutlinePaint((-10), (java.awt.Paint) color41, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator32);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(color41);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Color color15 = java.awt.Color.BLUE;
        renderAttributes13.setSeriesFillPaint((int) 'a', (java.awt.Paint) color15);
        org.jfree.chart.LegendItem legendItem19 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color23 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem19.setLinePaint((java.awt.Paint) color23);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color28 = java.awt.Color.BLUE;
        lineAndShapeRenderer27.setBaseItemLabelPaint((java.awt.Paint) color28);
        java.awt.Shape shape30 = lineAndShapeRenderer27.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity32 = new org.jfree.chart.entity.ChartEntity(shape30, "");
        legendItem19.setLine(shape30);
        java.awt.Stroke stroke34 = legendItem19.getLineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer37 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean39 = lineAndShapeRenderer37.isSeriesVisibleInLegend(1);
        java.awt.Font font40 = lineAndShapeRenderer37.getBaseLegendTextFont();
        java.awt.Color color43 = java.awt.Color.GRAY;
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator47 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 0, color43, 1.0f, (-1), 10.0d);
        lineAndShapeRenderer37.setSeriesPaint(0, (java.awt.Paint) color43, false);
        int int50 = color43.getAlpha();
        legendItem19.setOutlinePaint((java.awt.Paint) color43);
        renderAttributes13.setSeriesFillPaint((int) ' ', (java.awt.Paint) color43);
        boolean boolean53 = renderAttributes13.getAllowNull();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(font40);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 255 + "'", int50 == 255);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        categoryPlot14.clearRangeMarkers(0);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset21 = new org.jfree.data.category.DefaultCategoryDataset();
        int int23 = defaultCategoryDataset21.getColumnIndex((java.lang.Comparable) 3.0d);
        int int25 = defaultCategoryDataset21.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset21.clearSelection();
        int int27 = categoryPlot14.indexOf((org.jfree.data.category.CategoryDataset) defaultCategoryDataset21);
        int int28 = defaultCategoryDataset21.getColumnCount();
        java.lang.Comparable comparable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = defaultCategoryDataset21.getColumnIndex(comparable29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.awt.Paint paint39 = renderAttributes13.getDefaultFillPaint();
        renderAttributes13.setDefaultCreateEntity((java.lang.Boolean) false);
        java.lang.Boolean boolean42 = renderAttributes13.getDefaultLabelVisible();
        java.awt.Stroke stroke43 = renderAttributes13.getDefaultOutlineStroke();
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
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertNull(stroke43);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float17 = categoryAxis16.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis16, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        java.lang.Object obj29 = categoryPlot28.clone();
        java.awt.Stroke stroke30 = categoryPlot28.getDomainCrosshairStroke();
        lineAndShapeRenderer2.setPlot(categoryPlot28);
        org.jfree.chart.axis.AxisSpace axisSpace32 = null;
        categoryPlot28.setFixedDomainAxisSpace(axisSpace32);
        categoryPlot28.setDomainCrosshairColumnKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.plot.CategoryMarker categoryMarker36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot28.addDomainMarker(categoryMarker36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        int int2 = keyedObjects0.getIndex((java.lang.Comparable) 255);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Shape shape9 = lineAndShapeRenderer6.getBaseShape();
        java.awt.Stroke stroke10 = lineAndShapeRenderer6.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        lineAndShapeRenderer6.setBaseItemLabelGenerator(categoryItemLabelGenerator11, false);
        java.awt.Font font15 = lineAndShapeRenderer6.getLegendTextFont((-1));
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float19 = categoryAxis18.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color24 = java.awt.Color.BLUE;
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color24);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = lineAndShapeRenderer23.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis18, valueAxis20, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer23);
        lineAndShapeRenderer23.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj38 = categoryAxis37.clone();
        java.awt.Font font39 = categoryAxis37.getTickLabelFont();
        lineAndShapeRenderer23.setSeriesItemLabelFont((int) '#', font39);
        lineAndShapeRenderer6.setBaseItemLabelFont(font39);
        java.awt.Paint paint45 = lineAndShapeRenderer6.getItemFillPaint((-16776961), (-1), false);
        java.awt.Shape shape49 = lineAndShapeRenderer6.getItemShape(10, 1, true);
        keyedObjects0.setObject((java.lang.Comparable) "DatasetRenderingOrder.REVERSE", (java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(font15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(shape49);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        float float34 = categoryPlot21.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot21.getRangeAxisLocation();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent36 = null;
        categoryPlot21.rendererChanged(rendererChangeEvent36);
        boolean boolean38 = categoryPlot21.isDomainPannable();
        categoryPlot21.configureDomainAxes();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        java.awt.geom.GeneralPath generalPath29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        org.jfree.chart.RenderingSource renderingSource31 = null;
        categoryPlot21.select(generalPath29, rectangle2D30, renderingSource31);
        boolean boolean33 = categoryPlot21.canSelectByPoint();
        org.jfree.chart.plot.CategoryMarker categoryMarker34 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot21.addDomainMarker(categoryMarker34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getItemOutlineStroke(3, 0, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer19.setBaseURLGenerator(categoryURLGenerator20);
        java.awt.Paint paint23 = lineAndShapeRenderer19.getSeriesOutlinePaint(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean28 = lineAndShapeRenderer26.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        lineAndShapeRenderer26.setSeriesURLGenerator(0, categoryURLGenerator30, false);
        java.awt.Color color33 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace34 = color33.getColorSpace();
        lineAndShapeRenderer26.setBaseFillPaint((java.awt.Paint) color33);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer38 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        lineAndShapeRenderer38.setBaseURLGenerator(categoryURLGenerator39);
        java.awt.Shape shape42 = lineAndShapeRenderer38.getLegendShape(0);
        lineAndShapeRenderer38.setAutoPopulateSeriesStroke(false);
        java.awt.Font font46 = lineAndShapeRenderer38.getSeriesItemLabelFont(0);
        lineAndShapeRenderer38.setUseSeriesOffset(true);
        java.awt.Font font50 = null;
        lineAndShapeRenderer38.setSeriesItemLabelFont((int) (short) 1, font50, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = lineAndShapeRenderer38.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        lineAndShapeRenderer26.setBasePositiveItemLabelPosition(itemLabelPosition54, false);
        lineAndShapeRenderer19.setBasePositiveItemLabelPosition(itemLabelPosition54, true);
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition(4, itemLabelPosition54);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(colorSpace34);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNull(font46);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        java.awt.Paint paint39 = renderAttributes13.getDefaultFillPaint();
        renderAttributes13.setDefaultCreateEntity((java.lang.Boolean) false);
        java.awt.Shape shape42 = renderAttributes13.getDefaultShape();
        java.awt.Stroke stroke43 = renderAttributes13.getDefaultOutlineStroke();
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
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNull(stroke43);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        org.jfree.chart.LegendItem legendItem37 = barRenderer0.getLegendItem(8, (int) 'a');
        double double38 = barRenderer0.getBase();
        boolean boolean39 = barRenderer0.getBaseCreateEntities();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNull(legendItem37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        barRenderer0.setShadowVisible(false);
        barRenderer0.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        barRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator40, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = barRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = barRenderer0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNull(drawingSupplier44);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
            java.awt.Stroke stroke40 = renderAttributes13.getSeriesOutlineStroke(2);
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
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer15 = new org.jfree.chart.util.StandardGradientPaintTransformer();
        java.lang.Object obj16 = standardGradientPaintTransformer15.clone();
        barRenderer0.setGradientPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer15);
        java.awt.GradientPaint gradientPaint18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean23 = lineAndShapeRenderer21.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        lineAndShapeRenderer21.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator25, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent28 = null;
        lineAndShapeRenderer21.notifyListeners(rendererChangeEvent28);
        java.awt.Shape shape31 = lineAndShapeRenderer21.getLegendShape(0);
        java.awt.Shape shape33 = lineAndShapeRenderer21.lookupSeriesShape((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint34 = standardGradientPaintTransformer15.transform(gradientPaint18, shape33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        java.lang.String str21 = categoryAxis17.getCategoryLabelToolTip((java.lang.Comparable) 2);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float24 = categoryAxis23.getTickMarkInsideLength();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double27 = categoryAxis26.getFixedDimension();
        org.jfree.chart.plot.Plot plot28 = categoryAxis26.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryAxis26.getLabelInsets();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions30 = categoryAxis26.getCategoryLabelPositions();
        categoryAxis23.setCategoryLabelPositions(categoryLabelPositions30);
        categoryAxis17.setCategoryLabelPositions(categoryLabelPositions30);
        categoryAxis17.setTickMarksVisible(true);
        java.lang.String str35 = categoryAxis17.getLabel();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxis17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(categoryLabelPositions30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer26.setBaseURLGenerator(categoryURLGenerator27);
        java.awt.Shape shape30 = lineAndShapeRenderer26.getLegendShape(0);
        lineAndShapeRenderer26.setAutoPopulateSeriesStroke(false);
        java.awt.Font font34 = lineAndShapeRenderer26.getSeriesItemLabelFont(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        lineAndShapeRenderer26.setBaseURLGenerator(categoryURLGenerator35, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = lineAndShapeRenderer26.getPlot();
        lineAndShapeRenderer26.setSeriesVisible(4, (java.lang.Boolean) true);
        java.awt.Paint paint42 = lineAndShapeRenderer26.getBaseOutlinePaint();
        categoryAxis15.setTickLabelPaint(paint42);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNull(font34);
        org.junit.Assert.assertNull(categoryPlot38);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        java.awt.Paint paint39 = renderAttributes13.getDefaultFillPaint();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint42 = renderAttributes13.getItemLabelPaint(100, 0);
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
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = null;
        categoryPlot21.setDrawingSupplier(drawingSupplier34, true);
        boolean boolean37 = categoryPlot21.isDomainZoomable();
        categoryPlot21.setDomainCrosshairVisible(false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = barRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = barRenderer0.getSeriesURLGenerator(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
        org.junit.Assert.assertNull(categoryURLGenerator39);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot21.zoomRangeAxes((double) (short) 1, 1.0d, plotRenderingInfo30, point2D31);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent33 = null;
        categoryPlot21.rendererChanged(rendererChangeEvent33);
        java.lang.Comparable comparable35 = categoryPlot21.getDomainCrosshairColumnKey();
        java.lang.String str36 = categoryPlot21.getNoDataMessage();
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
        org.junit.Assert.assertNull(comparable35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getItemOutlineStroke((int) (byte) 100, (int) (short) -1, false);
        lineAndShapeRenderer2.setSeriesLinesVisible(0, false);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float22 = categoryAxis21.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis21, valueAxis23, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer26);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot33.getDomainAxis();
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        categoryPlot33.addChangeListener(plotChangeListener35);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor37 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        java.awt.Color color38 = java.awt.Color.yellow;
        boolean boolean39 = itemLabelAnchor37.equals((java.lang.Object) color38);
        categoryPlot33.setRangeZeroBaselinePaint((java.awt.Paint) color38);
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color38);
        int int42 = color38.getTransparency();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator32);
        org.junit.Assert.assertNotNull(categoryAxis34);
        org.junit.Assert.assertNotNull(itemLabelAnchor37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator24);
        java.awt.Shape shape27 = lineAndShapeRenderer23.getLegendShape(0);
        lineAndShapeRenderer23.setAutoPopulateSeriesStroke(false);
        java.awt.Font font31 = lineAndShapeRenderer23.getSeriesItemLabelFont(0);
        lineAndShapeRenderer23.setUseSeriesOffset(true);
        java.awt.Shape shape35 = null;
        lineAndShapeRenderer23.setSeriesShape((int) (short) 10, shape35, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = lineAndShapeRenderer23.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor39 = itemLabelPosition38.getTextAnchor();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(1, itemLabelPosition38, false);
        org.jfree.chart.ChartColor chartColor45 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        lineAndShapeRenderer2.setBasePaint((java.awt.Paint) chartColor45);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator51 = lineAndShapeRenderer2.getURLGenerator((int) (byte) 10, (int) (byte) 100, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertNull(font31);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertNotNull(textAnchor39);
        org.junit.Assert.assertNull(drawingSupplier47);
        org.junit.Assert.assertNull(categoryURLGenerator51);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        java.awt.Paint paint10 = defaultDrawingSupplier9.getNextOutlinePaint();
        java.lang.Object obj11 = defaultDrawingSupplier9.clone();
        java.awt.Paint[] paintArray12 = new java.awt.Paint[] {};
        java.awt.Paint[] paintArray13 = new java.awt.Paint[] {};
        java.awt.Paint paint14 = null;
        java.awt.Paint[] paintArray15 = new java.awt.Paint[] { paint14 };
        java.awt.Stroke[] strokeArray16 = new java.awt.Stroke[] {};
        java.awt.Stroke stroke17 = null;
        java.awt.Stroke[] strokeArray18 = new java.awt.Stroke[] { stroke17 };
        java.awt.Shape shape19 = null;
        java.awt.Shape[] shapeArray20 = new java.awt.Shape[] { shape19 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier21 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray12, paintArray13, paintArray15, strokeArray16, strokeArray18, shapeArray20);
        boolean boolean22 = defaultDrawingSupplier9.equals((java.lang.Object) strokeArray16);
        java.awt.Shape shape23 = defaultDrawingSupplier9.getNextShape();
        java.lang.Object obj24 = defaultDrawingSupplier9.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint25 = defaultDrawingSupplier9.getNextPaint();
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
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(paintArray12);
        org.junit.Assert.assertNotNull(paintArray13);
        org.junit.Assert.assertNotNull(paintArray15);
        org.junit.Assert.assertNotNull(strokeArray16);
        org.junit.Assert.assertNotNull(strokeArray18);
        org.junit.Assert.assertNotNull(shapeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        java.awt.Image image27 = null;
        categoryPlot4.setBackgroundImage(image27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer32 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset29, categoryAxis30, valueAxis31, categoryItemRenderer32);
        org.jfree.chart.ChartColor chartColor38 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel39 = null;
        java.awt.Rectangle rectangle40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        java.awt.geom.AffineTransform affineTransform42 = null;
        java.awt.RenderingHints renderingHints43 = null;
        java.awt.PaintContext paintContext44 = chartColor38.createContext(colorModel39, rectangle40, rectangle2D41, affineTransform42, renderingHints43);
        java.awt.Color color45 = java.awt.Color.getColor("", (java.awt.Color) chartColor38);
        categoryPlot33.setDomainCrosshairPaint((java.awt.Paint) color45);
        categoryPlot4.setRangeCrosshairPaint((java.awt.Paint) color45);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paintContext44);
        org.junit.Assert.assertNotNull(color45);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color21 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer17.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = lineAndShapeRenderer17.getBaseToolTipGenerator();
        java.lang.Boolean boolean25 = lineAndShapeRenderer17.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer17.getSeriesItemLabelGenerator((int) (byte) 1);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator28 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        boolean boolean30 = standardCategorySeriesLabelGenerator28.equals((java.lang.Object) 100L);
        lineAndShapeRenderer17.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator28);
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator28);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesToolTipGenerator((-10411212), categoryToolTipGenerator34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.ChartColor chartColor10 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel11 = null;
        java.awt.Rectangle rectangle12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.AffineTransform affineTransform14 = null;
        java.awt.RenderingHints renderingHints15 = null;
        java.awt.PaintContext paintContext16 = chartColor10.createContext(colorModel11, rectangle12, rectangle2D13, affineTransform14, renderingHints15);
        java.awt.Color color17 = java.awt.Color.getColor("", (java.awt.Color) chartColor10);
        categoryPlot5.setDomainCrosshairPaint((java.awt.Paint) color17);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator22 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 100, color17, 1.0f, (int) (byte) -1, (double) 10);
        java.awt.Color color23 = defaultShadowGenerator22.getShadowColor();
        int int24 = defaultShadowGenerator22.getShadowSize();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color31 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer27.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color31);
        java.awt.Paint paint33 = lineAndShapeRenderer27.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        lineAndShapeRenderer27.setSeriesURLGenerator(97, categoryURLGenerator35, false);
        java.awt.Paint paint39 = lineAndShapeRenderer27.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer27.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator47 = lineAndShapeRenderer27.getToolTipGenerator(0, 52, true);
        boolean boolean48 = defaultShadowGenerator22.equals((java.lang.Object) true);
        float float49 = defaultShadowGenerator22.getShadowOpacity();
        org.junit.Assert.assertNotNull(paintContext16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNull(categoryToolTipGenerator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
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
        java.awt.Stroke stroke27 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot4.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo30, point2D31);
        boolean boolean33 = categoryPlot4.canSelectByRegion();
        categoryPlot4.setDrawSharedDomainAxis(false);
        java.awt.geom.GeneralPath generalPath36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.chart.RenderingSource renderingSource38 = null;
        categoryPlot4.select(generalPath36, rectangle2D37, renderingSource38);
        org.jfree.chart.axis.CategoryAxis categoryAxis40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = categoryPlot4.getDomainAxisIndex(categoryAxis40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.ChartColor chartColor19 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel20 = null;
        java.awt.Rectangle rectangle21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.AffineTransform affineTransform23 = null;
        java.awt.RenderingHints renderingHints24 = null;
        java.awt.PaintContext paintContext25 = chartColor19.createContext(colorModel20, rectangle21, rectangle2D22, affineTransform23, renderingHints24);
        java.awt.Color color26 = java.awt.Color.getColor("", (java.awt.Color) chartColor19);
        categoryPlot14.setDomainCrosshairPaint((java.awt.Paint) color26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot14.zoomRangeAxes((double) 100.0f, plotRenderingInfo29, point2D30);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot14.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot14.getDomainAxisEdge((int) (short) 100);
        java.lang.String str36 = categoryPlot14.getPlotType();
        org.jfree.data.KeyedObject keyedObject37 = new org.jfree.data.KeyedObject((java.lang.Comparable) 100L, (java.lang.Object) categoryPlot14);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = lineAndShapeRenderer2.getDomainAxis(categoryPlot14, categoryDataset38);
        int int40 = lineAndShapeRenderer2.getDefaultEntityRadius();
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNotNull(paintContext25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Category Plot" + "'", str36, "Category Plot");
        org.junit.Assert.assertNull(categoryAxis39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRendererForDataset(categoryDataset5);
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
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot12.getRangeAxisLocation();
        java.lang.String str35 = axisLocation34.toString();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.setRangeAxisLocation((int) (byte) -1, axisLocation34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryAxis31);
        org.junit.Assert.assertNotNull(rectangleEdge33);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AxisLocation.TOP_OR_LEFT" + "'", str35, "AxisLocation.TOP_OR_LEFT");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.ChartColor chartColor19 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel20 = null;
        java.awt.Rectangle rectangle21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.AffineTransform affineTransform23 = null;
        java.awt.RenderingHints renderingHints24 = null;
        java.awt.PaintContext paintContext25 = chartColor19.createContext(colorModel20, rectangle21, rectangle2D22, affineTransform23, renderingHints24);
        java.awt.Color color26 = java.awt.Color.getColor("", (java.awt.Color) chartColor19);
        categoryPlot14.setDomainCrosshairPaint((java.awt.Paint) color26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot14.zoomRangeAxes((double) 100.0f, plotRenderingInfo29, point2D30);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot14.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot14.getDomainAxisEdge((int) (short) 100);
        java.lang.String str36 = categoryPlot14.getPlotType();
        org.jfree.data.KeyedObject keyedObject37 = new org.jfree.data.KeyedObject((java.lang.Comparable) 100L, (java.lang.Object) categoryPlot14);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = lineAndShapeRenderer2.getDomainAxis(categoryPlot14, categoryDataset38);
        lineAndShapeRenderer2.removeAnnotations();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNotNull(paintContext25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Category Plot" + "'", str36, "Category Plot");
        org.junit.Assert.assertNull(categoryAxis39);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator19);
        java.awt.Font font21 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.jfree.chart.ChartColor chartColor27 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color28 = chartColor27.darker();
        org.jfree.chart.LegendItem legendItem29 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor27);
        java.lang.String str30 = legendItem29.getToolTipText();
        java.lang.String str31 = legendItem29.getURLText();
        legendItem29.setShapeVisible(true);
        java.awt.Shape shape38 = null;
        org.jfree.chart.ChartColor chartColor43 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color44 = chartColor43.darker();
        org.jfree.chart.LegendItem legendItem45 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor43);
        int int46 = chartColor43.getAlpha();
        org.jfree.chart.LegendItem legendItem47 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape38, (java.awt.Paint) chartColor43);
        legendItem29.setLabelPaint((java.awt.Paint) chartColor43);
        lineAndShapeRenderer2.setSeriesFillPaint((int) (short) 0, (java.awt.Paint) chartColor43);
        boolean boolean52 = lineAndShapeRenderer2.getItemShapeFilled((int) ' ', 24);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 255 + "'", int46 == 255);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
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
        org.jfree.chart.ChartColor chartColor30 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color31 = chartColor30.darker();
        org.jfree.chart.LegendItem legendItem32 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor30);
        java.lang.String str33 = legendItem32.getToolTipText();
        legendItem32.setDescription("");
        java.awt.Paint paint36 = legendItem32.getLinePaint();
        org.jfree.data.general.Dataset dataset37 = null;
        legendItem32.setDataset(dataset37);
        legendItem32.setLineVisible(true);
        java.awt.Paint paint41 = legendItem32.getLinePaint();
        java.awt.Stroke stroke42 = legendItem32.getLineStroke();
        lineAndShapeRenderer2.setSeriesOutlineStroke((int) (short) 1, stroke42);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
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
        org.jfree.chart.ChartColor chartColor26 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color27 = chartColor26.darker();
        org.jfree.chart.LegendItem legendItem28 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor26);
        java.lang.String str29 = legendItem28.getToolTipText();
        legendItem28.setDescription("");
        legendItem28.setSeriesKey((java.lang.Comparable) (short) 100);
        java.awt.Paint paint34 = legendItem28.getLinePaint();
        lineAndShapeRenderer2.setSeriesItemLabelPaint(0, paint34);
        int int36 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        java.lang.Boolean boolean39 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        lineAndShapeRenderer2.setDefaultEntityRadius(52);
        java.awt.Paint paint45 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(categoryToolTipGenerator40);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
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
        java.awt.Paint paint20 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color27 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer23.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = lineAndShapeRenderer23.getBaseToolTipGenerator();
        java.lang.Boolean boolean31 = lineAndShapeRenderer23.getSeriesVisible((int) (short) -1);
        boolean boolean32 = lineAndShapeRenderer23.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator33, true);
        java.lang.Boolean boolean37 = lineAndShapeRenderer23.getSeriesCreateEntities(10);
        boolean boolean38 = lineAndShapeRenderer23.getBaseItemLabelsVisible();
        boolean boolean39 = lineAndShapeRenderer2.equals((java.lang.Object) lineAndShapeRenderer23);
        org.jfree.chart.LegendItem legendItem42 = lineAndShapeRenderer23.getLegendItem((int) ' ', 33);
        java.awt.Stroke stroke43 = lineAndShapeRenderer23.getBaseStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = lineAndShapeRenderer23.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryToolTipGenerator29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(legendItem42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNull(categoryToolTipGenerator44);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = null;
        org.jfree.chart.axis.ValueAxis valueAxis3 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis3, categoryItemRenderer4);
        org.jfree.chart.ChartColor chartColor10 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel11 = null;
        java.awt.Rectangle rectangle12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.AffineTransform affineTransform14 = null;
        java.awt.RenderingHints renderingHints15 = null;
        java.awt.PaintContext paintContext16 = chartColor10.createContext(colorModel11, rectangle12, rectangle2D13, affineTransform14, renderingHints15);
        java.awt.Color color17 = java.awt.Color.getColor("", (java.awt.Color) chartColor10);
        categoryPlot5.setDomainCrosshairPaint((java.awt.Paint) color17);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator22 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 100, color17, 1.0f, (int) (byte) -1, (double) 10);
        java.awt.Color color23 = defaultShadowGenerator22.getShadowColor();
        int int24 = defaultShadowGenerator22.getShadowSize();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color31 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer27.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color31);
        java.awt.Paint paint33 = lineAndShapeRenderer27.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        lineAndShapeRenderer27.setSeriesURLGenerator(97, categoryURLGenerator35, false);
        java.awt.Paint paint39 = lineAndShapeRenderer27.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer27.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator47 = lineAndShapeRenderer27.getToolTipGenerator(0, 52, true);
        boolean boolean48 = defaultShadowGenerator22.equals((java.lang.Object) true);
        java.awt.Color color49 = defaultShadowGenerator22.getShadowColor();
        org.junit.Assert.assertNotNull(paintContext16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNull(categoryToolTipGenerator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(color49);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
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
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        categoryPlot4.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot4.getRangeAxisForDataset((int) (byte) 1);
        java.awt.geom.GeneralPath generalPath31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.RenderingSource renderingSource33 = null;
        categoryPlot4.select(generalPath31, rectangle2D32, renderingSource33);
        categoryPlot4.clearDomainMarkers((int) (byte) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation37 = categoryPlot4.getOrientation();
        categoryPlot4.setRangeCrosshairValue(100.0d, false);
        boolean boolean41 = categoryPlot4.isRangeGridlinesVisible();
        java.awt.Stroke stroke42 = categoryPlot4.getDomainCrosshairStroke();
        org.jfree.chart.util.Layer layer43 = null;
        java.util.Collection collection44 = categoryPlot4.getDomainMarkers(layer43);
        categoryPlot4.setRangeCrosshairValue(0.0d);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(plotOrientation37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNull(collection44);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
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
        org.jfree.chart.ChartColor chartColor26 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color27 = chartColor26.darker();
        org.jfree.chart.LegendItem legendItem28 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor26);
        java.lang.String str29 = legendItem28.getToolTipText();
        legendItem28.setDescription("");
        legendItem28.setSeriesKey((java.lang.Comparable) (short) 100);
        java.awt.Paint paint34 = legendItem28.getLinePaint();
        lineAndShapeRenderer2.setSeriesItemLabelPaint(0, paint34);
        int int36 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        java.lang.Boolean boolean39 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator41 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator41, true);
        lineAndShapeRenderer2.setItemLabelAnchorOffset((double) 10L);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator40);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setSeriesVisibleInLegend(10, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color21 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer17.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = lineAndShapeRenderer17.getBaseToolTipGenerator();
        java.lang.Boolean boolean25 = lineAndShapeRenderer17.getSeriesVisible((int) (short) -1);
        boolean boolean26 = lineAndShapeRenderer17.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer17.setBaseURLGenerator(categoryURLGenerator27, true);
        java.lang.Boolean boolean31 = lineAndShapeRenderer17.getSeriesCreateEntities(10);
        boolean boolean32 = lineAndShapeRenderer17.getBaseItemLabelsVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        lineAndShapeRenderer17.setSeriesURLGenerator(0, categoryURLGenerator34);
        java.awt.Font font36 = lineAndShapeRenderer17.getBaseItemLabelFont();
        lineAndShapeRenderer2.setBaseItemLabelFont(font36, true);
        java.awt.Paint paint42 = lineAndShapeRenderer2.getItemOutlinePaint(0, (int) (short) -1, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = lineAndShapeRenderer2.getItemLabelGenerator((int) 'a', 0, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color25 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer21.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = lineAndShapeRenderer21.getBaseToolTipGenerator();
        java.lang.Boolean boolean29 = lineAndShapeRenderer21.getSeriesVisible((int) (short) -1);
        boolean boolean30 = lineAndShapeRenderer21.getBaseSeriesVisible();
        boolean boolean32 = lineAndShapeRenderer21.isSeriesVisible((-10289251));
        java.awt.Stroke stroke33 = lineAndShapeRenderer21.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke33, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = lineAndShapeRenderer2.getBaseURLGenerator();
        java.awt.Font font38 = lineAndShapeRenderer2.getLegendTextFont(0);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        boolean boolean42 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        boolean boolean43 = lineAndShapeRenderer2.getBaseShapesFilled();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNull(categoryToolTipGenerator27);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNull(categoryURLGenerator36);
        org.junit.Assert.assertNull(font38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
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
        java.awt.Stroke stroke27 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot4.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo30, point2D31);
        float float33 = categoryPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.data.Range range35 = categoryPlot4.getDataRange(valueAxis34);
        boolean boolean36 = categoryPlot4.isRangeZoomable();
        org.jfree.chart.plot.Marker marker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        boolean boolean41 = categoryPlot4.removeDomainMarker((-10289251), marker38, layer39, false);
        int int42 = categoryPlot4.getCrosshairDatasetIndex();
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = categoryPlot4.getDomainAxisForDataset(97);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent45 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent45);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNull(range35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(categoryAxis44);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color7 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer3.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color7);
        java.awt.Paint paint9 = lineAndShapeRenderer3.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer3.setSeriesURLGenerator(97, categoryURLGenerator11, false);
        java.awt.Paint paint15 = lineAndShapeRenderer3.getSeriesItemLabelPaint(33);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = null;
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis18, categoryItemRenderer19);
        org.jfree.chart.ChartColor chartColor25 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel26 = null;
        java.awt.Rectangle rectangle27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.awt.geom.AffineTransform affineTransform29 = null;
        java.awt.RenderingHints renderingHints30 = null;
        java.awt.PaintContext paintContext31 = chartColor25.createContext(colorModel26, rectangle27, rectangle2D28, affineTransform29, renderingHints30);
        java.awt.Color color32 = java.awt.Color.getColor("", (java.awt.Color) chartColor25);
        categoryPlot20.setDomainCrosshairPaint((java.awt.Paint) color32);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        categoryPlot20.removeChangeListener(plotChangeListener34);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer37 = categoryPlot20.getRenderer(97);
        org.jfree.chart.plot.Plot plot38 = categoryPlot20.getParent();
        double double39 = categoryPlot20.getAnchorValue();
        lineAndShapeRenderer3.setPlot(categoryPlot20);
        java.awt.Paint paint41 = lineAndShapeRenderer3.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("hi!", paint41);
        legendItem42.setLineVisible(false);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paintContext31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(categoryItemRenderer37);
        org.junit.Assert.assertNull(plot38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        java.awt.Font font40 = lineAndShapeRenderer2.getBaseItemLabelFont();
        boolean boolean43 = lineAndShapeRenderer2.getItemShapeFilled((int) '#', 35);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paintContext30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(categoryItemRenderer36);
        org.junit.Assert.assertNull(plot37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
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
        categoryPlot4.setAnchorValue((double) (byte) 10);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot4.getDomainAxisLocation((int) (short) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color32 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer28.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color32);
        java.awt.Paint paint34 = lineAndShapeRenderer28.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        lineAndShapeRenderer28.setSeriesURLGenerator(97, categoryURLGenerator36, false);
        java.awt.Paint paint40 = lineAndShapeRenderer28.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator41 = null;
        lineAndShapeRenderer28.setBaseToolTipGenerator(categoryToolTipGenerator41);
        java.awt.Stroke stroke44 = lineAndShapeRenderer28.getSeriesOutlineStroke((int) (short) 1);
        java.awt.Paint paint48 = lineAndShapeRenderer28.getItemOutlinePaint(97, (-16777216), true);
        categoryPlot4.setOutlinePaint(paint48);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNull(stroke44);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
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
        java.awt.Stroke stroke27 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot4.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo30, point2D31);
        float float33 = categoryPlot4.getBackgroundAlpha();
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.data.Range range35 = categoryPlot4.getDataRange(valueAxis34);
        boolean boolean36 = categoryPlot4.isRangeZoomable();
        org.jfree.chart.plot.Marker marker38 = null;
        org.jfree.chart.util.Layer layer39 = null;
        boolean boolean41 = categoryPlot4.removeDomainMarker((-10289251), marker38, layer39, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer43 = categoryPlot4.getRenderer(0);
        categoryPlot4.setDomainCrosshairVisible(false);
        categoryPlot4.setDomainCrosshairVisible(false);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNull(range35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(categoryItemRenderer43);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Paint paint10 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color17 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer13.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = lineAndShapeRenderer13.getBaseToolTipGenerator();
        java.lang.Boolean boolean21 = lineAndShapeRenderer13.getSeriesVisible((int) (short) -1);
        boolean boolean22 = lineAndShapeRenderer13.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        lineAndShapeRenderer13.setBaseURLGenerator(categoryURLGenerator23, true);
        java.lang.Boolean boolean27 = lineAndShapeRenderer13.getSeriesCreateEntities(10);
        org.jfree.chart.ChartColor chartColor32 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color33 = chartColor32.darker();
        lineAndShapeRenderer13.setSeriesFillPaint(100, (java.awt.Paint) color33);
        java.awt.Paint paint35 = lineAndShapeRenderer13.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = null;
        lineAndShapeRenderer13.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator37);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = lineAndShapeRenderer13.getToolTipGenerator((-1), 0, true);
        java.awt.Stroke stroke46 = lineAndShapeRenderer13.getItemStroke(0, (-10289251), false);
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke46);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(categoryToolTipGenerator42);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
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
        int int22 = categoryPlot4.getRangeAxisCount();
        categoryPlot4.setRangeCrosshairVisible(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color32 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer28.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = lineAndShapeRenderer28.getBaseToolTipGenerator();
        categoryPlot4.setRenderer(33, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer28, false);
        categoryPlot4.configureDomainAxes();
        boolean boolean38 = categoryPlot4.getDrawSharedDomainAxis();
        boolean boolean39 = categoryPlot4.isNotify();
        float float40 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation41 = categoryPlot4.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(categoryToolTipGenerator34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation41);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double36 = rectangleInsets34.calculateTopOutset((double) (byte) 0);
        java.lang.String str37 = rectangleInsets34.toString();
        org.jfree.chart.util.UnitType unitType38 = rectangleInsets34.getUnitType();
        double double40 = rectangleInsets34.calculateTopOutset((double) (-1.0f));
        org.jfree.chart.util.UnitType unitType41 = rectangleInsets34.getUnitType();
        categoryPlot4.setAxisOffset(rectangleInsets34);
        categoryPlot4.clearAnnotations();
        org.jfree.chart.util.SortOrder sortOrder44 = categoryPlot4.getRowRenderingOrder();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str37, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertNotNull(unitType38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(unitType41);
        org.junit.Assert.assertNotNull(sortOrder44);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
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
        java.awt.Font font35 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke37 = lineAndShapeRenderer2.getSeriesOutlineStroke((-1));
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = null;
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer41 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset38, categoryAxis39, valueAxis40, categoryItemRenderer41);
        org.jfree.chart.axis.AxisLocation axisLocation44 = null;
        categoryPlot42.setRangeAxisLocation(97, axisLocation44, false);
        java.awt.Stroke stroke47 = categoryPlot42.getOutlineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke47);
        java.awt.Stroke stroke50 = lineAndShapeRenderer2.lookupSeriesOutlineStroke((int) (short) 10);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNull(stroke37);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color6 = chartColor5.darker();
        org.jfree.chart.LegendItem legendItem7 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor5);
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", (java.awt.Paint) chartColor5);
        boolean boolean9 = legendItem8.isShapeFilled();
        legendItem8.setDescription("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        java.awt.Font font12 = legendItem8.getLabelFont();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color20 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer16.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = lineAndShapeRenderer16.getBaseToolTipGenerator();
        java.lang.Boolean boolean24 = lineAndShapeRenderer16.getSeriesVisible((int) (short) -1);
        boolean boolean25 = lineAndShapeRenderer16.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        lineAndShapeRenderer16.setBaseURLGenerator(categoryURLGenerator26, true);
        java.awt.Color color32 = java.awt.Color.getColor("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", (int) (short) 1);
        lineAndShapeRenderer16.setSeriesItemLabelPaint((int) (byte) 0, (java.awt.Paint) color32, false);
        org.jfree.chart.ChartColor chartColor40 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color41 = chartColor40.darker();
        org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor40);
        java.lang.String str43 = legendItem42.getToolTipText();
        legendItem42.setDescription("");
        legendItem42.setSeriesKey((java.lang.Comparable) (short) 100);
        java.awt.Paint paint48 = legendItem42.getLinePaint();
        lineAndShapeRenderer16.setSeriesItemLabelPaint(0, paint48);
        org.jfree.chart.LegendItem legendItem50 = new org.jfree.chart.LegendItem("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", paint48);
        legendItem8.setFillPaint(paint48);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot21.getRowRenderingOrder();
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        categoryPlot21.setDomainCrosshairStroke(stroke35);
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
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        java.awt.Stroke stroke17 = categoryPlot14.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double20 = categoryAxis19.getFixedDimension();
        org.jfree.chart.plot.Plot plot21 = categoryAxis19.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryAxis19.getLabelInsets();
        double double24 = rectangleInsets22.calculateTopInset((double) 1.0f);
        categoryPlot14.setAxisOffset(rectangleInsets22);
        org.jfree.chart.plot.Marker marker26 = null;
        org.jfree.chart.util.Layer layer27 = null;
        boolean boolean28 = categoryPlot14.removeDomainMarker(marker26, layer27);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.0d + "'", double24 == 3.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        java.awt.Stroke stroke17 = categoryPlot14.getRangeGridlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis19 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double20 = categoryAxis19.getFixedDimension();
        org.jfree.chart.plot.Plot plot21 = categoryAxis19.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = categoryAxis19.getLabelInsets();
        double double24 = rectangleInsets22.calculateTopInset((double) 1.0f);
        categoryPlot14.setAxisOffset(rectangleInsets22);
        categoryPlot14.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.ValueAxis valueAxis29 = categoryPlot14.getRangeAxisForDataset(4);
        categoryPlot14.setDomainCrosshairRowKey((java.lang.Comparable) (-4.0d));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.0d + "'", double24 == 3.0d);
        org.junit.Assert.assertNull(valueAxis29);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        java.awt.Stroke stroke7 = lineAndShapeRenderer3.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot22.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis25 = lineAndShapeRenderer3.getRangeAxis(categoryPlot22, (int) '4');
        double double26 = categoryPlot22.getRangeCrosshairValue();
        java.awt.Paint paint27 = categoryPlot22.getRangeZeroBaselinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot22.getRangeAxisLocation();
        abstractCategoryDataset0.removeChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot22);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState30 = abstractCategoryDataset0.getSelectionState();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState31 = abstractCategoryDataset0.getSelectionState();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(categoryItemRenderer23);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(categoryDatasetSelectionState30);
        org.junit.Assert.assertNull(categoryDatasetSelectionState31);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double32 = rectangleInsets30.calculateBottomInset(0.0d);
        categoryPlot21.setAxisOffset(rectangleInsets30);
        categoryPlot21.setDomainCrosshairColumnKey((java.lang.Comparable) 2.0d, false);
        categoryPlot21.clearDomainMarkers(0);
        org.jfree.chart.axis.AxisLocation axisLocation39 = categoryPlot21.getRangeAxisLocation();
        categoryPlot21.configureRangeAxes();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.0d + "'", double32 == 3.0d);
        org.junit.Assert.assertNotNull(axisLocation39);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
        boolean boolean27 = categoryPlot21.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.data.Range range29 = categoryPlot21.getDataRange(valueAxis28);
        boolean boolean30 = categoryPlot21.isDomainZoomable();
        java.util.List list31 = categoryPlot21.getAnnotations();
        boolean boolean32 = categoryPlot21.canSelectByRegion();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float27 = categoryAxis26.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color32 = java.awt.Color.BLUE;
        lineAndShapeRenderer31.setBaseItemLabelPaint((java.awt.Paint) color32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer31.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot(categoryDataset24, categoryAxis26, valueAxis28, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer31);
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = categoryPlot38.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.data.Range range41 = categoryPlot38.getDataRange(valueAxis40);
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot38.getRangeAxisLocation();
        categoryPlot38.clearRangeMarkers(0);
        boolean boolean45 = lineAndShapeRenderer2.equals((java.lang.Object) categoryPlot38);
        org.jfree.chart.axis.ValueAxis valueAxis46 = categoryPlot38.getRangeAxis();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator21);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertNotNull(categoryAxis39);
        org.junit.Assert.assertNull(range41);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(valueAxis46);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        categoryPlot21.clearSelection();
        boolean boolean33 = categoryPlot21.isRangeCrosshairVisible();
        org.jfree.data.category.CategoryDataset categoryDataset34 = categoryPlot21.getDataset();
        org.jfree.chart.axis.AxisSpace axisSpace35 = null;
        categoryPlot21.setFixedRangeAxisSpace(axisSpace35, false);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(categoryDataset34);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        java.awt.Font font36 = renderAttributes13.getDefaultLabelFont();
        java.awt.Shape shape39 = renderAttributes13.getItemShape((int) (byte) -1, (-10));
        java.awt.Paint paint41 = renderAttributes13.getSeriesOutlinePaint(0);
        java.awt.Paint paint42 = renderAttributes13.getDefaultLabelPaint();
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
        org.junit.Assert.assertNull(font36);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(paint42);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        java.awt.Stroke stroke8 = lineAndShapeRenderer4.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float12 = categoryAxis11.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis11, valueAxis13, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot23.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis26 = lineAndShapeRenderer4.getRangeAxis(categoryPlot23, (int) '4');
        boolean boolean27 = categoryPlot23.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot23.getDomainAxisEdge();
        boolean boolean29 = categoryPlot23.isRangeZeroBaselineVisible();
        boolean boolean30 = categoryPlot23.isDomainGridlinesVisible();
        keyedObjects0.addObject((java.lang.Comparable) (short) 100, (java.lang.Object) categoryPlot23);
        org.jfree.chart.util.SortOrder sortOrder32 = categoryPlot23.getRowRenderingOrder();
        java.lang.String str33 = sortOrder32.toString();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(categoryItemRenderer24);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(sortOrder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "SortOrder.ASCENDING" + "'", str33, "SortOrder.ASCENDING");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        java.awt.Stroke stroke17 = categoryPlot14.getRangeGridlineStroke();
        categoryPlot14.setRangePannable(false);
        org.jfree.chart.util.Layer layer21 = null;
        java.util.Collection collection22 = categoryPlot14.getDomainMarkers((int) (byte) 100, layer21);
        categoryPlot14.setAnchorValue((double) 10L, false);
        boolean boolean26 = categoryPlot14.canSelectByRegion();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset28 = new org.jfree.data.category.DefaultCategoryDataset();
        int int30 = defaultCategoryDataset28.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list31 = defaultCategoryDataset28.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot14.mapDatasetToRangeAxes(255, list31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        categoryPlot21.clearSelection();
        boolean boolean33 = categoryPlot21.canSelectByPoint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot21.getRenderer((int) (short) 100);
        java.util.List list36 = categoryPlot21.getAnnotations();
        boolean boolean37 = categoryPlot21.canSelectByPoint();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(categoryItemRenderer35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        java.awt.Stroke stroke7 = lineAndShapeRenderer3.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float11 = categoryAxis10.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color16 = java.awt.Color.BLUE;
        lineAndShapeRenderer15.setBaseItemLabelPaint((java.awt.Paint) color16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = lineAndShapeRenderer15.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis10, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer23 = categoryPlot22.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis25 = lineAndShapeRenderer3.getRangeAxis(categoryPlot22, (int) '4');
        double double26 = categoryPlot22.getRangeCrosshairValue();
        java.awt.Paint paint27 = categoryPlot22.getRangeZeroBaselinePaint();
        org.jfree.chart.axis.AxisLocation axisLocation28 = categoryPlot22.getRangeAxisLocation();
        abstractCategoryDataset0.removeChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot22);
        org.jfree.chart.util.Layer layer30 = null;
        java.util.Collection collection31 = categoryPlot22.getDomainMarkers(layer30);
        org.jfree.chart.util.Layer layer32 = null;
        java.util.Collection collection33 = categoryPlot22.getRangeMarkers(layer32);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot22.getRangeAxisEdge((-1656));
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(categoryItemRenderer23);
        org.junit.Assert.assertNull(valueAxis25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(axisLocation28);
        org.junit.Assert.assertNull(collection31);
        org.junit.Assert.assertNull(collection33);
        org.junit.Assert.assertNotNull(rectangleEdge35);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        java.awt.Font font36 = renderAttributes13.getDefaultLabelFont();
        java.awt.Paint paint38 = renderAttributes13.getSeriesOutlinePaint(500);
        java.awt.Color color39 = org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA;
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color39);
        java.awt.Paint paint43 = renderAttributes13.getItemPaint((-254), (int) (byte) 10);
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
        org.junit.Assert.assertNull(font36);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNull(paint43);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        boolean boolean28 = categoryPlot21.isDomainGridlinesVisible();
        java.awt.Stroke stroke29 = categoryPlot21.getOutlineStroke();
        java.awt.geom.GeneralPath generalPath30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.RenderingSource renderingSource32 = null;
        categoryPlot21.select(generalPath30, rectangle2D31, renderingSource32);
        categoryPlot21.clearDomainMarkers();
        org.jfree.chart.axis.ValueAxis valueAxis36 = categoryPlot21.getRangeAxis(9);
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
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(valueAxis36);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        java.awt.Shape shape20 = null;
        org.jfree.chart.ChartColor chartColor25 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color26 = chartColor25.darker();
        org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor25);
        int int28 = chartColor25.getAlpha();
        org.jfree.chart.LegendItem legendItem29 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape20, (java.awt.Paint) chartColor25);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = null;
        org.jfree.chart.axis.ValueAxis valueAxis32 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer33 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot(categoryDataset30, categoryAxis31, valueAxis32, categoryItemRenderer33);
        org.jfree.chart.axis.AxisLocation axisLocation36 = null;
        categoryPlot34.setRangeAxisLocation(97, axisLocation36, false);
        java.awt.Stroke stroke39 = categoryPlot34.getOutlineStroke();
        boolean boolean40 = categoryPlot34.isDomainZoomable();
        org.jfree.chart.util.SortOrder sortOrder41 = categoryPlot34.getColumnRenderingOrder();
        java.awt.Font font42 = categoryPlot34.getNoDataMessageFont();
        legendItem29.setLabelFont(font42);
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 10, font42);
        double double45 = lineAndShapeRenderer2.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 255 + "'", int28 == 255);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(sortOrder41);
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float17 = categoryAxis16.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis16, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        java.lang.Object obj29 = categoryPlot28.clone();
        java.awt.Stroke stroke30 = categoryPlot28.getDomainCrosshairStroke();
        lineAndShapeRenderer2.setPlot(categoryPlot28);
        org.jfree.chart.axis.ValueAxis valueAxis33 = categoryPlot28.getRangeAxis((int) (short) 10);
        org.jfree.chart.plot.Marker marker35 = null;
        org.jfree.chart.util.Layer layer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot28.addRangeMarker(255, marker35, layer36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(valueAxis33);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        org.jfree.chart.plot.Marker marker28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        boolean boolean31 = categoryPlot21.removeDomainMarker((int) (short) 0, marker28, layer29, false);
        org.jfree.chart.plot.Marker marker32 = null;
        org.jfree.chart.util.Layer layer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = categoryPlot21.removeRangeMarker(marker32, layer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.ChartColor chartColor19 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel20 = null;
        java.awt.Rectangle rectangle21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.AffineTransform affineTransform23 = null;
        java.awt.RenderingHints renderingHints24 = null;
        java.awt.PaintContext paintContext25 = chartColor19.createContext(colorModel20, rectangle21, rectangle2D22, affineTransform23, renderingHints24);
        java.awt.Color color26 = java.awt.Color.getColor("", (java.awt.Color) chartColor19);
        categoryPlot14.setDomainCrosshairPaint((java.awt.Paint) color26);
        org.jfree.chart.event.PlotChangeListener plotChangeListener28 = null;
        categoryPlot14.removeChangeListener(plotChangeListener28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        java.awt.geom.Point2D point2D32 = null;
        categoryPlot14.panRangeAxes(0.0d, plotRenderingInfo31, point2D32);
        java.lang.String str34 = categoryPlot14.getNoDataMessage();
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot14.getRowRenderingOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        java.awt.geom.Point2D point2D38 = null;
        categoryPlot14.panRangeAxes(0.0d, plotRenderingInfo37, point2D38);
        java.awt.Paint paint40 = categoryPlot14.getRangeZeroBaselinePaint();
        lineAndShapeRenderer2.setBaseItemLabelPaint(paint40, true);
        java.lang.Boolean boolean44 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (byte) 0);
        boolean boolean45 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(paintContext25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(sortOrder35);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(boolean44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        boolean boolean28 = categoryPlot21.isDomainGridlinesVisible();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor29 = categoryPlot21.getDomainGridlinePosition();
        java.lang.String str30 = categoryAnchor29.toString();
        java.lang.String str31 = categoryAnchor29.toString();
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
        org.junit.Assert.assertNotNull(categoryAnchor29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "CategoryAnchor.MIDDLE" + "'", str30, "CategoryAnchor.MIDDLE");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "CategoryAnchor.MIDDLE" + "'", str31, "CategoryAnchor.MIDDLE");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        org.jfree.chart.plot.Marker marker33 = null;
        org.jfree.chart.util.Layer layer34 = null;
        boolean boolean35 = categoryPlot4.removeDomainMarker(35, marker33, layer34);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = categoryPlot4.removeAnnotation(categoryAnnotation36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        boolean boolean38 = categoryPlot37.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis40 = categoryPlot37.getRangeAxisForDataset((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot37.getRangeAxisLocation((int) '4');
        lineAndShapeRenderer2.setPlot(categoryPlot37);
        java.awt.Paint paint47 = lineAndShapeRenderer2.getItemPaint((int) '4', (int) (byte) 0, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        boolean boolean20 = categoryPlot14.isDomainZoomable();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = categoryPlot14.render(graphics2D21, rectangle2D22, (int) (short) -1, plotRenderingInfo24, categoryCrosshairState25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'index'.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        categoryPlot4.setAnchorValue((double) 1L);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot4.getDomainAxisEdge((int) ' ');
        boolean boolean24 = categoryPlot4.isSubplot();
        java.awt.Stroke stroke25 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot4.zoomDomainAxes((double) (-1), (double) (-1), plotRenderingInfo28, point2D29);
        double double31 = categoryPlot4.getAnchorValue();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        java.awt.geom.Point2D point2D34 = null;
        org.jfree.chart.plot.PlotState plotState35 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.draw(graphics2D32, rectangle2D33, point2D34, plotState35, plotRenderingInfo36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        boolean boolean38 = categoryPlot37.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis40 = categoryPlot37.getRangeAxisForDataset((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot37.getRangeAxisLocation((int) '4');
        lineAndShapeRenderer2.setPlot(categoryPlot37);
        boolean boolean44 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        boolean boolean11 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color18 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer14.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color18);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = lineAndShapeRenderer14.getBaseToolTipGenerator();
        java.lang.Boolean boolean22 = lineAndShapeRenderer14.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer14.getSeriesItemLabelGenerator((int) (byte) 1);
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator25 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        boolean boolean27 = standardCategorySeriesLabelGenerator25.equals((java.lang.Object) 100L);
        lineAndShapeRenderer14.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator25);
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator25);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation30 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
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
        org.jfree.chart.ChartColor chartColor26 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color27 = chartColor26.darker();
        org.jfree.chart.LegendItem legendItem28 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor26);
        java.lang.String str29 = legendItem28.getToolTipText();
        legendItem28.setDescription("");
        legendItem28.setSeriesKey((java.lang.Comparable) (short) 100);
        java.awt.Paint paint34 = legendItem28.getLinePaint();
        lineAndShapeRenderer2.setSeriesItemLabelPaint(0, paint34);
        int int36 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        java.lang.Boolean boolean39 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 0);
        org.jfree.chart.LegendItem legendItem42 = lineAndShapeRenderer2.getLegendItem((int) (short) 100, (int) ' ');
        java.awt.Paint paint44 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((int) (byte) 1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(legendItem42);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        java.awt.geom.Point2D point2D22 = null;
        categoryPlot4.panRangeAxes(0.0d, plotRenderingInfo21, point2D22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot4);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color33 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer29.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator35 = lineAndShapeRenderer29.getBaseToolTipGenerator();
        java.lang.Boolean boolean37 = lineAndShapeRenderer29.getSeriesVisible((int) (short) -1);
        boolean boolean38 = lineAndShapeRenderer29.getBaseSeriesVisible();
        boolean boolean40 = lineAndShapeRenderer29.isSeriesVisible((-10289251));
        java.awt.Stroke stroke41 = lineAndShapeRenderer29.getBaseOutlineStroke();
        categoryPlot4.setOutlineStroke(stroke41);
        java.lang.Object obj43 = categoryPlot4.clone();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNull(categoryToolTipGenerator35);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        categoryPlot21.clearDomainMarkers((int) (byte) 100);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = categoryPlot21.getRangeAxisIndex(valueAxis31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        java.awt.Font font3 = categoryAxis1.getTickLabelFont();
        java.awt.Paint paint4 = categoryAxis1.getLabelPaint();
        java.awt.Stroke stroke5 = categoryAxis1.getAxisLineStroke();
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float15 = categoryAxis14.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer19.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis14, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer27 = categoryPlot26.getRenderer();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = categoryPlot26.getDomainAxisForDataset(2);
        boolean boolean30 = categoryPlot26.canSelectByPoint();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent31 = null;
        categoryPlot26.datasetChanged(datasetChangeEvent31);
        org.jfree.chart.util.RectangleEdge rectangleEdge34 = categoryPlot26.getDomainAxisEdge(8);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = categoryAxis1.getCategorySeriesMiddle(4, 8, (int) (byte) -1, (int) (short) 10, (double) (-1), rectangle2D11, rectangleEdge34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(categoryItemRenderer27);
        org.junit.Assert.assertNotNull(categoryAxis29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(rectangleEdge34);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color31 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer27.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = lineAndShapeRenderer27.getBaseToolTipGenerator();
        java.lang.Boolean boolean35 = lineAndShapeRenderer27.getSeriesVisible((int) (short) -1);
        boolean boolean36 = lineAndShapeRenderer27.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = null;
        lineAndShapeRenderer27.setBaseURLGenerator(categoryURLGenerator37, true);
        java.lang.Boolean boolean41 = lineAndShapeRenderer27.getSeriesCreateEntities(10);
        java.awt.Stroke stroke42 = lineAndShapeRenderer27.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseStroke(stroke42);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((-52), (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(categoryToolTipGenerator33);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.text.AttributedString attributedString0 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color10 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer6.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = lineAndShapeRenderer6.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer6.getSeriesItemLabelGenerator(0);
        java.awt.Font font18 = lineAndShapeRenderer6.getItemLabelFont((int) '4', (int) (short) 10, false);
        java.awt.Paint paint20 = lineAndShapeRenderer6.getLegendTextPaint(0);
        boolean boolean21 = lineAndShapeRenderer6.getAutoPopulateSeriesFillPaint();
        java.awt.Shape shape25 = lineAndShapeRenderer6.getItemShape((-7839), (int) (short) 1, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color32 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer28.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color32);
        java.awt.Paint paint34 = lineAndShapeRenderer28.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        lineAndShapeRenderer28.setSeriesURLGenerator(97, categoryURLGenerator36, false);
        lineAndShapeRenderer28.setBaseSeriesVisible(false, false);
        java.awt.Paint paint45 = lineAndShapeRenderer28.getItemLabelPaint((int) (short) -1, (int) '4', false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem(attributedString0, "java.awt.Color[r=223,g=255,b=190]", "", "AxisLocation.TOP_OR_LEFT", shape25, paint45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(categoryToolTipGenerator12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color32 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer28.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color32);
        java.awt.Paint paint34 = lineAndShapeRenderer28.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        lineAndShapeRenderer28.setSeriesURLGenerator(97, categoryURLGenerator36, false);
        lineAndShapeRenderer28.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = lineAndShapeRenderer28.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition45, true);
        lineAndShapeRenderer2.setSeriesVisible((int) '#', (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (short) 10, (java.lang.Boolean) true);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNotNull(itemLabelPosition45);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot21.getRowRenderingOrder();
        boolean boolean35 = categoryPlot21.isDomainZoomable();
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
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float26 = categoryAxis25.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color31 = java.awt.Color.BLUE;
        lineAndShapeRenderer30.setBaseItemLabelPaint((java.awt.Paint) color31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = lineAndShapeRenderer30.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis25, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        boolean boolean38 = categoryPlot37.canSelectByPoint();
        org.jfree.chart.axis.ValueAxis valueAxis40 = categoryPlot37.getRangeAxisForDataset((int) '4');
        org.jfree.chart.axis.AxisLocation axisLocation42 = categoryPlot37.getRangeAxisLocation((int) '4');
        lineAndShapeRenderer2.setPlot(categoryPlot37);
        boolean boolean44 = categoryPlot37.getDrawSharedDomainAxis();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(valueAxis40);
        org.junit.Assert.assertNotNull(axisLocation42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
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
        org.jfree.chart.ChartColor chartColor26 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color27 = chartColor26.darker();
        org.jfree.chart.LegendItem legendItem28 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor26);
        java.lang.String str29 = legendItem28.getToolTipText();
        legendItem28.setDescription("");
        legendItem28.setSeriesKey((java.lang.Comparable) (short) 100);
        java.awt.Paint paint34 = legendItem28.getLinePaint();
        lineAndShapeRenderer2.setSeriesItemLabelPaint(0, paint34);
        int int36 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator37 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        java.lang.Boolean boolean39 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (short) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator43 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator43);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator37);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(categoryToolTipGenerator40);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        java.awt.Paint paint22 = renderAttributes16.getItemFillPaint(97, (int) (short) -1);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color30 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer26.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color30);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = lineAndShapeRenderer26.getBaseToolTipGenerator();
        java.lang.Boolean boolean34 = lineAndShapeRenderer26.getSeriesVisible((int) (short) -1);
        boolean boolean35 = lineAndShapeRenderer26.getUseOutlinePaint();
        java.awt.Shape shape36 = lineAndShapeRenderer26.getBaseShape();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState38 = lineAndShapeRenderer26.createState(plotRenderingInfo37);
        java.awt.Shape shape39 = lineAndShapeRenderer26.getBaseShape();
        renderAttributes16.setSeriesShape(24, shape39);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(renderAttributes16);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNull(categoryToolTipGenerator32);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(categoryItemRendererState38);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        boolean boolean20 = categoryPlot14.isDomainZoomable();
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float24 = categoryAxis23.getTickMarkInsideLength();
        categoryAxis23.setTickLabelsVisible(false);
        double double27 = categoryAxis23.getLowerMargin();
        java.lang.String str28 = categoryAxis23.getLabelToolTip();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions29 = categoryAxis23.getCategoryLabelPositions();
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot14.setDomainAxis((int) (byte) -1, categoryAxis23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.05d + "'", double27 == 0.05d);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(categoryLabelPositions29);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
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
        java.awt.Paint paint20 = lineAndShapeRenderer2.getBasePaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color27 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer23.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = lineAndShapeRenderer23.getBaseToolTipGenerator();
        java.lang.Boolean boolean31 = lineAndShapeRenderer23.getSeriesVisible((int) (short) -1);
        boolean boolean32 = lineAndShapeRenderer23.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator33, true);
        java.lang.Boolean boolean37 = lineAndShapeRenderer23.getSeriesCreateEntities(10);
        boolean boolean38 = lineAndShapeRenderer23.getBaseItemLabelsVisible();
        boolean boolean39 = lineAndShapeRenderer2.equals((java.lang.Object) lineAndShapeRenderer23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator40);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryToolTipGenerator29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color5 = java.awt.Color.BLUE;
        lineAndShapeRenderer4.setBaseItemLabelPaint((java.awt.Paint) color5);
        java.awt.Stroke stroke8 = lineAndShapeRenderer4.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float12 = categoryAxis11.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color17 = java.awt.Color.BLUE;
        lineAndShapeRenderer16.setBaseItemLabelPaint((java.awt.Paint) color17);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer16.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset9, categoryAxis11, valueAxis13, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer16);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = categoryPlot23.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis26 = lineAndShapeRenderer4.getRangeAxis(categoryPlot23, (int) '4');
        boolean boolean27 = categoryPlot23.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot23.getDomainAxisEdge();
        boolean boolean29 = categoryPlot23.isRangeZeroBaselineVisible();
        boolean boolean30 = categoryPlot23.isDomainGridlinesVisible();
        keyedObjects0.addObject((java.lang.Comparable) (short) 100, (java.lang.Object) categoryPlot23);
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects0.removeValue((java.lang.Comparable) 8);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (8) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(categoryItemRenderer24);
        org.junit.Assert.assertNull(valueAxis26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setSeriesVisibleInLegend(10, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color21 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer17.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = lineAndShapeRenderer17.getBaseToolTipGenerator();
        java.lang.Boolean boolean25 = lineAndShapeRenderer17.getSeriesVisible((int) (short) -1);
        boolean boolean26 = lineAndShapeRenderer17.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer17.setBaseURLGenerator(categoryURLGenerator27, true);
        java.lang.Boolean boolean31 = lineAndShapeRenderer17.getSeriesCreateEntities(10);
        boolean boolean32 = lineAndShapeRenderer17.getBaseItemLabelsVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        lineAndShapeRenderer17.setSeriesURLGenerator(0, categoryURLGenerator34);
        java.awt.Font font36 = lineAndShapeRenderer17.getBaseItemLabelFont();
        lineAndShapeRenderer2.setBaseItemLabelFont(font36, true);
        boolean boolean39 = lineAndShapeRenderer2.getBaseCreateEntities();
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Paint paint43 = lineAndShapeRenderer2.getSeriesOutlinePaint((int) (short) 1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(paint43);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
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
        java.awt.Paint paint25 = lineAndShapeRenderer2.getSeriesPaint((-10289251));
        boolean boolean27 = lineAndShapeRenderer2.isSeriesVisibleInLegend((int) (byte) 1);
        double double28 = lineAndShapeRenderer2.getItemMargin();
        java.awt.Font font32 = lineAndShapeRenderer2.getItemLabelFont((int) (byte) 1, (int) (short) 0, true);
        java.awt.Color color36 = java.awt.Color.getColor("ItemLabelAnchor.OUTSIDE12", 24);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelPaint((-100), (java.awt.Paint) color36);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        org.jfree.chart.plot.Plot plot28 = categoryAxis1.getPlot();
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float31 = categoryAxis30.getTickMarkInsideLength();
        categoryAxis30.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis30.setLabelToolTip("java.awt.Color[r=255,g=255,b=255]");
        categoryAxis30.setUpperMargin((double) '#');
        double double38 = categoryAxis30.getUpperMargin();
        boolean boolean39 = categoryAxis1.equals((java.lang.Object) categoryAxis30);
        org.jfree.chart.plot.Plot plot40 = null;
        categoryAxis1.setPlot(plot40);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = lineAndShapeRenderer2.getItemLabelGenerator((int) 'a', 0, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color25 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer21.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = lineAndShapeRenderer21.getBaseToolTipGenerator();
        java.lang.Boolean boolean29 = lineAndShapeRenderer21.getSeriesVisible((int) (short) -1);
        boolean boolean30 = lineAndShapeRenderer21.getBaseSeriesVisible();
        boolean boolean32 = lineAndShapeRenderer21.isSeriesVisible((-10289251));
        java.awt.Stroke stroke33 = lineAndShapeRenderer21.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke33, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator37, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator40 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint42 = lineAndShapeRenderer2.getSeriesPaint((-10411212));
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNull(categoryToolTipGenerator27);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNull(categoryURLGenerator36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator40);
        org.junit.Assert.assertNull(paint42);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        java.awt.Stroke stroke39 = renderAttributes13.getDefaultStroke();
        java.awt.Paint paint41 = null;
        // The following exception was thrown during execution in test generation
        try {
            renderAttributes13.setSeriesLabelPaint(0, paint41);
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
        org.junit.Assert.assertNull(stroke39);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        categoryPlot4.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.jfree.chart.axis.ValueAxis valueAxis30 = categoryPlot4.getRangeAxisForDataset((int) (byte) 1);
        java.awt.geom.GeneralPath generalPath31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        org.jfree.chart.RenderingSource renderingSource33 = null;
        categoryPlot4.select(generalPath31, rectangle2D32, renderingSource33);
        categoryPlot4.clearDomainMarkers((int) (byte) 1);
        org.jfree.chart.plot.PlotOrientation plotOrientation37 = categoryPlot4.getOrientation();
        categoryPlot4.setRangeCrosshairValue(100.0d, false);
        org.jfree.chart.util.RectangleEdge rectangleEdge41 = categoryPlot4.getDomainAxisEdge();
        org.jfree.chart.axis.ValueAxis valueAxis42 = categoryPlot4.getRangeAxis();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent43 = null;
        categoryPlot4.datasetChanged(datasetChangeEvent43);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(collection20);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertNotNull(plotOrientation37);
        org.junit.Assert.assertNotNull(rectangleEdge41);
        org.junit.Assert.assertNull(valueAxis42);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        boolean boolean30 = categoryPlot21.isRangeZoomable();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot21.drawBackground(graphics2D31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator12, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = lineAndShapeRenderer2.getItemLabelGenerator((int) 'a', 0, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color25 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer21.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = lineAndShapeRenderer21.getBaseToolTipGenerator();
        java.lang.Boolean boolean29 = lineAndShapeRenderer21.getSeriesVisible((int) (short) -1);
        boolean boolean30 = lineAndShapeRenderer21.getBaseSeriesVisible();
        boolean boolean32 = lineAndShapeRenderer21.isSeriesVisible((-10289251));
        java.awt.Stroke stroke33 = lineAndShapeRenderer21.getBaseOutlineStroke();
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke33, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator37, false);
        java.lang.Object obj40 = lineAndShapeRenderer2.clone();
        lineAndShapeRenderer2.clearSeriesPaints(true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNull(categoryToolTipGenerator27);
        org.junit.Assert.assertNull(boolean29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNull(categoryURLGenerator36);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double32 = rectangleInsets30.calculateBottomInset(0.0d);
        categoryPlot21.setAxisOffset(rectangleInsets30);
        categoryPlot21.setDomainCrosshairColumnKey((java.lang.Comparable) 2.0d, false);
        categoryPlot21.setRangeCrosshairLockedOnData(true);
        org.jfree.chart.axis.AxisSpace axisSpace39 = null;
        categoryPlot21.setFixedRangeAxisSpace(axisSpace39, false);
        categoryPlot21.setRangeCrosshairLockedOnData(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.0d + "'", double32 == 3.0d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.awt.Font font36 = renderAttributes13.getDefaultLabelFont();
        java.awt.Paint paint38 = renderAttributes13.getSeriesOutlinePaint(500);
        java.awt.Color color39 = org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA;
        renderAttributes13.setDefaultOutlinePaint((java.awt.Paint) color39);
        java.awt.Stroke stroke41 = renderAttributes13.getDefaultOutlineStroke();
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
        org.junit.Assert.assertNull(font36);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNull(stroke41);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape12 = lineAndShapeRenderer2.lookupLegendShape(8);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseFillPaint();
        org.jfree.chart.LegendItem legendItem16 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color20 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem16.setLinePaint((java.awt.Paint) color20);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color25 = java.awt.Color.BLUE;
        lineAndShapeRenderer24.setBaseItemLabelPaint((java.awt.Paint) color25);
        java.awt.Shape shape27 = lineAndShapeRenderer24.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity29 = new org.jfree.chart.entity.ChartEntity(shape27, "");
        legendItem16.setLine(shape27);
        java.awt.Shape shape31 = legendItem16.getShape();
        java.lang.String str32 = legendItem16.getLabel();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean37 = lineAndShapeRenderer35.isSeriesVisibleInLegend(1);
        java.awt.Font font38 = lineAndShapeRenderer35.getBaseItemLabelFont();
        legendItem16.setLabelFont(font38);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelFont((-16776961), font38, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(font38);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot21.zoomRangeAxes((double) (short) 1, 1.0d, plotRenderingInfo30, point2D31);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent33 = null;
        categoryPlot21.rendererChanged(rendererChangeEvent33);
        java.lang.Comparable comparable35 = categoryPlot21.getDomainCrosshairColumnKey();
        java.awt.geom.GeneralPath generalPath36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        org.jfree.chart.RenderingSource renderingSource38 = null;
        categoryPlot21.select(generalPath36, rectangle2D37, renderingSource38);
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
        org.junit.Assert.assertNull(comparable35);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.jfree.chart.util.SortOrder sortOrder34 = categoryPlot21.getRowRenderingOrder();
        org.jfree.chart.axis.AxisSpace axisSpace35 = categoryPlot21.getFixedRangeAxisSpace();
        categoryPlot21.setNotify(true);
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
        org.junit.Assert.assertNotNull(sortOrder34);
        org.junit.Assert.assertNull(axisSpace35);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        categoryPlot21.setAnchorValue((double) ' ', true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        categoryPlot21.axisChanged(axisChangeEvent32);
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot21.getLegendItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.LegendItem legendItem36 = legendItemCollection34.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertNotNull(legendItemCollection34);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Shape shape9 = lineAndShapeRenderer6.getBaseShape();
        java.awt.Stroke stroke10 = lineAndShapeRenderer6.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        lineAndShapeRenderer6.setBaseItemLabelGenerator(categoryItemLabelGenerator11, false);
        java.awt.Font font15 = lineAndShapeRenderer6.getLegendTextFont((-1));
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float19 = categoryAxis18.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color24 = java.awt.Color.BLUE;
        lineAndShapeRenderer23.setBaseItemLabelPaint((java.awt.Paint) color24);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = lineAndShapeRenderer23.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis18, valueAxis20, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer23);
        lineAndShapeRenderer23.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis37 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj38 = categoryAxis37.clone();
        java.awt.Font font39 = categoryAxis37.getTickLabelFont();
        lineAndShapeRenderer23.setSeriesItemLabelFont((int) '#', font39);
        lineAndShapeRenderer6.setBaseItemLabelFont(font39);
        lineAndShapeRenderer6.setBaseSeriesVisibleInLegend(false, false);
        int int45 = lineAndShapeRenderer6.getDefaultEntityRadius();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects0.insertValue(100, (java.lang.Comparable) 0.0d, (java.lang.Object) int45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(font15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        boolean boolean11 = legendItem6.isShapeOutlineVisible();
        boolean boolean12 = legendItem6.isLineVisible();
        org.jfree.data.general.Dataset dataset13 = legendItem6.getDataset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color20 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer16.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color20);
        java.awt.Paint paint22 = lineAndShapeRenderer16.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        lineAndShapeRenderer16.setSeriesURLGenerator(97, categoryURLGenerator24, false);
        lineAndShapeRenderer16.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer16.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        java.awt.Paint paint35 = lineAndShapeRenderer16.getSeriesPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = lineAndShapeRenderer16.getBaseNegativeItemLabelPosition();
        lineAndShapeRenderer16.setDataBoundsIncludesVisibleSeriesOnly(false);
        boolean boolean39 = legendItem6.equals((java.lang.Object) lineAndShapeRenderer16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer16.getBaseItemLabelGenerator();
        boolean boolean41 = lineAndShapeRenderer16.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataset13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        boolean boolean27 = categoryPlot21.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.data.Range range29 = categoryPlot21.getDataRange(valueAxis28);
        boolean boolean30 = categoryPlot21.isDomainZoomable();
        java.util.List list31 = categoryPlot21.getAnnotations();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot21.annotationChanged(annotationChangeEvent32);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(range29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = null;
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis23, categoryItemRenderer24);
        org.jfree.chart.ChartColor chartColor30 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel31 = null;
        java.awt.Rectangle rectangle32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        java.awt.geom.AffineTransform affineTransform34 = null;
        java.awt.RenderingHints renderingHints35 = null;
        java.awt.PaintContext paintContext36 = chartColor30.createContext(colorModel31, rectangle32, rectangle2D33, affineTransform34, renderingHints35);
        java.awt.Color color37 = java.awt.Color.getColor("", (java.awt.Color) chartColor30);
        categoryPlot25.setDomainCrosshairPaint((java.awt.Paint) color37);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        java.awt.geom.Point2D point2D41 = null;
        categoryPlot25.zoomRangeAxes((double) 100.0f, plotRenderingInfo40, point2D41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis44 = lineAndShapeRenderer2.getDomainAxis(categoryPlot25, categoryDataset43);
        categoryPlot25.setDomainGridlinesVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        java.awt.geom.Point2D point2D50 = null;
        categoryPlot25.zoomRangeAxes((double) (short) -1, (double) '4', plotRenderingInfo49, point2D50);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paintContext36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNull(categoryAxis44);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
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
        java.awt.Stroke stroke27 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot4.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo30, point2D31);
        boolean boolean33 = categoryPlot4.canSelectByRegion();
        java.util.List list34 = categoryPlot4.getAnnotations();
        org.jfree.chart.axis.ValueAxis[] valueAxisArray35 = new org.jfree.chart.axis.ValueAxis[] {};
        categoryPlot4.setRangeAxes(valueAxisArray35);
        int int37 = categoryPlot4.getBackgroundImageAlignment();
        categoryPlot4.clearRangeMarkers(24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = null;
        categoryPlot4.setDrawingSupplier(drawingSupplier40, false);
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = categoryPlot4.getRangeAxisEdge();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(valueAxisArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(rectangleEdge43);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        java.lang.Comparable comparable34 = categoryPlot21.getDomainCrosshairRowKey();
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
        org.junit.Assert.assertNull(comparable34);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        categoryPlot21.clearRangeMarkers();
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
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        java.lang.String str21 = categoryAxis17.getCategoryLabelToolTip((java.lang.Comparable) 2);
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float24 = categoryAxis23.getTickMarkInsideLength();
        org.jfree.chart.axis.CategoryAxis categoryAxis26 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double27 = categoryAxis26.getFixedDimension();
        org.jfree.chart.plot.Plot plot28 = categoryAxis26.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = categoryAxis26.getLabelInsets();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions30 = categoryAxis26.getCategoryLabelPositions();
        categoryAxis23.setCategoryLabelPositions(categoryLabelPositions30);
        categoryAxis17.setCategoryLabelPositions(categoryLabelPositions30);
        categoryAxis17.setTickMarkInsideLength((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxis17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(categoryLabelPositions30);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = null;
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset10, categoryAxis11, valueAxis12, categoryItemRenderer13);
        org.jfree.chart.ChartColor chartColor19 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.image.ColorModel colorModel20 = null;
        java.awt.Rectangle rectangle21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.AffineTransform affineTransform23 = null;
        java.awt.RenderingHints renderingHints24 = null;
        java.awt.PaintContext paintContext25 = chartColor19.createContext(colorModel20, rectangle21, rectangle2D22, affineTransform23, renderingHints24);
        java.awt.Color color26 = java.awt.Color.getColor("", (java.awt.Color) chartColor19);
        categoryPlot14.setDomainCrosshairPaint((java.awt.Paint) color26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot14.zoomRangeAxes((double) 100.0f, plotRenderingInfo29, point2D30);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = categoryPlot14.getDomainAxis((int) (byte) 1);
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot14.getDomainAxisEdge((int) (short) 100);
        java.lang.String str36 = categoryPlot14.getPlotType();
        org.jfree.data.KeyedObject keyedObject37 = new org.jfree.data.KeyedObject((java.lang.Comparable) 100L, (java.lang.Object) categoryPlot14);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis39 = lineAndShapeRenderer2.getDomainAxis(categoryPlot14, categoryDataset38);
        java.awt.Paint paint41 = lineAndShapeRenderer2.getSeriesFillPaint(0);
        org.jfree.chart.LegendItem legendItem44 = lineAndShapeRenderer2.getLegendItem(10284987, 52);
        boolean boolean45 = lineAndShapeRenderer2.getUseSeriesOffset();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNotNull(paintContext25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(categoryAxis33);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Category Plot" + "'", str36, "Category Plot");
        org.junit.Assert.assertNull(categoryAxis39);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(legendItem44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        barRenderer0.setShadowVisible(false);
        barRenderer0.setSeriesVisible(0, (java.lang.Boolean) true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        barRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator40, false);
        java.awt.Stroke stroke44 = barRenderer0.getSeriesStroke((int) (short) 0);
        barRenderer0.setSeriesItemLabelsVisible(50, (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNull(stroke44);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
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
        java.awt.Stroke stroke27 = categoryPlot4.getRangeZeroBaselineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot4.zoomDomainAxes(1.0d, (double) 0, plotRenderingInfo30, point2D31);
        boolean boolean33 = categoryPlot4.canSelectByRegion();
        java.util.List list34 = categoryPlot4.getAnnotations();
        boolean boolean35 = categoryPlot4.isRangeZoomable();
        java.lang.String str36 = categoryPlot4.getPlotType();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot4.getDomainAxisEdge((-52));
        categoryPlot4.mapDatasetToRangeAxis(33, (int) (short) -1);
        categoryPlot4.setNoDataMessage("");
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Category Plot" + "'", str36, "Category Plot");
        org.junit.Assert.assertNotNull(rectangleEdge38);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float22 = categoryAxis21.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis23 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color27 = java.awt.Color.BLUE;
        lineAndShapeRenderer26.setBaseItemLabelPaint((java.awt.Paint) color27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = lineAndShapeRenderer26.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = new org.jfree.chart.plot.CategoryPlot(categoryDataset19, categoryAxis21, valueAxis23, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer26);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot33.getDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.data.Range range36 = categoryPlot33.getDataRange(valueAxis35);
        org.jfree.chart.axis.AxisLocation axisLocation37 = categoryPlot33.getRangeAxisLocation();
        categoryPlot33.configureDomainAxes();
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot33);
        boolean boolean40 = categoryPlot33.isRangeZeroBaselineVisible();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator32);
        org.junit.Assert.assertNotNull(categoryAxis34);
        org.junit.Assert.assertNull(range36);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent16 = null;
        categoryPlot14.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        categoryPlot14.setDrawingSupplier(drawingSupplier18);
        java.awt.Color color21 = java.awt.Color.BLUE;
        int int22 = color21.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator26 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color21, (float) 1L, 10, (double) 0L);
        double double27 = defaultShadowGenerator26.getAngle();
        int int28 = defaultShadowGenerator26.getDistance();
        categoryPlot14.setShadowGenerator((org.jfree.chart.util.ShadowGenerator) defaultShadowGenerator26);
        org.jfree.chart.plot.PlotOrientation plotOrientation30 = categoryPlot14.getOrientation();
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier31 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Shape shape32 = defaultDrawingSupplier31.getNextShape();
        java.lang.Object obj33 = defaultDrawingSupplier31.clone();
        boolean boolean34 = plotOrientation30.equals(obj33);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(plotOrientation30);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double32 = rectangleInsets30.calculateBottomInset(0.0d);
        categoryPlot21.setAxisOffset(rectangleInsets30);
        double double35 = rectangleInsets30.extendWidth((double) 4);
        double double36 = rectangleInsets30.getRight();
        double double38 = rectangleInsets30.trimWidth((double) (-1L));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.0d + "'", double32 == 3.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.0d + "'", double36 == 3.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-7.0d) + "'", double38 == (-7.0d));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        categoryAxis1.setLowerMargin((double) 10L);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color7 = java.awt.Color.BLUE;
        lineAndShapeRenderer6.setBaseItemLabelPaint((java.awt.Paint) color7);
        java.awt.Stroke stroke10 = lineAndShapeRenderer6.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float14 = categoryAxis13.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color19 = java.awt.Color.BLUE;
        lineAndShapeRenderer18.setBaseItemLabelPaint((java.awt.Paint) color19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer18.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset11, categoryAxis13, valueAxis15, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer18);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer26 = categoryPlot25.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis28 = lineAndShapeRenderer6.getRangeAxis(categoryPlot25, (int) '4');
        boolean boolean29 = categoryPlot25.isRangeCrosshairVisible();
        java.awt.Paint paint30 = categoryPlot25.getRangeZeroBaselinePaint();
        categoryPlot25.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double36 = rectangleInsets34.calculateBottomInset(0.0d);
        categoryPlot25.setAxisOffset(rectangleInsets34);
        categoryAxis1.setLabelInsets(rectangleInsets34, true);
        double double41 = rectangleInsets34.calculateLeftInset(0.0d);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(categoryItemRenderer26);
        org.junit.Assert.assertNull(valueAxis28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 3.0d + "'", double36 == 3.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 3.0d + "'", double41 == 3.0d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        java.awt.Paint paint26 = categoryPlot21.getRangeZeroBaselinePaint();
        categoryPlot21.mapDatasetToDomainAxis((int) (byte) 1, (int) (short) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double32 = rectangleInsets30.calculateBottomInset(0.0d);
        categoryPlot21.setAxisOffset(rectangleInsets30);
        categoryPlot21.setDomainCrosshairColumnKey((java.lang.Comparable) 2.0d, false);
        categoryPlot21.clearDomainMarkers(0);
        org.jfree.chart.axis.AxisLocation axisLocation39 = categoryPlot21.getRangeAxisLocation();
        categoryPlot21.setAnchorValue(6.00000001d);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3.0d + "'", double32 == 3.0d);
        org.junit.Assert.assertNotNull(axisLocation39);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        boolean boolean28 = categoryPlot21.isDomainGridlinesVisible();
        org.jfree.chart.plot.CategoryMarker categoryMarker29 = null;
        org.jfree.chart.util.Layer layer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot21.addDomainMarker(categoryMarker29, layer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setBase((double) (short) 100);
        boolean boolean39 = barRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        categoryPlot14.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.chart.plot.Marker marker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        boolean boolean25 = categoryPlot14.removeDomainMarker((int) ' ', marker22, layer23, false);
        org.jfree.chart.util.Layer layer26 = null;
        java.util.Collection collection27 = categoryPlot14.getRangeMarkers(layer26);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot14.getRangeAxisEdge();
        categoryPlot14.setDomainGridlinesVisible(false);
        java.awt.Paint paint31 = categoryPlot14.getRangeZeroBaselinePaint();
        org.jfree.data.general.Dataset dataset32 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo33 = new org.jfree.chart.event.DatasetChangeInfo();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent34 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) paint31, dataset32, datasetChangeInfo33);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(collection27);
        org.junit.Assert.assertNotNull(rectangleEdge28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        java.awt.Font font36 = renderAttributes13.getDefaultLabelFont();
        java.awt.Shape shape39 = renderAttributes13.getItemShape((int) (byte) -1, (-10));
        java.awt.Paint paint41 = renderAttributes13.getSeriesFillPaint((-16776961));
        java.awt.Shape shape44 = renderAttributes13.getItemShape(10, 32);
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
        org.junit.Assert.assertNull(font36);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(shape44);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        int int2 = keyedObjects0.getItemCount();
        int int3 = keyedObjects0.getItemCount();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color9 = java.awt.Color.BLUE;
        lineAndShapeRenderer8.setBaseItemLabelPaint((java.awt.Paint) color9);
        java.awt.Stroke stroke12 = lineAndShapeRenderer8.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float16 = categoryAxis15.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = lineAndShapeRenderer20.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot(categoryDataset13, categoryAxis15, valueAxis17, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer20);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer28 = categoryPlot27.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis30 = lineAndShapeRenderer8.getRangeAxis(categoryPlot27, (int) '4');
        double double31 = categoryPlot27.getRangeCrosshairValue();
        java.awt.Paint paint32 = categoryPlot27.getRangeZeroBaselinePaint();
        int int33 = categoryPlot27.getRangeAxisCount();
        java.awt.Color color34 = java.awt.Color.BLUE;
        categoryPlot27.setRangeMinorGridlinePaint((java.awt.Paint) color34);
        java.awt.Stroke stroke36 = categoryPlot27.getRangeMinorGridlineStroke();
        keyedObjects0.insertValue((int) (short) 0, (java.lang.Comparable) 104.0d, (java.lang.Object) stroke36);
        keyedObjects0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator26);
        org.junit.Assert.assertNotNull(categoryItemRenderer28);
        org.junit.Assert.assertNull(valueAxis30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator38 = null;
        barRenderer0.setSeriesURLGenerator(0, categoryURLGenerator38);
        boolean boolean40 = barRenderer0.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        barRenderer0.setBase((double) (short) 100);
        barRenderer0.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        barRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = barRenderer0.getSeriesNegativeItemLabelPosition(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float17 = categoryAxis16.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color22 = java.awt.Color.BLUE;
        lineAndShapeRenderer21.setBaseItemLabelPaint((java.awt.Paint) color22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer21.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis16, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        java.lang.Object obj29 = categoryPlot28.clone();
        java.awt.Stroke stroke30 = categoryPlot28.getDomainCrosshairStroke();
        lineAndShapeRenderer2.setPlot(categoryPlot28);
        categoryPlot28.setDrawSharedDomainAxis(true);
        boolean boolean34 = categoryPlot28.isRangeGridlinesVisible();
        org.jfree.chart.axis.AxisLocation axisLocation35 = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation36 = axisLocation35.getOpposite();
        categoryPlot28.setDomainAxisLocation(axisLocation35, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(axisLocation36);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        categoryPlot21.clearSelection();
        boolean boolean33 = categoryPlot21.canSelectByPoint();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer35 = categoryPlot21.getRenderer((int) (short) 100);
        org.jfree.chart.axis.AxisSpace axisSpace36 = categoryPlot21.getFixedRangeAxisSpace();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(categoryItemRenderer35);
        org.junit.Assert.assertNull(axisSpace36);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator11, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color18 = java.awt.Color.BLUE;
        lineAndShapeRenderer17.setBaseItemLabelPaint((java.awt.Paint) color18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer17.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator24 = null;
        lineAndShapeRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator24);
        java.awt.Paint paint27 = lineAndShapeRenderer17.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes28 = lineAndShapeRenderer17.getSelectedItemAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer31 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = null;
        lineAndShapeRenderer31.setBaseURLGenerator(categoryURLGenerator32);
        java.awt.Shape shape35 = lineAndShapeRenderer31.getLegendShape(0);
        lineAndShapeRenderer31.setAutoPopulateSeriesStroke(false);
        java.awt.Font font39 = lineAndShapeRenderer31.getSeriesItemLabelFont(0);
        lineAndShapeRenderer31.setUseSeriesOffset(true);
        int int42 = lineAndShapeRenderer31.getColumnCount();
        lineAndShapeRenderer31.setBaseSeriesVisibleInLegend(true);
        java.awt.Stroke stroke48 = lineAndShapeRenderer31.getItemOutlineStroke((int) (byte) -1, (int) (byte) 100, false);
        renderAttributes28.setDefaultStroke(stroke48);
        lineAndShapeRenderer2.setSeriesStroke((int) ' ', stroke48, true);
        lineAndShapeRenderer2.clearSeriesStrokes(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(renderAttributes28);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNull(font39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        float float34 = categoryPlot21.getForegroundAlpha();
        org.jfree.chart.axis.AxisLocation axisLocation35 = categoryPlot21.getRangeAxisLocation();
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier36 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.lang.Object obj37 = defaultDrawingSupplier36.clone();
        categoryPlot21.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier36);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(categoryItemRenderer22);
        org.junit.Assert.assertNull(valueAxis24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(datasetRenderingOrder26);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(axisLocation35);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        boolean boolean33 = barRenderer0.getShadowsVisible();
        org.jfree.chart.renderer.category.BarPainter barPainter34 = barRenderer0.getBarPainter();
        java.awt.Color color35 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        barRenderer0.setShadowPaint((java.awt.Paint) color35);
        double double37 = barRenderer0.getShadowXOffset();
        java.awt.Color color38 = org.jfree.chart.ChartColor.VERY_LIGHT_CYAN;
        barRenderer0.setShadowPaint((java.awt.Paint) color38);
        barRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(font23);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(textAnchor31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(barPainter34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.0d + "'", double37 == 4.0d);
        org.junit.Assert.assertNotNull(color38);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float15 = categoryAxis14.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer19.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis14, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        lineAndShapeRenderer19.setSeriesVisibleInLegend(3, (java.lang.Boolean) false, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj34 = categoryAxis33.clone();
        java.awt.Font font35 = categoryAxis33.getTickLabelFont();
        lineAndShapeRenderer19.setSeriesItemLabelFont((int) '#', font35);
        lineAndShapeRenderer2.setBaseItemLabelFont(font35);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        int int41 = lineAndShapeRenderer2.getDefaultEntityRadius();
        java.awt.Paint paint43 = lineAndShapeRenderer2.getSeriesFillPaint(3);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNull(paint43);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) 'a');
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer35 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color36 = java.awt.Color.BLUE;
        lineAndShapeRenderer35.setBaseItemLabelPaint((java.awt.Paint) color36);
        java.awt.Shape shape38 = lineAndShapeRenderer35.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity40 = new org.jfree.chart.entity.ChartEntity(shape38, "");
        lineAndShapeRenderer2.setSeriesShape(11, shape38);
        java.awt.Stroke stroke43 = lineAndShapeRenderer2.getSeriesStroke((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(categoryAxis19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNull(categoryToolTipGenerator27);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNull(stroke43);
    }
}
