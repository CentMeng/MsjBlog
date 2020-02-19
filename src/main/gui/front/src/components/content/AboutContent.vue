<template>
    <div class="article-content layout-content">
        <Row>
            <Col :xs="24" :sm="24" :md="24" :lg="24" :xl="17">
                <div class="layout-left">
                    <div class="about-content" style="padding:0;">
                        <ul class="myblog">
                            <div class="intro">
                                <h5>博客简介 | Blog：</h5>
                                <div class="intro_detail">
                                    <div>
                                        程&nbsp;序：基于SpringBoot开发的个人博客程序。 <span class="wb_url"><a
                                            href="https://github.com/CentMeng"
                                            target="_blank">GitHub</a></span><br>
                                        域&nbsp;名：www.bb.bj.cn，创建于2020<span class="wb_url"><a
                                            href="https://wanwang.aliyun.com/"
                                            target="_blank">注册域名</a></span><br>
                                        服务器：阿里云轻量级应用服务器(2G)<span class="wb_url"><a
                                            href="https://promotion.aliyun.com/ntms/yunparter/invite.html?userCode=3viaxu0k"
                                            target="_blank">购买空间</a></span><br>
                                        备案号：京ICP备 20004988<br>
                                    </div>
                                </div>
                                <h5>搭建博客目的 | Goal：</h5>
                                <div class="intro_detail">
                                    <div>
                                        &nbsp;&nbsp;&nbsp;&nbsp;计算机、互联网这一类的东西，很多很庞杂，要想全部记住是不可能的事。所以在上大学不久，我就使用为知笔记、有道云或者OneNote这些笔记工具记录自己的笔记，方便自己什么时候遗忘了，再拿起来看看，
                                        这是最开始的目的。随着接触互联网的东西越来越多，分享这个词在我的身边越来越多的被提及，CSDN、博客园等等博客网站出现在我的眼前，我开始觉得，自己写的东西，如果能够实实在在的帮助到别人，
                                        那才是我记录的意义。所以我一边在自己的小本本上记录，一边开始注册博客网站的账号，开始在网络上写博客。
                                        <hr>
                                        &nbsp;&nbsp; &nbsp;&nbsp;为什么开始做自己的网站，我记得有一天很晚了，我发现网络上关于某一块的知识很少，并不全面，我从下午一直写到了晚上，废寝忘食，晚上十点左右，我写完了，将博客发出去的时候，心里参数一口气。
                                        于是我开始把博客链接分享给别人，以为会对别人有帮助，结果发现404，我那时才知道原来CSDN的博客，竟然是要审核的，与此同时，CSDN网站的广告越来越多。
                                        <hr>
                                        &nbsp;&nbsp;&nbsp;&nbsp;于是我开始做自己的网站，当时好像才大二吧，我啥都不会，看着很多大神的个人博客网站花里胡哨，心有余而力不足。偶然间发现了HEXO这个静态博客，于是开始各种设计，各种DIY。在使用了快一年后，我发现了
                                        它的问题，由于是静态博客，编辑很不方便，需要自己在本地编辑，然后上传，由于是静态服务器托管在GitHub或者Coding，访问速度可想而知。于是有了您现在所看到的。<a href="https://centmeng.github.io" target="_blank">（原hexo搭建博客地址）</a>
                                      <hr>
                                        &nbsp;&nbsp;&nbsp;&nbsp;我不认为个人博客网站需要多漂亮美丽，“内涵”很重要，如果装饰的很花哨，而内容平平一般，我觉得博客分享的意义便不复存在。
                                    </div>
                                </div>
                            </div>
                        </ul>
                        <span class="ly_button"><a href="/leaveComment" target="_blank">留言</a></span>
                        <p class="ab_dubai">
                        <div class="intro">
                            <h5>个人简介 | Resume：</h5>
                            <div class="intro_detail">
                                <div>
                                    人物：孟少杰<br>
                                    性别：男<br>
                                    年龄：92后<br>
                                    身高：&lt; 2m<br>
                                    体重：&gt; 65kg<br>
                                    现居：中国·北京·朝阳<br>
                                    职业：Geeker<br>
                                    <span>注意：此处捡一些比较重要的说。</span><br>
                                    1、2010-2014 大连理工大学城市学院获得工学学士学位 毕业设计《时间胶囊》优秀毕业论文<br>
                                    2、2015-2019 北京航空航天大学软件学院获得工程硕士学位 毕业设计《基于微服务的在线教育平台设计与实现》 优秀通过<br>
                                    3、创过业，做过移动端负责人、后台负责人、技术经理、CTO。 <span class="wb_url"><a href="#project">详情</a></span></a><br>
                                </div>
                            </div>
                            <h5>编程理想 | Dream：</h5>
                            <div class="intro_detail">
                                <div>
                                    赋予使命感的去创业去工作，用代码change world。
                                </div>
                            </div>
                            <h5> 技术方向</a> | Technology：</h5>
                            <div class="intro_detail">
                                <div>
                                    1、SpringBoot、Maven、ZooKeeper、 thrift、KafKa、Docker、RocketMQ、Dubbo、 Redis、Swagger2、ElasticSearch<br>
                                    2、了解Hadoop、Storm、Spark、 HBase、Solr、Nginx<br>
                                    3、Android，JsBridge(仿照大神自写)、 ace-admin、Thymeleaf<br>
                                    4、机器学习算法、R、Python<br>
                                    5、其他技术正在学习中！唯一能持久的竞争优势是胜过竞争对手的学习能力。<br>
                                </div>
                            </div>
                            <h5 id="project">工作经验 | Project：</h5>
                            <div class="intro_detail">
                                <div>
                                    <span>注意：该处只介绍过往经验...</span><br>
                                    1、 北京罗藤银河网络科技有限公司，创业合作伙伴，技术入股，占有股份，因创业失败离职。主要职责:“指点”移动端负责人，前期独立开发 Android 项目，后期管理移动端团队并对 Android 产品优化。<br>
                                    2、国家电网电子商务有限公司，架构师+研发经理（管理20人）主要职责:负责公司互联网金融业务的架构改造和研发管理;负责电e宝移动端二代、三代架构搭建和规划及开发工作安排和调度。负责第三方中间件采购技术评估。<br>
                                    3、K12在线教育（在职中）<br>
                                </div>
                            </div>
                            <h5>兴趣爱好 | Hobby：</h5>
                            <div class="intro_detail">
                                <div>
                                    1、旅游，人一生要不行万里路，要不读万卷书<br>
                                    2、读书，夫所以读书学问，本欲开心名目，利于行耳<br>
                                    3、摄影，单反穷三代<br>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </Col>
            <Col :xs="24" :sm="24" :md="24" :lg="24" :xl="7">
                <div class="layout-right">
                    <Recommend/>
                    <Hot style="margin-top:15px;"/>
                    <TagWall style="margin-top:15px;"/>
                    <FriendLinks style="margin-top:15px;"/>
                </div>
            </Col>
        </Row>
    </div>
</template>

<script>
    import Recommend from "../../views/Recommend";
    import TagWall from "../../views/TagWall";
    import Hot from "../../views/Hot";
    import FriendLinks from "../../views/FriendLinks";

    export default {
        name: "AboutContent",
        components: {
            Recommend, TagWall, Hot, FriendLinks
        },
    }
</script>

<style lang="stylus" type="text/stylus" rel="stylesheet/stylus">
    @import "../../common/stylus/theme.styl";

    .about-content {
        line-height: 25px;
        margin-bottom: 30px;
        padding: 20px;
    }

    .intro {
        float: left;
        font-size: 14px;
    }

    .intro h5 {
        width: 60%;
        font-weight: bold;
        margin-top: 10px;
        float: left;
    }

    .intro hr {
        border: 0.5px dashed #ccc;
    }

    .intro_detail div {
        margin: 10px 0;
        float: left;
        padding: 10px 20px 10px 20px;
        color: #555;
        border-left: 4px solid #0cc;
    }

    .intro_detail .wb_url {
        margin: 0 10px;
    }

    .intro_detail .wb_url a {
        color: #1CA368;
    }

    .intro span {
        color: #ff3366;
    }

    .ab_box h3 {
        margin: 10px 0 10px;
        font-size: 18px;
    }

    .ab_box p {
        color: #666;
        margin-bottom: 5px
    }

    .avatar_pic img {
        width: 100%;
        border-radius: 50%;
    }

    .ab_dubai {
        margin-bottom: 15px;
        display: inline-block;
    }

    .ly_button {
        float: right;
        width: 100px;
        background: #000;
        text-align: center;
        border-radius: 3px;
        line-height: 30px
    }

    .ly_button a {
        color: #FFF
    }

</style>
