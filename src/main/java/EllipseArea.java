/**
 * Project name(项目名称)：作业_构造方法与对象创建之求椭圆面积
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/3
 * Time(创建时间)： 10:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

import java.text.DecimalFormat;

/**
 * 任务：已知椭圆的短半轴长为20.00，长半轴的长为15.50，计算椭圆面积。
 * 类名为：EllipseArea
 */

public class EllipseArea
{
// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码


// 创建一个名为 EllipseArea 的公开类


    // 定义椭圆的两个属性 ：短半轴长和长半轴长
    private double short_arbor;
    private double long_arbor;
    private static final double PI = 3.1415926;

// 定义一个显示有参构造方法，携带两个参数，分别表示为传来的短半轴的值和长半轴传来的值

    public EllipseArea()
    {

    }

    public EllipseArea(double short_arbor, double long_arbor)
    {
        if (short_arbor >= 0)
        {
            this.short_arbor = short_arbor;
        }
        else
        {
            this.short_arbor = 0;
        }
        if (long_arbor >= 0)
        {
            this.long_arbor = long_arbor;
        }
        else
        {
            this.long_arbor = 0;
        }
    }

    // 该方法实现将短半轴长和长半轴长分别初始化为携带的两个参数的值。

    public double getShort_arbor()
    {
        return short_arbor;
    }

    public void setShort_arbor(double short_arbor)
    {
        if (short_arbor >= 0)
        {
            this.short_arbor = short_arbor;
        }
        else
        {
            this.short_arbor = 0;
        }
    }

    public double getLong_arbor()
    {
        return long_arbor;
    }

    public void setLong_arbor(double long_arbor)
    {
        if (long_arbor >= 0)
        {
            this.long_arbor = long_arbor;
        }
        else
        {
            this.long_arbor = 0;
        }
    }

    // 定义一个方法，该方法实现计算椭圆的面积，并将其返回，返回值类型为double
    public double getArea()
    {
        return PI * this.short_arbor * this.long_arbor;
    }

    // 定义主方法
    public static void main(String[] args)
    {
        // 在主方法中通过有参构造方法实例化一个对象，将椭圆的短半轴的值和长半轴的值传入其中
        EllipseArea e = new EllipseArea(20.0, 15.5);

// 调用计算椭圆的面积的方法，计算该椭圆的面积
        double result;
        result = e.getArea();

// 将计算后的结果四舍五入保留两位小数后输出，输出格式为：椭圆形的面积为xx
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        System.out.println("椭圆形的面积为" + decimalFormat.format(result));
    }

}
