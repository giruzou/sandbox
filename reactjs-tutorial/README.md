# Reactのチュートリアルやった

これ

* https://facebook.github.io/react/docs/tutorial-ja-JP.html

JavaScriptはwebpackでビルドするようにした。
次のコマンドで準備する。

```
npm install
```

次のコマンドでビルドする。

```
npm run build
```

JSONをアレするサーバはJAX-RS使ってGroovyで書いてみた。

サーバの起動方法は以下

```sh
groovy server.groovy
```

初回は依存JARのダウンロードが行われるので少し待たないといけないかも。
なお、ダウンロードされた依存JARは`~/.groovy/grapes/`以下に保存される。

