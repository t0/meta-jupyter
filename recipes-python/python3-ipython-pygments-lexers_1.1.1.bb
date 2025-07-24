SUMMARY = "A Pygments plugin for IPython code & console sessions"
HOMEPAGE = "https://github.com/ipython/ipython-pygments-lexers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59028f809aa24c7b88bff27927343d58"

DEPENDS += "python3-jupyter-packaging-native"

SRCREV = "76f70093e2d354e6a2f4f42a7aed53018eff580c"
PYPI_SRC_URI = "git://github.com/ipython/ipython-pygments-lexers.git;protocol=https;branch=main"

inherit pypi python_setuptools_build_meta

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "python3-core python3-pygments"
BBCLASSEXTEND = "native"
