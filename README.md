# rocket
📚 开发环境和工具服务安装指南

<br>

🤔
👨‍💻
📌
🎉
✨
📜

📦 **install**

```sh
# Desktop
gnome-tweak-tool synaptic remmina
```
```sh
# Command
vim curl wget git tree neofetch pigz sshpass net-tools cloc g++
```

```sh
pip3 install torch torchvision
```

- 设置时区

```
sudo tzconfig，如果命令不存在请使用 dpkg-reconfigure tzdata
然后按照提示选择 Asia对应的序号，选完后会显示一堆新的提示—输入城市名，如Shanghai或Chongqing，最后再用 sudo date -s “” 来修改本地时间。
按照提示进行选择时区。

二、为了防止系统重启后时区改变，输入以下命令
sudo cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
```

**download tools**

- https://developer.android.com/studio
- https://jetbrains.com/clion/download
- https://jetbrains.com/go/download
- https://jetbrains.com/idea/download
- https://jetbrains.com/pycharm/download
- https://openjdk.java.net
- https://golang.org

📌 **system info**

```sh
neofetch
dpkg --version | grep dpkg
echo
printf '* '; apt --version
printf '* '; g++ --version | grep g++
printf '* '; java --version | grep openjdk
printf '* '; go version
printf '* '; python3 -V
echo; df -h /
echo; free -h
echo;
```

**command tools**

- https://github.com/cjbassi/gotop
- https://github.com/link1st/go-stress-testing
- https://github.com/FiloSottile/mkcert
- https://github.com/dylanaraps/fff

**vm**

- https://github.com/yuin/gopher-lua
- https://github.com/mikespook/goemphp

**driver**

- https://github.com/mongodb/mongo-go-driver
- https://github.com/Shopify/sarama
- https://github.com/jmoiron/sqlx

**service**

- https://github.com/blevesearch/bleve
- https://github.com/jpillora/overseer

**libs**

- https://github.com/zhiqiangxu/qrpc
- https://github.com/importcjj/sensitive
- https://github.com/tealeg/xlsx
- https://github.com/go-ego/gpy

**windows**

- https://github.com/jmeubank/tdm-gcc
