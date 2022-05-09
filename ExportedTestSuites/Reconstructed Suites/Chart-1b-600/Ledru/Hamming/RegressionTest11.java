package org.jfree.chart.renderer.category;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        java.awt.Paint paint4 = barRenderer0.getShadowPaint();
        double double5 = barRenderer0.getMinimumBarLength();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5502() throws Throwable {
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
    public void test5503() throws Throwable {
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
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = barRenderer0.getItemLabelGenerator(100, (int) (byte) -1, false);
        barRenderer0.setDrawBarOutline(false);
        java.awt.Paint paint21 = barRenderer0.getBaseOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test5505() throws Throwable {
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
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition(0);
        org.jfree.chart.LegendItem legendItem10 = lineAndShapeRenderer2.getLegendItem((-10411212), 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(legendItem10);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        lineAndShapeRenderer2.setBaseShapesVisible(true);
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        java.awt.Paint paint32 = lineAndShapeRenderer2.lookupLegendTextPaint((int) ' ');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(range26);
        org.junit.Assert.assertNull(paint32);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = categoryPlot4.getInsets();
        categoryPlot4.setRangePannable(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot4.zoomRangeAxes(0.0d, 0.0d, plotRenderingInfo25, point2D26);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test5510() throws Throwable {
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
    public void test5511() throws Throwable {
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
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 1);
        boolean boolean14 = lineAndShapeRenderer2.isSeriesVisible((int) (byte) 100);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5513() throws Throwable {
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
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.jfree.chart.plot.Plot plot65 = plotEntity64.getPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent66 = null;
        plot65.axisChanged(axisChangeEvent66);
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
        org.junit.Assert.assertNotNull(plot65);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        categoryAxis1.setLowerMargin(11.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5516() throws Throwable {
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
    public void test5517() throws Throwable {
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
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.awt.Paint paint17 = renderAttributes13.getSeriesFillPaint(500);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test5519() throws Throwable {
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
    public void test5520() throws Throwable {
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
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        boolean boolean9 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        java.awt.Paint paint13 = lineAndShapeRenderer2.getItemLabelPaint((int) (short) -1, (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        boolean boolean28 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(categoryAxis19);
        org.junit.Assert.assertNull(range21);
        org.junit.Assert.assertNull(categoryToolTipGenerator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.lang.Comparable comparable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = defaultCategoryDataset0.getColumnIndex(comparable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5524() throws Throwable {
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
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) 'a', (java.lang.Boolean) true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = lineAndShapeRenderer2.getItemLabelGenerator(0, 97, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator70 = lineAndShapeRenderer2.getSeriesURLGenerator((int) (short) 10);
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
        org.junit.Assert.assertNull(categoryItemLabelGenerator68);
        org.junit.Assert.assertNull(categoryURLGenerator70);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot14.getDomainAxisLocation();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNotNull(axisLocation19);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
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
        boolean boolean32 = lineAndShapeRenderer2.getDrawOutlines();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5528() throws Throwable {
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
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.entity.ChartEntity chartEntity3 = new org.jfree.chart.entity.ChartEntity(shape0, "java.awt.Color[r=223,g=255,b=190]", "java.awt.Color[r=223,g=255,b=190]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'area' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5530() throws Throwable {
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
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
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
        categoryPlot4.setDomainCrosshairVisible(false);
        categoryPlot4.setForegroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        categoryPlot4.setDataset(33, categoryDataset32);
        boolean boolean34 = categoryPlot4.isDomainPannable();
        java.awt.Stroke stroke35 = categoryPlot4.getOutlineStroke();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        categoryPlot14.setDrawSharedDomainAxis(true);
        boolean boolean23 = categoryPlot14.getDrawSharedDomainAxis();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5533() throws Throwable {
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
    public void test5534() throws Throwable {
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
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow(comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        boolean boolean5 = legendItem1.isShapeFilled();
        java.awt.Shape shape6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        legendItem1.setShape(shape6);
        boolean boolean8 = legendItem1.isLineVisible();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        org.jfree.chart.util.SortOrder sortOrder18 = org.jfree.chart.util.SortOrder.ASCENDING;
        categoryPlot14.setRowRenderingOrder(sortOrder18);
        java.awt.geom.GeneralPath generalPath20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.RenderingSource renderingSource22 = null;
        categoryPlot14.select(generalPath20, rectangle2D21, renderingSource22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = categoryPlot14.getFixedRangeAxisSpace();
        boolean boolean25 = categoryPlot14.isRangeMinorGridlinesVisible();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(sortOrder18);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5538() throws Throwable {
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
    public void test5539() throws Throwable {
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
    public void test5540() throws Throwable {
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
    public void test5541() throws Throwable {
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
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
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
        categoryPlot4.clearAnnotations();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        categoryPlot4.addChangeListener(plotChangeListener25);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = null;
        categoryPlot4.setDomainAxis((int) '4', categoryAxis28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        java.awt.geom.Point2D point2D33 = null;
        categoryPlot4.zoomDomainAxes(63.0d, 0.0d, plotRenderingInfo32, point2D33);
        org.jfree.chart.LegendItemCollection legendItemCollection35 = categoryPlot4.getLegendItems();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(legendItemCollection35);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 10, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5544() throws Throwable {
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
    public void test5545() throws Throwable {
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
    public void test5546() throws Throwable {
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
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        categoryAxis15.setMaximumCategoryLabelLines((int) ' ');
        java.lang.Object obj20 = null;
        boolean boolean21 = categoryAxis15.equals(obj20);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        categoryAxis17.setLabelToolTip("UnitType.ABSOLUTE");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryItemRenderer15);
        org.junit.Assert.assertNotNull(categoryAxis17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test5549() throws Throwable {
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
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        boolean boolean10 = lineAndShapeRenderer2.getUseOutlinePaint();
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState5 = defaultCategoryDataset0.getSelectionState();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState6 = defaultCategoryDataset0.getSelectionState();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState5);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState6);
    }

    @Test
    public void test5552() throws Throwable {
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
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color15 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem11.setLinePaint((java.awt.Paint) color15);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Shape shape22 = lineAndShapeRenderer19.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity24 = new org.jfree.chart.entity.ChartEntity(shape22, "");
        legendItem11.setLine(shape22);
        lineAndShapeRenderer2.setSeriesShape(0, shape22);
        int int27 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNull(categoryURLGenerator28);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        org.jfree.chart.util.Layer layer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot14.addDomainMarker(categoryMarker15, layer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Comparable comparable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = keyedObjects2D0.getRowIndex(comparable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5556() throws Throwable {
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
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((int) (short) -1);
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (byte) 100);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        java.awt.Font font8 = lineAndShapeRenderer0.getItemLabelFont(11, 2, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = lineAndShapeRenderer0.getBaseToolTipGenerator();
        boolean boolean11 = lineAndShapeRenderer0.isSeriesVisibleInLegend(500);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5559() throws Throwable {
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
    public void test5560() throws Throwable {
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
    public void test5561() throws Throwable {
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
    public void test5562() throws Throwable {
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
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        java.lang.String str7 = rectangleInsets4.toString();
        double double9 = rectangleInsets4.calculateBottomInset((double) 100.0f);
        double double11 = rectangleInsets4.calculateBottomOutset(19.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str7, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.configure();
        categoryAxis0.setMinorTickMarkInsideLength((float) 11);
        java.awt.Paint paint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryAxis0.setLabelPaint(paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesVisibleInLegend(100);
        java.awt.Paint paint22 = lineAndShapeRenderer2.getSeriesFillPaint((int) (byte) 1);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(paint22);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer21 = categoryPlot4.getRenderer(97);
        org.jfree.chart.plot.Plot plot22 = categoryPlot4.getParent();
        int int23 = categoryPlot4.getWeight();
        boolean boolean24 = categoryPlot4.isDomainZoomable();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryItemRenderer21);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color9 = java.awt.Color.darkGray;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color9, true);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = lineAndShapeRenderer2.getLegendItems();
        double double13 = lineAndShapeRenderer2.getItemMargin();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        java.awt.Shape shape28 = lineAndShapeRenderer2.getBaseShape();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test5569() throws Throwable {
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
    public void test5570() throws Throwable {
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
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setPlot(categoryPlot5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        boolean boolean11 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, (int) '4');
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
    }

    @Test
    public void test5573() throws Throwable {
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
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.renderer.RenderAttributes renderAttributes14 = lineAndShapeRenderer2.getSelectedItemAttributes();
        boolean boolean15 = renderAttributes14.getAllowNull();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(renderAttributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.awt.Font font26 = null;
        lineAndShapeRenderer14.setSeriesItemLabelFont((int) (short) 1, font26, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = lineAndShapeRenderer14.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition30, false);
        java.lang.Boolean boolean34 = lineAndShapeRenderer2.getSeriesVisible((int) (short) 10);
        boolean boolean35 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        java.awt.Paint paint11 = legendItem6.getFillPaint();
        java.text.AttributedString attributedString12 = legendItem6.getAttributedLabel();
        legendItem6.setDatasetIndex(0);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(attributedString12);
    }

    @Test
    public void test5578() throws Throwable {
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
    public void test5579() throws Throwable {
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
    public void test5580() throws Throwable {
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
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.Class<?> wildcardClass19 = plotChangeEvent15.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(jFreeChart16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator25, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(font19);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Stroke stroke5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseStroke(stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
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
        org.jfree.chart.axis.AxisSpace axisSpace29 = null;
        categoryPlot4.setFixedRangeAxisSpace(axisSpace29);
        int int31 = categoryPlot4.getWeight();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent32 = null;
        categoryPlot4.annotationChanged(annotationChangeEvent32);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = lineAndShapeRenderer2.getSeriesToolTipGenerator(10);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNull(categoryToolTipGenerator15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        java.lang.Object obj5 = legendItem1.clone();
        java.awt.Shape shape6 = legendItem1.getShape();
        org.jfree.data.general.Dataset dataset7 = legendItem1.getDataset();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(dataset7);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
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
        java.awt.Paint paint23 = lineAndShapeRenderer17.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator25 = null;
        lineAndShapeRenderer17.setSeriesURLGenerator(97, categoryURLGenerator25, false);
        lineAndShapeRenderer17.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer17.getPositiveItemLabelPosition((int) (byte) 10, (int) (byte) 1, true);
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition34, false);
        boolean boolean37 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test5588() throws Throwable {
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
    public void test5589() throws Throwable {
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
    public void test5590() throws Throwable {
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
    public void test5591() throws Throwable {
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
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color15 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem11.setLinePaint((java.awt.Paint) color15);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Shape shape22 = lineAndShapeRenderer19.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity24 = new org.jfree.chart.entity.ChartEntity(shape22, "");
        legendItem11.setLine(shape22);
        lineAndShapeRenderer2.setSeriesShape(0, shape22);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator27);
        java.awt.Font font29 = lineAndShapeRenderer2.getBaseLegendTextFont();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNull(font29);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (byte) 10);
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) true, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = lineAndShapeRenderer2.getPlot();
        java.awt.Shape shape14 = lineAndShapeRenderer2.getLegendShape((int) (byte) 10);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test5595() throws Throwable {
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
    public void test5596() throws Throwable {
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
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        org.jfree.chart.plot.Plot plot65 = plotEntity64.getPlot();
        java.lang.Object obj66 = plotEntity64.clone();
        java.lang.Object obj67 = plotEntity64.clone();
        java.lang.String str68 = plotEntity64.toString();
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
        org.junit.Assert.assertNotNull(plot65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "PlotEntity: tooltip = null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "PlotEntity: tooltip = null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "PlotEntity: tooltip = null");
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "PlotEntity: tooltip = null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "PlotEntity: tooltip = null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "PlotEntity: tooltip = null");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "PlotEntity: tooltip = null" + "'", str68, "PlotEntity: tooltip = null");
    }

    @Test
    public void test5598() throws Throwable {
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
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        java.lang.String str2 = unknownKeyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]" + "'", str2, "org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
    }

    @Test
    public void test5600() throws Throwable {
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
    public void test5601() throws Throwable {
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
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.LegendItem legendItem11 = lineAndShapeRenderer2.getLegendItem((int) (byte) 100, 5);
        java.awt.Color color13 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) (byte) 0, (java.awt.Paint) color13, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(legendItem11);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test5603() throws Throwable {
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
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj22 = categoryAxis21.clone();
        java.awt.Font font23 = categoryAxis21.getTickLabelFont();
        lineAndShapeRenderer7.setSeriesItemLabelFont((int) '#', font23);
        lineAndShapeRenderer7.clearSeriesPaints(true);
        java.awt.Paint paint28 = lineAndShapeRenderer7.getSeriesOutlinePaint((int) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        java.lang.String str24 = chartEntity23.getURLText();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5606() throws Throwable {
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
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Font font18 = renderAttributes13.getSeriesLabelFont(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        java.awt.Stroke stroke30 = null;
        lineAndShapeRenderer2.setSeriesOutlineStroke((int) '4', stroke30, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test5609() throws Throwable {
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
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset0.clearSelection();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeRow(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5611() throws Throwable {
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
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.setSelected((int) (byte) 1, 255, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test5613() throws Throwable {
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
    public void test5614() throws Throwable {
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
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent18 = null;
        categoryPlot14.datasetChanged(datasetChangeEvent18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        categoryPlot14.removeChangeListener(plotChangeListener20);
        boolean boolean22 = categoryPlot14.canSelectByRegion();
        categoryPlot14.setForegroundAlpha((float) 8);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5616() throws Throwable {
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
    public void test5617() throws Throwable {
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
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        categoryPlot4.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot4.zoom((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = keyedObjects2D0.getColumnKey((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5620() throws Throwable {
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
    public void test5621() throws Throwable {
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
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float3 = categoryAxis2.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer7.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis2, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.plot.CategoryMarker categoryMarker16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryPlot14.addDomainMarker(0, categoryMarker16, layer17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator11, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        int int15 = lineAndShapeRenderer2.getColumnCount();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.Comparable comparable7 = null;
        legendItem6.setSeriesKey(comparable7);
        int int9 = legendItem6.getSeriesIndex();
        java.awt.Paint paint10 = legendItem6.getFillPaint();
        int int11 = legendItem6.getSeriesIndex();
        org.jfree.data.general.Dataset dataset12 = legendItem6.getDataset();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(dataset12);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("GradientPaintTransformType.HORIZONTAL");
        java.lang.Object obj2 = datasetGroup1.clone();
        java.lang.String str3 = datasetGroup1.getID();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GradientPaintTransformType.HORIZONTAL" + "'", str3, "GradientPaintTransformType.HORIZONTAL");
    }

    @Test
    public void test5626() throws Throwable {
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
    public void test5627() throws Throwable {
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
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        org.jfree.chart.renderer.RenderAttributes renderAttributes17 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(renderAttributes17);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        lineAndShapeRenderer2.setDrawOutlines(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        defaultCategoryDataset0.setValue(0.05d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 4);
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeRow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5631() throws Throwable {
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
    public void test5632() throws Throwable {
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
    public void test5633() throws Throwable {
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
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.ChartColor chartColor12 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color13 = chartColor12.darker();
        org.jfree.chart.LegendItem legendItem14 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor12);
        int int15 = chartColor12.getAlpha();
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) chartColor12);
        lineAndShapeRenderer2.setDefaultEntityRadius((int) '4');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 255 + "'", int15 == 255);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        boolean boolean5 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        java.awt.Font font7 = lineAndShapeRenderer2.lookupLegendTextFont(100);
        java.awt.Stroke stroke11 = lineAndShapeRenderer2.getItemOutlineStroke(255, (int) 'a', true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator11);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        boolean boolean14 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        java.awt.Paint paint25 = lineAndShapeRenderer2.getItemPaint(100, 0, false);
        java.awt.Paint paint29 = lineAndShapeRenderer2.getItemOutlinePaint(1, (-1), true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setMinimumBarLength(0.0d);
        int int6 = barRenderer0.getPassCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Paint paint9 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(4);
        int int10 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Stroke stroke18 = lineAndShapeRenderer2.getItemStroke((int) (byte) 100, 3, true);
        lineAndShapeRenderer2.setBaseShapesFilled(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        java.awt.Color color18 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        categoryPlot14.setOutlinePaint((java.awt.Paint) color18);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.data.Range range21 = categoryPlot14.getDataRange(valueAxis20);
        categoryPlot14.clearRangeMarkers();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent23 = null;
        categoryPlot14.annotationChanged(annotationChangeEvent23);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(range21);
    }

    @Test
    public void test5643() throws Throwable {
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
    public void test5644() throws Throwable {
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
    public void test5645() throws Throwable {
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
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        lineAndShapeRenderer2.setSeriesCreateEntities(100, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test5647() throws Throwable {
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
    public void test5648() throws Throwable {
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
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot4);
        categoryPlot4.setAnchorValue((double) (-1));
        org.jfree.chart.axis.AxisSpace axisSpace27 = null;
        categoryPlot4.setFixedDomainAxisSpace(axisSpace27, true);
        categoryPlot4.setDomainCrosshairVisible(false);
        org.jfree.chart.util.Layer layer33 = null;
        java.util.Collection collection34 = categoryPlot4.getRangeMarkers((-10411212), layer33);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(collection34);
    }

    @Test
    public void test5650() throws Throwable {
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
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        int int5 = defaultCategoryDataset0.getColumnCount();
        java.lang.Object obj6 = defaultCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test5652() throws Throwable {
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
    public void test5653() throws Throwable {
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
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        lineAndShapeRenderer2.setSeriesShapesVisible(10, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
    }

    @Test
    public void test5655() throws Throwable {
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
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        categoryPlot14.setRangeCrosshairVisible(false);
        categoryPlot14.setCrosshairDatasetIndex(0);
        java.awt.Image image23 = categoryPlot14.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image23);
    }

    @Test
    public void test5657() throws Throwable {
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
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable4 = keyedObjects2D0.getRowKey(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test5659() throws Throwable {
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
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) '#', categoryItemLabelGenerator12);
        java.lang.Boolean boolean15 = lineAndShapeRenderer2.getSeriesShapesFilled(0);
        boolean boolean16 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5661() throws Throwable {
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
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset0.clearSelection();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = defaultCategoryDataset0.isSelected(255, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 255, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5663() throws Throwable {
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
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent25 = null;
        categoryPlot4.rendererChanged(rendererChangeEvent25);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot4.getDomainMarkers(layer27);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(collection28);
    }

    @Test
    public void test5665() throws Throwable {
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
    public void test5666() throws Throwable {
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
    public void test5667() throws Throwable {
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
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(0);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getBaseFillPaint();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setPlot(categoryPlot7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        categoryPlot14.setDomainCrosshairVisible(true);
        categoryPlot14.clearRangeMarkers();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        categoryPlot14.axisChanged(axisChangeEvent21);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test5671() throws Throwable {
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
    public void test5672() throws Throwable {
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
    public void test5673() throws Throwable {
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
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
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
        java.awt.Paint paint79 = lineAndShapeRenderer47.lookupSeriesFillPaint((int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition81 = lineAndShapeRenderer47.getSeriesPositiveItemLabelPosition((-52));
        lineAndShapeRenderer47.setBaseSeriesVisibleInLegend(false, true);
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
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertNotNull(itemLabelPosition81);
    }

    @Test
    public void test5675() throws Throwable {
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
    public void test5676() throws Throwable {
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
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.awt.Paint paint21 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test5678() throws Throwable {
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
    public void test5679() throws Throwable {
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
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        boolean boolean15 = lineAndShapeRenderer2.isItemLabelVisible(0, 9, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(true, true);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = lineAndShapeRenderer2.getNegativeItemLabelPosition(4, (-1), true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
    }

    @Test
    public void test5682() throws Throwable {
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
    public void test5683() throws Throwable {
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
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jfree.chart.LegendItem legendItem5 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color9 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem5.setLinePaint((java.awt.Paint) color9);
        boolean boolean11 = legendItem5.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color15 = java.awt.Color.BLUE;
        lineAndShapeRenderer14.setBaseItemLabelPaint((java.awt.Paint) color15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer14.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = lineAndShapeRenderer14.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape24 = lineAndShapeRenderer14.lookupLegendShape(8);
        legendItem5.setLine(shape24);
        java.awt.Stroke stroke26 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        java.awt.Color color27 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem28 = new org.jfree.chart.LegendItem("SortOrder.ASCENDING", "{0}", "-3,-3,3,3", "", shape24, stroke26, (java.awt.Paint) color27);
        java.awt.Paint paint29 = legendItem28.getFillPaint();
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test5685() throws Throwable {
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
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeObject((java.lang.Comparable) 2, (java.lang.Comparable) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (2) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesVisible((int) (short) -1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test5688() throws Throwable {
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
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        java.awt.Color color18 = org.jfree.chart.ChartColor.VERY_DARK_BLUE;
        categoryPlot14.setOutlinePaint((java.awt.Paint) color18);
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot14.getRangeAxisEdge((-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(rectangleEdge21);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getItemStroke(100, 0, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible(4);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBasePaint();
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemOutlinePaint(5, (int) (short) 1, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test5691() throws Throwable {
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
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        java.awt.Shape shape4 = null;
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color10 = chartColor9.darker();
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor9);
        int int12 = chartColor9.getAlpha();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape4, (java.awt.Paint) chartColor9);
        legendItem13.setLineVisible(true);
        java.awt.Shape shape16 = legendItem13.getShape();
        java.awt.Shape shape17 = legendItem13.getLine();
        java.awt.Paint paint18 = legendItem13.getLinePaint();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 255 + "'", int12 == 255);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test5693() throws Throwable {
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
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        categoryAxis15.configure();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test5695() throws Throwable {
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
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = categoryPlot21.removeAnnotation(categoryAnnotation36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
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
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(axisLocation35);
    }

    @Test
    public void test5697() throws Throwable {
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
    public void test5698() throws Throwable {
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
    public void test5699() throws Throwable {
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
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(33, (-1), true);
        lineAndShapeRenderer2.setDefaultEntityRadius((-7839));
        lineAndShapeRenderer2.setBaseShapesVisible(true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test5701() throws Throwable {
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
    public void test5702() throws Throwable {
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
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        int int2 = keyedObjects0.getItemCount();
        int int3 = keyedObjects0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = keyedObjects0.getKey(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5704() throws Throwable {
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
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        lineAndShapeRenderer2.setBaseShapesVisible(true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(stroke16);
    }

    @Test
    public void test5706() throws Throwable {
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
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        lineAndShapeRenderer2.setSeriesShapesVisible(100, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition48 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
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
        org.junit.Assert.assertNull(categoryToolTipGenerator44);
        org.junit.Assert.assertNotNull(itemLabelPosition48);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = lineAndShapeRenderer2.getPlot();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = lineAndShapeRenderer2.getSeriesToolTipGenerator(192);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(categoryPlot7);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 10);
        int int7 = categoryAxis1.getMaximumCategoryLabelLines();
        categoryAxis1.setTickMarkOutsideLength((float) 128);
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        int int24 = defaultShadowGenerator22.calculateOffsetY();
        int int25 = defaultShadowGenerator22.getDistance();
        org.junit.Assert.assertNotNull(paintContext16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        int int18 = chartColor16.getRed();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setSeriesShapesVisible(0, false);
        lineAndShapeRenderer2.setBaseLinesVisible(true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.Comparable comparable7 = legendItem6.getSeriesKey();
        boolean boolean8 = legendItem6.isShapeVisible();
        legendItem6.setSeriesKey((java.lang.Comparable) 63.0d);
        java.lang.String str11 = legendItem6.getURLText();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(comparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(97);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test5716() throws Throwable {
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
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.lang.String str2 = legendItem1.getToolTipText();
        java.awt.Paint paint3 = null;
        // The following exception was thrown during execution in test generation
        try {
            legendItem1.setOutlinePaint(paint3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        java.awt.Shape shape4 = null;
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color10 = chartColor9.darker();
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor9);
        int int12 = chartColor9.getAlpha();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape4, (java.awt.Paint) chartColor9);
        legendItem13.setShapeVisible(true);
        java.awt.Stroke stroke16 = legendItem13.getOutlineStroke();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 255 + "'", int12 == 255);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        keyedObjects2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = keyedObjects2D0.getObject((java.lang.Comparable) 1, (java.lang.Comparable) "PlotEntity: tooltip = null");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint14 = renderAttributes13.getDefaultLabelPaint();
        java.awt.Paint paint15 = renderAttributes13.getDefaultLabelPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseShapesVisible();
        lineAndShapeRenderer2.setBaseLinesVisible(false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5722() throws Throwable {
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
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
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
        java.awt.Paint paint36 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        int int8 = defaultShadowGenerator6.calculateOffsetX();
        int int9 = defaultShadowGenerator6.calculateOffsetX();
        int int10 = defaultShadowGenerator6.calculateOffsetX();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number3 = defaultCategoryDataset0.getValue((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        lineAndShapeRenderer2.setItemLabelAnchorOffset((double) 0);
        java.lang.Boolean boolean20 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(8);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = lineAndShapeRenderer2.getURLGenerator(32, 2, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNull(categoryURLGenerator24);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeColumn((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean5 = categoryAxis1.isVisible();
        java.awt.Font font7 = null;
        categoryAxis1.setTickLabelFont((java.lang.Comparable) (byte) 10, font7);
        double double9 = categoryAxis1.getLowerMargin();
        java.awt.Font font10 = categoryAxis1.getLabelFont();
        categoryAxis1.setFixedDimension(0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test5729() throws Throwable {
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
    public void test5730() throws Throwable {
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
    public void test5731() throws Throwable {
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
    public void test5732() throws Throwable {
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
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Paint paint13 = renderAttributes11.getSeriesPaint(8);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(renderAttributes11);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        categoryAxis1.setMinorTickMarksVisible(true);
        categoryAxis1.setLabelAngle((-9.0d));
        categoryAxis1.setMaximumCategoryLabelLines((-10289251));
        categoryAxis1.setLabelToolTip("org.jfree.chart.event.ChartChangeEvent[source=java.awt.geom.Rectangle2D$Double[x=-3.0,y=-3.0,w=6.0,h=6.0]]");
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0f, false);
        boolean boolean3 = selectableValue2.isSelected();
        java.lang.Number number4 = selectableValue2.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + number4 + "' != '" + 1.0f + "'", number4, 1.0f);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color5 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem1.setLinePaint((java.awt.Paint) color5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color10 = java.awt.Color.BLUE;
        lineAndShapeRenderer9.setBaseItemLabelPaint((java.awt.Paint) color10);
        java.awt.Shape shape12 = lineAndShapeRenderer9.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity14 = new org.jfree.chart.entity.ChartEntity(shape12, "");
        legendItem1.setLine(shape12);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer16 = legendItem1.getFillPaintTransformer();
        java.lang.String str17 = legendItem1.getURLText();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(gradientPaintTransformer16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5738() throws Throwable {
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
    public void test5739() throws Throwable {
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
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        boolean boolean32 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        categoryPlot14.setCrosshairDatasetIndex(100, false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
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
        categoryPlot4.setDomainCrosshairVisible(false);
        categoryPlot4.setRangePannable(true);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test5743() throws Throwable {
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
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color21 = java.awt.Color.BLUE;
        lineAndShapeRenderer20.setBaseItemLabelPaint((java.awt.Paint) color21);
        java.awt.Stroke stroke24 = lineAndShapeRenderer20.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float28 = categoryAxis27.getTickMarkInsideLength();
        org.jfree.chart.axis.ValueAxis valueAxis29 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color33 = java.awt.Color.BLUE;
        lineAndShapeRenderer32.setBaseItemLabelPaint((java.awt.Paint) color33);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = lineAndShapeRenderer32.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot39 = new org.jfree.chart.plot.CategoryPlot(categoryDataset25, categoryAxis27, valueAxis29, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer32);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer40 = categoryPlot39.getRenderer();
        org.jfree.chart.axis.ValueAxis valueAxis42 = lineAndShapeRenderer20.getRangeAxis(categoryPlot39, (int) '4');
        boolean boolean43 = categoryPlot39.isRangeCrosshairVisible();
        lineAndShapeRenderer2.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot39);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false, false);
        java.awt.Stroke stroke49 = lineAndShapeRenderer2.getBaseStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator50 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator50);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(itemLabelAnchor14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNull(categoryItemLabelGenerator38);
        org.junit.Assert.assertNotNull(categoryItemRenderer40);
        org.junit.Assert.assertNull(valueAxis42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        boolean boolean5 = legendItem1.isShapeFilled();
        java.awt.Stroke stroke6 = legendItem1.getOutlineStroke();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test5746() throws Throwable {
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
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        legendItem6.setSeriesIndex((int) (byte) 100);
        java.awt.Shape shape12 = legendItem6.getLine();
        java.lang.String str13 = legendItem6.getToolTipText();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.jfree.chart.LegendItem legendItem13 = lineAndShapeRenderer2.getLegendItem(500, (int) (short) 10);
        boolean boolean14 = lineAndShapeRenderer2.getUseOutlinePaint();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(legendItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        org.jfree.chart.LegendItem legendItem18 = lineAndShapeRenderer2.getLegendItem(0, (-12517568));
        java.awt.Stroke stroke19 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertNull(legendItem18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        java.lang.Boolean boolean19 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) '4');
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        categoryPlot14.setDrawSharedDomainAxis(true);
        java.lang.Class<?> wildcardClass23 = categoryPlot14.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNull(range17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(range18);
        org.junit.Assert.assertNull(stroke20);
    }

    @Test
    public void test5754() throws Throwable {
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
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator14);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5757() throws Throwable {
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
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        boolean boolean19 = lineAndShapeRenderer2.getBaseShapesVisible();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        categoryAxis15.setMaximumCategoryLabelWidthRatio((float) 1);
        java.lang.Class<?> wildcardClass22 = categoryAxis15.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        java.lang.Object obj1 = keyedObjects0.clone();
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        categoryAxis3.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis3.setMaximumCategoryLabelLines(10);
        java.lang.Object obj9 = categoryAxis3.clone();
        java.awt.Paint paint10 = categoryAxis3.getLabelPaint();
        java.awt.Paint paint11 = categoryAxis3.getAxisLinePaint();
        boolean boolean12 = keyedObjects0.equals((java.lang.Object) categoryAxis3);
        categoryAxis3.setLowerMargin((double) 4);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        java.awt.Stroke stroke12 = lineAndShapeRenderer2.getBaseStroke();
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesPaint((int) '#');
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Stroke stroke7 = lineAndShapeRenderer2.getSeriesStroke(4);
        boolean boolean8 = lineAndShapeRenderer2.getBaseShapesFilled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Stroke stroke23 = lineAndShapeRenderer19.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot24);
        org.jfree.chart.util.Layer layer27 = null;
        java.util.Collection collection28 = categoryPlot24.getDomainMarkers(0, layer27);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertNull(collection28);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.LegendItem legendItem14 = lineAndShapeRenderer2.getLegendItem((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(legendItem14);
    }

    @Test
    public void test5765() throws Throwable {
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
    public void test5766() throws Throwable {
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
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((-16776961));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(font14);
    }

    @Test
    public void test5768() throws Throwable {
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
    public void test5769() throws Throwable {
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
    public void test5770() throws Throwable {
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
    public void test5771() throws Throwable {
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
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("ItemLabelAnchor.OUTSIDE6");
        java.lang.Object obj2 = standardCategorySeriesLabelGenerator1.clone();
        java.lang.Object obj3 = standardCategorySeriesLabelGenerator1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        java.lang.Object obj8 = keyedObjects2D0.clone();
        java.util.List list9 = keyedObjects2D0.getRowKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean18 = renderAttributes15.getCreateEntity(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
    }

    @Test
    public void test5775() throws Throwable {
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
    public void test5776() throws Throwable {
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
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(128, categoryItemLabelGenerator15, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        categoryPlot14.setDomainCrosshairVisible(true);
        categoryPlot14.clearRangeMarkers();
        categoryPlot14.clearRangeMarkers((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        boolean boolean11 = legendItem6.isShapeOutlineVisible();
        legendItem6.setDescription("");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5780() throws Throwable {
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
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
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
        legendItem42.setLineVisible(true);
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
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        boolean boolean20 = categoryPlot14.isRangeZoomable();
        categoryPlot14.mapDatasetToRangeAxis(2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!");
        java.awt.Color color15 = java.awt.Color.getHSBColor((float) (short) 1, (float) ' ', 0.0f);
        legendItem11.setLinePaint((java.awt.Paint) color15);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Shape shape22 = lineAndShapeRenderer19.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity24 = new org.jfree.chart.entity.ChartEntity(shape22, "");
        legendItem11.setLine(shape22);
        lineAndShapeRenderer2.setSeriesShape(0, shape22);
        int int27 = lineAndShapeRenderer2.getPassCount();
        lineAndShapeRenderer2.setUseFillPaint(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        int int19 = categoryPlot14.getWeight();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        double double13 = lineAndShapeRenderer2.getItemMargin();
        lineAndShapeRenderer2.setBaseCreateEntities(true, false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5786() throws Throwable {
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
    public void test5787() throws Throwable {
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
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getLegendShape(0);
        java.awt.Shape shape14 = lineAndShapeRenderer2.lookupSeriesShape((int) (byte) 10);
        boolean boolean17 = lineAndShapeRenderer2.getItemShapeVisible(32, 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5789() throws Throwable {
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
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Shape shape13 = lineAndShapeRenderer2.getItemShape(500, 0, false);
        java.awt.Stroke stroke17 = lineAndShapeRenderer2.getItemOutlineStroke((int) '4', 0, true);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
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
        int int23 = defaultShadowGenerator22.getShadowSize();
        int int24 = defaultShadowGenerator22.getDistance();
        float float25 = defaultShadowGenerator22.getShadowOpacity();
        org.junit.Assert.assertNotNull(paintContext16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        boolean boolean6 = categoryAxis1.equals((java.lang.Object) 0.5f);
        double double7 = categoryAxis1.getUpperMargin();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.05d + "'", double7 == 0.05d);
    }

    @Test
    public void test5793() throws Throwable {
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
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        java.lang.String str2 = unknownKeyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.jfree.data.UnknownKeyException: AxisLocation.BOTTOM_OR_RIGHT" + "'", str2, "org.jfree.data.UnknownKeyException: AxisLocation.BOTTOM_OR_RIGHT");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = categoryPlot14.getRenderer(0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(categoryItemRenderer18);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = lineAndShapeRenderer2.getPlot();
        boolean boolean26 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryPlot25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5797() throws Throwable {
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
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
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
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator35 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator35);
        lineAndShapeRenderer2.setSeriesCreateEntities(24, (java.lang.Boolean) false, false);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5800() throws Throwable {
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
    public void test5801() throws Throwable {
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
    public void test5802() throws Throwable {
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
    public void test5803() throws Throwable {
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
    public void test5804() throws Throwable {
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
    public void test5805() throws Throwable {
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
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        categoryPlot14.setWeight(255);
        categoryPlot14.setDomainCrosshairColumnKey((java.lang.Comparable) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test5807() throws Throwable {
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
    public void test5808() throws Throwable {
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
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        java.lang.Object obj21 = lineAndShapeRenderer2.clone();
        java.lang.Boolean boolean23 = lineAndShapeRenderer2.getSeriesVisibleInLegend(500);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test5810() throws Throwable {
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
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.lang.Boolean boolean21 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 10);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray1 = org.jfree.chart.ChartColor.createDefaultPaintArray();
        java.awt.Stroke[] strokeArray2 = null;
        java.awt.Stroke[] strokeArray3 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Shape[] shapeArray4 = null;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier5 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, strokeArray2, strokeArray3, shapeArray4);
        java.awt.Stroke stroke6 = defaultDrawingSupplier5.getNextOutlineStroke();
        java.awt.Paint paint7 = defaultDrawingSupplier5.getNextOutlinePaint();
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(strokeArray3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test5813() throws Throwable {
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
    public void test5814() throws Throwable {
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
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Paint paint18 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        lineAndShapeRenderer2.setSeriesShapesVisible(255, (java.lang.Boolean) false);
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5817() throws Throwable {
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
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        int int5 = defaultCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.setValue((double) ' ', (java.lang.Comparable) "AxisLocation.BOTTOM_OR_RIGHT", (java.lang.Comparable) 104.0d);
        int int11 = defaultCategoryDataset0.getRowCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        java.lang.Object obj1 = keyedObjects0.clone();
        org.jfree.chart.axis.CategoryAxis categoryAxis3 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float4 = categoryAxis3.getTickMarkInsideLength();
        categoryAxis3.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis3.setMaximumCategoryLabelLines(10);
        java.lang.Object obj9 = categoryAxis3.clone();
        java.awt.Paint paint10 = categoryAxis3.getLabelPaint();
        java.awt.Paint paint11 = categoryAxis3.getAxisLinePaint();
        boolean boolean12 = keyedObjects0.equals((java.lang.Object) categoryAxis3);
        java.lang.Object obj13 = keyedObjects0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test5820() throws Throwable {
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
    public void test5821() throws Throwable {
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
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getSeriesShape(255);
        lineAndShapeRenderer2.setUseFillPaint(false);
        lineAndShapeRenderer2.setBaseShapesFilled(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(shape16);
    }

    @Test
    public void test5823() throws Throwable {
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
    public void test5824() throws Throwable {
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
    public void test5825() throws Throwable {
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
    public void test5826() throws Throwable {
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
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeValue((java.lang.Comparable) 1.0d, (java.lang.Comparable) false);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        java.awt.Shape shape1 = lineAndShapeRenderer0.getBaseShape();
        boolean boolean2 = lineAndShapeRenderer0.getBaseShapesVisible();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5829() throws Throwable {
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
    public void test5830() throws Throwable {
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
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color8 = java.awt.Color.BLUE;
        lineAndShapeRenderer7.setBaseItemLabelPaint((java.awt.Paint) color8);
        java.awt.Stroke stroke11 = lineAndShapeRenderer7.getSeriesOutlineStroke((int) (short) 1);
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
        org.jfree.chart.axis.ValueAxis valueAxis29 = lineAndShapeRenderer7.getRangeAxis(categoryPlot26, (int) '4');
        double double30 = categoryPlot26.getRangeCrosshairValue();
        java.awt.Paint paint31 = categoryPlot26.getRangeZeroBaselinePaint();
        int int32 = categoryPlot26.getRangeAxisCount();
        java.awt.Color color33 = java.awt.Color.BLUE;
        categoryPlot26.setRangeMinorGridlinePaint((java.awt.Paint) color33);
        java.awt.Stroke stroke35 = categoryPlot26.getRangeMinorGridlineStroke();
        float float36 = categoryPlot26.getBackgroundAlpha();
        defaultCategoryDataset0.addChangeListener((org.jfree.data.event.DatasetChangeListener) categoryPlot26);
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState38 = defaultCategoryDataset0.getSelectionState();
        defaultCategoryDataset0.setValue((double) 10L, (java.lang.Comparable) 'a', (java.lang.Comparable) "{0}");
        int int44 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 2);
        int int45 = defaultCategoryDataset0.getColumnCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(categoryItemRenderer27);
        org.junit.Assert.assertNull(valueAxis29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test5832() throws Throwable {
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
    public void test5833() throws Throwable {
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
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj22 = categoryAxis21.clone();
        java.awt.Font font23 = categoryAxis21.getTickLabelFont();
        lineAndShapeRenderer7.setSeriesItemLabelFont((int) '#', font23);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = lineAndShapeRenderer7.getPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot25);
        categoryPlot25.setAnchorValue((-1.6776955E7d), false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(categoryPlot25);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(categoryURLGenerator18);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(100);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test5837() throws Throwable {
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
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        categoryPlot14.setRangeCrosshairVisible(false);
        categoryPlot14.setDomainCrosshairColumnKey((java.lang.Comparable) "{0}");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(categoryAxis15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test5839() throws Throwable {
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
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Font font9 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_FONT;
        lineAndShapeRenderer2.setLegendTextFont(0, font9);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test5841() throws Throwable {
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
    public void test5842() throws Throwable {
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
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(1, categoryToolTipGenerator10);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlineStroke(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5844() throws Throwable {
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
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
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
        int int23 = defaultShadowGenerator22.getShadowSize();
        double double24 = defaultShadowGenerator22.getAngle();
        org.junit.Assert.assertNotNull(paintContext16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test5846() throws Throwable {
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
    public void test5847() throws Throwable {
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
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible((-12517568));
        lineAndShapeRenderer2.setDataBoundsIncludesVisibleSeriesOnly(true);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5849() throws Throwable {
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
    public void test5850() throws Throwable {
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
    public void test5851() throws Throwable {
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
    public void test5852() throws Throwable {
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
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        boolean boolean27 = lineAndShapeRenderer2.getAutoPopulateSeriesShape();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseFillPaint();
        boolean boolean14 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        lineAndShapeRenderer2.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5855() throws Throwable {
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
    public void test5856() throws Throwable {
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
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        boolean boolean12 = lineAndShapeRenderer2.getBaseCreateEntities();
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.lookupSeriesStroke((int) (short) 100);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test5858() throws Throwable {
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
    public void test5859() throws Throwable {
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
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.jfree.chart.text.TextAnchor textAnchor11 = itemLabelPosition10.getTextAnchor();
        double double12 = itemLabelPosition10.getAngle();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5861() throws Throwable {
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
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        java.awt.Paint paint28 = lineAndShapeRenderer2.getItemFillPaint((int) (byte) 10, 0, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) true, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = lineAndShapeRenderer2.getPlot();
        boolean boolean13 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent14 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) boolean13);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.awt.Paint paint17 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(15);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test5865() throws Throwable {
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
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) 2.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5867() throws Throwable {
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
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        int int13 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = lineAndShapeRenderer2.getDrawingSupplier();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(drawingSupplier14);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.RenderingSource renderingSource22 = null;
        categoryPlot14.select((-0.010101010101010166d), (double) (byte) 10, rectangle2D21, renderingSource22);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(axisLocation18);
    }

    @Test
    public void test5870() throws Throwable {
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
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getURLGenerator(255, 4, false);
        lineAndShapeRenderer2.setSeriesVisible(10, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNull(categoryURLGenerator15);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Stroke stroke3 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseStroke(stroke3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(255, (java.lang.Boolean) false);
        lineAndShapeRenderer2.removeAnnotations();
        boolean boolean15 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        boolean boolean14 = lineAndShapeRenderer2.getBaseCreateEntities();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5875() throws Throwable {
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
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        lineAndShapeRenderer2.setItemLabelAnchorOffset((double) 0);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getSeriesItemLabelPaint(15);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true);
        lineAndShapeRenderer2.setSeriesShapesVisible(8, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        lineAndShapeRenderer2.setSeriesLinesVisible(0, false);
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
    public void test5878() throws Throwable {
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
    public void test5879() throws Throwable {
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
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.data.Range range7 = lineAndShapeRenderer2.findRangeBounds(categoryDataset6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(4, categoryURLGenerator9, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(range7);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        org.jfree.chart.entity.ChartEntity chartEntity19 = new org.jfree.chart.entity.ChartEntity(shape16, "PlotEntity: tooltip = null", "PlotOrientation.VERTICAL");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator11);
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesVisibleInLegend(0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test5883() throws Throwable {
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
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        lineAndShapeRenderer2.setSeriesLinesVisible(10, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL;
        boolean boolean2 = gradientPaintTransformType0.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        lineAndShapeRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        java.awt.Shape shape7 = lineAndShapeRenderer3.getLegendShape(0);
        lineAndShapeRenderer3.setAutoPopulateSeriesStroke(false);
        java.awt.Font font11 = lineAndShapeRenderer3.getSeriesItemLabelFont(0);
        org.jfree.data.KeyedObject keyedObject12 = new org.jfree.data.KeyedObject((java.lang.Comparable) 100.0f, (java.lang.Object) 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(font11);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        boolean boolean3 = categoryAxis1.isAxisLineVisible();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(100, (java.lang.Boolean) true, false);
        java.awt.Font font16 = lineAndShapeRenderer2.getSeriesItemLabelFont((int) (byte) -1);
        boolean boolean17 = lineAndShapeRenderer2.getDrawOutlines();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5889() throws Throwable {
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
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot14.setDataset(categoryDataset19);
        boolean boolean21 = categoryPlot14.isRangeGridlinesVisible();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(rectangleEdge17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5892() throws Throwable {
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
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        int int7 = categoryAxis1.getCategoryLabelPositionOffset();
        float float8 = categoryAxis1.getMinorTickMarkOutsideLength();
        org.jfree.chart.plot.Plot plot9 = categoryAxis1.getPlot();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test5894() throws Throwable {
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
    public void test5895() throws Throwable {
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
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer14.setBaseURLGenerator(categoryURLGenerator15);
        java.awt.Shape shape18 = lineAndShapeRenderer14.getLegendShape(0);
        lineAndShapeRenderer14.setAutoPopulateSeriesStroke(false);
        java.awt.Font font22 = lineAndShapeRenderer14.getSeriesItemLabelFont(0);
        lineAndShapeRenderer14.setUseSeriesOffset(true);
        java.awt.Shape shape26 = null;
        lineAndShapeRenderer14.setSeriesShape((int) (short) 10, shape26, true);
        lineAndShapeRenderer14.setSeriesLinesVisible((int) (short) 100, false);
        java.awt.Stroke stroke33 = lineAndShapeRenderer14.getSeriesOutlineStroke(100);
        java.awt.Paint paint37 = lineAndShapeRenderer14.getItemPaint(100, 0, false);
        renderAttributes11.setDefaultOutlinePaint(paint37);
        java.awt.Stroke stroke41 = renderAttributes11.getItemStroke((int) (byte) -1, (-12517568));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(renderAttributes11);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(font22);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(stroke41);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        boolean boolean32 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(font16);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        boolean boolean21 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.renderer.RenderAttributes renderAttributes14 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.lang.Boolean boolean15 = renderAttributes14.getDefaultCreateEntity();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(renderAttributes14);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test5900() throws Throwable {
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
    public void test5901() throws Throwable {
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
    public void test5902() throws Throwable {
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
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Paint paint11 = lineAndShapeRenderer2.getItemLabelPaint(0, (int) (short) 1, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        java.awt.Paint paint7 = barRenderer0.getItemFillPaint(5, (-254), false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test5905() throws Throwable {
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
    public void test5906() throws Throwable {
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
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        boolean boolean17 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        java.lang.Boolean boolean19 = lineAndShapeRenderer2.getSeriesVisible(9);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test5908() throws Throwable {
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
    public void test5909() throws Throwable {
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
    public void test5910() throws Throwable {
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
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        java.awt.Font font7 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Color color9 = java.awt.Color.DARK_GRAY;
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) (byte) 1, (java.awt.Paint) color9, false);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        boolean boolean16 = lineAndShapeRenderer2.isItemLabelVisible((int) (short) 0, (int) (byte) 1, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator12);
        boolean boolean16 = lineAndShapeRenderer2.getItemShapeVisible(0, 3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = lineAndShapeRenderer2.getPlot();
        java.awt.Shape shape26 = lineAndShapeRenderer2.getBaseShape();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryPlot25);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color9 = java.awt.Color.darkGray;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color9, true);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = lineAndShapeRenderer2.getLegendItems();
        java.util.Iterator iterator13 = legendItemCollection12.iterator();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset0.clear();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeRow((-12517568));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5918() throws Throwable {
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
    public void test5919() throws Throwable {
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
    public void test5920() throws Throwable {
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
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        lineAndShapeRenderer2.setSeriesShapesVisible(255, (java.lang.Boolean) false);
        java.awt.Stroke stroke13 = null;
        lineAndShapeRenderer2.setSeriesStroke(2, stroke13);
        boolean boolean18 = lineAndShapeRenderer2.isItemLabelVisible((int) (byte) 100, (-16777206), true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ItemLabelAnchor.OUTSIDE6" + "'", str1, "ItemLabelAnchor.OUTSIDE6");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        java.awt.Stroke stroke3 = barRenderer0.getSeriesOutlineStroke(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke3);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        lineAndShapeRenderer2.setBaseSeriesVisible(false, true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
    }

    @Test
    public void test5926() throws Throwable {
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
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        defaultCategoryDataset0.setValue(0.05d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 4);
        defaultCategoryDataset0.validateObject();
        defaultCategoryDataset0.clearSelection();
        int int9 = defaultCategoryDataset0.getColumnCount();
        java.lang.Object obj10 = defaultCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5928() throws Throwable {
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
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        org.jfree.chart.util.Layer layer29 = null;
        java.util.Collection collection30 = categoryPlot4.getRangeMarkers(layer29);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot4.getRangeAxisLocation();
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(collection30);
        org.junit.Assert.assertNotNull(axisLocation31);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Stroke stroke23 = lineAndShapeRenderer19.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot24);
        java.awt.Paint paint26 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        boolean boolean6 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) '#', (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean5 = categoryAxis1.isVisible();
        java.awt.Font font7 = null;
        categoryAxis1.setTickLabelFont((java.lang.Comparable) (byte) 10, font7);
        double double9 = categoryAxis1.getLowerMargin();
        categoryAxis1.setMinorTickMarkInsideLength((float) (short) 0);
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) (-0.010101010101010166d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
    }

    @Test
    public void test5933() throws Throwable {
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
    public void test5934() throws Throwable {
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
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator12);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, false);
        java.lang.Boolean boolean19 = lineAndShapeRenderer2.getSeriesLinesVisible(32);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test5936() throws Throwable {
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
    public void test5937() throws Throwable {
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
    public void test5938() throws Throwable {
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
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        java.lang.String str8 = chartEntity7.getShapeCoords();
        java.lang.String str9 = chartEntity7.getURLText();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-3,-3,3,3" + "'", str8, "-3,-3,3,3");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(33, (-1), true);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = lineAndShapeRenderer2.getSeriesToolTipGenerator(52);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(categoryToolTipGenerator20);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        float float1 = categoryAxis0.getMinorTickMarkInsideLength();
        categoryAxis0.setLabelToolTip("java.awt.Color[r=255,g=255,b=255]");
        java.lang.String str4 = categoryAxis0.getLabel();
        categoryAxis0.setLabelURL("TextAnchor.HALF_ASCENT_LEFT");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5942() throws Throwable {
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
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = keyedObjects2D0.getObject((java.lang.Comparable) 5.0d, (java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (5.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent26 = null;
        categoryPlot4.rendererChanged(rendererChangeEvent26);
        categoryPlot4.setRangePannable(true);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(categoryAxis23);
        org.junit.Assert.assertNotNull(rectangleEdge25);
    }

    @Test
    public void test5945() throws Throwable {
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
    public void test5946() throws Throwable {
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
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        int int11 = lineAndShapeRenderer2.getPassCount();
        java.lang.Boolean boolean13 = lineAndShapeRenderer2.getSeriesVisible((int) (byte) 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test5948() throws Throwable {
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
    public void test5949() throws Throwable {
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
    public void test5950() throws Throwable {
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
    public void test5951() throws Throwable {
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
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color9 = java.awt.Color.darkGray;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color9, true);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = lineAndShapeRenderer2.getLegendItems();
        int int13 = legendItemCollection12.getItemCount();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        categoryPlot21.setDomainCrosshairVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis33 = null;
        org.jfree.data.Range range34 = categoryPlot21.getDataRange(valueAxis33);
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
        org.junit.Assert.assertNull(range34);
    }

    @Test
    public void test5954() throws Throwable {
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
    public void test5955() throws Throwable {
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
    public void test5956() throws Throwable {
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
    public void test5957() throws Throwable {
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
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        categoryAxis1.setMinorTickMarkInsideLength((float) (short) -1);
        int int4 = categoryAxis1.getCategoryLabelPositionOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test5959() throws Throwable {
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
    public void test5960() throws Throwable {
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
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(10, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.awt.Color color1 = org.jfree.chart.ChartColor.VERY_DARK_CYAN;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color1);
        java.lang.Comparable comparable3 = legendItem2.getSeriesKey();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(comparable3);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.lang.Object obj21 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test5964() throws Throwable {
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
    public void test5965() throws Throwable {
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
    public void test5966() throws Throwable {
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
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        lineAndShapeRenderer2.setDrawOutlines(false);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5968() throws Throwable {
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
    public void test5969() throws Throwable {
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
    public void test5970() throws Throwable {
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
    public void test5971() throws Throwable {
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
    public void test5972() throws Throwable {
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
    public void test5973() throws Throwable {
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
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        int int2 = keyedObjects0.getItemCount();
        int int3 = keyedObjects0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = keyedObjects0.getKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
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
        lineAndShapeRenderer2.setSeriesVisibleInLegend((int) 'a', (java.lang.Boolean) true, false);
        java.awt.Stroke stroke66 = lineAndShapeRenderer2.getSeriesStroke((int) (short) 100);
        lineAndShapeRenderer2.setSeriesShapesVisible(35, false);
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
        org.junit.Assert.assertNull(stroke66);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.Boolean boolean19 = lineAndShapeRenderer2.getSeriesShapesFilled(10);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 100);
        java.lang.Number number2 = selectableValue1.getValue();
        java.lang.Number number3 = selectableValue1.getValue();
        org.junit.Assert.assertEquals("'" + number2 + "' != '" + 100 + "'", number2, 100);
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 100 + "'", number3, 100);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("java.awt.Color[r=128,g=128,b=128]");
        java.lang.String str2 = datasetGroup1.getID();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.awt.Color[r=128,g=128,b=128]" + "'", str2, "java.awt.Color[r=128,g=128,b=128]");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.lang.Object obj2 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((-16776961));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16776961");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test5980() throws Throwable {
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
    public void test5981() throws Throwable {
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
    public void test5982() throws Throwable {
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
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        legendItem6.setSeriesIndex(52);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot4.panDomainAxes((double) 10284987, plotRenderingInfo26, point2D27);
        org.junit.Assert.assertNotNull(paintContext15);
        org.junit.Assert.assertNotNull(color16);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor11 = itemLabelPosition10.getItemLabelAnchor();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(itemLabelAnchor11);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
    }

    @Test
    public void test5987() throws Throwable {
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
    public void test5988() throws Throwable {
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
    public void test5989() throws Throwable {
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
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color20 = java.awt.Color.BLUE;
        lineAndShapeRenderer19.setBaseItemLabelPaint((java.awt.Paint) color20);
        java.awt.Stroke stroke23 = lineAndShapeRenderer19.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot24);
        categoryPlot24.setRangeGridlinesVisible(false);
        java.util.List list28 = categoryPlot24.getCategories();
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertNull(list28);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        java.awt.Stroke stroke70 = renderAttributes69.getDefaultStroke();
        renderAttributes69.setDefaultLabelVisible((java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint74 = renderAttributes69.getSeriesLabelPaint(10);
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
        org.junit.Assert.assertNull(stroke70);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint(33);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        java.awt.Paint paint20 = lineAndShapeRenderer2.getItemLabelPaint((-16777216), 10284987, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        java.awt.Stroke stroke6 = categoryAxis1.getAxisLineStroke();
        java.awt.Stroke stroke7 = categoryAxis1.getAxisLineStroke();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 100);
        java.awt.Paint paint10 = categoryAxis1.getTickMarkPaint();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test5994() throws Throwable {
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
    public void test5995() throws Throwable {
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
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        boolean boolean9 = lineAndShapeRenderer2.getItemShapeVisible(0, 3);
        boolean boolean10 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean13 = lineAndShapeRenderer2.getItemShapeVisible((int) (short) -1, 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        org.jfree.chart.util.ShadowGenerator shadowGenerator40 = categoryPlot21.getShadowGenerator();
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
        org.junit.Assert.assertNotNull(shadowGenerator40);
    }

    @Test
    public void test5998() throws Throwable {
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
    public void test5999() throws Throwable {
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
    public void test6000() throws Throwable {
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
}
