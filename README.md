# 💬 Echo Verse

A real-time chat application built using **Spring Boot**, **WebSockets**, **STOMP Protocol**, and modern web technologies.  
Echo Verse enables users to communicate instantly with live message broadcasting and real-time updates.

---

# 🚀 Features

✨ Real-Time Messaging  
✨ WebSocket Communication  
✨ STOMP Protocol Integration  
✨ Live Message Broadcasting  
✨ Multiple User Support  
✨ Instant Chat Updates  
✨ Clean Interactive UI  
✨ Join/Leave Notifications  
✨ Responsive Frontend  

---

# 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| ☕ Java | Core Programming Language |
| 🌱 Spring Boot | Backend Framework |
| 🔌 WebSocket | Real-Time Communication |
| 📡 STOMP | Messaging Protocol |
| 🎨 HTML/CSS/JavaScript | Frontend |
| 📦 Maven | Dependency Management |

---

# 🏗️ Project Architecture

The application follows a client-server real-time communication model.

## 📌 Frontend
Handles user interaction and live chat interface.

## 📌 WebSocket Layer
Maintains persistent bidirectional communication.

## 📌 Controller Layer
Processes incoming chat messages.

## 📌 Message Broker
Broadcasts messages to subscribed clients.

---

# 🔄 Complete Chat Flow

```text
User Sends Message
        ↓
WebSocket Connection
        ↓
STOMP Endpoint (/app)
        ↓
Chat Controller
        ↓
Message Broker (/topic)
        ↓
Broadcast To All Connected Users
```

---

# 📡 WebSocket Endpoints

| Endpoint | Purpose |
|---|---|
| `/app/sendMessage` | Send chat messages |
| `/topic/messages` | Receive broadcast messages |

---

# ⚡ How It Works

## 🔹 Step 1
Client establishes a WebSocket connection with the server.

## 🔹 Step 2
User sends a message through the STOMP endpoint.

## 🔹 Step 3
Spring Boot controller receives the message.

## 🔹 Step 4
Message broker broadcasts the message to all subscribed clients.

## 🔹 Step 5
All connected users instantly receive the message without refreshing the page.

---

# 📂 Main Functionalities

## 💬 Real-Time Chat
Users can send and receive messages instantly.

## 👥 Multi-User Support
Multiple users can connect simultaneously.

## 📢 Message Broadcasting
Messages are automatically shared with all active users.

## 🔔 Join Notifications
Displays notifications when users join the chat.

---

# ⚙️ How To Run The Project

## 1️⃣ Clone Repository

```bash
git clone https://github.com/Ayan70036/Echo-Verse.git
```

---

## 2️⃣ Open Project

Open using:
- IntelliJ IDEA
- Eclipse
- VS Code

---

## 3️⃣ Run Application

```bash
mvn spring-boot:run
```

---

## 4️⃣ Open Browser

Visit:

```text
http://localhost:8080
```

---

# 🧠 Concepts Used

✔️ WebSockets  
✔️ STOMP Messaging  
✔️ Real-Time Communication  
✔️ Spring Boot  
✔️ Event Broadcasting  
✔️ MVC Architecture  

---

# 🚀 Future Improvements

✨ Private Messaging  
✨ User Authentication  
✨ Chat History Storage  
✨ Online/Offline Status  
✨ Typing Indicators  
✨ File Sharing  
✨ Emoji Support  
✨ Cloud Deployment  

---

# 👨‍💻 Author

## Ayan Malakar

Backend Developer passionate about Spring Boot, WebSockets, and scalable real-time applications 🚀

---

# ⭐ Support

If you liked this project, consider giving it a ⭐ on GitHub!
