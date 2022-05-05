package org.jfree.chart.renderer.category;;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

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
    public void test4810() throws Throwable {
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
    public void test5537() throws Throwable {
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
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity8 = new org.jfree.chart.entity.ChartEntity(shape5, "", "java.awt.Color[r=255,g=255,b=255]");
        java.lang.String str9 = chartEntity8.getURLText();
        org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator10 = null;
        org.jfree.chart.imagemap.URLTagFragmentGenerator uRLTagFragmentGenerator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = chartEntity8.getImageMapAreaTag(toolTipTagFragmentGenerator10, uRLTagFragmentGenerator11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.awt.Color[r=255,g=255,b=255]" + "'", str9, "java.awt.Color[r=255,g=255,b=255]");
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
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray2 = unknownKeyException1.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException4 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException4);
        org.jfree.data.UnknownKeyException unknownKeyException7 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        java.lang.Throwable[] throwableArray8 = unknownKeyException7.getSuppressed();
        org.jfree.data.UnknownKeyException unknownKeyException10 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        unknownKeyException7.addSuppressed((java.lang.Throwable) unknownKeyException10);
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException7);
        java.lang.String str13 = unknownKeyException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str13, "org.jfree.data.UnknownKeyException: RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
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
    public void test5516() throws Throwable {
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
    public void test5558() throws Throwable {
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
    public void test5592() throws Throwable {
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
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        int int9 = defaultShadowGenerator6.calculateOffsetY();
        int int10 = defaultShadowGenerator6.getShadowSize();
        int int11 = defaultShadowGenerator6.calculateOffsetY();
        int int12 = defaultShadowGenerator6.calculateOffsetY();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10) + "'", int11 == (-10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
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
    public void test5530() throws Throwable {
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
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState8 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.updateCrosshairValues(categoryCrosshairState8, (java.lang.Comparable) 120.0d, (java.lang.Comparable) 0L, (double) 'a', (int) 'a', (double) (-1.0f), (double) 10284987, plotOrientation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
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
    public void test5534() throws Throwable {
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
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getBaseSeriesVisible();
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((-1), (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
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
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color6 = chartColor5.darker();
        org.jfree.chart.LegendItem legendItem7 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor5);
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", (java.awt.Paint) chartColor5);
        legendItem8.setLineVisible(false);
        java.lang.Object obj11 = legendItem8.clone();
        java.awt.Shape shape12 = legendItem8.getShape();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.entity.CategoryItemEntity categoryItemEntity18 = new org.jfree.chart.entity.CategoryItemEntity(shape12, "AxisLocation.TOP_OR_LEFT", "org.jfree.data.UnknownKeyException: org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]", categoryDataset15, (java.lang.Comparable) false, (java.lang.Comparable) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test5533() throws Throwable {
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
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double9 = rectangleInsets7.calculateBottomInset(0.0d);
        double double11 = rectangleInsets7.trimWidth((double) '#');
        categoryAxis1.setTickLabelInsets(rectangleInsets7);
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D14 = rectangleInsets7.createOutsetRectangle(rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.0d + "'", double9 == 3.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 29.0d + "'", double11 == 29.0d);
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
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
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
            java.lang.Boolean boolean17 = renderAttributes15.getSeriesLabelVisible(52);
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
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.awt.Shape shape15 = null;
        renderAttributes13.setSeriesShape((int) ' ', shape15);
        java.awt.Paint paint18 = renderAttributes13.getSeriesOutlinePaint(50);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
        org.junit.Assert.assertNull(paint18);
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
    public void test5523() throws Throwable {
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
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = lineAndShapeRenderer2.getBaseNegativeItemLabelPosition();
        boolean boolean11 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (byte) -1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setLegendItemLabelGenerator(categorySeriesLabelGenerator12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'generator' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        int int3 = keyedObjects2D0.getRowCount();
        int int4 = keyedObjects2D0.getColumnCount();
        int int5 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = keyedObjects2D0.getColumnKey(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 9, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
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
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Color color8 = java.awt.Color.GRAY;
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator12 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 0, color8, 1.0f, (-1), 10.0d);
        lineAndShapeRenderer2.setSeriesPaint(0, (java.awt.Paint) color8, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
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
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.text.AttributedString attributedString0 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        lineAndShapeRenderer6.setBaseURLGenerator(categoryURLGenerator7);
        java.awt.Shape shape10 = lineAndShapeRenderer6.getLegendShape(0);
        lineAndShapeRenderer6.setAutoPopulateSeriesStroke(false);
        java.awt.Shape shape14 = lineAndShapeRenderer6.lookupSeriesShape(1);
        java.awt.Color color15 = java.awt.Color.red;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.LegendItem legendItem16 = new org.jfree.chart.LegendItem(attributedString0, "", "RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]", "AxisLocation.BOTTOM_OR_LEFT", shape14, (java.awt.Paint) color15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(color15);
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
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesStroke((int) '4');
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(10, (java.lang.Boolean) true);
        boolean boolean12 = lineAndShapeRenderer2.getItemShapeVisible((int) 'a', (int) (byte) 100);
        lineAndShapeRenderer2.setBaseShapesFilled(false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
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
    public void test5565() throws Throwable {
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
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator14 = lineAndShapeRenderer2.getToolTipGenerator((int) '#', (int) (byte) 10, false);
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test5520() throws Throwable {
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
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
            java.awt.Stroke stroke18 = renderAttributes15.getItemOutlineStroke(1, 0);
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
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Shape shape10 = lineAndShapeRenderer2.lookupSeriesShape(1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.entity.CategoryItemEntity categoryItemEntity16 = new org.jfree.chart.entity.CategoryItemEntity(shape10, "ItemLabelAnchor.OUTSIDE6", "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]", categoryDataset13, (java.lang.Comparable) (-16776961), (java.lang.Comparable) "ItemLabelAnchor.INSIDE7");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(shape10);
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
    public void test5648() throws Throwable {
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
    public void test5536() throws Throwable {
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
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        boolean boolean5 = categoryAxis1.isTickLabelsVisible();
        double double6 = categoryAxis1.getUpperMargin();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = categoryAxis1.getLabelInsets();
        double double9 = rectangleInsets7.calculateLeftOutset((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.05d + "'", double6 == 0.05d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.0d + "'", double9 == 3.0d);
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
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0f, false);
        java.lang.Number number3 = selectableValue2.getValue();
        boolean boolean4 = selectableValue2.isSelected();
        java.lang.Number number5 = selectableValue2.getValue();
        java.lang.Number number6 = selectableValue2.getValue();
        java.lang.Number number7 = selectableValue2.getValue();
        boolean boolean8 = selectableValue2.isSelected();
        org.junit.Assert.assertEquals("'" + number3 + "' != '" + 1.0f + "'", number3, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + number5 + "' != '" + 1.0f + "'", number5, 1.0f);
        org.junit.Assert.assertEquals("'" + number6 + "' != '" + 1.0f + "'", number6, 1.0f);
        org.junit.Assert.assertEquals("'" + number7 + "' != '" + 1.0f + "'", number7, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
    public void test5584() throws Throwable {
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
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) 100, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
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
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator11);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
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
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((int) (short) -1);
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (short) -1, (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryAxis1.getLabelInsets();
        categoryAxis1.setMinorTickMarkInsideLength((float) (short) 1);
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) "PlotEntity: tooltip = java.awt.Color[r=64,g=255,b=64]", "UnitType.RELATIVE");
        java.lang.Object obj10 = categoryAxis1.clone();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(obj10);
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
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity8 = new org.jfree.chart.entity.ChartEntity(shape5, "", "java.awt.Color[r=255,g=255,b=255]");
        java.lang.String str9 = chartEntity8.getURLText();
        java.lang.String str10 = chartEntity8.getShapeCoords();
        java.lang.String str11 = chartEntity8.getShapeCoords();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.awt.Color[r=255,g=255,b=255]" + "'", str9, "java.awt.Color[r=255,g=255,b=255]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-3,-3,3,3" + "'", str10, "-3,-3,3,3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-3,-3,3,3" + "'", str11, "-3,-3,3,3");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        java.awt.Stroke stroke21 = null;
        lineAndShapeRenderer2.setSeriesOutlineStroke(3, stroke21, true);
        java.awt.Shape shape24 = lineAndShapeRenderer2.getBaseLegendShape();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(shape24);
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
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
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
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        legendItem1.setShapeVisible(false);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(stroke16);
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
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator12);
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getBaseStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) ' ', categoryURLGenerator16);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator11);
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(15);
        lineAndShapeRenderer2.setBaseShapesVisible(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(font14);
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
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.data.Range range15 = lineAndShapeRenderer2.findRangeBounds(categoryDataset14);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(range15);
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
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        int int9 = defaultShadowGenerator6.calculateOffsetX();
        int int10 = defaultShadowGenerator6.calculateOffsetX();
        double double11 = defaultShadowGenerator6.getAngle();
        int int12 = defaultShadowGenerator6.getDistance();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5621() throws Throwable {
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
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator8, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getBaseItemLabelFont();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test5557() throws Throwable {
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
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getURLGenerator(255, 4, false);
        java.lang.Boolean boolean17 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (byte) 10);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator13);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator15);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(50, categoryToolTipGenerator18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
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
    public void test5639() throws Throwable {
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
    public void test5583() throws Throwable {
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
    public void test5682() throws Throwable {
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
    public void test5690() throws Throwable {
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
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        lineAndShapeRenderer2.setSeriesVisibleInLegend(255, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((-16776961));
        java.awt.Paint paint19 = lineAndShapeRenderer2.getItemLabelPaint(2, (-254), false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(paint19);
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
    public void test5548() throws Throwable {
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
    public void test5623() throws Throwable {
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
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double8 = rectangleInsets6.calculateTopOutset((double) (byte) 0);
        double double10 = rectangleInsets6.calculateBottomInset(0.0d);
        boolean boolean11 = objectList1.equals((java.lang.Object) double10);
        boolean boolean13 = objectList1.equals((java.lang.Object) (-1.0d));
        objectList1.clear();
        objectList1.clear();
        java.lang.Object obj17 = objectList1.get((int) 'a');
        java.lang.Object obj19 = objectList1.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
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
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator11, true);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = lineAndShapeRenderer2.getPlot();
        boolean boolean17 = lineAndShapeRenderer2.getItemLineVisible(0, 0);
        java.lang.Boolean boolean19 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator20, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(boolean19);
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
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        java.awt.Shape shape4 = null;
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color10 = chartColor9.darker();
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor9);
        int int12 = chartColor9.getAlpha();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape4, (java.awt.Paint) chartColor9);
        java.awt.Shape shape14 = legendItem13.getLine();
        java.lang.Object obj15 = legendItem13.clone();
        java.awt.Stroke stroke16 = legendItem13.getLineStroke();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 255 + "'", int12 == 255);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(stroke16);
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
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("ChartEntity: tooltip = GradientPaintTransformType.HORIZONTAL");
        org.jfree.data.UnknownKeyException unknownKeyException3 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        org.jfree.data.UnknownKeyException unknownKeyException5 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        unknownKeyException3.addSuppressed((java.lang.Throwable) unknownKeyException5);
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException3);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unknownKeyException3.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = lineAndShapeRenderer2.getPlot();
        java.awt.Shape shape15 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNull(categoryURLGenerator16);
    }

    @Test
    public void test5552() throws Throwable {
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
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double8 = rectangleInsets6.calculateTopOutset((double) (byte) 0);
        double double10 = rectangleInsets6.calculateBottomInset(0.0d);
        boolean boolean11 = objectList1.equals((java.lang.Object) double10);
        boolean boolean13 = objectList1.equals((java.lang.Object) (-1.0d));
        objectList1.clear();
        java.lang.Object obj16 = null;
        objectList1.set(100, obj16);
        java.lang.Object obj19 = null;
        objectList1.set((int) (byte) 0, obj19);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double12 = rectangleInsets4.calculateRightOutset((double) (short) 10);
        double double14 = rectangleInsets4.calculateLeftOutset((double) '#');
        double double16 = rectangleInsets4.calculateLeftInset((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryAxis1.getLabelInsets();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions5 = categoryAxis1.getCategoryLabelPositions();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.util.RectangleEdge rectangleEdge9 = null;
        org.jfree.chart.axis.AxisState axisState10 = null;
        categoryAxis1.drawTickMarks(graphics2D6, (double) (short) 0, rectangle2D8, rectangleEdge9, axisState10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(categoryLabelPositions5);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        boolean boolean11 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setItemLabelAnchorOffset(10.0d);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5713() throws Throwable {
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
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.trimWidth((double) (-10289251));
        double double8 = rectangleInsets4.calculateTopOutset(0.0d);
        double double10 = rectangleInsets4.calculateLeftInset((double) 0L);
        double double11 = rectangleInsets4.getRight();
        java.lang.String str12 = rectangleInsets4.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0289271E7d) + "'", double6 == (-1.0289271E7d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str12, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
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
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot4.zoomRangeAxes(43.0d, (double) (-1), plotRenderingInfo18, point2D19);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator11, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator10);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        java.awt.Paint paint9 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(4);
        java.awt.Paint paint10 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_PAINT;
        lineAndShapeRenderer2.setBaseLegendTextPaint(paint10);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
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
    public void test5720() throws Throwable {
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
    public void test5506() throws Throwable {
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
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        int int3 = keyedObjects2D0.getRowCount();
        int int4 = keyedObjects2D0.getColumnCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeColumn((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Shape shape16 = lineAndShapeRenderer2.getItemShape(33, (-1), true);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        java.awt.Stroke stroke20 = lineAndShapeRenderer2.getSeriesOutlineStroke(35);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(stroke20);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Shape shape12 = lineAndShapeRenderer2.lookupLegendShape(8);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseFillPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = lineAndShapeRenderer2.getDrawingSupplier();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(drawingSupplier14);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) true, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = lineAndShapeRenderer2.getPlot();
        boolean boolean13 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(33, categoryToolTipGenerator15);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5570() throws Throwable {
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
    public void test5661() throws Throwable {
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
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = lineAndShapeRenderer2.getURLGenerator(1, (int) 'a', false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryURLGenerator15);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        boolean boolean12 = lineAndShapeRenderer2.getBaseCreateEntities();
        java.awt.Shape shape14 = lineAndShapeRenderer2.getSeriesShape(2);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator15 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator15);
    }

    @Test
    public void test5515() throws Throwable {
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
    public void test5607() throws Throwable {
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
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        int int8 = lineAndShapeRenderer2.getPassCount();
        boolean boolean9 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5568() throws Throwable {
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
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        int int5 = defaultCategoryDataset0.getColumnCount();
        java.util.List list6 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.setValue((double) ' ', (java.lang.Comparable) "AxisLocation.BOTTOM_OR_RIGHT", (java.lang.Comparable) 104.0d);
        java.lang.Object obj11 = defaultCategoryDataset0.clone();
        defaultCategoryDataset0.fireSelectionEvent();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = categoryAxis1.getLabelInsets();
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions5 = categoryAxis1.getCategoryLabelPositions();
        float float6 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) "ItemLabelAnchor.INSIDE10", "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(categoryLabelPositions5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
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
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        java.awt.Shape shape14 = null;
        lineAndShapeRenderer2.setSeriesShape((int) (short) 10, shape14, true);
        java.lang.Boolean boolean18 = lineAndShapeRenderer2.getSeriesLinesVisible(100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator20);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(boolean18);
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
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getItemStroke(100, 0, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible(4);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation12 = null;
        boolean boolean13 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation12);
        java.awt.Paint paint15 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test5556() throws Throwable {
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
    public void test5706() throws Throwable {
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
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        int int9 = defaultShadowGenerator6.calculateOffsetY();
        int int10 = defaultShadowGenerator6.getShadowSize();
        int int11 = defaultShadowGenerator6.getDistance();
        int int12 = defaultShadowGenerator6.calculateOffsetY();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
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
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        int int9 = defaultShadowGenerator6.calculateOffsetY();
        int int10 = defaultShadowGenerator6.getShadowSize();
        double double11 = defaultShadowGenerator6.getAngle();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5666() throws Throwable {
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
    public void test5549() throws Throwable {
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
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        defaultCategoryDataset10.clearSelection();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(range13);
    }

    @Test
    public void test5580() throws Throwable {
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
    public void test5731() throws Throwable {
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
    public void test5752() throws Throwable {
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
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        boolean boolean11 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, (int) '4');
        boolean boolean12 = lineAndShapeRenderer2.getBaseCreateEntities();
        java.awt.Font font14 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(font14);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        lineAndShapeRenderer0.setBaseSeriesVisibleInLegend(false, false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer0.setSeriesVisibleInLegend((-1656), (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        lineAndShapeRenderer0.setSeriesCreateEntities(192, (java.lang.Boolean) true, false);
        java.awt.Font font8 = lineAndShapeRenderer0.getItemLabelFont(11, 2, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = lineAndShapeRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint13 = lineAndShapeRenderer0.getItemLabelPaint((int) '4', 0, true);
        boolean boolean14 = lineAndShapeRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
    }

    @Test
    public void test5679() throws Throwable {
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
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = lineAndShapeRenderer2.getLegendItems();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(legendItemCollection11);
    }

    @Test
    public void test5701() throws Throwable {
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
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        boolean boolean4 = barRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        barRenderer0.setBaseOutlinePaint(paint5, false);
        barRenderer0.setItemLabelAnchorOffset((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test5773() throws Throwable {
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
    public void test5769() throws Throwable {
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
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((int) (short) 1);
        lineAndShapeRenderer2.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false, false);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = lineAndShapeRenderer2.getLegendItems();
        java.lang.Boolean boolean15 = lineAndShapeRenderer2.getSeriesVisibleInLegend(0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNull(boolean15);
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
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        boolean boolean11 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes12 = lineAndShapeRenderer2.getSelectedItemAttributes();
        java.lang.Boolean boolean13 = renderAttributes12.getDefaultLabelVisible();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renderAttributes12);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        java.lang.Object obj11 = legendItem6.clone();
        java.awt.Font font12 = legendItem6.getLabelFont();
        java.awt.Font font13 = legendItem6.getLabelFont();
        java.awt.Paint paint14 = legendItem6.getLabelPaint();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNull(font13);
        org.junit.Assert.assertNull(paint14);
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
    public void test5562() throws Throwable {
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
    public void test5531() throws Throwable {
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
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = lineAndShapeRenderer2.getSelectedItemAttributes();
        lineAndShapeRenderer2.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, true);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, true);
        java.awt.Shape shape20 = lineAndShapeRenderer2.getSeriesShape((int) (byte) 0);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(renderAttributes11);
        org.junit.Assert.assertNull(shape20);
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
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.util.List list13 = keyedObjects0.getKeys();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        java.lang.String str7 = rectangleInsets4.toString();
        org.jfree.chart.util.UnitType unitType8 = rectangleInsets4.getUnitType();
        double double10 = rectangleInsets4.calculateTopOutset((double) (-1.0f));
        java.lang.String str11 = rectangleInsets4.toString();
        double double13 = rectangleInsets4.calculateTopOutset(43.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str7, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertNotNull(unitType8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str11, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
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
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getItemStroke(100, 0, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible(4);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBasePaint();
        java.lang.Boolean boolean14 = lineAndShapeRenderer2.getSeriesCreateEntities((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test5542() throws Throwable {
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
    public void test5686() throws Throwable {
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
    public void test5802() throws Throwable {
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
    public void test5535() throws Throwable {
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
    public void test5507() throws Throwable {
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
    public void test5589() throws Throwable {
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
    public void test5664() throws Throwable {
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
    public void test5541() throws Throwable {
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
    public void test5545() throws Throwable {
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
    public void test5685() throws Throwable {
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
    public void test5563() throws Throwable {
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
    public void test5725() throws Throwable {
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
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = lineAndShapeRenderer2.getDrawingSupplier();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        java.awt.Font font15 = lineAndShapeRenderer2.getBaseItemLabelFont();
        lineAndShapeRenderer2.setSeriesItemLabelsVisible(0, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(drawingSupplier13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getItemStroke(100, 0, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible(4);
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = lineAndShapeRenderer2.getToolTipGenerator((int) '4', 255, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
    }

    @Test
    public void test5644() throws Throwable {
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
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        org.jfree.data.UnknownKeyException unknownKeyException3 = new org.jfree.data.UnknownKeyException("RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException3);
        org.jfree.data.UnknownKeyException unknownKeyException6 = new org.jfree.data.UnknownKeyException("ItemLabelAnchor.OUTSIDE6");
        java.lang.Throwable[] throwableArray7 = unknownKeyException6.getSuppressed();
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException6);
        org.jfree.data.UnknownKeyException unknownKeyException10 = new org.jfree.data.UnknownKeyException("ChartEntity: tooltip = GradientPaintTransformType.HORIZONTAL");
        org.jfree.data.UnknownKeyException unknownKeyException12 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        unknownKeyException10.addSuppressed((java.lang.Throwable) unknownKeyException12);
        unknownKeyException6.addSuppressed((java.lang.Throwable) unknownKeyException12);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke10 = null;
        lineAndShapeRenderer2.setSeriesStroke((int) 'a', stroke10, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemURLGenerator();
        java.awt.Paint paint15 = lineAndShapeRenderer2.getSeriesItemLabelPaint(192);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test5709() throws Throwable {
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
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        boolean boolean10 = rectangleInsets4.equals((java.lang.Object) (byte) 10);
        double double11 = rectangleInsets4.getBottom();
        double double12 = rectangleInsets4.getLeft();
        double double14 = rectangleInsets4.calculateRightOutset((-8.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
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
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesPaint(1);
        java.awt.Paint paint16 = lineAndShapeRenderer2.getItemFillPaint((-1), (int) (short) 100, false);
        java.awt.Shape shape18 = lineAndShapeRenderer2.lookupLegendShape(4);
        lineAndShapeRenderer2.setUseOutlinePaint(true);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(shape18);
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
    public void test5553() throws Throwable {
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
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        java.lang.Boolean boolean9 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(2);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesPaint(8);
        boolean boolean12 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test5714() throws Throwable {
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
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupLegendTextPaint(4);
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getItemStroke(10, 50, false);
        java.lang.Boolean boolean18 = lineAndShapeRenderer2.getSeriesLinesVisible((-10));
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(boolean18);
    }

    @Test
    public void test5683() throws Throwable {
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
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double7 = rectangleInsets4.getBottom();
        double double9 = rectangleInsets4.trimHeight((-1.0289271E7d));
        java.lang.String str10 = rectangleInsets4.toString();
        double double12 = rectangleInsets4.calculateLeftOutset((double) ' ');
        double double14 = rectangleInsets4.calculateLeftOutset((double) 24);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0289282E7d) + "'", double9 == (-1.0289282E7d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str10, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
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
    public void test5590() throws Throwable {
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
    public void test5573() throws Throwable {
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
    public void test5619() throws Throwable {
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
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateBottomInset((double) (byte) 100);
        double double12 = rectangleInsets4.calculateBottomInset((double) 100.0f);
        double double13 = rectangleInsets4.getTop();
        double double15 = rectangleInsets4.calculateBottomInset(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test5711() throws Throwable {
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
    public void test5635() throws Throwable {
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
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double12 = rectangleInsets4.calculateRightOutset((double) (short) 10);
        double double14 = rectangleInsets4.calculateLeftOutset((double) '#');
        double double16 = rectangleInsets4.trimHeight((double) 1L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
    }

    @Test
    public void test5782() throws Throwable {
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
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        boolean boolean16 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator12, false);
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesShapesVisible((int) (short) 0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        lineAndShapeRenderer2.setUseOutlinePaint(true);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(renderAttributes13);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        java.lang.String str8 = chartEntity7.getShapeCoords();
        java.awt.Shape shape9 = chartEntity7.getArea();
        java.lang.Object obj10 = chartEntity7.clone();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-3,-3,3,3" + "'", str8, "-3,-3,3,3");
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "ChartEntity: tooltip = ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "ChartEntity: tooltip = ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "ChartEntity: tooltip = ");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator7, false);
        java.awt.Font font11 = lineAndShapeRenderer2.getLegendTextFont((-1));
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(font11);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test5663() throws Throwable {
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
    public void test5710() throws Throwable {
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
    public void test5572() throws Throwable {
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
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeValue((java.lang.Comparable) 3.0d, (java.lang.Comparable) 0.5f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (3.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5776() throws Throwable {
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
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        java.lang.String str3 = rectangleInsets0.toString();
        java.lang.String str4 = rectangleInsets0.toString();
        double double6 = rectangleInsets0.extendHeight((double) (-10));
        double double8 = rectangleInsets0.trimHeight((double) (short) 1);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str3, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str4, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.0d) + "'", double6 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
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
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        boolean boolean5 = legendItem1.isShapeFilled();
        java.awt.Shape shape6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        legendItem1.setShape(shape6);
        legendItem1.setShapeVisible(true);
        int int10 = legendItem1.getDatasetIndex();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5597() throws Throwable {
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
    public void test5739() throws Throwable {
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
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        int int9 = defaultShadowGenerator6.calculateOffsetY();
        int int10 = defaultShadowGenerator6.getShadowSize();
        int int11 = defaultShadowGenerator6.calculateOffsetY();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-10) + "'", int11 == (-10));
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double12 = rectangleInsets4.calculateRightOutset((double) (short) 10);
        double double14 = rectangleInsets4.trimHeight((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5653() throws Throwable {
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
    public void test5629() throws Throwable {
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
    public void test5728() throws Throwable {
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
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.chart.util.UnitType unitType0 = org.jfree.chart.util.UnitType.RELATIVE;
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = new org.jfree.chart.util.RectangleInsets(unitType0, 0.0d, (double) (-1), (double) 100, (double) (short) 100);
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D9 = rectangleInsets5.createAdjustedRectangle(rectangle2D6, lengthAdjustmentType7, lengthAdjustmentType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unitType0);
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
    public void test5680() throws Throwable {
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
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        categoryPlot4.axisChanged(axisChangeEvent12);
        categoryPlot4.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Category Plot" + "'", str11, "Category Plot");
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
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Stroke stroke13 = lineAndShapeRenderer2.lookupSeriesStroke((int) (byte) -1);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getItemFillPaint(8, 0, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test5694() throws Throwable {
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
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        lineAndShapeRenderer2.setSeriesVisible(192, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((-1));
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
    }

    @Test
    public void test5649() throws Throwable {
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
    public void test5577() throws Throwable {
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
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double8 = rectangleInsets4.calculateBottomInset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double12 = rectangleInsets4.calculateRightOutset((double) (short) 10);
        double double14 = rectangleInsets4.calculateRightInset((double) 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        lineAndShapeRenderer2.setSeriesShapesVisible(255, (java.lang.Boolean) false);
        java.awt.Stroke stroke13 = null;
        lineAndShapeRenderer2.setSeriesStroke(2, stroke13);
        boolean boolean15 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Paint paint17 = lineAndShapeRenderer2.getSeriesItemLabelPaint((int) 'a');
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test5538() throws Throwable {
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
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes6 = lineAndShapeRenderer2.getSelectedItemAttributes();
        renderAttributes6.setDefaultLabelVisible((java.lang.Boolean) true);
        java.awt.Paint paint11 = renderAttributes6.getItemOutlinePaint((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(renderAttributes6);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test5588() throws Throwable {
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
    public void test5786() throws Throwable {
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
    public void test5746() throws Throwable {
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
    public void test5660() throws Throwable {
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
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.awt.Shape shape4 = null;
        org.jfree.chart.ChartColor chartColor9 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color10 = chartColor9.darker();
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor9);
        int int12 = chartColor9.getAlpha();
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("", "org.jfree.chart.event.ChartChangeEvent[source=1]", "hi!", "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]", shape4, (java.awt.Paint) chartColor9);
        legendItem13.setLineVisible(true);
        java.awt.Shape shape16 = legendItem13.getShape();
        java.awt.Shape shape17 = legendItem13.getLine();
        int int18 = legendItem13.getDatasetIndex();
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 255 + "'", int12 == 255);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5692() throws Throwable {
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
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer6 = categoryPlot4.getRendererForDataset(categoryDataset5);
        float float7 = categoryPlot4.getForegroundAlpha();
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = categoryPlot4.getOrientation();
        org.junit.Assert.assertNull(categoryItemRenderer6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(plotOrientation8);
    }

    @Test
    public void test5670() throws Throwable {
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
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlineStroke();
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesFillPaint();
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = lineAndShapeRenderer2.getSeriesToolTipGenerator((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator11);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = lineAndShapeRenderer2.getURLGenerator(0, 0, true);
        lineAndShapeRenderer2.setDrawOutlines(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
        org.junit.Assert.assertNull(categoryURLGenerator16);
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
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseItemLabelFont();
        java.awt.Stroke stroke9 = lineAndShapeRenderer2.getItemStroke(100, 0, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisible(4);
        boolean boolean12 = lineAndShapeRenderer2.getAutoPopulateSeriesShape();
        java.lang.Object obj13 = lineAndShapeRenderer2.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
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
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator8);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        int int13 = lineAndShapeRenderer2.getRowCount();
        boolean boolean15 = lineAndShapeRenderer2.isSeriesVisibleInLegend(50);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(10, categoryToolTipGenerator6);
        int int8 = lineAndShapeRenderer2.getRowCount();
        boolean boolean11 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, (int) '4');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator(0, categoryToolTipGenerator13);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition((-20561));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color4 = java.awt.Color.BLUE;
        lineAndShapeRenderer3.setBaseItemLabelPaint((java.awt.Paint) color4);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer3.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator10 = null;
        lineAndShapeRenderer3.setLegendItemURLGenerator(categorySeriesLabelGenerator10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        lineAndShapeRenderer3.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator13);
        java.awt.Paint paint15 = lineAndShapeRenderer3.getBaseItemLabelPaint();
        org.jfree.chart.LegendItem legendItem16 = new org.jfree.chart.LegendItem("java.awt.Color[r=255,g=255,b=0]", paint15);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test5772() throws Throwable {
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
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((int) 'a');
        lineAndShapeRenderer2.setSeriesCreateEntities(192, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator15, false);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        boolean boolean23 = lineAndShapeRenderer2.getDrawOutlines();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
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
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.trimWidth((double) (-10289251));
        double double8 = rectangleInsets4.calculateTopOutset(0.0d);
        double double10 = rectangleInsets4.calculateTopOutset((double) 100.0f);
        double double12 = rectangleInsets4.extendWidth((double) (byte) 1);
        double double14 = rectangleInsets4.extendHeight((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0289271E7d) + "'", double6 == (-1.0289271E7d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 21.0d + "'", double12 == 21.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 11.0d + "'", double14 == 11.0d);
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
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator8, true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesVisible((-16776961));
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test5596() throws Throwable {
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
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double8 = rectangleInsets6.calculateTopOutset((double) (byte) 0);
        double double10 = rectangleInsets6.calculateBottomInset(0.0d);
        boolean boolean11 = objectList1.equals((java.lang.Object) double10);
        boolean boolean13 = objectList1.equals((java.lang.Object) (-1.0d));
        objectList1.clear();
        int int15 = objectList1.size();
        int int16 = objectList1.size();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color9 = java.awt.Color.darkGray;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color9, true);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getSeriesStroke(0);
        boolean boolean15 = lineAndShapeRenderer2.getBaseShapesVisible();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5637() throws Throwable {
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
    public void test5620() throws Throwable {
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
    public void test5688() throws Throwable {
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
    public void test5595() throws Throwable {
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
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE11;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        lineAndShapeRenderer3.setBaseURLGenerator(categoryURLGenerator4);
        boolean boolean6 = lineAndShapeRenderer3.getBaseLinesVisible();
        java.awt.Stroke stroke8 = lineAndShapeRenderer3.getSeriesStroke(4);
        boolean boolean9 = itemLabelAnchor0.equals((java.lang.Object) 4);
        java.lang.String str10 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ItemLabelAnchor.OUTSIDE11" + "'", str10, "ItemLabelAnchor.OUTSIDE11");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        java.awt.Paint paint10 = legendItem6.getLinePaint();
        boolean boolean11 = legendItem6.isShapeOutlineVisible();
        boolean boolean12 = legendItem6.isLineVisible();
        org.jfree.data.general.Dataset dataset13 = legendItem6.getDataset();
        java.text.AttributedString attributedString14 = legendItem6.getAttributedLabel();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataset13);
        org.junit.Assert.assertNull(attributedString14);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = null;
        lineAndShapeRenderer2.setLegendItemURLGenerator(categorySeriesLabelGenerator9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator12);
        boolean boolean16 = lineAndShapeRenderer2.getItemShapeVisible(0, 3);
        java.awt.Shape shape18 = lineAndShapeRenderer2.getLegendShape(1);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(shape18);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = lineAndShapeRenderer2.getSeriesURLGenerator((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(categoryURLGenerator19);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getNegativeItemLabelPosition(9, 0, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        java.lang.String str8 = legendItem6.getURLText();
        legendItem6.setShapeVisible(true);
        java.text.AttributedString attributedString11 = legendItem6.getAttributedLabel();
        java.awt.Stroke stroke12 = legendItem6.getLineStroke();
        boolean boolean13 = legendItem6.isShapeVisible();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(attributedString11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
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
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(true);
        java.awt.Font font21 = lineAndShapeRenderer2.getItemLabelFont(24, (int) (byte) 0, true);
        java.awt.Paint paint23 = lineAndShapeRenderer2.getSeriesFillPaint(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNull(paint23);
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
    public void test5935() throws Throwable {
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
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor(0, 8, (int) ' ');
        legendItem1.setFillPaint((java.awt.Paint) chartColor5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean11 = lineAndShapeRenderer9.isSeriesVisibleInLegend(1);
        java.awt.Font font12 = lineAndShapeRenderer9.getBaseItemLabelFont();
        java.awt.Stroke stroke16 = lineAndShapeRenderer9.getItemStroke(100, 0, true);
        legendItem1.setOutlineStroke(stroke16);
        legendItem1.setSeriesIndex((-10));
        legendItem1.setURLText("rect");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color6 = java.awt.Color.BLUE;
        lineAndShapeRenderer5.setBaseItemLabelPaint((java.awt.Paint) color6);
        java.awt.Stroke stroke9 = lineAndShapeRenderer5.getSeriesStroke((int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer5);
        lineAndShapeRenderer5.setBaseCreateEntities(true, false);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(stroke9);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent9);
        java.awt.Shape shape12 = lineAndShapeRenderer2.getLegendShape(0);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = lineAndShapeRenderer2.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.awt.Color color0 = java.awt.Color.GRAY;
        java.awt.Color color1 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace2 = color1.getColorSpace();
        float[] floatArray5 = new float[] { 0.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = color0.getColorComponents(colorSpace2, floatArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(colorSpace2);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.5019761, 0.5019455]");
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity7 = new org.jfree.chart.entity.ChartEntity(shape5, "");
        java.lang.String str8 = chartEntity7.getShapeCoords();
        java.awt.Shape shape9 = chartEntity7.getArea();
        java.lang.String str10 = chartEntity7.getToolTipText();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-3,-3,3,3" + "'", str8, "-3,-3,3,3");
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5727() throws Throwable {
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
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Shape shape1 = defaultDrawingSupplier0.getNextShape();
        org.jfree.data.KeyedObjects2D keyedObjects2D2 = new org.jfree.data.KeyedObjects2D();
        int int4 = keyedObjects2D2.getRowIndex((java.lang.Comparable) 1);
        boolean boolean5 = defaultDrawingSupplier0.equals((java.lang.Object) int4);
        java.awt.Stroke stroke6 = defaultDrawingSupplier0.getNextStroke();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test5678() throws Throwable {
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
    public void test5654() throws Throwable {
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
    public void test5703() throws Throwable {
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
    public void test5759() throws Throwable {
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
    public void test5642() throws Throwable {
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
    public void test5521() throws Throwable {
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
    public void test5758() throws Throwable {
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
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        java.lang.Object obj3 = null;
        keyedObjects2D0.setObject(obj3, (java.lang.Comparable) 4.0d, (java.lang.Comparable) ' ');
        int int7 = keyedObjects2D0.getColumnCount();
        int int9 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        int int11 = keyedObjects2D0.getRowIndex((java.lang.Comparable) "RectangleInsets[t=4.0,l=8.0,b=4.0,r=8.0]");
        java.util.List list12 = keyedObjects2D0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test5632() throws Throwable {
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
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT;
        keyedObjects0.addObject((java.lang.Comparable) 0L, (java.lang.Object) axisLocation2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = keyedObjects0.getObject((java.lang.Comparable) 0.5f);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (0.5) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(axisLocation2);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        boolean boolean4 = barRenderer0.getIncludeBaseInRange();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        barRenderer0.setBaseURLGenerator(categoryURLGenerator5, false);
        barRenderer0.setBaseCreateEntities(true, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5522() throws Throwable {
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
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        categoryAxis1.setMinorTickMarksVisible(true);
        categoryAxis1.setLabelAngle((-9.0d));
        categoryAxis1.setLabelURL("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        categoryAxis1.setMaximumCategoryLabelLines((-52));
        boolean boolean14 = categoryAxis1.isTickMarksVisible();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.awt.Color color1 = java.awt.Color.GRAY;
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 0, color1, 1.0f, (-1), 10.0d);
        int int6 = defaultShadowGenerator5.getShadowSize();
        int int7 = defaultShadowGenerator5.getShadowSize();
        float float8 = defaultShadowGenerator5.getShadowOpacity();
        int int9 = defaultShadowGenerator5.calculateOffsetY();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
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
    public void test5825() throws Throwable {
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
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        java.awt.Stroke stroke6 = categoryAxis1.getAxisLineStroke();
        java.awt.Stroke stroke7 = categoryAxis1.getAxisLineStroke();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 100);
        java.lang.Object obj10 = categoryAxis1.clone();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5809() throws Throwable {
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
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont(0);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int13 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = lineAndShapeRenderer2.getPlot();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator15, true);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(font10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(categoryPlot14);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        int int8 = defaultShadowGenerator6.calculateOffsetX();
        int int9 = defaultShadowGenerator6.calculateOffsetX();
        int int10 = defaultShadowGenerator6.getShadowSize();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5801() throws Throwable {
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
    public void test5696() throws Throwable {
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
    public void test5633() throws Throwable {
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
    public void test5764() throws Throwable {
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
    public void test5650() throws Throwable {
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
    public void test5732() throws Throwable {
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
    public void test5722() throws Throwable {
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
    public void test5882() throws Throwable {
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
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable5 = keyedObjects2D0.getColumnKey((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test5765() throws Throwable {
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
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.Comparable comparable7 = null;
        legendItem6.setSeriesKey(comparable7);
        int int9 = legendItem6.getSeriesIndex();
        int int10 = legendItem6.getDatasetIndex();
        java.awt.Shape shape11 = legendItem6.getShape();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test5735() throws Throwable {
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
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        lineAndShapeRenderer2.setSeriesVisible(15, (java.lang.Boolean) false);
        java.awt.Paint paint8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseItemLabelPaint(paint8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        boolean boolean10 = lineAndShapeRenderer2.isSeriesVisibleInLegend((int) (short) 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = lineAndShapeRenderer2.getPlot();
        java.awt.Stroke stroke12 = lineAndShapeRenderer2.getBaseOutlineStroke();
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryPlot11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        categoryAxis1.setLabelToolTip("org.jfree.data.UnknownKeyException: org.jfree.chart.event.ChartChangeEvent[source=1]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions7 = categoryAxis1.getCategoryLabelPositions();
        java.awt.Paint paint8 = categoryAxis1.getLabelPaint();
        categoryAxis1.setLabelAngle((double) 10295828);
        java.awt.Stroke stroke11 = categoryAxis1.getTickMarkStroke();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertNotNull(categoryLabelPositions7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        defaultCategoryDataset0.setValue(0.05d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 4);
        defaultCategoryDataset0.validateObject();
        defaultCategoryDataset0.clearSelection();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeValue((java.lang.Comparable) 10.0f, (java.lang.Comparable) (-1));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (10.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color6 = chartColor5.darker();
        org.jfree.chart.LegendItem legendItem7 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor5);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator11 = new org.jfree.chart.util.DefaultShadowGenerator(10, (java.awt.Color) chartColor5, 0.0f, (int) '4', (double) (byte) 0);
        int int12 = defaultShadowGenerator11.calculateOffsetY();
        int int13 = defaultShadowGenerator11.calculateOffsetY();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-10) + "'", int13 == (-10));
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
    public void test5771() throws Throwable {
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
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes6 = lineAndShapeRenderer2.getSelectedItemAttributes();
        renderAttributes6.setDefaultLabelVisible((java.lang.Boolean) true);
        java.awt.Stroke stroke10 = renderAttributes6.getSeriesStroke((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(renderAttributes6);
        org.junit.Assert.assertNull(stroke10);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.data.Range range7 = lineAndShapeRenderer2.findRangeBounds(categoryDataset6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = lineAndShapeRenderer2.getBaseURLGenerator();
        int int9 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(range7);
        org.junit.Assert.assertNull(categoryURLGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        int int8 = defaultShadowGenerator6.getDistance();
        double double9 = defaultShadowGenerator6.getAngle();
        int int10 = defaultShadowGenerator6.calculateOffsetY();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-10) + "'", int10 == (-10));
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
    public void test5839() throws Throwable {
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
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = keyedObjects2D0.getObject((java.lang.Comparable) (-1L), (java.lang.Comparable) "PlotEntity: tooltip = java.awt.Color[r=64,g=255,b=64]");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test5806() throws Throwable {
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
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        org.jfree.chart.JFreeChart jFreeChart5 = null;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent6 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) 1L, jFreeChart5);
        org.jfree.chart.JFreeChart jFreeChart7 = chartChangeEvent6.getChart();
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType8 = null;
        chartChangeEvent6.setType(chartChangeEventType8);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType10 = null;
        chartChangeEvent6.setType(chartChangeEventType10);
        org.jfree.chart.JFreeChart jFreeChart12 = null;
        chartChangeEvent6.setChart(jFreeChart12);
        org.junit.Assert.assertNull(jFreeChart7);
    }

    @Test
    public void test5863() throws Throwable {
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
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        lineAndShapeRenderer2.setBaseCreateEntities(false, false);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesShapesVisible((int) (byte) -1, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 100.0f, 0.2d, (double) (-1.0f), (double) (byte) 100);
        double double6 = rectangleInsets4.calculateTopInset((double) 10L);
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D8 = rectangleInsets4.createOutsetRectangle(rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test5791() throws Throwable {
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
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        java.awt.Font font6 = categoryAxis1.getTickLabelFont((java.lang.Comparable) "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryAxis1.setLabelInsets(rectangleInsets7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setLabelToolTip("java.awt.Color[r=255,g=255,b=255]");
        categoryAxis1.setUpperMargin((double) '#');
        int int9 = categoryAxis1.getMaximumCategoryLabelLines();
        java.lang.String str11 = categoryAxis1.getCategoryLabelToolTip((java.lang.Comparable) "DatasetRenderingOrder.FORWARD");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5798() throws Throwable {
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
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        double double7 = rectangleInsets4.getBottom();
        double double9 = rectangleInsets4.trimHeight((-1.0289271E7d));
        double double11 = rectangleInsets4.calculateRightInset(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0289282E7d) + "'", double9 == (-1.0289282E7d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5842() throws Throwable {
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
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        categoryAxis1.setMaximumCategoryLabelWidthRatio(0.0f);
        java.awt.Font font6 = categoryAxis1.getTickLabelFont((java.lang.Comparable) "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        categoryAxis1.setLabelURL("");
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = categoryAxis1.getTickLabelInsets();
        java.lang.Object obj10 = null;
        boolean boolean11 = rectangleInsets9.equals(obj10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateRightOutset((double) (short) -1);
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D10 = rectangleInsets4.createInsetRectangle(rectangle2D7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5790() throws Throwable {
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
    public void test5851() throws Throwable {
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
    public void test5756() throws Throwable {
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
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = standardCategorySeriesLabelGenerator1.generateLabel(categoryDataset2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5613() throws Throwable {
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
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        org.jfree.data.general.DatasetGroup datasetGroup5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.setGroup(datasetGroup5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'group' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int3 = defaultCategoryDataset0.getRowCount();
        java.lang.Comparable comparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeValue((java.lang.Comparable) (short) -1, comparable5);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        float float1 = categoryAxis0.getMinorTickMarkInsideLength();
        boolean boolean2 = categoryAxis0.isTickLabelsVisible();
        float float3 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        categoryAxis0.setTickMarkOutsideLength((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = categoryAxis0.getTickLabelInsets();
        double double7 = rectangleInsets6.getLeft();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test5876() throws Throwable {
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
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        barRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        double double5 = barRenderer0.getShadowXOffset();
        java.awt.Color color7 = org.jfree.chart.ChartColor.DARK_YELLOW;
        java.awt.Color color8 = color7.darker();
        barRenderer0.setSeriesItemLabelPaint(8, (java.awt.Paint) color7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        java.awt.Stroke stroke15 = lineAndShapeRenderer2.getItemOutlineStroke(3, 0, false);
        java.awt.Font font17 = lineAndShapeRenderer2.lookupLegendTextFont(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(font17);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        java.awt.Font font3 = categoryAxis1.getTickLabelFont();
        java.awt.Paint paint4 = categoryAxis1.getLabelPaint();
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) (byte) 1, "");
        double double8 = categoryAxis1.getFixedDimension();
        int int9 = categoryAxis1.getMaximumCategoryLabelLines();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        float float1 = categoryAxis0.getMinorTickMarkInsideLength();
        boolean boolean2 = categoryAxis0.isTickLabelsVisible();
        float float3 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        double double4 = categoryAxis0.getFixedDimension();
        java.lang.Object obj5 = categoryAxis0.clone();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray1 = org.jfree.chart.ChartColor.createDefaultPaintArray();
        java.awt.Stroke[] strokeArray2 = null;
        java.awt.Stroke[] strokeArray3 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Shape[] shapeArray4 = null;
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier5 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray0, paintArray1, strokeArray2, strokeArray3, shapeArray4);
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent6 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) paintArray1);
        org.junit.Assert.assertNotNull(paintArray0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(strokeArray3);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator6, true);
        boolean boolean10 = lineAndShapeRenderer2.isSeriesVisible(1);
        boolean boolean14 = lineAndShapeRenderer2.getItemCreateEntity(0, 0, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5777() throws Throwable {
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
    public void test5803() throws Throwable {
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
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.setValue((-1.0d), (java.lang.Comparable) (-5.0d), (java.lang.Comparable) 3);
        org.jfree.data.general.DatasetGroup datasetGroup8 = defaultCategoryDataset0.getGroup();
        java.lang.Object obj9 = defaultCategoryDataset0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(datasetGroup8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5616() throws Throwable {
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
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        keyedObjects2D0.clear();
        java.awt.Color color5 = org.jfree.chart.ChartColor.DARK_CYAN;
        boolean boolean6 = keyedObjects2D0.equals((java.lang.Object) color5);
        int int7 = keyedObjects2D0.getRowCount();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.trimWidth((double) (-10289251));
        double double8 = rectangleInsets4.calculateTopOutset(0.0d);
        double double10 = rectangleInsets4.calculateRightOutset((double) (short) 0);
        double double11 = rectangleInsets4.getRight();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0289271E7d) + "'", double6 == (-1.0289271E7d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5822() throws Throwable {
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
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        boolean boolean7 = lineAndShapeRenderer2.getItemVisible((int) (byte) 100, 0);
        lineAndShapeRenderer2.setBaseSeriesVisible(false, false);
        boolean boolean13 = lineAndShapeRenderer2.getItemShapeFilled((-10), 0);
        java.awt.Paint paint17 = lineAndShapeRenderer2.getItemPaint(0, (-16776961), false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        int int7 = categoryAxis1.getCategoryLabelPositionOffset();
        float float8 = categoryAxis1.getMinorTickMarkOutsideLength();
        java.awt.Font font9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        categoryAxis1.setLabelFont(font9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test5855() throws Throwable {
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
    public void test5852() throws Throwable {
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
    public void test5849() throws Throwable {
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
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        java.awt.Stroke stroke6 = categoryAxis1.getAxisLineStroke();
        double double7 = categoryAxis1.getLabelAngle();
        float float8 = categoryAxis1.getMinorTickMarkOutsideLength();
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test5890() throws Throwable {
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
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) 1);
        int int3 = keyedObjects2D0.getRowCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = keyedObjects2D0.getObject((int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        java.lang.String str3 = rectangleInsets0.toString();
        java.lang.String str4 = rectangleInsets0.toString();
        double double6 = rectangleInsets0.trimHeight((-1.0d));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str3, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str4, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-7.0d) + "'", double6 == (-7.0d));
    }

    @Test
    public void test5795() throws Throwable {
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
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateBottomInset(0.0d);
        double double4 = rectangleInsets0.trimWidth((double) '#');
        double double6 = rectangleInsets0.calculateTopInset((double) (byte) 100);
        double double7 = rectangleInsets0.getBottom();
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 29.0d + "'", double4 == 29.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = barRenderer0.getPositiveItemLabelPositionFallback();
        barRenderer0.setMinimumBarLength(0.0d);
        boolean boolean7 = barRenderer0.isSeriesItemLabelsVisible(8);
        barRenderer0.setItemMargin((double) 255);
        barRenderer0.setItemMargin((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5889() throws Throwable {
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
    public void test5895() throws Throwable {
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
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesVisible((int) (short) -1);
        boolean boolean11 = lineAndShapeRenderer2.getUseOutlinePaint();
        java.awt.Shape shape12 = lineAndShapeRenderer2.getBaseShape();
        lineAndShapeRenderer2.setBaseShapesFilled(true);
        java.awt.Stroke stroke16 = lineAndShapeRenderer2.getSeriesStroke(0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNull(stroke16);
    }

    @Test
    public void test5899() throws Throwable {
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
    public void test5805() throws Throwable {
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
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier0 = new org.jfree.chart.plot.DefaultDrawingSupplier();
        java.awt.Stroke stroke1 = defaultDrawingSupplier0.getNextOutlineStroke();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes(false);
        java.awt.Shape shape4 = renderAttributes3.getDefaultShape();
        boolean boolean5 = defaultDrawingSupplier0.equals((java.lang.Object) shape4);
        java.awt.Paint paint6 = defaultDrawingSupplier0.getNextPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test5828() throws Throwable {
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
    public void test5840() throws Throwable {
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
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getItemLabelGenerator((int) '#', 0, false);
        java.awt.Color color9 = java.awt.Color.darkGray;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color9, true);
        java.awt.color.ColorSpace colorSpace12 = color9.getColorSpace();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace12);
    }

    @Test
    public void test5864() throws Throwable {
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
    public void test5824() throws Throwable {
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
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 10);
        int int7 = categoryAxis1.getMaximumCategoryLabelLines();
        categoryAxis1.setTickMarkOutsideLength((float) 128);
        java.awt.Paint paint11 = categoryAxis1.getTickLabelPaint((java.lang.Comparable) (-16.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        double double2 = categoryAxis1.getFixedDimension();
        org.jfree.chart.plot.Plot plot3 = categoryAxis1.getPlot();
        java.lang.String str4 = categoryAxis1.getLabel();
        boolean boolean5 = categoryAxis1.isTickLabelsVisible();
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) 11, "ChartEntity: tooltip = ");
        java.awt.Paint paint9 = categoryAxis1.getAxisLinePaint();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        boolean boolean7 = legendItem6.isLineVisible();
        java.lang.Object obj8 = legendItem6.clone();
        legendItem6.setLineVisible(true);
        java.awt.Stroke stroke11 = legendItem6.getLineStroke();
        java.lang.String str12 = legendItem6.getLabel();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5819() throws Throwable {
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
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("ChartEntity: tooltip = GradientPaintTransformType.HORIZONTAL");
        org.jfree.data.UnknownKeyException unknownKeyException3 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException3);
        org.jfree.data.UnknownKeyException unknownKeyException6 = new org.jfree.data.UnknownKeyException("ChartEntity: tooltip = GradientPaintTransformType.HORIZONTAL");
        org.jfree.data.UnknownKeyException unknownKeyException8 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        org.jfree.data.UnknownKeyException unknownKeyException10 = new org.jfree.data.UnknownKeyException("AxisLocation.BOTTOM_OR_RIGHT");
        unknownKeyException8.addSuppressed((java.lang.Throwable) unknownKeyException10);
        unknownKeyException6.addSuppressed((java.lang.Throwable) unknownKeyException8);
        unknownKeyException3.addSuppressed((java.lang.Throwable) unknownKeyException8);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        java.lang.Comparable comparable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.addValue((java.lang.Number) 6.0d, comparable2, (java.lang.Comparable) "GradientPaintTransformType.CENTER_HORIZONTAL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'rowKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5874() throws Throwable {
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
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        keyedObjects2D0.clear();
        java.lang.Object obj5 = keyedObjects2D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable comparable7 = keyedObjects2D0.getColumnKey(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5718() throws Throwable {
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
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        boolean boolean9 = lineAndShapeRenderer2.getItemShapeVisible(0, 3);
        boolean boolean10 = lineAndShapeRenderer2.getBaseSeriesVisible();
        boolean boolean12 = lineAndShapeRenderer2.isSeriesVisible((int) (short) -1);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        float float1 = categoryAxis0.getMinorTickMarkInsideLength();
        boolean boolean2 = categoryAxis0.isTickLabelsVisible();
        java.awt.Paint paint3 = null;
        // The following exception was thrown during execution in test generation
        try {
            categoryAxis0.setLabelPaint(paint3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        boolean boolean5 = categoryAxis1.isVisible();
        java.awt.Font font7 = null;
        categoryAxis1.setTickLabelFont((java.lang.Comparable) (byte) 10, font7);
        double double9 = categoryAxis1.getLowerMargin();
        categoryAxis1.setMinorTickMarkInsideLength((float) (short) 0);
        java.lang.String str12 = categoryAxis1.getLabelToolTip();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5;
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor1 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE2;
        org.jfree.chart.text.TextAnchor textAnchor2 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        org.jfree.chart.text.TextAnchor textAnchor3 = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor1, textAnchor2, textAnchor3, (double) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor0, textAnchor2);
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertNotNull(itemLabelAnchor1);
        org.junit.Assert.assertNotNull(textAnchor2);
        org.junit.Assert.assertNotNull(textAnchor3);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(0);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        lineAndShapeRenderer2.setSeriesShapesFilled((int) ' ', (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (byte) -1, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test5869() throws Throwable {
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
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Stroke stroke7 = lineAndShapeRenderer2.getSeriesStroke(4);
        boolean boolean8 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(true);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getBasePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test5745() throws Throwable {
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
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation5 = null;
        org.jfree.chart.util.Layer layer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation5, layer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color4 = chartColor3.brighter();
        float[] floatArray9 = new float[] { 100.0f, 100, 10, (-10289251) };
        float[] floatArray10 = color4.getComponents(floatArray9);
        int int11 = color4.getAlpha();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[0.5411765, 0.19607843, 0.2901961, 1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[0.5411765, 0.19607843, 0.2901961, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 255 + "'", int11 == 255);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.String str7 = legendItem6.getToolTipText();
        legendItem6.setDescription("");
        legendItem6.setSeriesKey((java.lang.Comparable) (short) 100);
        legendItem6.setURLText("hi!");
        int int14 = legendItem6.getSeriesIndex();
        java.text.AttributedString attributedString15 = legendItem6.getAttributedLabel();
        legendItem6.setDatasetIndex((int) (short) 10);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(attributedString15);
    }

    @Test
    public void test5868() throws Throwable {
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
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        defaultCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = defaultCategoryDataset0.isSelected(8, (-1656));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test5834() throws Throwable {
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
    public void test5894() throws Throwable {
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
    public void test5881() throws Throwable {
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
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getSeriesStroke((int) '4');
        java.awt.Paint paint7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.setBaseFillPaint(paint7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(stroke6);
    }

    @Test
    public void test5760() throws Throwable {
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
    public void test5862() throws Throwable {
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
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.util.List list2 = keyedObjects2D0.getRowKeys();
        java.lang.Object obj3 = keyedObjects2D0.clone();
        keyedObjects2D0.clear();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects2D0.removeRow((java.lang.Comparable) "PlotEntity: tooltip = null");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (PlotEntity: tooltip = null) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test5814() throws Throwable {
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
    public void test5655() throws Throwable {
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
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.general.DatasetGroup datasetGroup0 = new org.jfree.data.general.DatasetGroup();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean5 = lineAndShapeRenderer3.isSeriesVisibleInLegend(1);
        java.awt.Font font6 = lineAndShapeRenderer3.getBaseLegendTextFont();
        boolean boolean7 = datasetGroup0.equals((java.lang.Object) font6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(font6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getLegendShape(0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        boolean boolean8 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation7);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator9, false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5921() throws Throwable {
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
    public void test5651() throws Throwable {
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
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(97, categoryURLGenerator10, false);
        java.awt.Font font14 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = lineAndShapeRenderer2.getSeriesURLGenerator((int) 'a');
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertNotNull(renderAttributes15);
        org.junit.Assert.assertNull(categoryURLGenerator17);
    }

    @Test
    public void test5922() throws Throwable {
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
    public void test5925() throws Throwable {
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
    public void test5871() throws Throwable {
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
    public void test5818() throws Throwable {
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
    public void test5638() throws Throwable {
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
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.jfree.chart.ChartColor chartColor5 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color6 = chartColor5.darker();
        org.jfree.chart.LegendItem legendItem7 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor5);
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", (java.awt.Paint) chartColor5);
        int int9 = legendItem8.getDatasetIndex();
        legendItem8.setSeriesIndex((int) ' ');
        java.awt.Stroke stroke12 = legendItem8.getLineStroke();
        java.lang.String str13 = legendItem8.getToolTipText();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5961() throws Throwable {
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
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.awt.Color color1 = java.awt.Color.BLUE;
        int int2 = color1.getRed();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator6 = new org.jfree.chart.util.DefaultShadowGenerator((int) (short) 10, color1, (float) 1L, 10, (double) 0L);
        double double7 = defaultShadowGenerator6.getAngle();
        java.awt.Color color8 = defaultShadowGenerator6.getShadowColor();
        int int9 = color8.getRGB();
        int int10 = color8.getAlpha();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-16776961) + "'", int9 == (-16776961));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 255 + "'", int10 == 255);
    }

    @Test
    public void test5926() throws Throwable {
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
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        int int4 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) (byte) 10);
        defaultCategoryDataset0.clearSelection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = defaultCategoryDataset0.getValue((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10L, (double) 100, (double) 10.0f, (double) (byte) 10);
        boolean boolean6 = rectangleInsets4.equals((java.lang.Object) (-1.0d));
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Rectangle2D rectangle2D10 = rectangleInsets4.createOutsetRectangle(rectangle2D7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5865() throws Throwable {
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
    public void test5866() throws Throwable {
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
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        int int3 = lineAndShapeRenderer2.getColumnCount();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator5);
        java.lang.Boolean boolean8 = lineAndShapeRenderer2.getSeriesShapesFilled((int) (byte) 0);
        boolean boolean9 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5554() throws Throwable {
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
    public void test5904() throws Throwable {
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
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 10, (double) 10, (double) 1L, 10.0d);
        double double6 = rectangleInsets4.calculateTopOutset((double) (byte) 0);
        java.lang.String str7 = rectangleInsets4.toString();
        double double9 = rectangleInsets4.calculateBottomOutset((double) (-1L));
        double double11 = rectangleInsets4.calculateBottomInset((double) (-7839));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]" + "'", str7, "RectangleInsets[t=10.0,l=10.0,b=1.0,r=10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = null;
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis2, categoryItemRenderer3);
        org.jfree.chart.util.ShadowGenerator shadowGenerator5 = categoryPlot4.getShadowGenerator();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot4.getRangeMarkers((-52), layer7);
        java.lang.Comparable comparable9 = null;
        categoryPlot4.setDomainCrosshairRowKey(comparable9);
        org.junit.Assert.assertNotNull(shadowGenerator5);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test5910() throws Throwable {
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
    public void test5783() throws Throwable {
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
    public void test5896() throws Throwable {
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
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator3 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator3);
        java.awt.Paint paint6 = lineAndShapeRenderer2.getSeriesOutlinePaint(0);
        java.awt.Font font8 = lineAndShapeRenderer2.lookupLegendTextFont((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        lineAndShapeRenderer2.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator10, true);
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseFillPaint();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test5948() throws Throwable {
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
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.incrementValue(1.0d, (java.lang.Comparable) 0, (java.lang.Comparable) 500);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint8 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Font font10 = null;
        lineAndShapeRenderer2.setBaseItemLabelFont(font10, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        java.lang.Boolean boolean15 = lineAndShapeRenderer2.getSeriesCreateEntities(52);
        lineAndShapeRenderer2.setBaseItemLabelsVisible(true, true);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test5827() throws Throwable {
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
    public void test5850() throws Throwable {
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
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        double double2 = rectangleInsets0.extendHeight((double) 10);
        java.lang.String str3 = rectangleInsets0.toString();
        double double5 = rectangleInsets0.calculateTopOutset((double) 1);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.0d + "'", double2 == 16.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]" + "'", str3, "RectangleInsets[t=3.0,l=3.0,b=3.0,r=3.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.0d + "'", double5 == 3.0d);
    }

    @Test
    public void test5929() throws Throwable {
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
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType2 = org.jfree.chart.event.ChartChangeEventType.GENERAL;
        java.lang.String str3 = chartChangeEventType2.toString();
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent4 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) 10.0f, jFreeChart1, chartChangeEventType2);
        java.lang.String str5 = chartChangeEvent4.toString();
        org.junit.Assert.assertNotNull(chartChangeEventType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChartChangeEventType.GENERAL" + "'", str3, "ChartChangeEventType.GENERAL");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.jfree.chart.event.ChartChangeEvent[source=10.0]" + "'", str5, "org.jfree.chart.event.ChartChangeEvent[source=10.0]");
    }

    @Test
    public void test5885() throws Throwable {
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
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.awt.Color color0 = java.awt.Color.WHITE;
        java.awt.image.ColorModel colorModel1 = null;
        java.awt.Rectangle rectangle2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.awt.geom.AffineTransform affineTransform4 = null;
        java.awt.RenderingHints renderingHints5 = null;
        java.awt.PaintContext paintContext6 = color0.createContext(colorModel1, rectangle2, rectangle2D3, affineTransform4, renderingHints5);
        float[] floatArray7 = null;
        float[] floatArray8 = color0.getComponents(floatArray7);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(paintContext6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test5934() throws Throwable {
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
    public void test5897() throws Throwable {
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
    public void test5905() throws Throwable {
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
    public void test5845() throws Throwable {
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
    public void test5744() throws Throwable {
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
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setTickLabelsVisible(false);
        double double5 = categoryAxis1.getLowerMargin();
        java.lang.String str6 = categoryAxis1.getLabelToolTip();
        java.awt.Color color7 = org.jfree.chart.ChartColor.VERY_DARK_RED;
        categoryAxis1.setTickLabelPaint((java.awt.Paint) color7);
        int int9 = color7.getBlue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.05d + "'", double5 == 0.05d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        keyedObjects0.clear();
        int int2 = keyedObjects0.getItemCount();
        int int3 = keyedObjects0.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            keyedObjects0.removeValue((-254));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5837() throws Throwable {
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
    public void test5938() throws Throwable {
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
    public void test5799() throws Throwable {
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
    public void test5848() throws Throwable {
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
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = defaultCategoryDataset0.getValue((java.lang.Comparable) ' ', (java.lang.Comparable) 5.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key ( ) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test5883() throws Throwable {
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
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        java.awt.Font font5 = lineAndShapeRenderer2.getBaseLegendTextFont();
        boolean boolean6 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Paint paint8 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        int int3 = objectList1.indexOf((java.lang.Object) "hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection4 = new org.jfree.chart.LegendItemCollection();
        boolean boolean5 = objectList1.equals((java.lang.Object) legendItemCollection4);
        boolean boolean7 = objectList1.equals((java.lang.Object) (-16.0d));
        java.lang.Object obj8 = objectList1.clone();
        java.lang.Object obj9 = objectList1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
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
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        defaultCategoryDataset0.setValue(0.05d, (java.lang.Comparable) (byte) 100, (java.lang.Comparable) 4);
        defaultCategoryDataset0.validateObject();
        int int8 = defaultCategoryDataset0.getColumnCount();
        java.util.List list9 = defaultCategoryDataset0.getColumnKeys();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test5968() throws Throwable {
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
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        keyedObjects2D0.clear();
        java.lang.Object obj2 = null;
        keyedObjects2D0.addObject(obj2, (java.lang.Comparable) 4.0d, (java.lang.Comparable) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = keyedObjects2D0.getObject((java.lang.Comparable) "{0}", (java.lang.Comparable) 14.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key ({0}) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        float float2 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.setMaximumCategoryLabelLines((int) (byte) 1);
        categoryAxis1.setMaximumCategoryLabelLines(10);
        java.lang.Object obj7 = categoryAxis1.clone();
        java.awt.Paint paint8 = categoryAxis1.getLabelPaint();
        java.awt.Paint paint9 = categoryAxis1.getAxisLinePaint();
        categoryAxis1.setTickMarksVisible(false);
        categoryAxis1.setLabelAngle((double) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        boolean boolean4 = legendItem1.isShapeVisible();
        java.awt.Font font5 = legendItem1.getLabelFont();
        java.lang.Comparable comparable6 = legendItem1.getSeriesKey();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(font5);
        org.junit.Assert.assertNull(comparable6);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("hi!");
        java.text.AttributedString attributedString2 = legendItem1.getAttributedLabel();
        boolean boolean3 = legendItem1.isShapeFilled();
        java.lang.String str4 = legendItem1.getDescription();
        java.lang.Object obj5 = legendItem1.clone();
        java.awt.Shape shape6 = legendItem1.getShape();
        java.awt.Shape shape7 = legendItem1.getShape();
        java.lang.Object obj8 = legendItem1.clone();
        org.junit.Assert.assertNull(attributedString2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5943() throws Throwable {
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
    public void test5945() throws Throwable {
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
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisibleInLegend(1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator(0, categoryURLGenerator6, false);
        java.awt.Color color9 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        java.awt.color.ColorSpace colorSpace10 = color9.getColorSpace();
        lineAndShapeRenderer2.setBaseFillPaint((java.awt.Paint) color9);
        java.awt.Font font13 = lineAndShapeRenderer2.getSeriesItemLabelFont(500);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(colorSpace10);
        org.junit.Assert.assertNull(font13);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int2 = defaultCategoryDataset0.getColumnIndex((java.lang.Comparable) 3.0d);
        java.util.List list3 = defaultCategoryDataset0.getColumnKeys();
        defaultCategoryDataset0.validateObject();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState5 = defaultCategoryDataset0.getSelectionState();
        int int7 = defaultCategoryDataset0.getRowIndex((java.lang.Comparable) "CategoryAnchor.MIDDLE");
        defaultCategoryDataset0.addValue((double) 5, (java.lang.Comparable) 128, (java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5846() throws Throwable {
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
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation3 = null;
        boolean boolean4 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation3);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("org.jfree.chart.ChartColor[r=97,g=35,b=52]");
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions2 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.removeCategoryLabelToolTip((java.lang.Comparable) true);
        float float5 = categoryAxis1.getTickMarkOutsideLength();
        java.lang.String str6 = categoryAxis1.getLabelToolTip();
        categoryAxis1.setCategoryMargin((-1.0289282E7d));
        org.junit.Assert.assertNotNull(categoryLabelPositions2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5952() throws Throwable {
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
    public void test5829() throws Throwable {
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
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.awt.Color color1 = java.awt.Color.GRAY;
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator((int) (byte) 0, color1, 1.0f, (-1), 10.0d);
        java.awt.image.BufferedImage bufferedImage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = defaultShadowGenerator5.createDropShadow(bufferedImage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test5879() throws Throwable {
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
    public void test5599() throws Throwable {
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
    public void test5928() throws Throwable {
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
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double0 = org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.0d + "'", double0 == 3.0d);
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
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.jfree.chart.ChartColor chartColor4 = new org.jfree.chart.ChartColor((int) 'a', (int) '#', (int) '4');
        java.awt.Color color5 = chartColor4.darker();
        org.jfree.chart.LegendItem legendItem6 = new org.jfree.chart.LegendItem("hi!", (java.awt.Paint) chartColor4);
        java.lang.Comparable comparable7 = legendItem6.getSeriesKey();
        boolean boolean8 = legendItem6.isShapeVisible();
        java.awt.Stroke stroke9 = legendItem6.getLineStroke();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(comparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke9);
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
    public void test5931() throws Throwable {
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
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("hi!");
        java.lang.Object obj2 = categoryAxis1.clone();
        java.awt.Font font3 = categoryAxis1.getTickLabelFont();
        java.awt.Paint paint4 = categoryAxis1.getLabelPaint();
        java.awt.Stroke stroke5 = categoryAxis1.getAxisLineStroke();
        float float6 = categoryAxis1.getMinorTickMarkInsideLength();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = categoryAxis1.getLabelInsets();
        categoryAxis1.setTickLabelsVisible(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test5610() throws Throwable {
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
    public void test5600() throws Throwable {
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
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        defaultCategoryDataset0.clear();
        defaultCategoryDataset0.clearSelection();
        // The following exception was thrown during execution in test generation
        try {
            defaultCategoryDataset0.removeRow(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 15, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5854() throws Throwable {
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
    public void test5794() throws Throwable {
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
    public void test5950() throws Throwable {
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
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(false, true);
        java.awt.Color color3 = java.awt.Color.BLUE;
        lineAndShapeRenderer2.setBaseItemLabelPaint((java.awt.Paint) color3);
        java.awt.Shape shape5 = lineAndShapeRenderer2.getBaseShape();
        java.awt.Stroke stroke6 = lineAndShapeRenderer2.getBaseOutlineStroke();
        boolean boolean7 = lineAndShapeRenderer2.getBaseItemLabelsVisible();
        boolean boolean8 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Color color6 = java.awt.Color.getColor("org.jfree.chart.event.ChartChangeEvent[source=1]", (int) (byte) 10);
        lineAndShapeRenderer2.setSeriesOutlinePaint((int) (byte) 10, (java.awt.Paint) color6);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint(97);
        boolean boolean10 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
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
    public void test6000() throws Throwable {
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
}
