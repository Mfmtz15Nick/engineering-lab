# Simple server
from mcp.server.fastmcp import FastMCP

mcp = FastMCP("my-server")

@mcp.tool()

# We'll expose these
def hi(name: str) -> str:
    if name.lower() == 'mario':
        return "This is a MCP"

    return f"Hello {name}! Bienvenido a tu primer MCP"

if __name__ == "__main__":
    mcp.run()