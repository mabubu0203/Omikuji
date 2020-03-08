# Omikuji-Api
====

## 概要

おみくじを返却するAPI群を管理する子プロジェクトです。  
`micro-common` に依存しています。  

## 特徴

`openapi generator` を利用し、
OpenApiで定義するインタフェースは `spec` ファイルから `.java` ファイルを自動生成します。  
`github` では `spec` ファイルを管理しますが、 `.java` ファイルについては管理しません。  
開発サイクルについては、インターフェースを設計し `spec` ファイルを変更してから`.java` ファイルを再生成するとします。  
`SpringBoot` アプリケーションを立ち上げた際に、 'springdoc' により 'OpenAPI 3' もたちあがります。  

## Link

http://localhost:9001/OmikujiApi/swagger-ui.html