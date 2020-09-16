## Problem1

@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？



>首先，@Component是用来标注class为一个“component”的，是类级别的注解，功能类似的有像Controller、service等注解；而@Bean，在spring源码当中明确的说明为一个method级别注解，主要和@Configuration搭配使用，标注方法的返回值为bean，并且在过程当中使用工厂方法；

>第二，使用@Component注解标注的bean，可以理解为是“全自动化”交给了springIOC容器来进行生成和管理的，而使用@Bean得到的bean示例，则是由@Bean标注的方法的返回值提供的，在方法当中我们还可以进行一定程度的定制化，可以理解为“半自动化”的bean生成和管理；