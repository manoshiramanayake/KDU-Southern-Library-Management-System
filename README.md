Agriculture Chatbot Project

**NOTE: The project was run in Google colab. It is recommended to run it in Google colab for running it faster.

Overview

This project implements a conversational chatbot system that can answer questions and summarize topics from a collection of agricultural e-books. 
The system uses advanced natural language processing techniques, including Dense Passage Retrieval, extractive question answering, and sequence-to-sequence summarization. The chatbot is built using Python and integrates with Gradio for a user-friendly interface.
Steps of the Code
1. Download and Preprocess Data
2. Train Models
  a.	Fine-tune the BART model for summarization
  b.	Fine-tune the BERT model for question answering
  c.	These will save the fine-tuned models in the directories bart-finetunedagriculture and bert-qa-finetuned-agriculture, respectively.
3. Run the Chatbot
  a.	Launch the Gradio interface for the chatbot
  b.	This will start a local server and provide a URL to access the chatbot interface.

Approach and Code Explanation

1.	Text Preprocessing
  • Download e-books from Project Gutenberg and cleans the text to remove unwanted
content like headers, footers and disclaimers.
  • The cleaned text is split into paragraphs, and short or irrelevant paragraphs are filtered out.
  • Preprocessed paragraphs are saved in preprocessed_books.json.

2.	Dense Passage Retrieval
  • A Sentence Transformer model (multi-qa-mpnet-base-dot-v1) is used to encode paragraphs into embeddings.
  • A FAISS index is built for efficient similarity search, enabling quick retrieval of relevant paragraphs for a given query.
3.	Question Answering
  • A BERT model is fine-tuned on the agricultural dataset for extractive question answering.
  • The model retrieves relevant paragraphs using DPR and extracts answers from them.
4.	Summarization
  • A BART model is fine-tuned on the agricultural dataset for abstractive summarization.
  • The model generates concise summaries of retrieved paragraphs based on user queries.
5.	Chatbot Interface
  • The chatbot uses Gradio to provide a user-friendly interface.
  • It differentiates between summarization and question answering based on user input:
  •	Summarization: Triggered by phrases like "summarize", "tell me about", or "describe".
  •	Question Answering: Triggered by direct questions starting with "what", "how", "explain".

Technologies Used:
• PyTorch (torch) - Likely for deep learning model implementation.
• Transformers (transformers) - Indicates the use of transformer-based models like BERT, GPT
• Sentence Transformers (sentence-transformers) - Used for generating embeddings for text, possibly for similarity search.
• FAISS (faiss-cpu) - A library for efficient similarity search and clustering of dense vectors.
• Requests (requests) - Used for downloading text data from online sources (Project Gutenberg).
• Regular Expressions (re) - For text cleaning and preprocessing.
• JSON (json) - Likely for handling and storing structured data.
• TQDM (tqdm) - Provides a progress bar for tracking operations.

The notebook uses the following neural models:
1. SentenceTransformer (multi-qa-mpnet-base-dot-v1) - Used for generating text embeddings, likely for similarity search or retrieval-based tasks.
2. BART (BartForConditionalGeneration)- Used for text summarization.
3. BERT (BertForQuestionAnswering)- Used for question answering tasks.

Future Enhancements

1. Expand Dataset:
  o Include more e-books or external agricultural resources to improve the chatbot'sknowledge base.
  o Incorporate real-time data from agricultural APIs or databases.
2. Improve Summarization:
  o Experiment with larger or more advanced models like T5 or GPT for better summarization quality.
  o Add multi-document summarization to combine information from multiple sources.
3. Enhance Question Answering:
  o Implement generative question answering to provide more detailed and contextaware answers.
  o Add support for follow-up questions to maintain context in multi-turn conversations.
4. Multilingual Support:
  o Extend the chatbot to support multiple languages for broader accessibility.
  o Use multilingual models like mBERT or XLM-R for cross-lingual understanding.
