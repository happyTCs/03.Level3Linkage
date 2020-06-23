# Level3Linkage
省市县

Github 的使用
1、有GitHub账号
2、new repository
3、安装git和配置环境变量
4、git命令
进入文件目录，在文件中点击鼠标右键选择bash控制台进入
git init
git add .
git commit -m "first commit"
git remote add level3 "https://github.com:happyTCs/Level3Linkage.git"
git push -u level3 master
备注：
git init
运行git add . 命令（意思是将要上传本地所有文件）  
接着运行git commit -m "first commit"
 git remote add [命名] [项目地址]
第一次是不用pull的因为啥都没有，直接push即可
add->commit->pull->push
