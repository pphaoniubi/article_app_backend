package com.example.article_backend.ArticleClass;


import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;



@Service
public class ArticleService {
    private final List<Article> articles = new ArrayList<>();

    public ArticleService() {
        // Adding some hardcoded articles for demonstration
        articles.add(new Article(1L, "自信", LocalDate.parse("2024-09-08"), "自信，作为众多珍贵品质的其中之一\n" +
                "\n" +
                "那就来探讨探讨\n" +
                "\n" +
                "当我们说一个人很自信，我们是拿着怎样的一把尺子去测量的？\n" +
                "\n" +
                "刚进公司的你，什么也不会，见到领导要低头，请教同事要客气，那么你该如何自信\n" +
                "\n" +
                "刚进健身房的你，就是最细的那个，动作做的最差的那个，那么你该如何自信\n" +
                "\n" +
                "自信就像一个循环，强强关联，弱弱互补\n" +
                "\n" +
                "初入社会的你，在职场上屡屡碰壁。刚开始创业的你，客流量几乎为零。当你鼓起勇气去追求时，却换来一句“你是个不折不扣的好人”\n" +
                "\n" +
                "挫折与失败打击了你的自信心以及自尊心。所以下次付出行动的时候，你会变得更加小心翼翼，蹑手蹑脚。\n" +
                "\n" +
                "而付出行动时越放不开，你就越容易失败。而这次的失败再一次打击你的自信心和自尊心。\n" +
                "\n" +
                "从而进一步让你更加不敢再付出行动了。\n" +
                "\n" +
                "你想到，反正一直都是失败。那我做来干什么？\n" +
                "\n" +
                "You see, that's the catch\n" +
                "\n" +
                "You are not comfortable with failures. \n" +
                "\n" +
                "自信的这个循环可以被打破吗？\n" +
                "\n" +
                "当然可以\n" +
                "\n" +
                "你需要意识到，失败不可避免。\n" +
                "\n" +
                "每个人都会经历许许多多的挫折，是的，你也不例外。那么你能否习惯这些挫折\n" +
                "\n" +
                "人生顺利的时候，每个人都会很自信。你生意谈成了，变得很有钱。你交到了非常好看的男/女朋友，小日子一天天过的很滋润。\n" +
                "\n" +
                "这些都会让你觉得人间值得，自信心倍增\n" +
                "\n" +
                "但，在你失业的时候，在你一个人孤独寂寞的时候，你能否依然保持一个乐观积极的心态。能否保持一个稳定的内核。\n" +
                "\n" +
                "如果能，那这便是自信的一个体现。\n" +
                "\n" +
                "人生起起落落，起的时候，谁都会飘。但谁又可以在落的时候，稳稳当当的落下去？而不是一屁股坐地上，把屁股都给坐开花\n" +
                "\n" +
                "我想，衡量一个人是否自信的标准就是：\n" +
                "\n" +
                "他是否能平静的接受自己的短板，而这个短板是无法被改变的。身高，长相，原生家庭等等\n" +
                "\n" +
                "他是否能在失败的时候，平静处理，波澜不惊\n" +
                "\n" +
                "一个人的自信，以及内核的稳定性，就是在挫折中体现出来的。\n" +
                "\n" +
                "宝剑锋从磨砺出，梅花香自苦寒来\n" +
                "\n" +
                "一个人的成功越大，他以往的失败就越大\n" +
                "\n" +
                "想看一个人以后有多成功，你就看她现在正在受多大的苦难。\n" +
                "\n" +
                "宝剑锋利，是因为受过磨练。\n" +
                "\n" +
                "梅花它香，是因为受过严寒。\n" +
                "\n" +
                "而经过挫折打磨出来的内心，稳定且强大\n" +
                "\n" +
                "想打破自信循环的话，就去拥抱失败吧。在失败中吸取教训，在失败中建立自信\n" +
                "\n" +
                "当你越练越大的时候，你就会慢慢的变得自信\n" +
                "\n" +
                "当你用了数年去提升你的硬实力，你就会慢慢地变得自信。\n" +
                "\n" +
                "但在此之前，你一定会失败，你会看到别人写的代码跑起来嘎嘎快。而你的屎山代码就是垃圾。\n" +
                "\n" +
                "但是不怕，来日方长\n" +
                "\n" +
                "因为，自我提升之路没有终点。\n" +
                "\n" +
                "只要你想，你就可以找到下一个可以突破的地方。"));
        articles.add(new Article(2L, "鲜花", LocalDate.parse("2024-08-23"), "最近不知道写什么\n" +
                "\n" +
                "那就来写写在男追女框架下的一个心态\n" +
                "\n" +
                "自从2022年以来，我广泛阅读了，关于两性吸引的各种书籍。以及自己亲身实践的经历。\n" +
                "\n" +
                "不可否认，2年间的积累，我获得了大量的知识，心态，以及认知，其中很大一部分都非常有用。\n" +
                "\n" +
                "我也将它们放到了实践上面，也确实得到了意象不到的结果。\n" +
                "\n" +
                "但是\n" +
                "\n" +
                "唯有一个心法，让我觉得所有的调情技巧，以及建立人设等等。都毫无作用\n" +
                "\n" +
                "所谓心法，是由内向外的。想要掌握心法，你需要改变你的内在。\n" +
                "\n" +
                "而改变内在，并不像改变外在那样简单。\n" +
                "\n" +
                "换个发型，换个穿搭，一夜之间，你就可以变帅以及变美很多。\n" +
                "\n" +
                "但内在的变化，需要数年的历练。\n" +
                "\n" +
                "这套心法很难用语言描述出来，所以我想从几个方面下手，把它解释明白\n" +
                "\n" +
                "Friendzone -- 朋友圈\n" +
                "\n" +
                "朋友圈指的是，一边倒吸引。一方对一方感兴趣，另一方则对另一方毫无感觉。\n" +
                "\n" +
                "我看过很多教你如何避免，以及逃出Friendzone的文章。\n" +
                "\n" +
                "这些文章的标题包含了：\n" +
                "\n" +
                "她以前很热情，但现在冷淡你了，你该怎么做才能将关系恢复以前？\n" +
                "\n" +
                "女生总是找借口拒绝你的邀约，你该怎么办？\n" +
                "\n" +
                "等等等等\n" +
                "\n" +
                "总结一句话就是，你喜欢她，但她不喜欢你怎么办。\n" +
                "\n" +
                "到底该怎么办？\n" +
                "\n" +
                "我并不打算帮你解决这个问题，因为，这个问题始终是无解的。但我要教的是你该如何去接受现实\n" +
                "\n" +
                "我很喜欢成真恋爱学里的一句话：（是，我会去看所谓的恋爱学书籍）\n" +
                "\n" +
                "“最成功的挽回，就是不挽回。”\n" +
                "\n" +
                "当一个人下定决心要离你而去时，那个人一定是深思熟虑了很久很久的。因为你们爱过。在她深思熟虑的时候，她也经历着痛。只是你不知道而已。\n" +
                "\n" +
                "所以，此时此刻。你要做的就是，为她敞开大门，轻声的说一句：“走吧”\n" +
                "\n" +
                "没错，或许此时此刻你比她更痛。那又怎样？这依然改变不了一个事实\n" +
                "\n" +
                "那就是，你根本就留不住一个决心要走的人，即便你心底里一万个不愿意她走\n" +
                "\n" +
                "不论如何，你尊重他的选择，所以\n" +
                "\n" +
                "你不去挽留。\n" +
                "\n" +
                "对此，我想概括Mark书里说的一段话。\n" +
                "\n" +
                "我见过男人干的最蠢的事不是，在错误的时间去进行肢体升级，也不是在不该暴露需求感的时候去暴露需求感。\n" +
                "\n" +
                "而是，使出浑身解数，尝试去让一个不喜欢自己的女生喜欢自己。\n" +
                "\n" +
                "Mark对于这个行为评论到，你看过一个电影吗？\n" +
                "\n" +
                "对，就是那个Mission Impossible。\n" +
                "\n" +
                "所以，当面对一个将要离你而去的人，以及从来就不喜欢你的人，你要做的事就是：\n" +
                "\n" +
                "回归自我。\n" +
                "\n" +
                "这就是我想讨论的下一点。\n" +
                "\n" +
                "Self-Improvement\n" +
                "\n" +
                "我被很多女生拒绝过很多次。起初，我很伤心，喝了很多酒，烟倒是不抽，健身房咔咔就是干。\n" +
                "\n" +
                "后来慢慢的，我学会了回归自己\n" +
                "\n" +
                "回归自我指的是，不再去向外求，永远去向内求。\n" +
                "\n" +
                "你不在去祈求任何人喜欢你，你不在去祈求任何公司录用你。\n" +
                "\n" +
                "那么你该干嘛呢。去想今天有没有看书提高认知，有没有去健身房锻炼，有没有提高你的技术实力。\n" +
                "\n" +
                "向内求完全可控，你可以选择看书或者不看。你可以选择提高还是不提高你的硬实力，这都是你自己的选择\n" +
                "\n" +
                "向外求就完全不可控了，你再优秀，也一样有人讨厌你，因为讨厌你与否，是别人的选择\n" +
                "\n" +
                "所以，这就证明了回归自我的重要性。\n" +
                "\n" +
                "外人怎么看我，外人喜不喜欢我。无所谓，因为我根本就控制不了。脑子长在别人身上，我完全没法控制。\n" +
                "\n" +
                "我能控制的，就是我到底是提升还是不提升自己。\n" +
                "\n" +
                "渐渐的，被女生拒绝的次数多了之后，我懂了什么叫回归自我\n" +
                "\n" +
                "被女人拒绝，你需要做到以下3个不：\n" +
                "\n" +
                "不解释 -> 不会因为被拒绝而感到难堪，去解释从而挽回自己的颜面。没必要，我大胆的表达对你的喜爱，也可以大胆的在你拒绝的时候抽离。\n" +
                "\n" +
                "2. 不纠缠 -> 我尊重你的一切选择，不会给你一丁点压力，宝贝 <3  ;) \n" +
                "\n" +
                "3. 不对抗 -> 一样的道理，我尊重你的一切选择。你说啥就是啥\n" +
                "\n" +
                "不管是1还是2还是3，如果你去解释，纠缠，对抗，那你就是在浪费你的时间。你拿这些时间去提升自我不好吗？\n" +
                "\n" +
                "很简单的道理，一个女生已经不喜欢你了，你解释的越多，纠缠的越多，对抗的越多，只会把她越推越远。\n" +
                "\n" +
                "她拒绝了，你当然要尊重她的选择，但不必多想，毕竟她的选择你无法控制。\n" +
                "\n" +
                "转念之间，你应该去思考今天练背需要哪几个动作。还有你的硬拉怎么还没上140，是不是阳痿了哥们。\n" +
                "\n" +
                "这就是回归自我。\n" +
                "\n" +
                "最后，\n" +
                "\n" +
                "“你若盛开，蝴蝶自来”\n" +
                "\n" +
                "你是鲜花，还是牛粪？\n" +
                "\n" +
                "在夜晚，你落下了无声的泪，问到，为什么没有一个人喜欢你\n" +
                "\n" +
                "在写字楼楼下，你失落的看着你的简历，问到，为什么没有一家公司要你\n" +
                "\n" +
                "在咖啡店门外，你低下头看着你的合同，问到，为什么没有一个人买你的产品\n" +
                "\n" +
                "如果...\n" +
                "\n" +
                "如果，你练得一手好身材，弹得一手好吉他，哄起人来，一个比一个开心，那么怎么会没人喜欢你？\n" +
                "\n" +
                "只不过，你并不是鲜花，你只是牛粪。你并没有强壮的身体，说话时还不经意间伤人。那，谁又会喜欢你？\n" +
                "\n" +
                "如果，你前后端交互，了解的非常透彻。熟悉各大框架，怎么会没公司要你？\n" +
                "\n" +
                "只不过，你并不是鲜花，你只是牛粪。你并不拥有合格的资质。\n" +
                "\n" +
                "如果，你的产品可以给客户带来超高的性价比以及实用性，那么怎么会没有客户跟你签合同？\n" +
                "\n" +
                "只不过，你并不是鲜花，你只是牛粪。你的产品并不能给他们带来任何利益\n" +
                "\n" +
                "那么，\n" +
                "\n" +
                "你到底是鲜花，还是牛粪？\n" +
                "\n" +
                "或许这才是我们应该是思考的问题"));
        articles.add(new Article(3L, "身体健康", LocalDate.parse("2024-08-04"), "你是否想获得更好的生活，是否想获得更多的成就。\n" +
                "\n" +
                "如果是的话，那么就不得不提起健康\n" +
                "\n" +
                "本篇文章：\n" +
                "\n" +
                "身体健康与心理健康\n" +
                "\n" +
                "- 健康\n" +
                "\n" +
                "健康实在是不能被忽视，你可以什么都没有。没钱，那就赚。没朋友，那就去结交。没了健康，那你的阳寿将会大打折扣。\n" +
                "\n" +
                "An apple a day, keep the doctors away\n" +
                "\n" +
                "很多时候，我认为，你所有的成就，都离不开你健康的身体\n" +
                "\n" +
                "如果你器官衰竭，你怎么会有余力去思考如何赚钱？\n" +
                "\n" +
                "如果你患有精神疾病，你怎么有能力去自理你的生活？\n" +
                "\n" +
                "如果你各项医学指标超高，你怎么去享受生活？\n" +
                "\n" +
                "健康，永远是第一，而一个好的生活习惯，决定你是否拥有一个健康的身体。\n" +
                "\n" +
                "一个健康的身体，也是吸引异性的关键因素之一。\n" +
                "\n" +
                "你这个人阳光，成熟，身材好，有腹肌，那么即便你长相差点，我相信你的异性缘不会太差。\n" +
                "\n" +
                "关于腹肌吸引人这个问题，我思考了良久，直到我在网上看到了一段话，是这么说的。\n" +
                "\n" +
                "想练出腹肌，你需要拥有一套规律的饮食习惯，长期吃健康食品，少油少糖，高蛋白。\n" +
                "\n" +
                "在此之上，你需要在健身房里有一套规律的训练计划，并且长期坚持。\n" +
                "\n" +
                "那么拥有这两个习惯的人，将来患有疾病的风险会大大降低。无氧运动增强你的骨骼肌肉的密度与强度。规律饮食使你减少肥胖疾病的风险，脂肪肝，心血管疾病。\n" +
                "\n" +
                "不论是什么，你的这些习惯都是健康的表现。\n" +
                "\n" +
                "而拥有腹肌，就是这一切的证明，你这个人极其的自律，想要达到这种程度的自律，你需要极高的精神强度。\n" +
                "\n" +
                "那么想要获得良好的身体，需要做到以下几点\n" +
                "\n" +
                "1. 足够的睡眠，以及较高的睡眠质量\n" +
                "\n" +
                "如果你要我去写一篇关于睡觉的好处的文章，我能写100万字。\n" +
                "\n" +
                "如果你要我去写一篇关于睡觉的坏处的文章，我一个字写不出。\n" +
                "\n" +
                "深度睡眠会强化你的记忆，如果你当天获得了新知识，那么好的睡眠就会帮助你强化它。\n" +
                "\n" +
                "反之，差的睡眠，会使你遗忘。\n" +
                "\n" +
                "如果你健身，也是一样的道理，肌肉是在睡眠时增长的。如果你没有较好的睡眠质量，那么，肌肉就得不到恢复。从而影响你的健身成果。\n" +
                "\n" +
                "睡眠可以弱化你的精神创伤，这个过程发生在做梦期间。睡得越多，弱化的程度越大。\n" +
                "\n" +
                "上面这3个效果的前提都是你的睡眠质量和时长必须达标，否则一切都是空谈。\n" +
                "\n" +
                "睡眠的质量好坏很大程度上决定你的健康程度\n" +
                "\n" +
                "不论如何，利用好睡眠。睡眠是你作为人自带的功能。\n" +
                "\n" +
                "更何况，同志，你一生里1/3的时间都躺在床上睡觉。所以睡眠不可被忽视。\n" +
                "\n" +
                "2. 多喝水\n" +
                "\n" +
                "多喝水，会加速新陈代谢，从而更快的排除体内垃圾，燃烧脂肪。\n" +
                "\n" +
                "3. 运动\n" +
                "\n" +
                "无氧运动减少骨质疏松的风险，有氧运动提高心肺功能，控制体重，减少心血管疾病等等，不用多说了\n" +
                "\n" +
                "4. 关于健康的饮食习惯，也就不用多说了\n" +
                "\n" +
                "以上是身体健康。身体健康是一切的根基。\n" +
                "\n" +
                "那么建立在身体健康之上的便是，心理健康。\n" +
                "\n" +
                "心理健康虽说重要，但远远不及身体健康。因为，健康的心理，始终是建立在健康的身体上的。\n" +
                "\n" +
                "你是否能做到，痛而不言，惊而不乱，遇事不慌，冷静处理？\n" +
                "\n" +
                "你是否能做到，平静的接受自己不足，是自己的错，就勇敢承担责任\n" +
                "\n" +
                "而不是，遇到点小事就抱怨，为什么自己这么不幸，为什么坏事总发生在自己头上。\n" +
                "\n" +
                "也不是，不敢面对自己脆弱的一面，面对自己的缺点，面对真实的自己\n" +
                "\n" +
                "想要做到这些都是需要你有较强的心理韧性与强度。这也是成熟的表现。\n" +
                "\n" +
                "那么如何在心理上获得健康？\n" +
                "\n" +
                "想要在心理上获得韧性以及强度。我想，唯一的方法就是，去受挫，去付出行动，然后感受失败的滋味。感受被打倒在地，爬不起来的滋味。\n" +
                "\n" +
                "肌肉力量是磨练出来的，精神力量也是一样的。你需要给你的精神上强度，如果你每天过的无忧无虑的，感受不到世间疾苦，那么你的精神力怎么才能得到锻炼？\n" +
                "\n" +
                "为什么很多人情绪稳定？很简单不是吗，因为经历过很多次痛，自己抗过来了，所以在遇到相同挫折的时候也自然就没那么多情绪波动了，一切都看淡了。\n" +
                "\n" +
                "想要达到情绪稳定，就必须经历很多次情绪崩溃。\n" +
                "\n" +
                "在繁衍上，健康的人会被优先选择。不健康的人则会被淘汰。\n" +
                "\n" +
                "我承认，当今社会，有钱有权才是王道。\n" +
                "\n" +
                "我说的这些，不如别人开辆法拉利到你家楼下接你，也不如别人告诉你他爸是广州市副市长。\n" +
                "\n" +
                "但我想，不论是钱还是权，依然和生存以及健康挂钩。因为你的健康得到了保障。\n" +
                "\n" +
                "有钱代表了在你生病的时候有足够的资金去支撑。\n" +
                "\n" +
                "有权代表了，在你卧床不起的时候，他可以动用关系请到顶级医疗团队。\n" +
                "\n" +
                "人都是自私的，谁能给他利益，他就会跟谁走。谁能保障他的健康以及生存，他就会跟谁走。\n" +
                "\n" +
                "放到以前，谁打猎能力强，谁身体强壮，谁存的肉多，谁就有优先权。\n" +
                "\n" +
                "放到现在，在这个钱能换来一切东西的时代。LV，巴黎世家，保时捷，顶级医疗资源。谁有更多的钱，谁就有优先权。\n" +
                "\n" +
                "不论是哪个时候，谁能给你提供最多的生存保障，你就会跟谁\n" +
                "\n" +
                "因为归根到底，动物的唯一目标就是生存下去，越久越好\n" +
                "\n" +
                "最后，不管怎样，物竞天择，强者生存。不论在原始部落，还是现代社会，弱肉强食始终唯一，弱者终究会被淘汰。强者终究会脱颖而出。"));
        articles.add(new Article(4L, "Vulnerability", LocalDate.parse("2024-07-28"), "在两性吸引上有这么一个概念\n" +
                "\n" +
                "算的上是一支良剂，良剂虽苦，但非常的有效\n" +
                "\n" +
                "只不过，你需要数年的历练。\n" +
                "\n" +
                "但我相信，它不仅能在两性吸引上给你带来帮助，也能帮助你成为一个更好的人\n" +
                "\n" +
                "Vulnerablility - 脆弱面\n" +
                "\n" +
                "脆弱面是指，当你对一个人产生好感时，你毫无遮拦的表达出去\n" +
                "\n" +
                "但是，你的行为必须尊重个人边界并且礼貌\n" +
                "\n" +
                "“我很喜欢你笑的样子”\n" +
                "\n" +
                "“月光下的你很美”\n" +
                "\n" +
                "“我很想见你”\n" +
                "\n" +
                "那么这么去做，你就展示了你的脆弱面\n" +
                "\n" +
                "因为你把自己放到了一个可以被拒绝的位置上\n" +
                "\n" +
                "而宝贝，没人喜欢被拒绝\n" +
                "\n" +
                "是什么样的人可以主动把自己放在一个可以被拒绝的位置上？\n" +
                "\n" +
                "一个自信的人，他们的内心坚定且强大，不会因为外界的否定而坍塌\n" +
                "\n" +
                "一个成熟的人，他们懂得喜欢你是我的事，而你接受或拒绝不在他们的控制范围内，无论结果如何，他们都坦然接受\n" +
                "\n" +
                "一个勇敢的人，他们不是喜欢躲躲藏藏的胆小鬼，喜欢就表达出来，即便得不到想要的回应\n" +
                "\n" +
                "无论是哪种，我想都是有吸引力男人的标志，他们想要什么，就去争取，不会因为害怕被拒绝而当缩头乌龟\n" +
                "\n" +
                "那么，你展示了脆弱面，这很好，但不够，你的动机必须单纯而且不求回报\n" +
                "\n" +
                "当你表达出你的好感的时候，你必须传达出一个潜沟通\n" +
                "\n" +
                "那就是，你可以做出任何回应，我都能全盘接受，并尊重你的回应\n" +
                "\n" +
                "这些回应包括：\n" +
                "\n" +
                "接受，待定，拒绝，或者无回应，即无视你的好感表达\n" +
                "\n" +
                "不论是哪种，如果以前你们是朋友，那就继续当朋友，如果你们以前是同学，那就继续当同学\n" +
                "\n" +
                "那么，关于动机单纯\n" +
                "\n" +
                "你所有行为的动机，必须单纯。\n" +
                "\n" +
                "你做的所有事的动机必须只有一个，那就是你想。\n" +
                "\n" +
                "你想称赞她温柔，优雅，美丽，动人，仅仅是因为你想。\n" +
                "\n" +
                "如果你称赞她是因为想博得她的好感，那这个是不被允许的\n" +
                "\n" +
                "这个概念并不是只能应用到两性吸引上，它可以应用到很多关系上。\n" +
                "\n" +
                "如果你是个自私的人\n" +
                "\n" +
                "say so\n" +
                "\n" +
                "如果你是个喜欢走歪门邪道的人\n" +
                "\n" +
                "say so\n" +
                "\n" +
                "当朋友触及到你底线的时候，说出来，礼貌且尊重边界地说出来\n" +
                "\n" +
                "即便你知道她可能会翻脸，觉得你矫情\n" +
                "\n" +
                "但你依然把你真实的想法说了出来。\n" +
                "\n" +
                "但这容易吗？暴露自己的脆弱面容易吗？\n" +
                "\n" +
                "有多少人隐藏自己的真实想法不敢表达？仅仅是因为害怕被周围的人批判。\n" +
                "\n" +
                "很简单的一个道理，如果你躲躲藏藏，你就永远不会受到批判，当然了，你也永远不会得到成长\n" +
                "\n" +
                "如果你是一个勇敢的人，那么你就有勇气主动把自己放在一个可以被他人批判的位置。也就是暴露自己\n" +
                "\n" +
                "很喜欢知名作者的话，我依然会定期发布我的文章，即便我知道会有很多人讨厌我的观点，会批判我，会发email诋毁我\n" +
                "\n" +
                "但同时也会有很多人认同我的观点，并且从我的文字中学到新知识。\n" +
                "\n" +
                "最后举3个例子Vulnerablility的例子：\n" +
                "\n" +
                "月光下的她很美，你忍不住波动了她的头发，说到：“我很喜欢月亮下的你”，他露出了惊恐的表情。即便如此，你并不为你的进攻感到后悔\n" +
                "\n" +
                "-Vulnerable\n" +
                "\n" +
                "你很想告诉她，你并不喜欢他在你面前说这种没礼貌的话，但你怕跟她说了会让她讨厌你\n" +
                "\n" +
                "-Non-vulnerabale/Hiding\n" +
                "\n" +
                "你很想拥抱她，但你害怕她会厌恶抗拒，所以你呆呆的站在他面前，什么也不做\n" +
                "\n" +
                "-Non-vulnerable/Hiding"));
        articles.add(new Article(5L, "查理的漠不关心", LocalDate.parse("2024-05-26"), "\"The subtle art of not giving a fuck\"\n" +
                "\n" +
                "《漠不关心的精妙艺术》\n" +
                "\n" +
                "这本书以Charles Bukowski开头，Charles是一个彻头彻尾的Fucking Loser。\n" +
                "\n" +
                "查理是个作家，一个这辈子没有一个出版社跟他签合约的作家。每天晚上坐在打字机前，喝着小酒，写着文章，直到断片。30年都是如此，从没变过。\n" +
                "\n" +
                "不可否认，查理这一生没有成功过一次。在旁人看来，这个人是一个败类。一个社会的毒瘤。对社会百害无一利。\n" +
                "\n" +
                "为什么这么一个人会被拿来做一本书的开头？\n" +
                "\n" +
                "因为查理最后成功了吗？\n" +
                "\n" +
                "查理最后真的成功了吗？\n" +
                "\n" +
                "查理最后确实成功了\n" +
                "\n" +
                "最终有一个出版社签了他。他成功出版了他的第一本书，“Post Office”\n" +
                "\n" +
                "在1971年的美国，这本书销售了200万册。在当时，这是一个相当不错的成绩\n" +
                "\n" +
                "他成功与否，不是重点。在他的身上有一个品质，非常宝贵\n" +
                "\n" +
                "他看着自己最黑暗的那一面，耸了耸肩，说到：“好吧，这就是我”\n" +
                "\n" +
                "这句话翻译一下就是，\n" +
                "\n" +
                "“是，我沉迷女色，沉迷酒精，我每天不是找鸡，就是喝到断片。”\n" +
                "\n" +
                "“是，我写的文章别人看了都觉得恶心，觉得我是彻头彻尾的败类。”\n" +
                "\n" +
                "“别人都觉得我应该去死，因为我是社会的毒瘤。”\n" +
                "\n" +
                "最后，他说到：“对，这就是我，我是查理”\n" +
                "\n" +
                "查理从来没有去尝试改变什么。他没有尝试去改变任何人的看法。你们觉得我是Loser，好，那我就是Loser。\n" +
                "\n" +
                "你们觉得我是彻头彻尾的Loser，好，那我就是彻头彻尾的Loser\n" +
                "\n" +
                "他也没有尝试改变自己的生活，日复一日，不是找鸡就是喝酒。他没有去改变生活现状。\n" +
                "\n" +
                "最终，在查理的墓碑上刻着：\n" +
                "\n" +
                "Don't try.\n" +
                "\n" +
                "查理毫无保留的接受了自己最阴暗的那一面，他不仅毫无保留地接受了，还把他的失败写成一本书。\n" +
                "\n" +
                "读者们震惊了，一个人竟然这么毫无保留地把自己的失败写出来。写出一本卖了200万册的书。\n" +
                "\n" +
                "我们每个人是否能做到像他这样坦荡。\n" +
                "\n" +
                "“是，很多时候我很自私”\n" +
                "\n" +
                "“是，在女生这方面我一窍不通”\n" +
                "\n" +
                "“是，我的脑子转的没别人快”\n" +
                "\n" +
                "“是，我学习就是学不过别人”\n" +
                "\n" +
                "“对，没错，这就是我”\n" +
                "\n" +
                "事实上，查理从未关心过成功。在他出版“Post Office”之后，依然在读者联谊会上辱骂读者，不但如此，他还在出会之前喝的烂醉。\n" +
                "\n" +
                "他打心底里的知道，自己就是个Loser。\n" +
                "\n" +
                "人生在世，我们的能关注的事情少之又少\n" +
                "\n" +
                "当你对于人生的逆境做到得之坦然，失之淡然，忽然间，你觉得自己特别自由，不再被任何东西束缚\n" +
                "\n" +
                "也正是你对人生逆境做到了漠不关心，你才有能力把你宝贵的精力用在真正重要的事上。\n" +
                "\n" +
                "你的朋友，你的事业，你的健康\n" +
                "\n" +
                "这也正是漠不关心的精妙艺术\n" +
                "\n" +
                "“人们看不起我就看不起我吧”\n" +
                "\n" +
                "“Crush跟别人跑了就跟别人跑吧”\n" +
                "\n" +
                "你再也不会活在别人期待里\n" +
                "\n" +
                "真正的自由，需要有被讨厌的勇气。像查理那样，社会上的人都对他嗤之以鼻。\n" +
                "\n" +
                "但他关心过吗\n" +
                "\n" +
                "从未关心过\n" +
                "\n" +
                "因此，查理是个自由的人"));
        articles.add(new Article(6L, "复利", LocalDate.parse("2023-12-27"), "好久没再次提起习惯了\n" +
                "\n" +
                "那就来探讨一下吧\n" +
                "\n" +
                "说到习惯，那我就不得不引出一个非常重要的概念\n" +
                "\n" +
                "复利\n" +
                "\n" +
                "什么是复利？\n" +
                "\n" +
                "复利指的是一种增长趋势，这个趋势在前期非常缓慢，但到了一个时间拐点，它就会以指数增长\n" +
                "\n" +
                "那么这里面最重要的一个变量：\n" +
                "\n" +
                "时间\n" +
                "\n" +
                "时间必须流失的过多，结果才会显现\n" +
                "\n" +
                "这也恰恰证实了一点，你前期会付出很多努力却见不到效果。\n" +
                "\n" +
                "这不是因为你不够努力，只是因为时间这个变量没有积累到一定程度\n" +
                "\n" +
                "当你抱怨为什么我看了这么多书，还是不见认知上涨\n" +
                "\n" +
                "原因就是时间跨度不够长\n" +
                "\n" +
                "在你抱怨好习惯的同时，也应该反过来思考\n" +
                "\n" +
                "坏习惯也是一样的，你每天都在抽很多烟，身体依然没有发生太多的变化，难道不是吗？\n" +
                "\n" +
                "但只要时间跨度拉长到数年以后就说不定了\n" +
                "\n" +
                "如果你以后肺出现问题，你现在抽的每一根烟，都免不了责任。\n" +
                "\n" +
                "同理，当你以后行如流水的弹唱着斑马斑马，都离不开你现在按下的每一个和弦，弹响的每一根弦。\n" +
                "\n" +
                "你要问，这么微小的习惯究竟有什么意义？\n" +
                "\n" +
                "这些习惯小到你做了根本带来不了任何改变\n" +
                "\n" +
                "答案便是，为了更好的以后。\n" +
                "\n" +
                "这就是复利\n" +
                "\n" +
                "你现在做的所有微小的行为，对当下都毫无影响，但却为以后打下牢固的基础\n" +
                "\n" +
                "这也解释了为什么人总是重复着坏习惯\n" +
                "\n" +
                "因为坏习惯会奖励当下，在未来惩罚你。\n" +
                "\n" +
                "喝酒导致以后肝硬化，是以后。\n" +
                "\n" +
                "抽烟导致以后肺癌，也是以后\n" +
                "\n" +
                "人的大脑遵循着一套规律，及时满足，当下满足了就行，至于以后，管他呢\n" +
                "\n" +
                "这也恰恰证明了，建立好习惯也是相当的不容易。\n" +
                "\n" +
                "你吃一次减脂餐，不见体重降低。去一次健身房，不见肌肉长。\n" +
                "\n" +
                "所有的这些都是在当下惩罚你，在以后奖励你。\n" +
                "\n" +
                "你以后的好身材，都离不开你现在去的每一次健身房，吃的每一次减脂餐。\n" +
                "\n" +
                "这也就是复利，复利仅仅是一个增长趋势，这可以是好的增长，也可以是坏的增长\n" +
                "\n" +
                "时间推动着这条曲线向前走，它是好是坏取决于你的每天那些最不起眼的习惯\n" +
                "\n" +
                "好习惯让时间变成朋友，坏习惯让时间变成敌人\n" +
                "\n" +
                "时间是敌是友，就看你的了\n" +
                "\n" +
                "变得优秀，永远是王道，而习惯，就是你可以利用的工具，延迟满足，从最小的事做起，让时间给你慢慢复利\n" +
                "\n" +
                "日复一日，年复一年，从生到死\n" +
                "\n" +
                "请把《掌控习惯》这本书当作宝物，因为它告诉你拥有一颗真挚的耐心是多么难能可贵"));
        articles.add(new Article(7L, "掌控习惯", LocalDate.parse("2023-04-08"), "英国国家自行车队从倒数第一爬到顺位第一用了5年的时间。\n" +
                "\n" +
                "美国喜剧人Chris在成名之前用了17年的时间。\n" +
                "\n" +
                "英国音乐队The Beatles从建队到小有成名花了近10年的时间。\n" +
                "\n" +
                "“年”\n" +
                "\n" +
                "《掌控习惯》。这本书我花了不到40刀买到了，里面的智慧使我终身受益。40刀能干什么呢。\n" +
                "\n" +
                "有的时候跟朋友出去吃一顿寿司都要花上50刀，叼服务员还给老子摆脸色。去唱个K也要70，还总有叼人抢老子歌唱。妈的这些钱，我还不如拿来买书，我TMD。开个玩笑\n" +
                "\n" +
                "“慢慢感受习惯的力量，习惯成自然”   \n" +
                "\n" +
                "“慢”\n" +
                "\n" +
                "烧开水，25度，26度，27，28，29......96，97，98，99，100。水不会从25度直接跳到100。就像你不会一夜之间学会英语。今天背5个单词，明天听5分钟英语广播，后天读5分钟英语文章，大后天...大大后天...下个月...明年...\n" +
                "\n" +
                "总有一天，你会突然发现自己可以和老外侃侃而谈了。我不知道那一天是哪一天，但总有一天，总有一天，你会发现，你之前的努力都在那一刻化为成果。\n" +
                "\n" +
                "\"it's not about intensity, it's about...\"\n" +
                "\n" +
                "consistency \n" +
                "\n" +
                "起初微小的习惯根本不起眼，也带来不了任何收益。但正是这些不起眼的微小习惯，经过时间的累积，会变得越来越强大。任何习惯，无论好的坏的。\n" +
                "\n" +
                "把这些微小的习惯融入到你每天的生活中，然后用一生的时间去贯彻它。正所谓，水滴石穿。\n" +
                "\n" +
                "如果你一个星期去两三次健身房。1个星期，2个星期，3个星期。毫无变化。1年，2年，3年。身材开始慢慢变好，肌肉开始更有力量。4年，5年，6年...\n" +
                "\n" +
                "你去了一次健身房，体重没有减轻，那如果你明天再去。后天再去呢？去到明年呢？\n" +
                "\n" +
                "单看任何一个微小的习惯，其作用都可以忽略不计。那1千个呢？1万个呢？把这些细微的习惯全部融合在一起，效益或危害是相当巨大的。\n" +
                "\n" +
                "就像金字塔。你放一块砖，那就是一块砖。那你再放一块，也不是金字塔。你再放，还不是。再放一块，再放一块，再放一块。只要你一直放，迟早有一天你的金字塔就建成了。\n" +
                "\n" +
                "That‘s the power of atomic habits. Tiny changes, remarkable results. \n" +
                "\n" +
                "----James Clear\n" +
                "\n" +
                "So tiny that you would completely ignore it at the first glance, but when enough time passes by, it will reward you with remarkable results. \n" +
                "\n" +
                "so remarkable that it would surprise you in every possible way. \n" +
                "\n" +
                "克莱儿先生，你的文字使我终身受益，致敬"));
        articles.add(new Article(8L, "摘录 - 2023-03-23", LocalDate.parse("2023-03-23"), "麻烦就是麻烦，它不会因为你的逃避而就此消失。 《把时间当作朋友》\n" +
                "\n" +
                "愿上帝赐我能力去改变我能改变的，如果这一切都无法改变，那么请赐我勇气去从容接受。 《宁静祷文》\n" +
                "\n" +
                "除非你穿上一个人的鞋子，像他一样走来走去，否则你永远无法真正了解一个人。《杀死一只知更鸟》\n" +
                "\n" +
                "The avoidance of suffering is a form of suffering. The avoidance of struggle is a struggle.    -- The subtle art of not giving a F*ck\n" +
                "\n" +
                "让小小的习惯利滚利，滚出生命的大不同            《掌控习惯》\n" +
                "\n" +
                "人生苦难重重 《少有人走的路》\n" +
                "\n" +
                "决定我们自身的不是过去的经历，而是我们赋予经历的意义\n" +
                "\n" +
                "真正的自由，是需要有被讨厌的勇气。《被讨厌的勇气》"));

    }

    public List<Article> getAllArticles() {
        return articles;
    }

    public Optional<Article> getArticleById(Long id) {
        return articles.stream()
                .filter(article -> article.getId().equals(id))
                .findFirst(); // Returns an Optional<Article>
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public int getReadCount (Long id){
        Optional<Article> article = getArticleById(id);
        return article.map(Article::getReadCount).orElse(0);
    }
    public void incrementReadCount(Long id) {
        Optional<Article> articleOpt = getArticleById(id);
        articleOpt.ifPresent(article -> article.setReadCount(article.getReadCount() + 1));
    }
}
